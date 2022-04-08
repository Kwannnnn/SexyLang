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
		T__0=1, T__1=2, EMPTY=3, BULGE=4, BODYCOUNT=5, LENGTH=6, SAFEWORD=7, BODYCOUNT_ARRAY=8, 
		LENGTH_ARRAY=9, BULGE_ARRAY=10, SAFEWORD_ARRAY=11, INSERT=12, IN=13, MOAN=14, 
		MOANLOUD=15, BEDACTIVITY=16, EJACULATE=17, IF=18, ELSEIF=19, ELSE=20, 
		LUBE=21, HARD=22, SOFT=23, L_PAREN=24, R_PAREN=25, L_CURLY=26, R_CURLY=27, 
		L_SQUARE=28, R_SQUARE=29, COMMA=30, ADD=31, SUB=32, MUL=33, DIV=34, NEG=35, 
		EQUAL=36, GT=37, LT=38, GE=39, LE=40, AND=41, OR=42, WHAT_LENGTH=43, STRING=44, 
		IDENTIFIER=45, NUMBER=46, WS=47, COMMENT=48;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_whatLengthCall = 2, RULE_bedActivityCall = 3, 
		RULE_params = 4, RULE_statement = 5, RULE_blockStatement = 6, RULE_block = 7, 
		RULE_methodBlock = 8, RULE_arrayValueChangeStmt = 9, RULE_varDeclaration = 10, 
		RULE_varAssignment = 11, RULE_moanStmt = 12, RULE_ejaculateStmt = 13, 
		RULE_ifStmt = 14, RULE_elseIfStmt = 15, RULE_elseStmt = 16, RULE_lubeStmt = 17, 
		RULE_bedActivityStmt = 18, RULE_args = 19, RULE_argDeclaration = 20, RULE_type = 21, 
		RULE_bulgeLiteral = 22, RULE_safeWordLiteral = 23, RULE_bodyCountLiteral = 24, 
		RULE_lengthLiteral = 25, RULE_bodyCountElements = 26, RULE_bodyCountArrayLiteral = 27, 
		RULE_lengthArrayElements = 28, RULE_lengthArrayLiteral = 29, RULE_bulgeArrayElements = 30, 
		RULE_bulgeArrayLiteral = 31, RULE_safeWordArrayElements = 32, RULE_safeWordArrayLiteral = 33, 
		RULE_arrayAccess = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "whatLengthCall", "bedActivityCall", "params", 
			"statement", "blockStatement", "block", "methodBlock", "arrayValueChangeStmt", 
			"varDeclaration", "varAssignment", "moanStmt", "ejaculateStmt", "ifStmt", 
			"elseIfStmt", "elseStmt", "lubeStmt", "bedActivityStmt", "args", "argDeclaration", 
			"type", "bulgeLiteral", "safeWordLiteral", "bodyCountLiteral", "lengthLiteral", 
			"bodyCountElements", "bodyCountArrayLiteral", "lengthArrayElements", 
			"lengthArrayLiteral", "bulgeArrayElements", "bulgeArrayLiteral", "safeWordArrayElements", 
			"safeWordArrayLiteral", "arrayAccess"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'.'", "'empty'", "'bulge'", "'bodyCount'", "'length'", 
			"'SafeWord'", "'bodyCountArray'", "'lengthArray'", "'bulgeArray'", "'SafeWordArray'", 
			"'insert'", "'in'", "'moan'", "'moanLoud'", "'bedActivity'", "'ejaculate'", 
			"'if'", "'else if'", "'else'", "'lube'", "'hard'", "'soft'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "','", "'+'", "'-'", "'*'", "'/'", "'!'", 
			"'=='", "'>'", "'<'", "'>='", "'<='", "'and'", "'or'", "'whatLength'", 
			null, null, null, null, "'3==D'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "EMPTY", "BULGE", "BODYCOUNT", "LENGTH", "SAFEWORD", 
			"BODYCOUNT_ARRAY", "LENGTH_ARRAY", "BULGE_ARRAY", "SAFEWORD_ARRAY", "INSERT", 
			"IN", "MOAN", "MOANLOUD", "BEDACTIVITY", "EJACULATE", "IF", "ELSEIF", 
			"ELSE", "LUBE", "HARD", "SOFT", "L_PAREN", "R_PAREN", "L_CURLY", "R_CURLY", 
			"L_SQUARE", "R_SQUARE", "COMMA", "ADD", "SUB", "MUL", "DIV", "NEG", "EQUAL", 
			"GT", "LT", "GE", "LE", "AND", "OR", "WHAT_LENGTH", "STRING", "IDENTIFIER", 
			"NUMBER", "WS", "COMMENT"
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
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INSERT) | (1L << MOAN) | (1L << MOANLOUD) | (1L << BEDACTIVITY) | (1L << IF) | (1L << LUBE) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << L_SQUARE) | (1L << SUB) | (1L << NEG) | (1L << WHAT_LENGTH) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(72);
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
					setState(70);
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
					setState(71);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
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
	public static class BedActivityCallExpressionContext extends ExpressionContext {
		public BedActivityCallContext bedActivityCall() {
			return getRuleContext(BedActivityCallContext.class,0);
		}
		public BedActivityCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBedActivityCallExpression(this);
			else return visitor.visitChildren(this);
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
	public static class SafeWordArrayLiteralExpressionContext extends ExpressionContext {
		public SafeWordArrayLiteralContext safeWordArrayLiteral() {
			return getRuleContext(SafeWordArrayLiteralContext.class,0);
		}
		public SafeWordArrayLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitSafeWordArrayLiteralExpression(this);
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
	public static class LengthArrayLiteralExpressionContext extends ExpressionContext {
		public LengthArrayLiteralContext lengthArrayLiteral() {
			return getRuleContext(LengthArrayLiteralContext.class,0);
		}
		public LengthArrayLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitLengthArrayLiteralExpression(this);
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
	public static class BulgeArrayLiteralExpressionContext extends ExpressionContext {
		public BulgeArrayLiteralContext bulgeArrayLiteral() {
			return getRuleContext(BulgeArrayLiteralContext.class,0);
		}
		public BulgeArrayLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBulgeArrayLiteralExpression(this);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new GroupExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(80);
				match(L_PAREN);
				setState(81);
				expression(0);
				setState(82);
				match(R_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(NEG);
				setState(85);
				expression(17);
				}
				break;
			case 3:
				{
				_localctx = new WhatLengthCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				whatLengthCall();
				}
				break;
			case 4:
				{
				_localctx = new BedActivityCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				bedActivityCall();
				}
				break;
			case 5:
				{
				_localctx = new BulgeLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				bulgeLiteral();
				}
				break;
			case 6:
				{
				_localctx = new BodyCountLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				bodyCountLiteral();
				}
				break;
			case 7:
				{
				_localctx = new SafeWordLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				safeWordLiteral();
				}
				break;
			case 8:
				{
				_localctx = new LengthLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				lengthLiteral();
				}
				break;
			case 9:
				{
				_localctx = new BodyCountArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				bodyCountArrayLiteral();
				}
				break;
			case 10:
				{
				_localctx = new LengthArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				lengthArrayLiteral();
				}
				break;
			case 11:
				{
				_localctx = new BulgeArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				bulgeArrayLiteral();
				}
				break;
			case 12:
				{
				_localctx = new SafeWordArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				safeWordArrayLiteral();
				}
				break;
			case 13:
				{
				_localctx = new ArrayAccessExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				arrayAccess();
				}
				break;
			case 14:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MulDivExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(100);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(101);
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
						setState(102);
						((MulDivExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddSubExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(103);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(104);
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
						setState(105);
						((AddSubExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 3:
						{
						_localctx = new LogicExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LogicExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(107);
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
						setState(108);
						((LogicExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ChainedLogicExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ChainedLogicExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(109);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(110);
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
						setState(111);
						((ChainedLogicExpressionContext)_localctx).right = expression(14);
						}
						break;
					}
					} 
				}
				setState(116);
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
			setState(117);
			match(WHAT_LENGTH);
			setState(118);
			match(L_PAREN);
			setState(119);
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
			setState(121);
			((BedActivityCallContext)_localctx).name = match(IDENTIFIER);
			setState(122);
			match(L_PAREN);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << L_SQUARE) | (1L << SUB) | (1L << NEG) | (1L << WHAT_LENGTH) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(123);
				params();
				}
			}

			setState(126);
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
			setState(128);
			expression(0);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(129);
				match(COMMA);
				setState(130);
				expression(0);
				}
				}
				setState(135);
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
		public ArrayValueChangeStmtContext arrayValueChangeStmt() {
			return getRuleContext(ArrayValueChangeStmtContext.class,0);
		}
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
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				arrayValueChangeStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				varDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				varAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				moanStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				ifStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				lubeStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
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
		public ArrayValueChangeStmtContext arrayValueChangeStmt() {
			return getRuleContext(ArrayValueChangeStmtContext.class,0);
		}
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				arrayValueChangeStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				varDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				varAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				moanStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				ifStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
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
			setState(153);
			match(L_CURLY);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INSERT) | (1L << MOAN) | (1L << MOANLOUD) | (1L << IF) | (1L << LUBE) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << L_SQUARE) | (1L << SUB) | (1L << NEG) | (1L << WHAT_LENGTH) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(156);
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
					setState(154);
					expression(0);
					}
					break;
				case INSERT:
				case MOAN:
				case MOANLOUD:
				case IF:
				case LUBE:
					{
					setState(155);
					blockStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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
			setState(163);
			match(L_CURLY);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INSERT) | (1L << MOAN) | (1L << MOANLOUD) | (1L << IF) | (1L << LUBE) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << L_SQUARE) | (1L << SUB) | (1L << NEG) | (1L << WHAT_LENGTH) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(166);
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
					setState(164);
					expression(0);
					}
					break;
				case INSERT:
				case MOAN:
				case MOANLOUD:
				case IF:
				case LUBE:
					{
					setState(165);
					blockStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			ejaculateStmt();
			setState(172);
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

	public static class ArrayValueChangeStmtContext extends ParserRuleContext {
		public Token command;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(SexyLangParser.IN, 0); }
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public TerminalNode INSERT() { return getToken(SexyLangParser.INSERT, 0); }
		public ArrayValueChangeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValueChangeStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitArrayValueChangeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValueChangeStmtContext arrayValueChangeStmt() throws RecognitionException {
		ArrayValueChangeStmtContext _localctx = new ArrayValueChangeStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayValueChangeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			((ArrayValueChangeStmtContext)_localctx).command = match(INSERT);
			setState(175);
			expression(0);
			setState(176);
			match(IN);
			setState(177);
			arrayAccess();
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
		enterRule(_localctx, 20, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			((VarDeclarationContext)_localctx).command = match(INSERT);
			setState(180);
			((VarDeclarationContext)_localctx).varType = type();
			setState(181);
			expression(0);
			setState(182);
			match(IN);
			setState(183);
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
		enterRule(_localctx, 22, RULE_varAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			((VarAssignmentContext)_localctx).command = match(INSERT);
			setState(186);
			expression(0);
			setState(187);
			match(IN);
			setState(188);
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
		enterRule(_localctx, 24, RULE_moanStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
			setState(191);
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
		enterRule(_localctx, 26, RULE_ejaculateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			((EjaculateStmtContext)_localctx).command = match(EJACULATE);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << L_SQUARE) | (1L << SUB) | (1L << NEG) | (1L << WHAT_LENGTH) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(194);
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
		enterRule(_localctx, 28, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			((IfStmtContext)_localctx).command = match(IF);
			setState(198);
			match(L_PAREN);
			setState(199);
			((IfStmtContext)_localctx).condition = expression(0);
			setState(200);
			match(R_PAREN);
			setState(201);
			block();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(202);
				elseIfStmt();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(208);
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
		enterRule(_localctx, 30, RULE_elseIfStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			((ElseIfStmtContext)_localctx).command = match(ELSEIF);
			setState(212);
			match(L_PAREN);
			setState(213);
			((ElseIfStmtContext)_localctx).condition = expression(0);
			setState(214);
			match(R_PAREN);
			setState(215);
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
		enterRule(_localctx, 32, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((ElseStmtContext)_localctx).command = match(ELSE);
			setState(218);
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
		enterRule(_localctx, 34, RULE_lubeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			((LubeStmtContext)_localctx).command = match(LUBE);
			setState(221);
			((LubeStmtContext)_localctx).condition = expression(0);
			setState(222);
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
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
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
		enterRule(_localctx, 36, RULE_bedActivityStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(BEDACTIVITY);
			setState(225);
			((BedActivityStmtContext)_localctx).name = match(IDENTIFIER);
			setState(226);
			type();
			setState(227);
			match(L_PAREN);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPTY) | (1L << BULGE) | (1L << BODYCOUNT) | (1L << LENGTH) | (1L << SAFEWORD) | (1L << BODYCOUNT_ARRAY) | (1L << LENGTH_ARRAY) | (1L << BULGE_ARRAY) | (1L << SAFEWORD_ARRAY))) != 0)) {
				{
				setState(228);
				args();
				}
			}

			setState(231);
			match(R_PAREN);
			setState(232);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ArgDeclarationContext> argDeclaration() {
			return getRuleContexts(ArgDeclarationContext.class);
		}
		public ArgDeclarationContext argDeclaration(int i) {
			return getRuleContext(ArgDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SexyLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SexyLangParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			argDeclaration();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(235);
				match(COMMA);
				setState(236);
				argDeclaration();
				}
				}
				setState(241);
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

	public static class ArgDeclarationContext extends ParserRuleContext {
		public Token name;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SexyLangParser.IDENTIFIER, 0); }
		public ArgDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitArgDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgDeclarationContext argDeclaration() throws RecognitionException {
		ArgDeclarationContext _localctx = new ArgDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_argDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			type();
			setState(243);
			((ArgDeclarationContext)_localctx).name = match(IDENTIFIER);
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
		public TerminalNode LENGTH_ARRAY() { return getToken(SexyLangParser.LENGTH_ARRAY, 0); }
		public TerminalNode BULGE_ARRAY() { return getToken(SexyLangParser.BULGE_ARRAY, 0); }
		public TerminalNode SAFEWORD_ARRAY() { return getToken(SexyLangParser.SAFEWORD_ARRAY, 0); }
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
		enterRule(_localctx, 42, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EMPTY) | (1L << BULGE) | (1L << BODYCOUNT) | (1L << LENGTH) | (1L << SAFEWORD) | (1L << BODYCOUNT_ARRAY) | (1L << LENGTH_ARRAY) | (1L << BULGE_ARRAY) | (1L << SAFEWORD_ARRAY))) != 0)) ) {
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
		enterRule(_localctx, 44, RULE_bulgeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		enterRule(_localctx, 46, RULE_safeWordLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 48, RULE_bodyCountLiteral);
		int _la;
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(T__0);
				}
				break;
			case SUB:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(252);
					match(SUB);
					}
				}

				setState(255);
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
		enterRule(_localctx, 50, RULE_lengthLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			bodyCountLiteral();
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(259);
				match(T__1);
				setState(260);
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
		enterRule(_localctx, 52, RULE_bodyCountElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			bodyCountLiteral();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(264);
				match(COMMA);
				setState(265);
				bodyCountLiteral();
				}
				}
				setState(270);
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
		enterRule(_localctx, 54, RULE_bodyCountArrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(L_SQUARE);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SUB) | (1L << NUMBER))) != 0)) {
				{
				setState(272);
				bodyCountElements();
				}
			}

			setState(275);
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

	public static class LengthArrayElementsContext extends ParserRuleContext {
		public List<LengthLiteralContext> lengthLiteral() {
			return getRuleContexts(LengthLiteralContext.class);
		}
		public LengthLiteralContext lengthLiteral(int i) {
			return getRuleContext(LengthLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SexyLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SexyLangParser.COMMA, i);
		}
		public LengthArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthArrayElements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitLengthArrayElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthArrayElementsContext lengthArrayElements() throws RecognitionException {
		LengthArrayElementsContext _localctx = new LengthArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lengthArrayElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			lengthLiteral();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(278);
				match(COMMA);
				setState(279);
				lengthLiteral();
				}
				}
				setState(284);
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

	public static class LengthArrayLiteralContext extends ParserRuleContext {
		public TerminalNode L_SQUARE() { return getToken(SexyLangParser.L_SQUARE, 0); }
		public TerminalNode R_SQUARE() { return getToken(SexyLangParser.R_SQUARE, 0); }
		public LengthArrayElementsContext lengthArrayElements() {
			return getRuleContext(LengthArrayElementsContext.class,0);
		}
		public LengthArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthArrayLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitLengthArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthArrayLiteralContext lengthArrayLiteral() throws RecognitionException {
		LengthArrayLiteralContext _localctx = new LengthArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lengthArrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(L_SQUARE);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SUB) | (1L << NUMBER))) != 0)) {
				{
				setState(286);
				lengthArrayElements();
				}
			}

			setState(289);
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

	public static class BulgeArrayElementsContext extends ParserRuleContext {
		public List<BulgeLiteralContext> bulgeLiteral() {
			return getRuleContexts(BulgeLiteralContext.class);
		}
		public BulgeLiteralContext bulgeLiteral(int i) {
			return getRuleContext(BulgeLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SexyLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SexyLangParser.COMMA, i);
		}
		public BulgeArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulgeArrayElements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBulgeArrayElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BulgeArrayElementsContext bulgeArrayElements() throws RecognitionException {
		BulgeArrayElementsContext _localctx = new BulgeArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bulgeArrayElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			bulgeLiteral();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(292);
				match(COMMA);
				setState(293);
				bulgeLiteral();
				}
				}
				setState(298);
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

	public static class BulgeArrayLiteralContext extends ParserRuleContext {
		public TerminalNode L_SQUARE() { return getToken(SexyLangParser.L_SQUARE, 0); }
		public TerminalNode R_SQUARE() { return getToken(SexyLangParser.R_SQUARE, 0); }
		public BulgeArrayElementsContext bulgeArrayElements() {
			return getRuleContext(BulgeArrayElementsContext.class,0);
		}
		public BulgeArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulgeArrayLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitBulgeArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BulgeArrayLiteralContext bulgeArrayLiteral() throws RecognitionException {
		BulgeArrayLiteralContext _localctx = new BulgeArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bulgeArrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(L_SQUARE);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HARD || _la==SOFT) {
				{
				setState(300);
				bulgeArrayElements();
				}
			}

			setState(303);
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

	public static class SafeWordArrayElementsContext extends ParserRuleContext {
		public List<SafeWordLiteralContext> safeWordLiteral() {
			return getRuleContexts(SafeWordLiteralContext.class);
		}
		public SafeWordLiteralContext safeWordLiteral(int i) {
			return getRuleContext(SafeWordLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SexyLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SexyLangParser.COMMA, i);
		}
		public SafeWordArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_safeWordArrayElements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitSafeWordArrayElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SafeWordArrayElementsContext safeWordArrayElements() throws RecognitionException {
		SafeWordArrayElementsContext _localctx = new SafeWordArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_safeWordArrayElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			safeWordLiteral();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(306);
				match(COMMA);
				setState(307);
				safeWordLiteral();
				}
				}
				setState(312);
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

	public static class SafeWordArrayLiteralContext extends ParserRuleContext {
		public TerminalNode L_SQUARE() { return getToken(SexyLangParser.L_SQUARE, 0); }
		public TerminalNode R_SQUARE() { return getToken(SexyLangParser.R_SQUARE, 0); }
		public SafeWordArrayElementsContext safeWordArrayElements() {
			return getRuleContext(SafeWordArrayElementsContext.class,0);
		}
		public SafeWordArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_safeWordArrayLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitSafeWordArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SafeWordArrayLiteralContext safeWordArrayLiteral() throws RecognitionException {
		SafeWordArrayLiteralContext _localctx = new SafeWordArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_safeWordArrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(L_SQUARE);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(314);
				safeWordArrayElements();
				}
			}

			setState(317);
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
		public ExpressionContext index;
		public TerminalNode IDENTIFIER() { return getToken(SexyLangParser.IDENTIFIER, 0); }
		public TerminalNode L_SQUARE() { return getToken(SexyLangParser.L_SQUARE, 0); }
		public TerminalNode R_SQUARE() { return getToken(SexyLangParser.R_SQUARE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(IDENTIFIER);
			setState(320);
			match(L_SQUARE);
			setState(321);
			((ArrayAccessContext)_localctx).index = expression(0);
			setState(322);
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
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0147\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3e\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3s\n\3\f\3"+
		"\16\3v\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\177\n\5\3\5\3\5\3\6\3\6\3"+
		"\6\7\6\u0086\n\6\f\6\16\6\u0089\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0092"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009a\n\b\3\t\3\t\3\t\7\t\u009f\n\t\f"+
		"\t\16\t\u00a2\13\t\3\t\3\t\3\n\3\n\3\n\7\n\u00a9\n\n\f\n\16\n\u00ac\13"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\5\17\u00c6\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u00ce\n\20\f\20\16\20\u00d1\13\20\3\20\5\20\u00d4"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00e8\n\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\7\25\u00f0\n\25\f\25\16\25\u00f3\13\25\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\5\32\u0100\n\32\3\32\5\32\u0103\n\32\3\33\3"+
		"\33\3\33\5\33\u0108\n\33\3\34\3\34\3\34\7\34\u010d\n\34\f\34\16\34\u0110"+
		"\13\34\3\35\3\35\5\35\u0114\n\35\3\35\3\35\3\36\3\36\3\36\7\36\u011b\n"+
		"\36\f\36\16\36\u011e\13\36\3\37\3\37\5\37\u0122\n\37\3\37\3\37\3 \3 \3"+
		" \7 \u0129\n \f \16 \u012c\13 \3!\3!\5!\u0130\n!\3!\3!\3\"\3\"\3\"\7\""+
		"\u0137\n\"\f\"\16\"\u013a\13\"\3#\3#\5#\u013e\n#\3#\3#\3$\3$\3$\3$\3$"+
		"\3$\2\3\4%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDF\2\n\3\2#$\3\2!\"\3\2&*\3\2+,\3\2\20\21\3\2\5\r\3\2\30\31\4\2"+
		"\3\3\60\60\2\u0157\2L\3\2\2\2\4d\3\2\2\2\6w\3\2\2\2\b{\3\2\2\2\n\u0082"+
		"\3\2\2\2\f\u0091\3\2\2\2\16\u0099\3\2\2\2\20\u009b\3\2\2\2\22\u00a5\3"+
		"\2\2\2\24\u00b0\3\2\2\2\26\u00b5\3\2\2\2\30\u00bb\3\2\2\2\32\u00c0\3\2"+
		"\2\2\34\u00c3\3\2\2\2\36\u00c7\3\2\2\2 \u00d5\3\2\2\2\"\u00db\3\2\2\2"+
		"$\u00de\3\2\2\2&\u00e2\3\2\2\2(\u00ec\3\2\2\2*\u00f4\3\2\2\2,\u00f7\3"+
		"\2\2\2.\u00f9\3\2\2\2\60\u00fb\3\2\2\2\62\u0102\3\2\2\2\64\u0104\3\2\2"+
		"\2\66\u0109\3\2\2\28\u0111\3\2\2\2:\u0117\3\2\2\2<\u011f\3\2\2\2>\u0125"+
		"\3\2\2\2@\u012d\3\2\2\2B\u0133\3\2\2\2D\u013b\3\2\2\2F\u0141\3\2\2\2H"+
		"K\5\4\3\2IK\5\f\7\2JH\3\2\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2"+
		"MO\3\2\2\2NL\3\2\2\2OP\7\2\2\3P\3\3\2\2\2QR\b\3\1\2RS\7\32\2\2ST\5\4\3"+
		"\2TU\7\33\2\2Ue\3\2\2\2VW\7%\2\2We\5\4\3\23Xe\5\6\4\2Ye\5\b\5\2Ze\5.\30"+
		"\2[e\5\62\32\2\\e\5\60\31\2]e\5\64\33\2^e\58\35\2_e\5<\37\2`e\5@!\2ae"+
		"\5D#\2be\5F$\2ce\7/\2\2dQ\3\2\2\2dV\3\2\2\2dX\3\2\2\2dY\3\2\2\2dZ\3\2"+
		"\2\2d[\3\2\2\2d\\\3\2\2\2d]\3\2\2\2d^\3\2\2\2d_\3\2\2\2d`\3\2\2\2da\3"+
		"\2\2\2db\3\2\2\2dc\3\2\2\2et\3\2\2\2fg\f\22\2\2gh\t\2\2\2hs\5\4\3\23i"+
		"j\f\21\2\2jk\t\3\2\2ks\5\4\3\22lm\f\20\2\2mn\t\4\2\2ns\5\4\3\21op\f\17"+
		"\2\2pq\t\5\2\2qs\5\4\3\20rf\3\2\2\2ri\3\2\2\2rl\3\2\2\2ro\3\2\2\2sv\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2u\5\3\2\2\2vt\3\2\2\2wx\7-\2\2xy\7\32\2\2yz"+
		"\7\33\2\2z\7\3\2\2\2{|\7/\2\2|~\7\32\2\2}\177\5\n\6\2~}\3\2\2\2~\177\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7\33\2\2\u0081\t\3\2\2\2\u0082\u0087"+
		"\5\4\3\2\u0083\u0084\7 \2\2\u0084\u0086\5\4\3\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\13\3\2\2"+
		"\2\u0089\u0087\3\2\2\2\u008a\u0092\5\24\13\2\u008b\u0092\5\26\f\2\u008c"+
		"\u0092\5\30\r\2\u008d\u0092\5\32\16\2\u008e\u0092\5\36\20\2\u008f\u0092"+
		"\5$\23\2\u0090\u0092\5&\24\2\u0091\u008a\3\2\2\2\u0091\u008b\3\2\2\2\u0091"+
		"\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0090\3\2\2\2\u0092\r\3\2\2\2\u0093\u009a\5\24\13\2\u0094\u009a"+
		"\5\26\f\2\u0095\u009a\5\30\r\2\u0096\u009a\5\32\16\2\u0097\u009a\5\36"+
		"\20\2\u0098\u009a\5$\23\2\u0099\u0093\3\2\2\2\u0099\u0094\3\2\2\2\u0099"+
		"\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2"+
		"\2\2\u009a\17\3\2\2\2\u009b\u00a0\7\34\2\2\u009c\u009f\5\4\3\2\u009d\u009f"+
		"\5\16\b\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a4\7\35\2\2\u00a4\21\3\2\2\2\u00a5\u00aa\7\34\2\2\u00a6"+
		"\u00a9\5\4\3\2\u00a7\u00a9\5\16\b\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3"+
		"\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\5\34\17\2\u00ae\u00af\7"+
		"\35\2\2\u00af\23\3\2\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00b2\5\4\3\2\u00b2"+
		"\u00b3\7\17\2\2\u00b3\u00b4\5F$\2\u00b4\25\3\2\2\2\u00b5\u00b6\7\16\2"+
		"\2\u00b6\u00b7\5,\27\2\u00b7\u00b8\5\4\3\2\u00b8\u00b9\7\17\2\2\u00b9"+
		"\u00ba\7/\2\2\u00ba\27\3\2\2\2\u00bb\u00bc\7\16\2\2\u00bc\u00bd\5\4\3"+
		"\2\u00bd\u00be\7\17\2\2\u00be\u00bf\7/\2\2\u00bf\31\3\2\2\2\u00c0\u00c1"+
		"\t\6\2\2\u00c1\u00c2\5\4\3\2\u00c2\33\3\2\2\2\u00c3\u00c5\7\23\2\2\u00c4"+
		"\u00c6\5\4\3\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\35\3\2\2"+
		"\2\u00c7\u00c8\7\24\2\2\u00c8\u00c9\7\32\2\2\u00c9\u00ca\5\4\3\2\u00ca"+
		"\u00cb\7\33\2\2\u00cb\u00cf\5\20\t\2\u00cc\u00ce\5 \21\2\u00cd\u00cc\3"+
		"\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\5\"\22\2\u00d3\u00d2\3"+
		"\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\37\3\2\2\2\u00d5\u00d6\7\25\2\2\u00d6"+
		"\u00d7\7\32\2\2\u00d7\u00d8\5\4\3\2\u00d8\u00d9\7\33\2\2\u00d9\u00da\5"+
		"\20\t\2\u00da!\3\2\2\2\u00db\u00dc\7\26\2\2\u00dc\u00dd\5\20\t\2\u00dd"+
		"#\3\2\2\2\u00de\u00df\7\27\2\2\u00df\u00e0\5\4\3\2\u00e0\u00e1\5\20\t"+
		"\2\u00e1%\3\2\2\2\u00e2\u00e3\7\22\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e5"+
		"\5,\27\2\u00e5\u00e7\7\32\2\2\u00e6\u00e8\5(\25\2\u00e7\u00e6\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\33\2\2\u00ea\u00eb"+
		"\5\22\n\2\u00eb\'\3\2\2\2\u00ec\u00f1\5*\26\2\u00ed\u00ee\7 \2\2\u00ee"+
		"\u00f0\5*\26\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2)\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5"+
		"\5,\27\2\u00f5\u00f6\7/\2\2\u00f6+\3\2\2\2\u00f7\u00f8\t\7\2\2\u00f8-"+
		"\3\2\2\2\u00f9\u00fa\t\b\2\2\u00fa/\3\2\2\2\u00fb\u00fc\7.\2\2\u00fc\61"+
		"\3\2\2\2\u00fd\u0103\7\3\2\2\u00fe\u0100\7\"\2\2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\7\60\2\2\u0102\u00fd\3"+
		"\2\2\2\u0102\u00ff\3\2\2\2\u0103\63\3\2\2\2\u0104\u0107\5\62\32\2\u0105"+
		"\u0106\7\4\2\2\u0106\u0108\t\t\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\65\3\2\2\2\u0109\u010e\5\62\32\2\u010a\u010b\7 \2\2\u010b\u010d"+
		"\5\62\32\2\u010c\u010a\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2"+
		"\u010e\u010f\3\2\2\2\u010f\67\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0113"+
		"\7\36\2\2\u0112\u0114\5\66\34\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2"+
		"\2\u0114\u0115\3\2\2\2\u0115\u0116\7\37\2\2\u01169\3\2\2\2\u0117\u011c"+
		"\5\64\33\2\u0118\u0119\7 \2\2\u0119\u011b\5\64\33\2\u011a\u0118\3\2\2"+
		"\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d;"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121\7\36\2\2\u0120\u0122\5:\36\2"+
		"\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124"+
		"\7\37\2\2\u0124=\3\2\2\2\u0125\u012a\5.\30\2\u0126\u0127\7 \2\2\u0127"+
		"\u0129\5.\30\2\u0128\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b?\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f"+
		"\7\36\2\2\u012e\u0130\5> \2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\7\37\2\2\u0132A\3\2\2\2\u0133\u0138\5\60\31"+
		"\2\u0134\u0135\7 \2\2\u0135\u0137\5\60\31\2\u0136\u0134\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139C\3\2\2\2"+
		"\u013a\u0138\3\2\2\2\u013b\u013d\7\36\2\2\u013c\u013e\5B\"\2\u013d\u013c"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7\37\2\2"+
		"\u0140E\3\2\2\2\u0141\u0142\7/\2\2\u0142\u0143\7\36\2\2\u0143\u0144\5"+
		"\4\3\2\u0144\u0145\7\37\2\2\u0145G\3\2\2\2\37JLdrt~\u0087\u0091\u0099"+
		"\u009e\u00a0\u00a8\u00aa\u00c5\u00cf\u00d3\u00e7\u00f1\u00ff\u0102\u0107"+
		"\u010e\u0113\u011c\u0121\u012a\u012f\u0138\u013d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}