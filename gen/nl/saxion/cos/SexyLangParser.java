// Generated from /Users/quan/Projects/compilers_and_operating_systems/src/SexyLang.g4 by ANTLR 4.9.2
package nl.saxion.cos;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SexyLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, EMPTY=3, BULGE=4, BODYCOUNT=5, BODYCOUNT_ARRAY=6, LENGTH=7, 
		SAFEWORD=8, INSERT=9, IN=10, MOAN=11, MOANLOUD=12, BEDACTIVITY=13, EJACULATE=14, 
		IF=15, ELSEIF=16, ELSE=17, LUBE=18, HARD=19, SOFT=20, L_PAREN=21, R_PAREN=22, 
		L_CURLY=23, R_CURLY=24, L_SQUARE=25, R_SQUARE=26, COMMA=27, ADD=28, SUB=29, 
		MUL=30, DIV=31, NEG=32, EQUAL=33, GT=34, LT=35, GE=36, LE=37, AND=38, 
		OR=39, WHAT_LENGTH=40, STRING=41, IDENTIFIER=42, NUMBER=43, WS=44, COMMENT=45;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_whatLengthCall = 2, RULE_bedActivityCall = 3, 
		RULE_params = 4, RULE_statement = 5, RULE_blockStatement = 6, RULE_block = 7, 
		RULE_methodBlock = 8, RULE_varDeclaration = 9, RULE_varAssignment = 10, 
		RULE_moanStmt = 11, RULE_ejaculateStmt = 12, RULE_ifStmt = 13, RULE_elseIfStmt = 14, 
		RULE_elseStmt = 15, RULE_lubeStmt = 16, RULE_bedActivityStmt = 17, RULE_paramsDeclaration = 18, 
		RULE_type = 19, RULE_bulgeLiteral = 20, RULE_safeWordLiteral = 21, RULE_bodyCountLiteral = 22, 
		RULE_lengthLiteral = 23, RULE_bodyCountElements = 24, RULE_bodyCountArrayLiteral = 25, 
		RULE_arrayAccess = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "whatLengthCall", "bedActivityCall", "params", 
			"statement", "blockStatement", "block", "methodBlock", "varDeclaration", 
			"varAssignment", "moanStmt", "ejaculateStmt", "ifStmt", "elseIfStmt", 
			"elseStmt", "lubeStmt", "bedActivityStmt", "paramsDeclaration", "type", 
			"bulgeLiteral", "safeWordLiteral", "bodyCountLiteral", "lengthLiteral", 
			"bodyCountElements", "bodyCountArrayLiteral", "arrayAccess"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'.'", "'empty'", "'bulge'", "'bodyCount'", "'bodyCountArray'", 
			"'length'", "'SafeWord'", "'insert'", "'in'", "'moan'", "'moanLoud'", 
			"'bedActivity'", "'ejaculate'", "'if'", "'else if'", "'else'", "'lube'", 
			"'hard'", "'soft'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", 
			"'+'", "'-'", "'*'", "'/'", "'!'", "'=='", "'>'", "'<'", "'>='", "'<='", 
			"'and'", "'or'", "'whatLength'", null, null, null, null, "'3==D'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "EMPTY", "BULGE", "BODYCOUNT", "BODYCOUNT_ARRAY", "LENGTH", 
			"SAFEWORD", "INSERT", "IN", "MOAN", "MOANLOUD", "BEDACTIVITY", "EJACULATE", 
			"IF", "ELSEIF", "ELSE", "LUBE", "HARD", "SOFT", "L_PAREN", "R_PAREN", 
			"L_CURLY", "R_CURLY", "L_SQUARE", "R_SQUARE", "COMMA", "ADD", "SUB", 
			"MUL", "DIV", "NEG", "EQUAL", "GT", "LT", "GE", "LE", "AND", "OR", "WHAT_LENGTH", 
			"STRING", "IDENTIFIER", "NUMBER", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "SexyLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SexyLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SexyLangParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INSERT) | (1L << MOAN) | (1L << MOANLOUD) | (1L << BEDACTIVITY) | (1L << IF) | (1L << LUBE) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << L_SQUARE) | (1L << SUB) | (1L << NEG) | (1L << WHAT_LENGTH) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case HARD:
				case SOFT:
				case L_PAREN:
				case L_SQUARE:
				case SUB:
				case NEG:
				case WHAT_LENGTH:
				case STRING:
				case IDENTIFIER:
				case NUMBER:
					{
					setState(54);
					expression(0);
					}
					break;
				case INSERT:
				case MOAN:
				case MOANLOUD:
				case BEDACTIVITY:
				case IF:
				case LUBE:
					{
					setState(55);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(EOF);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BodyCountLiteralExpressionContext extends ExpressionContext {
		public BodyCountLiteralContext bodyCountLiteral() {
			return getRuleContext(BodyCountLiteralContext.class,0);
		}
		public BodyCountLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBodyCountLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LengthLiteralExpressionContext extends ExpressionContext {
		public LengthLiteralContext lengthLiteral() {
			return getRuleContext(LengthLiteralContext.class,0);
		}
		public LengthLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitLengthLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupExpressionContext extends ExpressionContext {
		public TerminalNode L_PAREN() { return getToken(SexyLangParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(SexyLangParser.R_PAREN, 0); }
		public GroupExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitGroupExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BodyCountArrayLiteralExpressionContext extends ExpressionContext {
		public BodyCountArrayLiteralContext bodyCountArrayLiteral() {
			return getRuleContext(BodyCountArrayLiteralContext.class,0);
		}
		public BodyCountArrayLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBodyCountArrayLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(SexyLangParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(SexyLangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SexyLangParser.SUB, 0); }
		public AddSubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChainedLogicExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SexyLangParser.AND, 0); }
		public TerminalNode OR() { return getToken(SexyLangParser.OR, 0); }
		public ChainedLogicExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitChainedLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BulgeLiteralExpressionContext extends ExpressionContext {
		public BulgeLiteralContext bulgeLiteral() {
			return getRuleContext(BulgeLiteralContext.class,0);
		}
		public BulgeLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBulgeLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(SexyLangParser.EQUAL, 0); }
		public TerminalNode LE() { return getToken(SexyLangParser.LE, 0); }
		public TerminalNode GE() { return getToken(SexyLangParser.GE, 0); }
		public TerminalNode LT() { return getToken(SexyLangParser.LT, 0); }
		public TerminalNode GT() { return getToken(SexyLangParser.GT, 0); }
		public LogicExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SafeWordLiteralExpressionContext extends ExpressionContext {
		public SafeWordLiteralContext safeWordLiteral() {
			return getRuleContext(SafeWordLiteralContext.class,0);
		}
		public SafeWordLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitSafeWordLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhatLengthCallExpressionContext extends ExpressionContext {
		public WhatLengthCallContext whatLengthCall() {
			return getRuleContext(WhatLengthCallContext.class,0);
		}
		public WhatLengthCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitWhatLengthCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BedActivitCallExpressionContext extends ExpressionContext {
		public BedActivityCallContext bedActivityCall() {
			return getRuleContext(BedActivityCallContext.class,0);
		}
		public BedActivitCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBedActivitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegationExpressionContext extends ExpressionContext {
		public TerminalNode NEG() { return getToken(SexyLangParser.NEG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitNegationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitArrayAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(SexyLangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SexyLangParser.DIV, 0); }
		public MulDivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitMulDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new GroupExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(64);
				match(L_PAREN);
				setState(65);
				expression(0);
				setState(66);
				match(R_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(NEG);
				setState(69);
				expression(14);
				}
				break;
			case 3:
				{
				_localctx = new WhatLengthCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				whatLengthCall();
				}
				break;
			case 4:
				{
				_localctx = new BedActivitCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				bedActivityCall();
				}
				break;
			case 5:
				{
				_localctx = new BulgeLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				bulgeLiteral();
				}
				break;
			case 6:
				{
				_localctx = new BodyCountLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				bodyCountLiteral();
				}
				break;
			case 7:
				{
				_localctx = new SafeWordLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				safeWordLiteral();
				}
				break;
			case 8:
				{
				_localctx = new LengthLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				lengthLiteral();
				}
				break;
			case 9:
				{
				_localctx = new BodyCountArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				bodyCountArrayLiteral();
				}
				break;
			case 10:
				{
				_localctx = new ArrayAccessExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				arrayAccess();
				}
				break;
			case 11:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MulDivExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(81);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(82);
						((MulDivExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(83);
						((MulDivExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddSubExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(84);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(85);
						((AddSubExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(86);
						((AddSubExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 3:
						{
						_localctx = new LogicExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LogicExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(87);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(88);
						((LogicExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << GT) | (1L << LT) | (1L << GE) | (1L << LE))) != 0)) ) {
							((LogicExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(89);
						((LogicExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ChainedLogicExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ChainedLogicExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(91);
						((ChainedLogicExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ChainedLogicExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(92);
						((ChainedLogicExpressionContext)_localctx).right = expression(11);
						}
						break;
					}
					} 
				}
				setState(97);
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

	public static class WhatLengthCallContext extends ParserRuleContext {
		public TerminalNode WHAT_LENGTH() { return getToken(SexyLangParser.WHAT_LENGTH, 0); }
		public TerminalNode L_PAREN() { return getToken(SexyLangParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(SexyLangParser.R_PAREN, 0); }
		public WhatLengthCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whatLengthCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitWhatLengthCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhatLengthCallContext whatLengthCall() throws RecognitionException {
		WhatLengthCallContext _localctx = new WhatLengthCallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whatLengthCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(WHAT_LENGTH);
			setState(99);
			match(L_PAREN);
			setState(100);
			match(R_PAREN);
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

	public static class BedActivityCallContext extends ParserRuleContext {
		public Token name;
		public TerminalNode L_PAREN() { return getToken(SexyLangParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(SexyLangParser.R_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SexyLangParser.IDENTIFIER, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public BedActivityCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bedActivityCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBedActivityCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BedActivityCallContext bedActivityCall() throws RecognitionException {
		BedActivityCallContext _localctx = new BedActivityCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bedActivityCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((BedActivityCallContext)_localctx).name = match(IDENTIFIER);
			setState(103);
			match(L_PAREN);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << L_SQUARE) | (1L << SUB) | (1L << NEG) | (1L << WHAT_LENGTH) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(104);
				params();
				}
			}

			setState(107);
			match(R_PAREN);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SexyLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SexyLangParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			expression(0);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(110);
				match(COMMA);
				setState(111);
				expression(0);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public MoanStmtContext moanStmt() {
			return getRuleContext(MoanStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public LubeStmtContext lubeStmt() {
			return getRuleContext(LubeStmtContext.class,0);
		}
		public BedActivityStmtContext bedActivityStmt() {
			return getRuleContext(BedActivityStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				moanStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				lubeStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				bedActivityStmt();
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

	public static class BlockStatementContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public MoanStmtContext moanStmt() {
			return getRuleContext(MoanStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public LubeStmtContext lubeStmt() {
			return getRuleContext(LubeStmtContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockStatement);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				moanStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				lubeStmt();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode L_CURLY() { return getToken(SexyLangParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(SexyLangParser.R_CURLY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(L_CURLY);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INSERT) | (1L << MOAN) | (1L << MOANLOUD) | (1L << IF) | (1L << LUBE) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << L_SQUARE) | (1L << SUB) | (1L << NEG) | (1L << WHAT_LENGTH) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case HARD:
				case SOFT:
				case L_PAREN:
				case L_SQUARE:
				case SUB:
				case NEG:
				case WHAT_LENGTH:
				case STRING:
				case IDENTIFIER:
				case NUMBER:
					{
					setState(133);
					expression(0);
					}
					break;
				case INSERT:
				case MOAN:
				case MOANLOUD:
				case IF:
				case LUBE:
					{
					setState(134);
					blockStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(R_CURLY);
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

	public static class MethodBlockContext extends ParserRuleContext {
		public TerminalNode L_CURLY() { return getToken(SexyLangParser.L_CURLY, 0); }
		public EjaculateStmtContext ejaculateStmt() {
			return getRuleContext(EjaculateStmtContext.class,0);
		}
		public TerminalNode R_CURLY() { return getToken(SexyLangParser.R_CURLY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public MethodBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitMethodBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBlockContext methodBlock() throws RecognitionException {
		MethodBlockContext _localctx = new MethodBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(L_CURLY);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INSERT) | (1L << MOAN) | (1L << MOANLOUD) | (1L << IF) | (1L << LUBE) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << L_SQUARE) | (1L << SUB) | (1L << NEG) | (1L << WHAT_LENGTH) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(145);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case HARD:
				case SOFT:
				case L_PAREN:
				case L_SQUARE:
				case SUB:
				case NEG:
				case WHAT_LENGTH:
				case STRING:
				case IDENTIFIER:
				case NUMBER:
					{
					setState(143);
					expression(0);
					}
					break;
				case INSERT:
				case MOAN:
				case MOANLOUD:
				case IF:
				case LUBE:
					{
					setState(144);
					blockStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			ejaculateStmt();
			setState(151);
			match(R_CURLY);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public Token command;
		public TypeContext varType;
		public Token varName;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(SexyLangParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(SexyLangParser.INSERT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SexyLangParser.IDENTIFIER, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((VarDeclarationContext)_localctx).command = match(INSERT);
			setState(154);
			((VarDeclarationContext)_localctx).varType = type();
			setState(155);
			expression(0);
			setState(156);
			match(IN);
			setState(157);
			((VarDeclarationContext)_localctx).varName = match(IDENTIFIER);
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

	public static class VarAssignmentContext extends ParserRuleContext {
		public Token command;
		public Token varName;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(SexyLangParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(SexyLangParser.INSERT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SexyLangParser.IDENTIFIER, 0); }
		public VarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((VarAssignmentContext)_localctx).command = match(INSERT);
			setState(160);
			expression(0);
			setState(161);
			match(IN);
			setState(162);
			((VarAssignmentContext)_localctx).varName = match(IDENTIFIER);
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

	public static class MoanStmtContext extends ParserRuleContext {
		public Token command;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MOAN() { return getToken(SexyLangParser.MOAN, 0); }
		public TerminalNode MOANLOUD() { return getToken(SexyLangParser.MOANLOUD, 0); }
		public MoanStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moanStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitMoanStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoanStmtContext moanStmt() throws RecognitionException {
		MoanStmtContext _localctx = new MoanStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_moanStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((MoanStmtContext)_localctx).command = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==MOAN || _la==MOANLOUD) ) {
				((MoanStmtContext)_localctx).command = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(165);
			expression(0);
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

	public static class EjaculateStmtContext extends ParserRuleContext {
		public Token command;
		public TerminalNode EJACULATE() { return getToken(SexyLangParser.EJACULATE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EjaculateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ejaculateStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitEjaculateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EjaculateStmtContext ejaculateStmt() throws RecognitionException {
		EjaculateStmtContext _localctx = new EjaculateStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ejaculateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((EjaculateStmtContext)_localctx).command = match(EJACULATE);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << L_SQUARE) | (1L << SUB) | (1L << NEG) | (1L << WHAT_LENGTH) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(168);
				expression(0);
				}
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

	public static class IfStmtContext extends ParserRuleContext {
		public Token command;
		public ExpressionContext condition;
		public TerminalNode L_PAREN() { return getToken(SexyLangParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(SexyLangParser.R_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(SexyLangParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ElseIfStmtContext> elseIfStmt() {
			return getRuleContexts(ElseIfStmtContext.class);
		}
		public ElseIfStmtContext elseIfStmt(int i) {
			return getRuleContext(ElseIfStmtContext.class,i);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			((IfStmtContext)_localctx).command = match(IF);
			setState(172);
			match(L_PAREN);
			setState(173);
			((IfStmtContext)_localctx).condition = expression(0);
			setState(174);
			match(R_PAREN);
			setState(175);
			block();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(176);
				elseIfStmt();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(182);
				elseStmt();
				}
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

	public static class ElseIfStmtContext extends ParserRuleContext {
		public Token command;
		public ExpressionContext condition;
		public TerminalNode L_PAREN() { return getToken(SexyLangParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(SexyLangParser.R_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ELSEIF() { return getToken(SexyLangParser.ELSEIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElseIfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitElseIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStmtContext elseIfStmt() throws RecognitionException {
		ElseIfStmtContext _localctx = new ElseIfStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseIfStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			((ElseIfStmtContext)_localctx).command = match(ELSEIF);
			setState(186);
			match(L_PAREN);
			setState(187);
			((ElseIfStmtContext)_localctx).condition = expression(0);
			setState(188);
			match(R_PAREN);
			setState(189);
			block();
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

	public static class ElseStmtContext extends ParserRuleContext {
		public Token command;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SexyLangParser.ELSE, 0); }
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			((ElseStmtContext)_localctx).command = match(ELSE);
			setState(192);
			block();
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

	public static class LubeStmtContext extends ParserRuleContext {
		public Token command;
		public ExpressionContext condition;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LUBE() { return getToken(SexyLangParser.LUBE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LubeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lubeStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitLubeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LubeStmtContext lubeStmt() throws RecognitionException {
		LubeStmtContext _localctx = new LubeStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lubeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((LubeStmtContext)_localctx).command = match(LUBE);
			setState(195);
			((LubeStmtContext)_localctx).condition = expression(0);
			setState(196);
			block();
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

	public static class BedActivityStmtContext extends ParserRuleContext {
		public Token name;
		public TerminalNode BEDACTIVITY() { return getToken(SexyLangParser.BEDACTIVITY, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(SexyLangParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(SexyLangParser.R_PAREN, 0); }
		public MethodBlockContext methodBlock() {
			return getRuleContext(MethodBlockContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SexyLangParser.IDENTIFIER, 0); }
		public ParamsDeclarationContext paramsDeclaration() {
			return getRuleContext(ParamsDeclarationContext.class,0);
		}
		public BedActivityStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bedActivityStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBedActivityStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BedActivityStmtContext bedActivityStmt() throws RecognitionException {
		BedActivityStmtContext _localctx = new BedActivityStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bedActivityStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(BEDACTIVITY);
			setState(199);
			((BedActivityStmtContext)_localctx).name = match(IDENTIFIER);
			setState(200);
			type();
			setState(201);
			match(L_PAREN);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPTY) | (1L << BULGE) | (1L << BODYCOUNT) | (1L << BODYCOUNT_ARRAY) | (1L << LENGTH) | (1L << SAFEWORD))) != 0)) {
				{
				setState(202);
				paramsDeclaration();
				}
			}

			setState(205);
			match(R_PAREN);
			setState(206);
			methodBlock();
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

	public static class ParamsDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SexyLangParser.IDENTIFIER, 0); }
		public ParamsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitParamsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsDeclarationContext paramsDeclaration() throws RecognitionException {
		ParamsDeclarationContext _localctx = new ParamsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_paramsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			type();
			setState(209);
			match(IDENTIFIER);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode EMPTY() { return getToken(SexyLangParser.EMPTY, 0); }
		public TerminalNode BULGE() { return getToken(SexyLangParser.BULGE, 0); }
		public TerminalNode BODYCOUNT() { return getToken(SexyLangParser.BODYCOUNT, 0); }
		public TerminalNode LENGTH() { return getToken(SexyLangParser.LENGTH, 0); }
		public TerminalNode SAFEWORD() { return getToken(SexyLangParser.SAFEWORD, 0); }
		public TerminalNode BODYCOUNT_ARRAY() { return getToken(SexyLangParser.BODYCOUNT_ARRAY, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPTY) | (1L << BULGE) | (1L << BODYCOUNT) | (1L << BODYCOUNT_ARRAY) | (1L << LENGTH) | (1L << SAFEWORD))) != 0)) ) {
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

	public static class BulgeLiteralContext extends ParserRuleContext {
		public TerminalNode HARD() { return getToken(SexyLangParser.HARD, 0); }
		public TerminalNode SOFT() { return getToken(SexyLangParser.SOFT, 0); }
		public BulgeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulgeLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBulgeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BulgeLiteralContext bulgeLiteral() throws RecognitionException {
		BulgeLiteralContext _localctx = new BulgeLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bulgeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==HARD || _la==SOFT) ) {
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

	public static class SafeWordLiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SexyLangParser.STRING, 0); }
		public SafeWordLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_safeWordLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitSafeWordLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SafeWordLiteralContext safeWordLiteral() throws RecognitionException {
		SafeWordLiteralContext _localctx = new SafeWordLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_safeWordLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(STRING);
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

	public static class BodyCountLiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SexyLangParser.NUMBER, 0); }
		public TerminalNode SUB() { return getToken(SexyLangParser.SUB, 0); }
		public BodyCountLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyCountLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBodyCountLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyCountLiteralContext bodyCountLiteral() throws RecognitionException {
		BodyCountLiteralContext _localctx = new BodyCountLiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bodyCountLiteral);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__0);
				}
				break;
			case SUB:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(218);
					match(SUB);
					}
				}

				setState(221);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LengthLiteralContext extends ParserRuleContext {
		public BodyCountLiteralContext bodyCountLiteral() {
			return getRuleContext(BodyCountLiteralContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(SexyLangParser.NUMBER, 0); }
		public LengthLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitLengthLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthLiteralContext lengthLiteral() throws RecognitionException {
		LengthLiteralContext _localctx = new LengthLiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lengthLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			bodyCountLiteral();
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(225);
				match(T__1);
				setState(226);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
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

	public static class BodyCountElementsContext extends ParserRuleContext {
		public List<BodyCountLiteralContext> bodyCountLiteral() {
			return getRuleContexts(BodyCountLiteralContext.class);
		}
		public BodyCountLiteralContext bodyCountLiteral(int i) {
			return getRuleContext(BodyCountLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SexyLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SexyLangParser.COMMA, i);
		}
		public BodyCountElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyCountElements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBodyCountElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyCountElementsContext bodyCountElements() throws RecognitionException {
		BodyCountElementsContext _localctx = new BodyCountElementsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bodyCountElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			bodyCountLiteral();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(230);
				match(COMMA);
				setState(231);
				bodyCountLiteral();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BodyCountArrayLiteralContext extends ParserRuleContext {
		public TerminalNode L_SQUARE() { return getToken(SexyLangParser.L_SQUARE, 0); }
		public TerminalNode R_SQUARE() { return getToken(SexyLangParser.R_SQUARE, 0); }
		public BodyCountElementsContext bodyCountElements() {
			return getRuleContext(BodyCountElementsContext.class,0);
		}
		public BodyCountArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyCountArrayLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBodyCountArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyCountArrayLiteralContext bodyCountArrayLiteral() throws RecognitionException {
		BodyCountArrayLiteralContext _localctx = new BodyCountArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bodyCountArrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(L_SQUARE);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SUB) | (1L << NUMBER))) != 0)) {
				{
				setState(238);
				bodyCountElements();
				}
			}

			setState(241);
			match(R_SQUARE);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public Token index;
		public TerminalNode IDENTIFIER() { return getToken(SexyLangParser.IDENTIFIER, 0); }
		public TerminalNode L_SQUARE() { return getToken(SexyLangParser.L_SQUARE, 0); }
		public TerminalNode R_SQUARE() { return getToken(SexyLangParser.R_SQUARE, 0); }
		public TerminalNode NUMBER() { return getToken(SexyLangParser.NUMBER, 0); }
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(IDENTIFIER);
			setState(244);
			match(L_SQUARE);
			setState(245);
			((ArrayAccessContext)_localctx).index = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==NUMBER) ) {
				((ArrayAccessContext)_localctx).index = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(246);
			match(R_SQUARE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3R"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3`\n\3\f\3\16\3"+
		"c\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5l\n\5\3\5\3\5\3\6\3\6\3\6\7\6s\n"+
		"\6\f\6\16\6v\13\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7~\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0085\n\b\3\t\3\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t\3\t\3\t\3"+
		"\n\3\n\3\n\7\n\u0094\n\n\f\n\16\n\u0097\13\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\5\16\u00ac\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00b4\n\17\f\17\16\17\u00b7\13"+
		"\17\3\17\5\17\u00ba\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00ce\n\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\5\30\u00de"+
		"\n\30\3\30\5\30\u00e1\n\30\3\31\3\31\3\31\5\31\u00e6\n\31\3\32\3\32\3"+
		"\32\7\32\u00eb\n\32\f\32\16\32\u00ee\13\32\3\33\3\33\5\33\u00f2\n\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\2\3\4\35\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\n\3\2 !\3\2\36\37\3\2#\'\3\2()"+
		"\3\2\r\16\3\2\5\n\3\2\25\26\4\2\3\3--\2\u0107\2<\3\2\2\2\4Q\3\2\2\2\6"+
		"d\3\2\2\2\bh\3\2\2\2\no\3\2\2\2\f}\3\2\2\2\16\u0084\3\2\2\2\20\u0086\3"+
		"\2\2\2\22\u0090\3\2\2\2\24\u009b\3\2\2\2\26\u00a1\3\2\2\2\30\u00a6\3\2"+
		"\2\2\32\u00a9\3\2\2\2\34\u00ad\3\2\2\2\36\u00bb\3\2\2\2 \u00c1\3\2\2\2"+
		"\"\u00c4\3\2\2\2$\u00c8\3\2\2\2&\u00d2\3\2\2\2(\u00d5\3\2\2\2*\u00d7\3"+
		"\2\2\2,\u00d9\3\2\2\2.\u00e0\3\2\2\2\60\u00e2\3\2\2\2\62\u00e7\3\2\2\2"+
		"\64\u00ef\3\2\2\2\66\u00f5\3\2\2\28;\5\4\3\29;\5\f\7\2:8\3\2\2\2:9\3\2"+
		"\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\2\2\3@\3\3"+
		"\2\2\2AB\b\3\1\2BC\7\27\2\2CD\5\4\3\2DE\7\30\2\2ER\3\2\2\2FG\7\"\2\2G"+
		"R\5\4\3\20HR\5\6\4\2IR\5\b\5\2JR\5*\26\2KR\5.\30\2LR\5,\27\2MR\5\60\31"+
		"\2NR\5\64\33\2OR\5\66\34\2PR\7,\2\2QA\3\2\2\2QF\3\2\2\2QH\3\2\2\2QI\3"+
		"\2\2\2QJ\3\2\2\2QK\3\2\2\2QL\3\2\2\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3"+
		"\2\2\2Ra\3\2\2\2ST\f\17\2\2TU\t\2\2\2U`\5\4\3\20VW\f\16\2\2WX\t\3\2\2"+
		"X`\5\4\3\17YZ\f\r\2\2Z[\t\4\2\2[`\5\4\3\16\\]\f\f\2\2]^\t\5\2\2^`\5\4"+
		"\3\r_S\3\2\2\2_V\3\2\2\2_Y\3\2\2\2_\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3"+
		"\2\2\2b\5\3\2\2\2ca\3\2\2\2de\7*\2\2ef\7\27\2\2fg\7\30\2\2g\7\3\2\2\2"+
		"hi\7,\2\2ik\7\27\2\2jl\5\n\6\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\30\2"+
		"\2n\t\3\2\2\2ot\5\4\3\2pq\7\35\2\2qs\5\4\3\2rp\3\2\2\2sv\3\2\2\2tr\3\2"+
		"\2\2tu\3\2\2\2u\13\3\2\2\2vt\3\2\2\2w~\5\24\13\2x~\5\26\f\2y~\5\30\r\2"+
		"z~\5\34\17\2{~\5\"\22\2|~\5$\23\2}w\3\2\2\2}x\3\2\2\2}y\3\2\2\2}z\3\2"+
		"\2\2}{\3\2\2\2}|\3\2\2\2~\r\3\2\2\2\177\u0085\5\24\13\2\u0080\u0085\5"+
		"\26\f\2\u0081\u0085\5\30\r\2\u0082\u0085\5\34\17\2\u0083\u0085\5\"\22"+
		"\2\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0083\3\2\2\2\u0085\17\3\2\2\2\u0086\u008b\7\31\2\2\u0087"+
		"\u008a\5\4\3\2\u0088\u008a\5\16\b\2\u0089\u0087\3\2\2\2\u0089\u0088\3"+
		"\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\32\2\2\u008f\21\3\2\2"+
		"\2\u0090\u0095\7\31\2\2\u0091\u0094\5\4\3\2\u0092\u0094\5\16\b\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0099\5\32\16\2\u0099\u009a\7\32\2\2\u009a\23\3\2\2\2\u009b\u009c\7\13"+
		"\2\2\u009c\u009d\5(\25\2\u009d\u009e\5\4\3\2\u009e\u009f\7\f\2\2\u009f"+
		"\u00a0\7,\2\2\u00a0\25\3\2\2\2\u00a1\u00a2\7\13\2\2\u00a2\u00a3\5\4\3"+
		"\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\7,\2\2\u00a5\27\3\2\2\2\u00a6\u00a7"+
		"\t\6\2\2\u00a7\u00a8\5\4\3\2\u00a8\31\3\2\2\2\u00a9\u00ab\7\20\2\2\u00aa"+
		"\u00ac\5\4\3\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\33\3\2\2"+
		"\2\u00ad\u00ae\7\21\2\2\u00ae\u00af\7\27\2\2\u00af\u00b0\5\4\3\2\u00b0"+
		"\u00b1\7\30\2\2\u00b1\u00b5\5\20\t\2\u00b2\u00b4\5\36\20\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\5 \21\2\u00b9\u00b8\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\35\3\2\2\2\u00bb\u00bc\7\22\2\2\u00bc\u00bd"+
		"\7\27\2\2\u00bd\u00be\5\4\3\2\u00be\u00bf\7\30\2\2\u00bf\u00c0\5\20\t"+
		"\2\u00c0\37\3\2\2\2\u00c1\u00c2\7\23\2\2\u00c2\u00c3\5\20\t\2\u00c3!\3"+
		"\2\2\2\u00c4\u00c5\7\24\2\2\u00c5\u00c6\5\4\3\2\u00c6\u00c7\5\20\t\2\u00c7"+
		"#\3\2\2\2\u00c8\u00c9\7\17\2\2\u00c9\u00ca\7,\2\2\u00ca\u00cb\5(\25\2"+
		"\u00cb\u00cd\7\27\2\2\u00cc\u00ce\5&\24\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\30\2\2\u00d0\u00d1\5\22\n\2"+
		"\u00d1%\3\2\2\2\u00d2\u00d3\5(\25\2\u00d3\u00d4\7,\2\2\u00d4\'\3\2\2\2"+
		"\u00d5\u00d6\t\7\2\2\u00d6)\3\2\2\2\u00d7\u00d8\t\b\2\2\u00d8+\3\2\2\2"+
		"\u00d9\u00da\7+\2\2\u00da-\3\2\2\2\u00db\u00e1\7\3\2\2\u00dc\u00de\7\37"+
		"\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e1\7-\2\2\u00e0\u00db\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e1/\3\2\2\2\u00e2"+
		"\u00e5\5.\30\2\u00e3\u00e4\7\4\2\2\u00e4\u00e6\t\t\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\61\3\2\2\2\u00e7\u00ec\5.\30\2\u00e8\u00e9"+
		"\7\35\2\2\u00e9\u00eb\5.\30\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2"+
		"\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\63\3\2\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ef\u00f1\7\33\2\2\u00f0\u00f2\5\62\32\2\u00f1\u00f0\3\2\2"+
		"\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\34\2\2\u00f4"+
		"\65\3\2\2\2\u00f5\u00f6\7,\2\2\u00f6\u00f7\7\33\2\2\u00f7\u00f8\t\t\2"+
		"\2\u00f8\u00f9\7\34\2\2\u00f9\67\3\2\2\2\30:<Q_akt}\u0084\u0089\u008b"+
		"\u0093\u0095\u00ab\u00b5\u00b9\u00cd\u00dd\u00e0\u00e5\u00ec\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}