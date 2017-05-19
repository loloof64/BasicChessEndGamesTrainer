package com.loloof64.android.basicchessendgamestrainer.graphic_board

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.Toast
import com.loloof64.android.basicchessendgamestrainer.MyApplication
import com.loloof64.android.basicchessendgamestrainer.PlayingActivity
import com.loloof64.android.basicchessendgamestrainer.R
import com.loloof64.android.basicchessendgamestrainer.UCICommandAnswerCallback
import ictk.boardgame.chess.*
import java.lang.ref.WeakReference
import java.util.logging.Logger

class MyUciCommandCallback(playingComponent: PlayableAgainstComputerBoardComponent) : UCICommandAnswerCallback {
    private val playingComponentRef:WeakReference<PlayableAgainstComputerBoardComponent> = WeakReference(playingComponent)

    override fun execute(answer: String) {
        if (playingComponentRef.get()?.isReadyToPlay() ?: false) {
            playingComponentRef.get()?.processComponentMove(answer)
        } else {
            playingComponentRef.get()?.notifyPlayerGoal(answer)
        }
    }
}

class PlayableAgainstComputerBoardComponent(context: Context, override val attrs: AttributeSet?,
                             defStyleAttr: Int) : BoardComponent(context, attrs, defStyleAttr), PieceMoveInteraction {

    constructor(context: Context, attrs: AttributeSet) : this(context, attrs, 0)
    constructor(context: Context) : this(context, null, 0)

    companion object {
        /**
         * Gets the expected game result from a uci position info line (line starting with info).
         * @param positionInfoLine - String - the info line to convert.
         * @return Int - ChessResult constant.
         */
        fun positionResultFromPositionInfo(positionInfoLine: String): Int {
            val infoLineStartingAtScore = positionInfoLine.split("cp ").last()
            val positionResult = if (infoLineStartingAtScore.startsWith("mate")) {
                val movesCount = Integer.parseInt(infoLineStartingAtScore.split("\\s+")[1])
                if (movesCount > 0) ChessResult.WHITE_WIN else ChessResult.BLACK_WIN
            } else {
                val score = Integer.parseInt(infoLineStartingAtScore.split(" ").first())
                if (Math.abs(score) > 1000){
                    if (score > 0) ChessResult.WHITE_WIN else ChessResult.BLACK_WIN
                } else {
                    if (Math.abs(score) < 50) ChessResult.DRAW else ChessResult.UNDECIDED
                }
            }
            return positionResult
        }
    }

    fun Char.toPromotionPiece():ChessPiece {
        return ChessPiece.toChessPiece(when(this) {
            'p', 'P' -> Pawn.INDEX
            'n', 'N' -> Knight.INDEX
            'b', 'B' -> Bishop.INDEX
            'r', 'R' -> Rook.INDEX
            'q', 'Q' -> Queen.INDEX
            'k', 'K' -> King.INDEX
            else -> throw RuntimeException("Unrecognized piece char $this")
        }.toInt())
    }

    init {
        (context.applicationContext as MyApplication).setCallbackForUciCommandAnswer(
                MyUciCommandCallback(this))
    }

    override fun relatedBoard(): ChessBoard {
        return _relatedBoard
    }

    override fun replaceBoardWith(board: ChessBoard) {
        _relatedBoard = board
    }

    override fun highlightedCell(): Pair<Int, Int>? {
        return _highlightedCell
    }

    override fun askForPromotionPiece() {
        when(context) {
            is PlayingActivity -> (context as PlayingActivity).askForPromotionPiece()
            else -> {}
        }
    }

    override fun reactForIllegalMove() {
        when(context) {
            is PlayingActivity -> (context as PlayingActivity).reactForIllegalMove()
            else -> {}
        }
    }

    // Fields from PieceMoveInteraction interface
    override var _relatedBoard = ChessBoard()
    override var _highlightedCell:Pair<Int, Int>? = null
    override var _pendingPromotionInfo:PromotionInfo? = null

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val notPlayerTurn = _playerHasWhite == _relatedBoard.isBlackMove
        if (notPlayerTurn || _gameFinished) return true

        val x = event.x
        val y = event.y
        val action = event.action

        val cellSize = (measuredWidth.min(measuredHeight)) / 9
        val file = ((x-cellSize*0.5) / cellSize).toInt()
        val rank = 7 - ((y-cellSize*0.5) / cellSize).toInt()

        if (action == MotionEvent.ACTION_DOWN && file >= 0 && file < 8 && rank >= 0 && rank < 8) {
            if (reversed) reactOnClick(7-file, 7-rank) else reactOnClick(file, rank)
            invalidate()
            checkIfGameFinished()
            if (!_gameFinished) makeComputerPlay()
        }

        return true
    }

    fun isReversed() : Boolean = reversed

    fun setReversedState(newReversedState: Boolean) {
        reversed = newReversedState
    }

    fun activateHighlightedCell(highlightedCellFile : Int, highlightedCellRank : Int) {
        _highlightedCell = Pair(highlightedCellFile, highlightedCellRank)
    }

    fun playerHasWhite() = _playerHasWhite

    fun setFinishedState(finished: Boolean){
        _gameFinished = finished
    }

    fun new_game(startFen: String, playerHasWhite: Boolean ?) {
        try {
            _gameFinished = false
            _relatedBoard = FEN.stringToBoard(startFen) as ChessBoard
            _playerHasWhite = if (playerHasWhite == null) ! _relatedBoard.isBlackMove /*player is the first to play (the fen must be chosen wisely)*/
                             else playerHasWhite
            invalidate()
        }
        catch (e:IllegalArgumentException) {
            java.util.logging.Logger.getLogger("BasicChessEndgamesTrainer").severe("Position $startFen is invalid and could not be load.")
        }
        val isComputerToMove = _playerHasWhite == relatedBoard().isBlackMove
        if (isComputerToMove) makeComputerPlay()
    }

    fun isWhiteToPlay() : Boolean {
        val WHITE_PLAYER = 0
        return _relatedBoard.playerToMove == WHITE_PLAYER
    }

    fun makeComputerPlay(){
        val isComputerToMove = _playerHasWhite == relatedBoard().isBlackMove
        if (isComputerToMove) {
            val myApp = context.applicationContext as MyApplication
            myApp.uciInteract("position fen ${FEN.boardToString(_relatedBoard)}")
            myApp.uciInteract("go")
        }
    }

    fun processComponentMove(longUCICommandAnswer: String) {
        val moveStr = longUCICommandAnswer.split("\n").filter { it.isNotEmpty() }.last().split(" ")[1]
        val chessMove = if (moveStr.length > 4) {
            val (sFile, sRank, eFile, eRank, promotion) = moveStr.toCharArray()
            ChessMove(_relatedBoard, _relatedBoard.getSquare(sFile, sRank), _relatedBoard.getSquare(eFile, eRank), promotion.toPromotionPiece())
        }
        else {
            val (sFile, sRank, eFile, eRank) = moveStr.toCharArray()
            ChessMove(_relatedBoard, _relatedBoard.getSquare(sFile, sRank), _relatedBoard.getSquare(eFile, eRank))
        }
        handler.post {
            _relatedBoard.playMove(chessMove)
            invalidate()
            checkIfGameFinished()
        }
    }

    fun isReadyToPlay() = _readyToPlay

    fun checkIfGameFinished() {
        if (_relatedBoard.isCheckmate) {
            Toast.makeText(context, R.string.checkmate, Toast.LENGTH_LONG).show()
            _gameFinished = true
            _readyToPlay = false
        }
        if (_relatedBoard.isStalemate){
            Toast.makeText(context, R.string.stalemate, Toast.LENGTH_LONG).show()
            _gameFinished = true
            _readyToPlay = false
        }
        else if (_relatedBoard.is50MoveRuleApplicible){
            Toast.makeText(context, R.string.fiftyMoveDraw, Toast.LENGTH_LONG).show()
            _gameFinished = true
            _readyToPlay = false
        }
    }

    fun notifyPlayerGoal(longUCICommandAnswer: String){
        val infoLine = longUCICommandAnswer.split("\n").filter { it.isNotEmpty() && it.startsWith("info")}.last()
        handler.post {
            when (positionResultFromPositionInfo(infoLine)){
                ChessResult.WHITE_WIN -> Toast.makeText(MyApplication.getApplicationContext(), R.string.white_play_for_mate, Toast.LENGTH_SHORT).show()
                ChessResult.BLACK_WIN -> Toast.makeText(MyApplication.getApplicationContext(), R.string.black_play_for_mate, Toast.LENGTH_SHORT).show()
                ChessResult.DRAW -> Toast.makeText(MyApplication.getApplicationContext(), R.string.should_be_draw, Toast.LENGTH_SHORT).show()
                ChessResult.UNDECIDED -> {}
            }
            _readyToPlay = true
        }
    }

    fun gameFinished() = _gameFinished

    private var _playerHasWhite = true
    private var _gameFinished = false
    private var _readyToPlay = false

}