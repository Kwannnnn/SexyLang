// Generated from /Users/kristiyan/Documents/Saxion/Y2/Q3/compilers-and-os/61/src/SexyLang.g4 by ANTLR 4.9.2
package nl.saxion.cos;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SexyLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, EMPTY=3, BULGE=4, BODYCOUNT=5, LENGTH=6, SAFEWORD=7, BODYCOUNT_ARRAY=8, 
		LENGTH_ARRAY=9, BULGE_ARRAY=10, SAFEWORD_ARRAY=11, INSERT=12, IN=13, MOAN=14, 
		MOANLOUD=15, BEDACTIVITY=16, EJACULATE=17, IF=18, ELSEIF=19, ELSE=20, 
		LUBE=21, WHAT_LENGTH=22, HARD=23, SOFT=24, L_PAREN=25, R_PAREN=26, L_CURLY=27, 
		R_CURLY=28, L_SQUARE=29, R_SQUARE=30, COMMA=31, QUOTE=32, ADD=33, SUB=34, 
		MUL=35, DIV=36, EQUAL=37, NOT_EQUAL=38, GT=39, LT=40, GE=41, LE=42, AND=43, 
		OR=44, NEG=45, StringLiteral=46, IDENTIFIER=47, NUMBER=48, COMMENT=49, 
		WS=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "EMPTY", "BULGE", "BODYCOUNT", "LENGTH", "SAFEWORD", 
			"BODYCOUNT_ARRAY", "LENGTH_ARRAY", "BULGE_ARRAY", "SAFEWORD_ARRAY", "INSERT", 
			"IN", "MOAN", "MOANLOUD", "BEDACTIVITY", "EJACULATE", "IF", "ELSEIF", 
			"ELSE", "LUBE", "WHAT_LENGTH", "HARD", "SOFT", "L_PAREN", "R_PAREN", 
			"L_CURLY", "R_CURLY", "L_SQUARE", "R_SQUARE", "COMMA", "QUOTE", "ADD", 
			"SUB", "MUL", "DIV", "EQUAL", "NOT_EQUAL", "GT", "LT", "GE", "LE", "AND", 
			"OR", "NEG", "StringLiteral", "StringCharacters", "STRING_CHARACTER", 
			"IDENTIFIER", "NUMBER", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'.'", "'empty'", "'bulge'", "'bodyCount'", "'length'", 
			"'SafeWord'", "'bodyCounts'", "'lengths'", "'bulges'", "'SafeWords'", 
			"'insert'", "'in'", "'moan'", "'moanLoud'", "'bedActivity'", "'ejaculate'", 
			"'if'", "'else if'", "'else'", "'lube'", "'whatLength'", "'hard'", "'soft'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "','", "'\"'", "'+'", "'-'", 
			"'*'", "'/'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'and'", 
			"'or'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "EMPTY", "BULGE", "BODYCOUNT", "LENGTH", "SAFEWORD", 
			"BODYCOUNT_ARRAY", "LENGTH_ARRAY", "BULGE_ARRAY", "SAFEWORD_ARRAY", "INSERT", 
			"IN", "MOAN", "MOANLOUD", "BEDACTIVITY", "EJACULATE", "IF", "ELSEIF", 
			"ELSE", "LUBE", "WHAT_LENGTH", "HARD", "SOFT", "L_PAREN", "R_PAREN", 
			"L_CURLY", "R_CURLY", "L_SQUARE", "R_SQUARE", "COMMA", "QUOTE", "ADD", 
			"SUB", "MUL", "DIV", "EQUAL", "NOT_EQUAL", "GT", "LT", "GE", "LE", "AND", 
			"OR", "NEG", "StringLiteral", "IDENTIFIER", "NUMBER", "COMMENT", "WS"
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


	public SexyLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SexyLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0174\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\5/\u0145\n/\3/\3/\3\60\6\60"+
		"\u014a\n\60\r\60\16\60\u014b\3\61\3\61\3\61\5\61\u0151\n\61\3\62\3\62"+
		"\7\62\u0155\n\62\f\62\16\62\u0158\13\62\3\63\3\63\7\63\u015c\n\63\f\63"+
		"\16\63\u015f\13\63\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u0167\n\64\f\64"+
		"\16\64\u016a\13\64\3\64\3\64\3\65\6\65\u016f\n\65\r\65\16\65\u0170\3\65"+
		"\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2c\61e\62g\63"+
		"i\64\3\2\n\6\2\f\f\17\17$$^^\n\2$$))^^ddhhppttvv\4\2C\\c|\6\2\62;C\\a"+
		"ac|\3\2\63;\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0178\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2\tu\3\2\2\2\13{\3\2"+
		"\2\2\r\u0085\3\2\2\2\17\u008c\3\2\2\2\21\u0095\3\2\2\2\23\u00a0\3\2\2"+
		"\2\25\u00a8\3\2\2\2\27\u00af\3\2\2\2\31\u00b9\3\2\2\2\33\u00c0\3\2\2\2"+
		"\35\u00c3\3\2\2\2\37\u00c8\3\2\2\2!\u00d1\3\2\2\2#\u00dd\3\2\2\2%\u00e7"+
		"\3\2\2\2\'\u00ea\3\2\2\2)\u00f2\3\2\2\2+\u00f7\3\2\2\2-\u00fc\3\2\2\2"+
		"/\u0107\3\2\2\2\61\u010c\3\2\2\2\63\u0111\3\2\2\2\65\u0113\3\2\2\2\67"+
		"\u0115\3\2\2\29\u0117\3\2\2\2;\u0119\3\2\2\2=\u011b\3\2\2\2?\u011d\3\2"+
		"\2\2A\u011f\3\2\2\2C\u0121\3\2\2\2E\u0123\3\2\2\2G\u0125\3\2\2\2I\u0127"+
		"\3\2\2\2K\u0129\3\2\2\2M\u012c\3\2\2\2O\u012f\3\2\2\2Q\u0131\3\2\2\2S"+
		"\u0133\3\2\2\2U\u0136\3\2\2\2W\u0139\3\2\2\2Y\u013d\3\2\2\2[\u0140\3\2"+
		"\2\2]\u0142\3\2\2\2_\u0149\3\2\2\2a\u0150\3\2\2\2c\u0152\3\2\2\2e\u0159"+
		"\3\2\2\2g\u0160\3\2\2\2i\u016e\3\2\2\2kl\7\62\2\2l\4\3\2\2\2mn\7\60\2"+
		"\2n\6\3\2\2\2op\7g\2\2pq\7o\2\2qr\7r\2\2rs\7v\2\2st\7{\2\2t\b\3\2\2\2"+
		"uv\7d\2\2vw\7w\2\2wx\7n\2\2xy\7i\2\2yz\7g\2\2z\n\3\2\2\2{|\7d\2\2|}\7"+
		"q\2\2}~\7f\2\2~\177\7{\2\2\177\u0080\7E\2\2\u0080\u0081\7q\2\2\u0081\u0082"+
		"\7w\2\2\u0082\u0083\7p\2\2\u0083\u0084\7v\2\2\u0084\f\3\2\2\2\u0085\u0086"+
		"\7n\2\2\u0086\u0087\7g\2\2\u0087\u0088\7p\2\2\u0088\u0089\7i\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\7j\2\2\u008b\16\3\2\2\2\u008c\u008d\7U\2\2\u008d"+
		"\u008e\7c\2\2\u008e\u008f\7h\2\2\u008f\u0090\7g\2\2\u0090\u0091\7Y\2\2"+
		"\u0091\u0092\7q\2\2\u0092\u0093\7t\2\2\u0093\u0094\7f\2\2\u0094\20\3\2"+
		"\2\2\u0095\u0096\7d\2\2\u0096\u0097\7q\2\2\u0097\u0098\7f\2\2\u0098\u0099"+
		"\7{\2\2\u0099\u009a\7E\2\2\u009a\u009b\7q\2\2\u009b\u009c\7w\2\2\u009c"+
		"\u009d\7p\2\2\u009d\u009e\7v\2\2\u009e\u009f\7u\2\2\u009f\22\3\2\2\2\u00a0"+
		"\u00a1\7n\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7i\2\2"+
		"\u00a4\u00a5\7v\2\2\u00a5\u00a6\7j\2\2\u00a6\u00a7\7u\2\2\u00a7\24\3\2"+
		"\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac"+
		"\7i\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7u\2\2\u00ae\26\3\2\2\2\u00af\u00b0"+
		"\7U\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"\u00b4\7Y\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7f\2\2"+
		"\u00b7\u00b8\7u\2\2\u00b8\30\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7"+
		"p\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7t\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf\32\3\2\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\34"+
		"\3\2\2\2\u00c3\u00c4\7o\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7c\2\2\u00c6"+
		"\u00c7\7p\2\2\u00c7\36\3\2\2\2\u00c8\u00c9\7o\2\2\u00c9\u00ca\7q\2\2\u00ca"+
		"\u00cb\7c\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7N\2\2\u00cd\u00ce\7q\2\2"+
		"\u00ce\u00cf\7w\2\2\u00cf\u00d0\7f\2\2\u00d0 \3\2\2\2\u00d1\u00d2\7d\2"+
		"\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5\7C\2\2\u00d5\u00d6"+
		"\7e\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7x\2\2\u00d9"+
		"\u00da\7k\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7{\2\2\u00dc\"\3\2\2\2\u00dd"+
		"\u00de\7g\2\2\u00de\u00df\7l\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7e\2\2"+
		"\u00e1\u00e2\7w\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5"+
		"\7v\2\2\u00e5\u00e6\7g\2\2\u00e6$\3\2\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9"+
		"\7h\2\2\u00e9&\3\2\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed"+
		"\7u\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7\"\2\2\u00ef\u00f0\7k\2\2\u00f0"+
		"\u00f1\7h\2\2\u00f1(\3\2\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7n\2\2\u00f4"+
		"\u00f5\7u\2\2\u00f5\u00f6\7g\2\2\u00f6*\3\2\2\2\u00f7\u00f8\7n\2\2\u00f8"+
		"\u00f9\7w\2\2\u00f9\u00fa\7d\2\2\u00fa\u00fb\7g\2\2\u00fb,\3\2\2\2\u00fc"+
		"\u00fd\7y\2\2\u00fd\u00fe\7j\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7v\2\2"+
		"\u0100\u0101\7N\2\2\u0101\u0102\7g\2\2\u0102\u0103\7p\2\2\u0103\u0104"+
		"\7i\2\2\u0104\u0105\7v\2\2\u0105\u0106\7j\2\2\u0106.\3\2\2\2\u0107\u0108"+
		"\7j\2\2\u0108\u0109\7c\2\2\u0109\u010a\7t\2\2\u010a\u010b\7f\2\2\u010b"+
		"\60\3\2\2\2\u010c\u010d\7u\2\2\u010d\u010e\7q\2\2\u010e\u010f\7h\2\2\u010f"+
		"\u0110\7v\2\2\u0110\62\3\2\2\2\u0111\u0112\7*\2\2\u0112\64\3\2\2\2\u0113"+
		"\u0114\7+\2\2\u0114\66\3\2\2\2\u0115\u0116\7}\2\2\u01168\3\2\2\2\u0117"+
		"\u0118\7\177\2\2\u0118:\3\2\2\2\u0119\u011a\7]\2\2\u011a<\3\2\2\2\u011b"+
		"\u011c\7_\2\2\u011c>\3\2\2\2\u011d\u011e\7.\2\2\u011e@\3\2\2\2\u011f\u0120"+
		"\7$\2\2\u0120B\3\2\2\2\u0121\u0122\7-\2\2\u0122D\3\2\2\2\u0123\u0124\7"+
		"/\2\2\u0124F\3\2\2\2\u0125\u0126\7,\2\2\u0126H\3\2\2\2\u0127\u0128\7\61"+
		"\2\2\u0128J\3\2\2\2\u0129\u012a\7?\2\2\u012a\u012b\7?\2\2\u012bL\3\2\2"+
		"\2\u012c\u012d\7#\2\2\u012d\u012e\7?\2\2\u012eN\3\2\2\2\u012f\u0130\7"+
		"@\2\2\u0130P\3\2\2\2\u0131\u0132\7>\2\2\u0132R\3\2\2\2\u0133\u0134\7@"+
		"\2\2\u0134\u0135\7?\2\2\u0135T\3\2\2\2\u0136\u0137\7>\2\2\u0137\u0138"+
		"\7?\2\2\u0138V\3\2\2\2\u0139\u013a\7c\2\2\u013a\u013b\7p\2\2\u013b\u013c"+
		"\7f\2\2\u013cX\3\2\2\2\u013d\u013e\7q\2\2\u013e\u013f\7t\2\2\u013fZ\3"+
		"\2\2\2\u0140\u0141\7#\2\2\u0141\\\3\2\2\2\u0142\u0144\5A!\2\u0143\u0145"+
		"\5_\60\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\5A!\2\u0147^\3\2\2\2\u0148\u014a\5a\61\2\u0149\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c`\3\2\2\2"+
		"\u014d\u0151\n\2\2\2\u014e\u014f\7^\2\2\u014f\u0151\t\3\2\2\u0150\u014d"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0151b\3\2\2\2\u0152\u0156\t\4\2\2\u0153"+
		"\u0155\t\5\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157d\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015d"+
		"\t\6\2\2\u015a\u015c\t\7\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015ef\3\2\2\2\u015f\u015d\3\2\2\2"+
		"\u0160\u0161\7\65\2\2\u0161\u0162\7?\2\2\u0162\u0163\7?\2\2\u0163\u0164"+
		"\7F\2\2\u0164\u0168\3\2\2\2\u0165\u0167\n\b\2\2\u0166\u0165\3\2\2\2\u0167"+
		"\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016b\u016c\b\64\2\2\u016ch\3\2\2\2\u016d\u016f"+
		"\t\t\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\b\65\2\2\u0173j\3\2\2\2"+
		"\n\2\u0144\u014b\u0150\u0156\u015d\u0168\u0170\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}