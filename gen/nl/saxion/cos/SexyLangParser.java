// Generated from /Users/kristiyan/Documents/Saxion/Y2/Q3/compilers-and-os/61/src/SexyLang.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, BULGE=3, BODYCOUNT=4, LENGTH=5, SAFEWORD=6, INSERT=7, 
		IN=8, MOAN=9, MOANLOUD=10, BEDACTIVITY=11, EJACULATE=12, IF=13, ELSEIF=14, 
		ELSE=15, LUBE=16, HARD=17, SOFT=18, L_PAREN=19, R_PAREN=20, L_CURLY=21, 
		R_CURLY=22, COMMA=23, ADD=24, SUB=25, MUL=26, DIV=27, NEG=28, EQUAL=29, 
		GT=30, LT=31, GE=32, LE=33, AND=34, OR=35, STRING=36, IDENTIFIER=37, NUMBER=38, 
		WS=39, COMMENT=40;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_bedActivityCall = 2, RULE_params = 3, 
		RULE_statement = 4, RULE_blockStatement = 5, RULE_block = 6, RULE_varDeclaration = 7, 
		RULE_varAssignment = 8, RULE_moanStmt = 9, RULE_ejaculateStmt = 10, RULE_ifStmt = 11, 
		RULE_elseIfStmt = 12, RULE_elseStmt = 13, RULE_lubeStmt = 14, RULE_bedActivityStmt = 15, 
		RULE_paramsDeclaration = 16, RULE_type = 17, RULE_bulgeLiteral = 18, RULE_safeWordLiteral = 19, 
		RULE_bodyCountLiteral = 20, RULE_lengthLiteral = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "bedActivityCall", "params", "statement", "blockStatement", 
			"block", "varDeclaration", "varAssignment", "moanStmt", "ejaculateStmt", 
			"ifStmt", "elseIfStmt", "elseStmt", "lubeStmt", "bedActivityStmt", "paramsDeclaration", 
			"type", "bulgeLiteral", "safeWordLiteral", "bodyCountLiteral", "lengthLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'.'", "'bulge'", "'bodyCount'", "'length'", "'SafeWord'", 
			"'insert'", "'in'", "'moan'", "'moanLoud'", "'bedActivity'", "'ejaculate'", 
			"'if'", "'else if'", "'else'", "'lube'", "'hard'", "'soft'", "'('", "')'", 
			"'{'", "'}'", "','", "'+'", "'-'", "'*'", "'/'", "'!'", "'=='", "'>'", 
			"'<'", "'>='", "'<='", "'and'", "'or'", null, null, null, null, "'3==D'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "BULGE", "BODYCOUNT", "LENGTH", "SAFEWORD", "INSERT", 
			"IN", "MOAN", "MOANLOUD", "BEDACTIVITY", "EJACULATE", "IF", "ELSEIF", 
			"ELSE", "LUBE", "HARD", "SOFT", "L_PAREN", "R_PAREN", "L_CURLY", "R_CURLY", 
			"COMMA", "ADD", "SUB", "MUL", "DIV", "NEG", "EQUAL", "GT", "LT", "GE", 
			"LE", "AND", "OR", "STRING", "IDENTIFIER", "NUMBER", "WS", "COMMENT"
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
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INSERT) | (1L << MOAN) | (1L << MOANLOUD) | (1L << BEDACTIVITY) | (1L << IF) | (1L << LUBE) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << SUB) | (1L << NEG) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case HARD:
				case SOFT:
				case L_PAREN:
				case SUB:
				case NEG:
				case STRING:
				case IDENTIFIER:
				case NUMBER:
					{
					setState(44);
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
					setState(45);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(SexyLangParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitIdentifierExpression(this);
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
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new GroupExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(54);
				match(L_PAREN);
				setState(55);
				expression(0);
				setState(56);
				match(R_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(NEG);
				setState(59);
				expression(11);
				}
				break;
			case 3:
				{
				_localctx = new BedActivitCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				bedActivityCall();
				}
				break;
			case 4:
				{
				_localctx = new BulgeLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				bulgeLiteral();
				}
				break;
			case 5:
				{
				_localctx = new BodyCountLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				bodyCountLiteral();
				}
				break;
			case 6:
				{
				_localctx = new SafeWordLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				safeWordLiteral();
				}
				break;
			case 7:
				{
				_localctx = new LengthLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				lengthLiteral();
				}
				break;
			case 8:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(80);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MulDivExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(69);
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
						setState(70);
						((MulDivExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddSubExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(72);
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
						setState(73);
						((AddSubExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 3:
						{
						_localctx = new LogicExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LogicExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(75);
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
						setState(76);
						((LogicExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ChainedLogicExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ChainedLogicExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(78);
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
						setState(79);
						((ChainedLogicExpressionContext)_localctx).right = expression(8);
						}
						break;
					}
					} 
				}
				setState(84);
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

	public static class BedActivityCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SexyLangParser.IDENTIFIER, 0); }
		public TerminalNode L_PAREN() { return getToken(SexyLangParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(SexyLangParser.R_PAREN, 0); }
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
		enterRule(_localctx, 4, RULE_bedActivityCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(IDENTIFIER);
			setState(86);
			match(L_PAREN);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << SUB) | (1L << NEG) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(87);
				params();
				}
			}

			setState(90);
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
		enterRule(_localctx, 6, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			expression(0);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(93);
				match(COMMA);
				setState(94);
				expression(0);
				}
				}
				setState(99);
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
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				moanStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				lubeStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
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
		public EjaculateStmtContext ejaculateStmt() {
			return getRuleContext(EjaculateStmtContext.class,0);
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
		enterRule(_localctx, 10, RULE_blockStatement);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				moanStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				lubeStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				ejaculateStmt();
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
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(L_CURLY);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INSERT) | (1L << MOAN) | (1L << MOANLOUD) | (1L << EJACULATE) | (1L << IF) | (1L << LUBE) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << SUB) | (1L << NEG) | (1L << STRING) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(119);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case HARD:
				case SOFT:
				case L_PAREN:
				case SUB:
				case NEG:
				case STRING:
				case IDENTIFIER:
				case NUMBER:
					{
					setState(117);
					expression(0);
					}
					break;
				case INSERT:
				case MOAN:
				case MOANLOUD:
				case EJACULATE:
				case IF:
				case LUBE:
					{
					setState(118);
					blockStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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
		enterRule(_localctx, 14, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((VarDeclarationContext)_localctx).command = match(INSERT);
			setState(127);
			((VarDeclarationContext)_localctx).varType = type();
			setState(128);
			expression(0);
			setState(129);
			match(IN);
			setState(130);
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
		enterRule(_localctx, 16, RULE_varAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			((VarAssignmentContext)_localctx).command = match(INSERT);
			setState(133);
			expression(0);
			setState(134);
			match(IN);
			setState(135);
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
		enterRule(_localctx, 18, RULE_moanStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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
			setState(138);
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
		enterRule(_localctx, 20, RULE_ejaculateStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((EjaculateStmtContext)_localctx).command = match(EJACULATE);
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(141);
				expression(0);
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
		enterRule(_localctx, 22, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((IfStmtContext)_localctx).command = match(IF);
			setState(145);
			match(L_PAREN);
			setState(146);
			((IfStmtContext)_localctx).condition = expression(0);
			setState(147);
			match(R_PAREN);
			setState(148);
			block();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(149);
				elseIfStmt();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(155);
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
		enterRule(_localctx, 24, RULE_elseIfStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			((ElseIfStmtContext)_localctx).command = match(ELSEIF);
			setState(159);
			match(L_PAREN);
			setState(160);
			((ElseIfStmtContext)_localctx).condition = expression(0);
			setState(161);
			match(R_PAREN);
			setState(162);
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
		enterRule(_localctx, 26, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((ElseStmtContext)_localctx).command = match(ELSE);
			setState(165);
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
		enterRule(_localctx, 28, RULE_lubeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((LubeStmtContext)_localctx).command = match(LUBE);
			setState(168);
			((LubeStmtContext)_localctx).condition = expression(0);
			setState(169);
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
		public TerminalNode L_PAREN() { return getToken(SexyLangParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(SexyLangParser.R_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SexyLangParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_bedActivityStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(BEDACTIVITY);
			setState(172);
			((BedActivityStmtContext)_localctx).name = match(IDENTIFIER);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BULGE) | (1L << BODYCOUNT) | (1L << LENGTH) | (1L << SAFEWORD))) != 0)) {
				{
				setState(173);
				type();
				}
			}

			setState(176);
			match(L_PAREN);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BULGE) | (1L << BODYCOUNT) | (1L << LENGTH) | (1L << SAFEWORD))) != 0)) {
				{
				setState(177);
				paramsDeclaration();
				}
			}

			setState(180);
			match(R_PAREN);
			setState(181);
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
		enterRule(_localctx, 32, RULE_paramsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			type();
			setState(184);
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
		public TerminalNode BULGE() { return getToken(SexyLangParser.BULGE, 0); }
		public TerminalNode BODYCOUNT() { return getToken(SexyLangParser.BODYCOUNT, 0); }
		public TerminalNode LENGTH() { return getToken(SexyLangParser.LENGTH, 0); }
		public TerminalNode SAFEWORD() { return getToken(SexyLangParser.SAFEWORD, 0); }
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
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BULGE) | (1L << BODYCOUNT) | (1L << LENGTH) | (1L << SAFEWORD))) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_bulgeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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
		enterRule(_localctx, 38, RULE_safeWordLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		enterRule(_localctx, 40, RULE_bodyCountLiteral);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(T__0);
				}
				break;
			case SUB:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(193);
					match(SUB);
					}
				}

				setState(196);
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
		enterRule(_localctx, 42, RULE_lengthLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			bodyCountLiteral();
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(200);
				match(T__1);
				setState(201);
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
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3E\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"S\n\3\f\3\16\3V\13\3\3\4\3\4\3\4\5\4[\n\4\3\4\3\4\3\5\3\5\3\5\7\5b\n\5"+
		"\f\5\16\5e\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7u\n\7\3\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\5\f\u0091\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\7\r\u0099\n\r\f\r\16\r\u009c\13\r\3\r\5\r\u009f"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\5\21\u00b1\n\21\3\21\3\21\5\21\u00b5\n\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\5\26\u00c5"+
		"\n\26\3\26\5\26\u00c8\n\26\3\27\3\27\3\27\5\27\u00cd\n\27\3\27\2\3\4\30"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\n\3\2\34\35\3\2\32\33"+
		"\3\2\37#\3\2$%\3\2\13\f\3\2\5\b\3\2\23\24\4\2\3\3((\2\u00db\2\62\3\2\2"+
		"\2\4D\3\2\2\2\6W\3\2\2\2\b^\3\2\2\2\nl\3\2\2\2\ft\3\2\2\2\16v\3\2\2\2"+
		"\20\u0080\3\2\2\2\22\u0086\3\2\2\2\24\u008b\3\2\2\2\26\u008e\3\2\2\2\30"+
		"\u0092\3\2\2\2\32\u00a0\3\2\2\2\34\u00a6\3\2\2\2\36\u00a9\3\2\2\2 \u00ad"+
		"\3\2\2\2\"\u00b9\3\2\2\2$\u00bc\3\2\2\2&\u00be\3\2\2\2(\u00c0\3\2\2\2"+
		"*\u00c7\3\2\2\2,\u00c9\3\2\2\2.\61\5\4\3\2/\61\5\n\6\2\60.\3\2\2\2\60"+
		"/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62"+
		"\3\2\2\2\65\66\7\2\2\3\66\3\3\2\2\2\678\b\3\1\289\7\25\2\29:\5\4\3\2:"+
		";\7\26\2\2;E\3\2\2\2<=\7\36\2\2=E\5\4\3\r>E\5\6\4\2?E\5&\24\2@E\5*\26"+
		"\2AE\5(\25\2BE\5,\27\2CE\7\'\2\2D\67\3\2\2\2D<\3\2\2\2D>\3\2\2\2D?\3\2"+
		"\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2ET\3\2\2\2FG\f\f\2\2GH\t\2"+
		"\2\2HS\5\4\3\rIJ\f\13\2\2JK\t\3\2\2KS\5\4\3\fLM\f\n\2\2MN\t\4\2\2NS\5"+
		"\4\3\13OP\f\t\2\2PQ\t\5\2\2QS\5\4\3\nRF\3\2\2\2RI\3\2\2\2RL\3\2\2\2RO"+
		"\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\5\3\2\2\2VT\3\2\2\2WX\7\'\2\2"+
		"XZ\7\25\2\2Y[\5\b\5\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\26\2\2]\7\3"+
		"\2\2\2^c\5\4\3\2_`\7\31\2\2`b\5\4\3\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd"+
		"\3\2\2\2d\t\3\2\2\2ec\3\2\2\2fm\5\20\t\2gm\5\22\n\2hm\5\24\13\2im\5\30"+
		"\r\2jm\5\36\20\2km\5 \21\2lf\3\2\2\2lg\3\2\2\2lh\3\2\2\2li\3\2\2\2lj\3"+
		"\2\2\2lk\3\2\2\2m\13\3\2\2\2nu\5\20\t\2ou\5\22\n\2pu\5\24\13\2qu\5\30"+
		"\r\2ru\5\36\20\2su\5\26\f\2tn\3\2\2\2to\3\2\2\2tp\3\2\2\2tq\3\2\2\2tr"+
		"\3\2\2\2ts\3\2\2\2u\r\3\2\2\2v{\7\27\2\2wz\5\4\3\2xz\5\f\7\2yw\3\2\2\2"+
		"yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\30"+
		"\2\2\177\17\3\2\2\2\u0080\u0081\7\t\2\2\u0081\u0082\5$\23\2\u0082\u0083"+
		"\5\4\3\2\u0083\u0084\7\n\2\2\u0084\u0085\7\'\2\2\u0085\21\3\2\2\2\u0086"+
		"\u0087\7\t\2\2\u0087\u0088\5\4\3\2\u0088\u0089\7\n\2\2\u0089\u008a\7\'"+
		"\2\2\u008a\23\3\2\2\2\u008b\u008c\t\6\2\2\u008c\u008d\5\4\3\2\u008d\25"+
		"\3\2\2\2\u008e\u0090\7\16\2\2\u008f\u0091\5\4\3\2\u0090\u008f\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\27\3\2\2\2\u0092\u0093\7\17\2\2\u0093\u0094"+
		"\7\25\2\2\u0094\u0095\5\4\3\2\u0095\u0096\7\26\2\2\u0096\u009a\5\16\b"+
		"\2\u0097\u0099\5\32\16\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u009f\5\34\17\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\31\3\2\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00a2\7\25\2\2\u00a2\u00a3\5\4"+
		"\3\2\u00a3\u00a4\7\26\2\2\u00a4\u00a5\5\16\b\2\u00a5\33\3\2\2\2\u00a6"+
		"\u00a7\7\21\2\2\u00a7\u00a8\5\16\b\2\u00a8\35\3\2\2\2\u00a9\u00aa\7\22"+
		"\2\2\u00aa\u00ab\5\4\3\2\u00ab\u00ac\5\16\b\2\u00ac\37\3\2\2\2\u00ad\u00ae"+
		"\7\r\2\2\u00ae\u00b0\7\'\2\2\u00af\u00b1\5$\23\2\u00b0\u00af\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\7\25\2\2\u00b3\u00b5\5"+
		"\"\22\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\7\26\2\2\u00b7\u00b8\5\16\b\2\u00b8!\3\2\2\2\u00b9\u00ba\5$\23"+
		"\2\u00ba\u00bb\7\'\2\2\u00bb#\3\2\2\2\u00bc\u00bd\t\7\2\2\u00bd%\3\2\2"+
		"\2\u00be\u00bf\t\b\2\2\u00bf\'\3\2\2\2\u00c0\u00c1\7&\2\2\u00c1)\3\2\2"+
		"\2\u00c2\u00c8\7\3\2\2\u00c3\u00c5\7\33\2\2\u00c4\u00c3\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\7(\2\2\u00c7\u00c2\3\2"+
		"\2\2\u00c7\u00c4\3\2\2\2\u00c8+\3\2\2\2\u00c9\u00cc\5*\26\2\u00ca\u00cb"+
		"\7\4\2\2\u00cb\u00cd\t\t\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"-\3\2\2\2\25\60\62DRTZclty{\u0090\u009a\u009e\u00b0\u00b4\u00c4\u00c7"+
		"\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}