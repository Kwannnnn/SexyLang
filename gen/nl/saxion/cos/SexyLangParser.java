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
		T__0=1, T__1=2, T__2=3, BULGE=4, BODYCOUNT=5, LENGTH=6, SAFEWORD=7, INSERT=8, 
		IN=9, MOAN=10, MOANLOUD=11, BEDACTIVITY=12, EJACULATE=13, IF=14, ELSE=15, 
		LUBE=16, HARD=17, SOFT=18, L_PAREN=19, R_PAREN=20, L_CURLY=21, R_CURLY=22, 
		COMMA=23, ADD=24, SUB=25, MUL=26, DIV=27, NEG=28, EQUAL=29, GT=30, LT=31, 
		GE=32, LE=33, AND=34, OR=35, IDENTIFIER=36, NUMBER=37, WS=38, COMMENT=39;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_bedActivityCall = 2, RULE_params = 3, 
		RULE_statement = 4, RULE_blockStatement = 5, RULE_block = 6, RULE_varDeclaration = 7, 
		RULE_varAssignment = 8, RULE_moanStmt = 9, RULE_ejaculateStmt = 10, RULE_ifStmt = 11, 
		RULE_elseStmt = 12, RULE_lubeStmt = 13, RULE_bedActivityStmt = 14, RULE_paramsDeclaration = 15, 
		RULE_type = 16, RULE_literal = 17, RULE_bulgeLiteral = 18, RULE_bodyCountLiteral = 19, 
		RULE_lengthLiteral = 20, RULE_safeWordLiteral = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "bedActivityCall", "params", "statement", "blockStatement", 
			"block", "varDeclaration", "varAssignment", "moanStmt", "ejaculateStmt", 
			"ifStmt", "elseStmt", "lubeStmt", "bedActivityStmt", "paramsDeclaration", 
			"type", "literal", "bulgeLiteral", "bodyCountLiteral", "lengthLiteral", 
			"safeWordLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'.'", "'\"'", "'bulge'", "'bodyCount'", "'length'", "'SafeWord'", 
			"'insert'", "'in'", "'moan'", "'moanLoud'", "'bedActivity'", "'ejaculate'", 
			"'if'", "'else'", "'lube'", "'hard'", "'soft'", "'('", "')'", "'{'", 
			"'}'", "','", "'+'", "'-'", "'*'", "'/'", "'!'", "'=='", "'>'", "'<'", 
			"'>='", "'<='", "'and'", "'or'", null, null, null, "'3==D'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "BULGE", "BODYCOUNT", "LENGTH", "SAFEWORD", "INSERT", 
			"IN", "MOAN", "MOANLOUD", "BEDACTIVITY", "EJACULATE", "IF", "ELSE", "LUBE", 
			"HARD", "SOFT", "L_PAREN", "R_PAREN", "L_CURLY", "R_CURLY", "COMMA", 
			"ADD", "SUB", "MUL", "DIV", "NEG", "EQUAL", "GT", "LT", "GE", "LE", "AND", 
			"OR", "IDENTIFIER", "NUMBER", "WS", "COMMENT"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << INSERT) | (1L << MOAN) | (1L << MOANLOUD) | (1L << BEDACTIVITY) | (1L << IF) | (1L << LUBE) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << SUB) | (1L << NEG) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__2:
				case HARD:
				case SOFT:
				case L_PAREN:
				case SUB:
				case NEG:
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
		public Token op;
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
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitLiteralExpression(this);
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(54);
				match(NEG);
				setState(55);
				expression(9);
				}
				break;
			case 2:
				{
				_localctx = new GroupExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(L_PAREN);
				setState(57);
				expression(0);
				setState(58);
				match(R_PAREN);
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
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				literal();
				}
				break;
			case 5:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MulDivExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(66);
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
						setState(67);
						((MulDivExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AddSubExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(69);
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
						setState(70);
						((AddSubExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 3:
						{
						_localctx = new LogicExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LogicExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(72);
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
						setState(73);
						((LogicExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ChainedLogicExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(75);
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
						setState(76);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(81);
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
			setState(82);
			match(IDENTIFIER);
			setState(83);
			match(L_PAREN);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << SUB) | (1L << NEG) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(84);
				params();
				}
			}

			setState(87);
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
			setState(89);
			expression(0);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(90);
				match(COMMA);
				setState(91);
				expression(0);
				}
				}
				setState(96);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				moanStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				lubeStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
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
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				moanStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				lubeStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
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
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
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
			setState(113);
			match(L_CURLY);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSERT) | (1L << MOAN) | (1L << MOANLOUD) | (1L << EJACULATE) | (1L << IF) | (1L << LUBE))) != 0)) {
				{
				setState(114);
				blockStatement();
				}
			}

			setState(117);
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
		public TerminalNode INSERT() { return getToken(SexyLangParser.INSERT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(SexyLangParser.IN, 0); }
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
			setState(119);
			match(INSERT);
			setState(120);
			type();
			setState(121);
			expression(0);
			setState(122);
			match(IN);
			setState(123);
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

	public static class VarAssignmentContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SexyLangParser.INSERT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(SexyLangParser.IN, 0); }
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
			setState(125);
			match(INSERT);
			setState(126);
			expression(0);
			setState(127);
			match(IN);
			setState(128);
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

	public static class MoanStmtContext extends ParserRuleContext {
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
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==MOAN || _la==MOANLOUD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(131);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(EJACULATE);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << HARD) | (1L << SOFT) | (1L << L_PAREN) | (1L << SUB) | (1L << NEG) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(134);
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
		public TerminalNode IF() { return getToken(SexyLangParser.IF, 0); }
		public TerminalNode L_PAREN() { return getToken(SexyLangParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(SexyLangParser.R_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
			setState(137);
			match(IF);
			setState(138);
			match(L_PAREN);
			setState(139);
			expression(0);
			setState(140);
			match(R_PAREN);
			setState(141);
			block();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(142);
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

	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SexyLangParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ELSE);
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_CURLY:
				{
				setState(146);
				block();
				}
				break;
			case IF:
				{
				setState(147);
				ifStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LubeStmtContext extends ParserRuleContext {
		public TerminalNode LUBE() { return getToken(SexyLangParser.LUBE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 26, RULE_lubeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(LUBE);
			setState(151);
			expression(0);
			setState(152);
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
		public TerminalNode BEDACTIVITY() { return getToken(SexyLangParser.BEDACTIVITY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SexyLangParser.IDENTIFIER, 0); }
		public TerminalNode L_PAREN() { return getToken(SexyLangParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(SexyLangParser.R_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_bedActivityStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(BEDACTIVITY);
			setState(155);
			match(IDENTIFIER);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BULGE) | (1L << BODYCOUNT) | (1L << LENGTH) | (1L << SAFEWORD))) != 0)) {
				{
				setState(156);
				type();
				}
			}

			setState(159);
			match(L_PAREN);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BULGE) | (1L << BODYCOUNT) | (1L << LENGTH) | (1L << SAFEWORD))) != 0)) {
				{
				setState(160);
				paramsDeclaration();
				}
			}

			setState(163);
			match(R_PAREN);
			setState(164);
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
		enterRule(_localctx, 30, RULE_paramsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			type();
			setState(167);
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
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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

	public static class LiteralContext extends ParserRuleContext {
		public BulgeLiteralContext bulgeLiteral() {
			return getRuleContext(BulgeLiteralContext.class,0);
		}
		public BodyCountLiteralContext bodyCountLiteral() {
			return getRuleContext(BodyCountLiteralContext.class,0);
		}
		public LengthLiteralContext lengthLiteral() {
			return getRuleContext(LengthLiteralContext.class,0);
		}
		public SafeWordLiteralContext safeWordLiteral() {
			return getRuleContext(SafeWordLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SexyLangVisitor ) return ((SexyLangVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				bulgeLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				bodyCountLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				lengthLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				safeWordLiteral();
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
			setState(177);
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
		enterRule(_localctx, 38, RULE_bodyCountLiteral);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(T__0);
				}
				break;
			case SUB:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(180);
					match(SUB);
					}
				}

				setState(183);
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
		enterRule(_localctx, 40, RULE_lengthLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			bodyCountLiteral();
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(187);
				match(T__1);
				setState(188);
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

	public static class SafeWordLiteralContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SexyLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SexyLangParser.IDENTIFIER, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__2);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(192);
				match(IDENTIFIER);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(T__2);
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
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"B\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3P\n\3\f\3\16"+
		"\3S\13\3\3\4\3\4\3\4\5\4X\n\4\3\4\3\4\3\5\3\5\3\5\7\5_\n\5\f\5\16\5b\13"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7r\n\7\3"+
		"\b\3\b\5\bv\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\5\f\u008a\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0092"+
		"\n\r\3\16\3\16\3\16\5\16\u0097\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\5\20\u00a0\n\20\3\20\3\20\5\20\u00a4\n\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00b2\n\23\3\24\3\24\3\25\3\25"+
		"\5\25\u00b8\n\25\3\25\5\25\u00bb\n\25\3\26\3\26\3\26\5\26\u00c0\n\26\3"+
		"\27\3\27\7\27\u00c4\n\27\f\27\16\27\u00c7\13\27\3\27\3\27\3\27\2\3\4\30"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\n\3\2\34\35\3\2\32\33"+
		"\3\2\37#\3\2$%\3\2\f\r\3\2\6\t\3\2\23\24\4\2\3\3\'\'\2\u00d7\2\62\3\2"+
		"\2\2\4A\3\2\2\2\6T\3\2\2\2\b[\3\2\2\2\ni\3\2\2\2\fq\3\2\2\2\16s\3\2\2"+
		"\2\20y\3\2\2\2\22\177\3\2\2\2\24\u0084\3\2\2\2\26\u0087\3\2\2\2\30\u008b"+
		"\3\2\2\2\32\u0093\3\2\2\2\34\u0098\3\2\2\2\36\u009c\3\2\2\2 \u00a8\3\2"+
		"\2\2\"\u00ab\3\2\2\2$\u00b1\3\2\2\2&\u00b3\3\2\2\2(\u00ba\3\2\2\2*\u00bc"+
		"\3\2\2\2,\u00c1\3\2\2\2.\61\5\4\3\2/\61\5\n\6\2\60.\3\2\2\2\60/\3\2\2"+
		"\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2"+
		"\2\65\66\7\2\2\3\66\3\3\2\2\2\678\b\3\1\289\7\36\2\29B\5\4\3\13:;\7\25"+
		"\2\2;<\5\4\3\2<=\7\26\2\2=B\3\2\2\2>B\5\6\4\2?B\5$\23\2@B\7&\2\2A\67\3"+
		"\2\2\2A:\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2BQ\3\2\2\2CD\f\n\2\2DE\t"+
		"\2\2\2EP\5\4\3\13FG\f\t\2\2GH\t\3\2\2HP\5\4\3\nIJ\f\b\2\2JK\t\4\2\2KP"+
		"\5\4\3\tLM\f\7\2\2MN\t\5\2\2NP\5\4\3\bOC\3\2\2\2OF\3\2\2\2OI\3\2\2\2O"+
		"L\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\5\3\2\2\2SQ\3\2\2\2TU\7&\2\2"+
		"UW\7\25\2\2VX\5\b\5\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\26\2\2Z\7\3\2"+
		"\2\2[`\5\4\3\2\\]\7\31\2\2]_\5\4\3\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a"+
		"\3\2\2\2a\t\3\2\2\2b`\3\2\2\2cj\5\20\t\2dj\5\22\n\2ej\5\24\13\2fj\5\30"+
		"\r\2gj\5\34\17\2hj\5\36\20\2ic\3\2\2\2id\3\2\2\2ie\3\2\2\2if\3\2\2\2i"+
		"g\3\2\2\2ih\3\2\2\2j\13\3\2\2\2kr\5\20\t\2lr\5\22\n\2mr\5\24\13\2nr\5"+
		"\30\r\2or\5\34\17\2pr\5\26\f\2qk\3\2\2\2ql\3\2\2\2qm\3\2\2\2qn\3\2\2\2"+
		"qo\3\2\2\2qp\3\2\2\2r\r\3\2\2\2su\7\27\2\2tv\5\f\7\2ut\3\2\2\2uv\3\2\2"+
		"\2vw\3\2\2\2wx\7\30\2\2x\17\3\2\2\2yz\7\n\2\2z{\5\"\22\2{|\5\4\3\2|}\7"+
		"\13\2\2}~\7&\2\2~\21\3\2\2\2\177\u0080\7\n\2\2\u0080\u0081\5\4\3\2\u0081"+
		"\u0082\7\13\2\2\u0082\u0083\7&\2\2\u0083\23\3\2\2\2\u0084\u0085\t\6\2"+
		"\2\u0085\u0086\5\4\3\2\u0086\25\3\2\2\2\u0087\u0089\7\17\2\2\u0088\u008a"+
		"\5\4\3\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\27\3\2\2\2\u008b"+
		"\u008c\7\20\2\2\u008c\u008d\7\25\2\2\u008d\u008e\5\4\3\2\u008e\u008f\7"+
		"\26\2\2\u008f\u0091\5\16\b\2\u0090\u0092\5\32\16\2\u0091\u0090\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\31\3\2\2\2\u0093\u0096\7\21\2\2\u0094\u0097"+
		"\5\16\b\2\u0095\u0097\5\30\r\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2"+
		"\u0097\33\3\2\2\2\u0098\u0099\7\22\2\2\u0099\u009a\5\4\3\2\u009a\u009b"+
		"\5\16\b\2\u009b\35\3\2\2\2\u009c\u009d\7\16\2\2\u009d\u009f\7&\2\2\u009e"+
		"\u00a0\5\"\22\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a3\7\25\2\2\u00a2\u00a4\5 \21\2\u00a3\u00a2\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\26\2\2\u00a6\u00a7\5"+
		"\16\b\2\u00a7\37\3\2\2\2\u00a8\u00a9\5\"\22\2\u00a9\u00aa\7&\2\2\u00aa"+
		"!\3\2\2\2\u00ab\u00ac\t\7\2\2\u00ac#\3\2\2\2\u00ad\u00b2\5&\24\2\u00ae"+
		"\u00b2\5(\25\2\u00af\u00b2\5*\26\2\u00b0\u00b2\5,\27\2\u00b1\u00ad\3\2"+
		"\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"%\3\2\2\2\u00b3\u00b4\t\b\2\2\u00b4\'\3\2\2\2\u00b5\u00bb\7\3\2\2\u00b6"+
		"\u00b8\7\33\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3"+
		"\2\2\2\u00b9\u00bb\7\'\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb"+
		")\3\2\2\2\u00bc\u00bf\5(\25\2\u00bd\u00be\7\4\2\2\u00be\u00c0\t\t\2\2"+
		"\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0+\3\2\2\2\u00c1\u00c5\7"+
		"\5\2\2\u00c2\u00c4\7&\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00c9\7\5\2\2\u00c9-\3\2\2\2\26\60\62AOQW`iqu\u0089\u0091\u0096"+
		"\u009f\u00a3\u00b1\u00b7\u00ba\u00bf\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}