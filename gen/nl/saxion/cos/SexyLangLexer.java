// Generated from /Users/quan/Projects/compilers_and_operating_systems/src/SexyLang.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, EMPTY=3, BULGE=4, BODYCOUNT=5, LENGTH=6, SAFEWORD=7, INSERT=8, 
		IN=9, MOAN=10, MOANLOUD=11, BEDACTIVITY=12, EJACULATE=13, IF=14, ELSEIF=15, 
		ELSE=16, LUBE=17, HARD=18, SOFT=19, L_PAREN=20, R_PAREN=21, L_CURLY=22, 
		R_CURLY=23, COMMA=24, ADD=25, SUB=26, MUL=27, DIV=28, NEG=29, EQUAL=30, 
		GT=31, LT=32, GE=33, LE=34, AND=35, OR=36, WHAT_LENGTH=37, STRING=38, 
		IDENTIFIER=39, NUMBER=40, WS=41, COMMENT=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "EMPTY", "BULGE", "BODYCOUNT", "LENGTH", "SAFEWORD", 
			"INSERT", "IN", "MOAN", "MOANLOUD", "BEDACTIVITY", "EJACULATE", "IF", 
			"ELSEIF", "ELSE", "LUBE", "HARD", "SOFT", "L_PAREN", "R_PAREN", "L_CURLY", 
			"R_CURLY", "COMMA", "ADD", "SUB", "MUL", "DIV", "NEG", "EQUAL", "GT", 
			"LT", "GE", "LE", "AND", "OR", "WHAT_LENGTH", "STRING", "IDENTIFIER", 
			"NUMBER", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'.'", "'empty'", "'bulge'", "'bodyCount'", "'length'", 
			"'SafeWord'", "'insert'", "'in'", "'moan'", "'moanLoud'", "'bedActivity'", 
			"'ejaculate'", "'if'", "'else if'", "'else'", "'lube'", "'hard'", "'soft'", 
			"'('", "')'", "'{'", "'}'", "','", "'+'", "'-'", "'*'", "'/'", "'!'", 
			"'=='", "'>'", "'<'", "'>='", "'<='", "'and'", "'or'", "'whatLength'", 
			null, null, null, null, "'3==D'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "EMPTY", "BULGE", "BODYCOUNT", "LENGTH", "SAFEWORD", 
			"INSERT", "IN", "MOAN", "MOANLOUD", "BEDACTIVITY", "EJACULATE", "IF", 
			"ELSEIF", "ELSE", "LUBE", "HARD", "SOFT", "L_PAREN", "R_PAREN", "L_CURLY", 
			"R_CURLY", "COMMA", "ADD", "SUB", "MUL", "DIV", "NEG", "EQUAL", "GT", 
			"LT", "GE", "LE", "AND", "OR", "WHAT_LENGTH", "STRING", "IDENTIFIER", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0124\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\7\'\u0104\n\'\f\'\16\'\u0107\13\'\3\'\3"+
		"\'\3(\3(\7(\u010d\n(\f(\16(\u0110\13(\3)\3)\7)\u0114\n)\f)\16)\u0117\13"+
		")\3*\6*\u011a\n*\r*\16*\u011b\3*\3*\3+\3+\3+\3+\3+\2\2,\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,\3\2\b\6\2\f\f\17\17$$^^\4\2C\\c|\6\2\62;C\\aac|\3\2\63"+
		";\3\2\62;\5\2\13\f\17\17\"\"\2\u0127\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7["+
		"\3\2\2\2\ta\3\2\2\2\13g\3\2\2\2\rq\3\2\2\2\17x\3\2\2\2\21\u0081\3\2\2"+
		"\2\23\u0088\3\2\2\2\25\u008b\3\2\2\2\27\u0090\3\2\2\2\31\u0099\3\2\2\2"+
		"\33\u00a5\3\2\2\2\35\u00af\3\2\2\2\37\u00b2\3\2\2\2!\u00ba\3\2\2\2#\u00bf"+
		"\3\2\2\2%\u00c4\3\2\2\2\'\u00c9\3\2\2\2)\u00ce\3\2\2\2+\u00d0\3\2\2\2"+
		"-\u00d2\3\2\2\2/\u00d4\3\2\2\2\61\u00d6\3\2\2\2\63\u00d8\3\2\2\2\65\u00da"+
		"\3\2\2\2\67\u00dc\3\2\2\29\u00de\3\2\2\2;\u00e0\3\2\2\2=\u00e2\3\2\2\2"+
		"?\u00e5\3\2\2\2A\u00e7\3\2\2\2C\u00e9\3\2\2\2E\u00ec\3\2\2\2G\u00ef\3"+
		"\2\2\2I\u00f3\3\2\2\2K\u00f6\3\2\2\2M\u0101\3\2\2\2O\u010a\3\2\2\2Q\u0111"+
		"\3\2\2\2S\u0119\3\2\2\2U\u011f\3\2\2\2WX\7\62\2\2X\4\3\2\2\2YZ\7\60\2"+
		"\2Z\6\3\2\2\2[\\\7g\2\2\\]\7o\2\2]^\7r\2\2^_\7v\2\2_`\7{\2\2`\b\3\2\2"+
		"\2ab\7d\2\2bc\7w\2\2cd\7n\2\2de\7i\2\2ef\7g\2\2f\n\3\2\2\2gh\7d\2\2hi"+
		"\7q\2\2ij\7f\2\2jk\7{\2\2kl\7E\2\2lm\7q\2\2mn\7w\2\2no\7p\2\2op\7v\2\2"+
		"p\f\3\2\2\2qr\7n\2\2rs\7g\2\2st\7p\2\2tu\7i\2\2uv\7v\2\2vw\7j\2\2w\16"+
		"\3\2\2\2xy\7U\2\2yz\7c\2\2z{\7h\2\2{|\7g\2\2|}\7Y\2\2}~\7q\2\2~\177\7"+
		"t\2\2\177\u0080\7f\2\2\u0080\20\3\2\2\2\u0081\u0082\7k\2\2\u0082\u0083"+
		"\7p\2\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2\u0085\u0086\7t\2\2\u0086"+
		"\u0087\7v\2\2\u0087\22\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a"+
		"\24\3\2\2\2\u008b\u008c\7o\2\2\u008c\u008d\7q\2\2\u008d\u008e\7c\2\2\u008e"+
		"\u008f\7p\2\2\u008f\26\3\2\2\2\u0090\u0091\7o\2\2\u0091\u0092\7q\2\2\u0092"+
		"\u0093\7c\2\2\u0093\u0094\7p\2\2\u0094\u0095\7N\2\2\u0095\u0096\7q\2\2"+
		"\u0096\u0097\7w\2\2\u0097\u0098\7f\2\2\u0098\30\3\2\2\2\u0099\u009a\7"+
		"d\2\2\u009a\u009b\7g\2\2\u009b\u009c\7f\2\2\u009c\u009d\7C\2\2\u009d\u009e"+
		"\7e\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7x\2\2\u00a1"+
		"\u00a2\7k\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7{\2\2\u00a4\32\3\2\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\u00a7\7l\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7e\2\2"+
		"\u00a9\u00aa\7w\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad"+
		"\7v\2\2\u00ad\u00ae\7g\2\2\u00ae\34\3\2\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1"+
		"\7h\2\2\u00b1\36\3\2\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5"+
		"\7u\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7\"\2\2\u00b7\u00b8\7k\2\2\u00b8"+
		"\u00b9\7h\2\2\u00b9 \3\2\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7n\2\2\u00bc"+
		"\u00bd\7u\2\2\u00bd\u00be\7g\2\2\u00be\"\3\2\2\2\u00bf\u00c0\7n\2\2\u00c0"+
		"\u00c1\7w\2\2\u00c1\u00c2\7d\2\2\u00c2\u00c3\7g\2\2\u00c3$\3\2\2\2\u00c4"+
		"\u00c5\7j\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7f\2\2"+
		"\u00c8&\3\2\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7h\2"+
		"\2\u00cc\u00cd\7v\2\2\u00cd(\3\2\2\2\u00ce\u00cf\7*\2\2\u00cf*\3\2\2\2"+
		"\u00d0\u00d1\7+\2\2\u00d1,\3\2\2\2\u00d2\u00d3\7}\2\2\u00d3.\3\2\2\2\u00d4"+
		"\u00d5\7\177\2\2\u00d5\60\3\2\2\2\u00d6\u00d7\7.\2\2\u00d7\62\3\2\2\2"+
		"\u00d8\u00d9\7-\2\2\u00d9\64\3\2\2\2\u00da\u00db\7/\2\2\u00db\66\3\2\2"+
		"\2\u00dc\u00dd\7,\2\2\u00dd8\3\2\2\2\u00de\u00df\7\61\2\2\u00df:\3\2\2"+
		"\2\u00e0\u00e1\7#\2\2\u00e1<\3\2\2\2\u00e2\u00e3\7?\2\2\u00e3\u00e4\7"+
		"?\2\2\u00e4>\3\2\2\2\u00e5\u00e6\7@\2\2\u00e6@\3\2\2\2\u00e7\u00e8\7>"+
		"\2\2\u00e8B\3\2\2\2\u00e9\u00ea\7@\2\2\u00ea\u00eb\7?\2\2\u00ebD\3\2\2"+
		"\2\u00ec\u00ed\7>\2\2\u00ed\u00ee\7?\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7"+
		"c\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7f\2\2\u00f2H\3\2\2\2\u00f3\u00f4"+
		"\7q\2\2\u00f4\u00f5\7t\2\2\u00f5J\3\2\2\2\u00f6\u00f7\7y\2\2\u00f7\u00f8"+
		"\7j\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7N\2\2\u00fb"+
		"\u00fc\7g\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7i\2\2\u00fe\u00ff\7v\2\2"+
		"\u00ff\u0100\7j\2\2\u0100L\3\2\2\2\u0101\u0105\7$\2\2\u0102\u0104\n\2"+
		"\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7$"+
		"\2\2\u0109N\3\2\2\2\u010a\u010e\t\3\2\2\u010b\u010d\t\4\2\2\u010c\u010b"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"P\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0115\t\5\2\2\u0112\u0114\t\6\2\2"+
		"\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116R\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\t\7\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011e\b*\2\2\u011eT\3\2\2\2\u011f\u0120"+
		"\7\65\2\2\u0120\u0121\7?\2\2\u0121\u0122\7?\2\2\u0122\u0123\7F\2\2\u0123"+
		"V\3\2\2\2\7\2\u0105\u010e\u0115\u011b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}