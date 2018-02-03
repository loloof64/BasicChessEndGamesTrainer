/*
 * Basic Chess Endgames : generates a position of the endgame you want, then play it against computer.
    Copyright (C) 2017-2018  Laurent Bernabe <laurent.bernabe@gmail.com>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

// Generated from SingleKingConstraint.g4 by ANTLR 4.7.1
package com.loloof64.android.basicchessendgamestrainer.position_generator_editor.single_king_constraint.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SingleKingConstraintParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, NumericLitteral=33, ID=34, WS=35;
	public static final int
		RULE_singleKingConstraint = 0, RULE_variableAssign = 1, RULE_booleanExpr = 2, 
		RULE_fileConstant = 3, RULE_rankConstant = 4, RULE_numericExpr = 5;
	public static final String[] ruleNames = {
		"singleKingConstraint", "variableAssign", "booleanExpr", "fileConstant", 
		"rankConstant", "numericExpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'return'", "';'", "':='", "'('", "')'", "'<'", "'>'", "'<='", "'>='", 
		"'='", "'<>'", "'and'", "'or'", "'FileA'", "'FileB'", "'FileC'", "'FileD'", 
		"'FileE'", "'FileF'", "'FileG'", "'FileH'", "'Rank1'", "'Rank2'", "'Rank3'", 
		"'Rank4'", "'Rank5'", "'Rank6'", "'Rank7'", "'Rank8'", "'abs('", "'+'", 
		"'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "NumericLitteral", 
		"ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SingleKingConstraint.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SingleKingConstraintParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleKingConstraintContext extends ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public List<VariableAssignContext> variableAssign() {
			return getRuleContexts(VariableAssignContext.class);
		}
		public VariableAssignContext variableAssign(int i) {
			return getRuleContext(VariableAssignContext.class,i);
		}
		public SingleKingConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleKingConstraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitSingleKingConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleKingConstraintContext singleKingConstraint() throws RecognitionException {
		SingleKingConstraintContext _localctx = new SingleKingConstraintContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleKingConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(12);
				variableAssign();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(T__0);
			setState(19);
			booleanExpr(0);
			setState(20);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableAssignContext extends ParserRuleContext {
		public VariableAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssign; }
	 
		public VariableAssignContext() { }
		public void copyFrom(VariableAssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumericAssignContext extends VariableAssignContext {
		public TerminalNode ID() { return getToken(SingleKingConstraintParser.ID, 0); }
		public NumericExprContext numericExpr() {
			return getRuleContext(NumericExprContext.class,0);
		}
		public NumericAssignContext(VariableAssignContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitNumericAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAssignContext extends VariableAssignContext {
		public TerminalNode ID() { return getToken(SingleKingConstraintParser.ID, 0); }
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public BooleanAssignContext(VariableAssignContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitBooleanAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignContext variableAssign() throws RecognitionException {
		VariableAssignContext _localctx = new VariableAssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableAssign);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new NumericAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(ID);
				setState(23);
				match(T__2);
				setState(24);
				numericExpr(0);
				setState(25);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new BooleanAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(ID);
				setState(28);
				match(T__2);
				setState(29);
				booleanExpr(0);
				setState(30);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExprContext extends ParserRuleContext {
		public BooleanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpr; }
	 
		public BooleanExprContext() { }
		public void copyFrom(BooleanExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumericEqualityContext extends BooleanExprContext {
		public Token op;
		public List<NumericExprContext> numericExpr() {
			return getRuleContexts(NumericExprContext.class);
		}
		public NumericExprContext numericExpr(int i) {
			return getRuleContext(NumericExprContext.class,i);
		}
		public NumericEqualityContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitNumericEquality(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrComparisonContext extends BooleanExprContext {
		public List<BooleanExprContext> booleanExpr() {
			return getRuleContexts(BooleanExprContext.class);
		}
		public BooleanExprContext booleanExpr(int i) {
			return getRuleContext(BooleanExprContext.class,i);
		}
		public OrComparisonContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitOrComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanVariableContext extends BooleanExprContext {
		public TerminalNode ID() { return getToken(SingleKingConstraintParser.ID, 0); }
		public BooleanVariableContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitBooleanVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisBooleanExprContext extends BooleanExprContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public ParenthesisBooleanExprContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitParenthesisBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndComparisonContext extends BooleanExprContext {
		public List<BooleanExprContext> booleanExpr() {
			return getRuleContexts(BooleanExprContext.class);
		}
		public BooleanExprContext booleanExpr(int i) {
			return getRuleContext(BooleanExprContext.class,i);
		}
		public AndComparisonContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitAndComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericRelationalContext extends BooleanExprContext {
		public Token op;
		public List<NumericExprContext> numericExpr() {
			return getRuleContexts(NumericExprContext.class);
		}
		public NumericExprContext numericExpr(int i) {
			return getRuleContext(NumericExprContext.class,i);
		}
		public NumericRelationalContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitNumericRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExprContext booleanExpr() throws RecognitionException {
		return booleanExpr(0);
	}

	private BooleanExprContext booleanExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExprContext _localctx = new BooleanExprContext(_ctx, _parentState);
		BooleanExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_booleanExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisBooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(35);
				match(T__3);
				setState(36);
				booleanExpr(0);
				setState(37);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new BooleanVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new NumericRelationalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				numericExpr(0);
				setState(41);
				((NumericRelationalContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
					((NumericRelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(42);
				numericExpr(0);
				}
				break;
			case 4:
				{
				_localctx = new NumericEqualityContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				numericExpr(0);
				setState(45);
				((NumericEqualityContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
					((NumericEqualityContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(46);
				numericExpr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new AndComparisonContext(new BooleanExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
						setState(50);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(51);
						match(T__11);
						setState(52);
						booleanExpr(3);
						}
						break;
					case 2:
						{
						_localctx = new OrComparisonContext(new BooleanExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpr);
						setState(53);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(54);
						match(T__12);
						setState(55);
						booleanExpr(2);
						}
						break;
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FileConstantContext extends ParserRuleContext {
		public FileConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitFileConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileConstantContext fileConstant() throws RecognitionException {
		FileConstantContext _localctx = new FileConstantContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fileConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RankConstantContext extends ParserRuleContext {
		public RankConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rankConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitRankConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RankConstantContext rankConstant() throws RecognitionException {
		RankConstantContext _localctx = new RankConstantContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rankConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericExprContext extends ParserRuleContext {
		public NumericExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericExpr; }
	 
		public NumericExprContext() { }
		public void copyFrom(NumericExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AbsoluteNumericExprContext extends NumericExprContext {
		public NumericExprContext numericExpr() {
			return getRuleContext(NumericExprContext.class,0);
		}
		public AbsoluteNumericExprContext(NumericExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitAbsoluteNumericExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisNumericExprContext extends NumericExprContext {
		public NumericExprContext numericExpr() {
			return getRuleContext(NumericExprContext.class,0);
		}
		public ParenthesisNumericExprContext(NumericExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitParenthesisNumericExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericVariableContext extends NumericExprContext {
		public TerminalNode ID() { return getToken(SingleKingConstraintParser.ID, 0); }
		public NumericVariableContext(NumericExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitNumericVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusNumericExprContext extends NumericExprContext {
		public Token op;
		public List<NumericExprContext> numericExpr() {
			return getRuleContexts(NumericExprContext.class);
		}
		public NumericExprContext numericExpr(int i) {
			return getRuleContext(NumericExprContext.class,i);
		}
		public PlusMinusNumericExprContext(NumericExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitPlusMinusNumericExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LitteralNumericExprContext extends NumericExprContext {
		public TerminalNode NumericLitteral() { return getToken(SingleKingConstraintParser.NumericLitteral, 0); }
		public LitteralNumericExprContext(NumericExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitLitteralNumericExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RankConstantNumericExprContext extends NumericExprContext {
		public RankConstantContext rankConstant() {
			return getRuleContext(RankConstantContext.class,0);
		}
		public RankConstantNumericExprContext(NumericExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitRankConstantNumericExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FileConstantNumericExprContext extends NumericExprContext {
		public FileConstantContext fileConstant() {
			return getRuleContext(FileConstantContext.class,0);
		}
		public FileConstantNumericExprContext(NumericExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SingleKingConstraintVisitor ) return ((SingleKingConstraintVisitor<? extends T>)visitor).visitFileConstantNumericExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericExprContext numericExpr() throws RecognitionException {
		return numericExpr(0);
	}

	private NumericExprContext numericExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumericExprContext _localctx = new NumericExprContext(_ctx, _parentState);
		NumericExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_numericExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				_localctx = new ParenthesisNumericExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(66);
				match(T__3);
				setState(67);
				numericExpr(0);
				setState(68);
				match(T__4);
				}
				break;
			case T__29:
				{
				_localctx = new AbsoluteNumericExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(T__29);
				setState(71);
				numericExpr(0);
				setState(72);
				match(T__4);
				}
				break;
			case NumericLitteral:
				{
				_localctx = new LitteralNumericExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(NumericLitteral);
				}
				break;
			case ID:
				{
				_localctx = new NumericVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(ID);
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				{
				_localctx = new FileConstantNumericExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				fileConstant();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
				{
				_localctx = new RankConstantNumericExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				rankConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PlusMinusNumericExprContext(new NumericExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_numericExpr);
					setState(80);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(81);
					((PlusMinusNumericExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__30 || _la==T__31) ) {
						((PlusMinusNumericExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(82);
					numericExpr(2);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return booleanExpr_sempred((BooleanExprContext)_localctx, predIndex);
		case 5:
			return numericExpr_sempred((NumericExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanExpr_sempred(BooleanExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean numericExpr_sempred(NumericExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%[\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3#\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\7\3\7\3\7\7\7V\n\7\f\7\16"+
		"\7Y\13\7\3\7\2\4\6\f\b\2\4\6\b\n\f\2\7\3\2\b\13\3\2\f\r\3\2\20\27\3\2"+
		"\30\37\3\2!\"\2a\2\21\3\2\2\2\4\"\3\2\2\2\6\62\3\2\2\2\b?\3\2\2\2\nA\3"+
		"\2\2\2\fP\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2"+
		"\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2\24\25\7\3\2\2\25\26\5\6"+
		"\4\2\26\27\7\4\2\2\27\3\3\2\2\2\30\31\7$\2\2\31\32\7\5\2\2\32\33\5\f\7"+
		"\2\33\34\7\4\2\2\34#\3\2\2\2\35\36\7$\2\2\36\37\7\5\2\2\37 \5\6\4\2 !"+
		"\7\4\2\2!#\3\2\2\2\"\30\3\2\2\2\"\35\3\2\2\2#\5\3\2\2\2$%\b\4\1\2%&\7"+
		"\6\2\2&\'\5\6\4\2\'(\7\7\2\2(\63\3\2\2\2)\63\7$\2\2*+\5\f\7\2+,\t\2\2"+
		"\2,-\5\f\7\2-\63\3\2\2\2./\5\f\7\2/\60\t\3\2\2\60\61\5\f\7\2\61\63\3\2"+
		"\2\2\62$\3\2\2\2\62)\3\2\2\2\62*\3\2\2\2\62.\3\2\2\2\63<\3\2\2\2\64\65"+
		"\f\4\2\2\65\66\7\16\2\2\66;\5\6\4\5\678\f\3\2\289\7\17\2\29;\5\6\4\4:"+
		"\64\3\2\2\2:\67\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\7\3\2\2\2><\3\2"+
		"\2\2?@\t\4\2\2@\t\3\2\2\2AB\t\5\2\2B\13\3\2\2\2CD\b\7\1\2DE\7\6\2\2EF"+
		"\5\f\7\2FG\7\7\2\2GQ\3\2\2\2HI\7 \2\2IJ\5\f\7\2JK\7\7\2\2KQ\3\2\2\2LQ"+
		"\7#\2\2MQ\7$\2\2NQ\5\b\5\2OQ\5\n\6\2PC\3\2\2\2PH\3\2\2\2PL\3\2\2\2PM\3"+
		"\2\2\2PN\3\2\2\2PO\3\2\2\2QW\3\2\2\2RS\f\3\2\2ST\t\6\2\2TV\5\f\7\4UR\3"+
		"\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\r\3\2\2\2YW\3\2\2\2\t\21\"\62:<"+
		"PW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}