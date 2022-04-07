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
		T__0=1, T__1=2, EMPTY=3, BULGE=4, BODYCOUNT=5, LENGTH=6, SAFEWORD=7, BODYCOUNT_ARRAY=8, 
		LENGTH_ARRAY=9, BULGE_ARRAY=10, SAFEWORD_ARRAY=11, INSERT=12, IN=13, MOAN=14, 
		MOANLOUD=15, BEDACTIVITY=16, EJACULATE=17, IF=18, ELSEIF=19, ELSE=20, 
		LUBE=21, HARD=22, SOFT=23, L_PAREN=24, R_PAREN=25, L_CURLY=26, R_CURLY=27, 
		L_SQUARE=28, R_SQUARE=29, COMMA=30, ADD=31, SUB=32, MUL=33, DIV=34, NEG=35, 
		EQUAL=36, GT=37, LT=38, GE=39, LE=40, AND=41, OR=42, WHAT_LENGTH=43, STRING=44, 
		IDENTIFIER=45, NUMBER=46, WS=47, COMMENT=48;
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
			"ELSE", "LUBE", "HARD", "SOFT", "L_PAREN", "R_PAREN", "L_CURLY", "R_CURLY", 
			"L_SQUARE", "R_SQUARE", "COMMA", "ADD", "SUB", "MUL", "DIV", "NEG", "EQUAL", 
			"GT", "LT", "GE", "LE", "AND", "OR", "WHAT_LENGTH", "STRING", "IDENTIFIER", 
			"NUMBER", "WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0168\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\7-\u0148\n-\f-\16-\u014b\13-\3-"+
		"\3-\3.\3.\7.\u0151\n.\f.\16.\u0154\13.\3/\3/\7/\u0158\n/\f/\16/\u015b"+
		"\13/\3\60\6\60\u015e\n\60\r\60\16\60\u015f\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\b"+
		"\6\2\f\f\17\17$$^^\4\2C\\c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\5\2\13\f\17"+
		"\17\"\"\2\u016b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7g\3\2\2\2\tm\3\2\2\2\13s\3"+
		"\2\2\2\r}\3\2\2\2\17\u0084\3\2\2\2\21\u008d\3\2\2\2\23\u009c\3\2\2\2\25"+
		"\u00a8\3\2\2\2\27\u00b3\3\2\2\2\31\u00c1\3\2\2\2\33\u00c8\3\2\2\2\35\u00cb"+
		"\3\2\2\2\37\u00d0\3\2\2\2!\u00d9\3\2\2\2#\u00e5\3\2\2\2%\u00ef\3\2\2\2"+
		"\'\u00f2\3\2\2\2)\u00fa\3\2\2\2+\u00ff\3\2\2\2-\u0104\3\2\2\2/\u0109\3"+
		"\2\2\2\61\u010e\3\2\2\2\63\u0110\3\2\2\2\65\u0112\3\2\2\2\67\u0114\3\2"+
		"\2\29\u0116\3\2\2\2;\u0118\3\2\2\2=\u011a\3\2\2\2?\u011c\3\2\2\2A\u011e"+
		"\3\2\2\2C\u0120\3\2\2\2E\u0122\3\2\2\2G\u0124\3\2\2\2I\u0126\3\2\2\2K"+
		"\u0129\3\2\2\2M\u012b\3\2\2\2O\u012d\3\2\2\2Q\u0130\3\2\2\2S\u0133\3\2"+
		"\2\2U\u0137\3\2\2\2W\u013a\3\2\2\2Y\u0145\3\2\2\2[\u014e\3\2\2\2]\u0155"+
		"\3\2\2\2_\u015d\3\2\2\2a\u0163\3\2\2\2cd\7\62\2\2d\4\3\2\2\2ef\7\60\2"+
		"\2f\6\3\2\2\2gh\7g\2\2hi\7o\2\2ij\7r\2\2jk\7v\2\2kl\7{\2\2l\b\3\2\2\2"+
		"mn\7d\2\2no\7w\2\2op\7n\2\2pq\7i\2\2qr\7g\2\2r\n\3\2\2\2st\7d\2\2tu\7"+
		"q\2\2uv\7f\2\2vw\7{\2\2wx\7E\2\2xy\7q\2\2yz\7w\2\2z{\7p\2\2{|\7v\2\2|"+
		"\f\3\2\2\2}~\7n\2\2~\177\7g\2\2\177\u0080\7p\2\2\u0080\u0081\7i\2\2\u0081"+
		"\u0082\7v\2\2\u0082\u0083\7j\2\2\u0083\16\3\2\2\2\u0084\u0085\7U\2\2\u0085"+
		"\u0086\7c\2\2\u0086\u0087\7h\2\2\u0087\u0088\7g\2\2\u0088\u0089\7Y\2\2"+
		"\u0089\u008a\7q\2\2\u008a\u008b\7t\2\2\u008b\u008c\7f\2\2\u008c\20\3\2"+
		"\2\2\u008d\u008e\7d\2\2\u008e\u008f\7q\2\2\u008f\u0090\7f\2\2\u0090\u0091"+
		"\7{\2\2\u0091\u0092\7E\2\2\u0092\u0093\7q\2\2\u0093\u0094\7w\2\2\u0094"+
		"\u0095\7p\2\2\u0095\u0096\7v\2\2\u0096\u0097\7C\2\2\u0097\u0098\7t\2\2"+
		"\u0098\u0099\7t\2\2\u0099\u009a\7c\2\2\u009a\u009b\7{\2\2\u009b\22\3\2"+
		"\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e\u009f\7p\2\2\u009f\u00a0"+
		"\7i\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7C\2\2\u00a3"+
		"\u00a4\7t\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7{\2\2"+
		"\u00a7\24\3\2\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7"+
		"n\2\2\u00ab\u00ac\7i\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7C\2\2\u00ae\u00af"+
		"\7t\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7{\2\2\u00b2"+
		"\26\3\2\2\2\u00b3\u00b4\7U\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7h\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7\u00b8\7Y\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7t\2\2"+
		"\u00ba\u00bb\7f\2\2\u00bb\u00bc\7C\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be"+
		"\7t\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7{\2\2\u00c0\30\3\2\2\2\u00c1\u00c2"+
		"\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7v\2\2\u00c7\32\3\2\2\2\u00c8\u00c9\7k\2\2\u00c9"+
		"\u00ca\7p\2\2\u00ca\34\3\2\2\2\u00cb\u00cc\7o\2\2\u00cc\u00cd\7q\2\2\u00cd"+
		"\u00ce\7c\2\2\u00ce\u00cf\7p\2\2\u00cf\36\3\2\2\2\u00d0\u00d1\7o\2\2\u00d1"+
		"\u00d2\7q\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7N\2\2"+
		"\u00d5\u00d6\7q\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7f\2\2\u00d8 \3\2\2"+
		"\2\u00d9\u00da\7d\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd"+
		"\7C\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7k\2\2\u00e0"+
		"\u00e1\7x\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7{\2\2"+
		"\u00e4\"\3\2\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7l\2\2\u00e7\u00e8\7c"+
		"\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec"+
		"\7c\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7g\2\2\u00ee$\3\2\2\2\u00ef\u00f0"+
		"\7k\2\2\u00f0\u00f1\7h\2\2\u00f1&\3\2\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4"+
		"\7n\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7\"\2\2\u00f7"+
		"\u00f8\7k\2\2\u00f8\u00f9\7h\2\2\u00f9(\3\2\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"\u00fc\7n\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7g\2\2\u00fe*\3\2\2\2\u00ff"+
		"\u0100\7n\2\2\u0100\u0101\7w\2\2\u0101\u0102\7d\2\2\u0102\u0103\7g\2\2"+
		"\u0103,\3\2\2\2\u0104\u0105\7j\2\2\u0105\u0106\7c\2\2\u0106\u0107\7t\2"+
		"\2\u0107\u0108\7f\2\2\u0108.\3\2\2\2\u0109\u010a\7u\2\2\u010a\u010b\7"+
		"q\2\2\u010b\u010c\7h\2\2\u010c\u010d\7v\2\2\u010d\60\3\2\2\2\u010e\u010f"+
		"\7*\2\2\u010f\62\3\2\2\2\u0110\u0111\7+\2\2\u0111\64\3\2\2\2\u0112\u0113"+
		"\7}\2\2\u0113\66\3\2\2\2\u0114\u0115\7\177\2\2\u01158\3\2\2\2\u0116\u0117"+
		"\7]\2\2\u0117:\3\2\2\2\u0118\u0119\7_\2\2\u0119<\3\2\2\2\u011a\u011b\7"+
		".\2\2\u011b>\3\2\2\2\u011c\u011d\7-\2\2\u011d@\3\2\2\2\u011e\u011f\7/"+
		"\2\2\u011fB\3\2\2\2\u0120\u0121\7,\2\2\u0121D\3\2\2\2\u0122\u0123\7\61"+
		"\2\2\u0123F\3\2\2\2\u0124\u0125\7#\2\2\u0125H\3\2\2\2\u0126\u0127\7?\2"+
		"\2\u0127\u0128\7?\2\2\u0128J\3\2\2\2\u0129\u012a\7@\2\2\u012aL\3\2\2\2"+
		"\u012b\u012c\7>\2\2\u012cN\3\2\2\2\u012d\u012e\7@\2\2\u012e\u012f\7?\2"+
		"\2\u012fP\3\2\2\2\u0130\u0131\7>\2\2\u0131\u0132\7?\2\2\u0132R\3\2\2\2"+
		"\u0133\u0134\7c\2\2\u0134\u0135\7p\2\2\u0135\u0136\7f\2\2\u0136T\3\2\2"+
		"\2\u0137\u0138\7q\2\2\u0138\u0139\7t\2\2\u0139V\3\2\2\2\u013a\u013b\7"+
		"y\2\2\u013b\u013c\7j\2\2\u013c\u013d\7c\2\2\u013d\u013e\7v\2\2\u013e\u013f"+
		"\7N\2\2\u013f\u0140\7g\2\2\u0140\u0141\7p\2\2\u0141\u0142\7i\2\2\u0142"+
		"\u0143\7v\2\2\u0143\u0144\7j\2\2\u0144X\3\2\2\2\u0145\u0149\7$\2\2\u0146"+
		"\u0148\n\2\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014d\7$\2\2\u014dZ\3\2\2\2\u014e\u0152\t\3\2\2\u014f\u0151\t\4\2\2\u0150"+
		"\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\\\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0159\t\5\2\2\u0156\u0158"+
		"\t\6\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a^\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\t\7\2\2"+
		"\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\b\60\2\2\u0162`\3\2\2\2\u0163"+
		"\u0164\7\65\2\2\u0164\u0165\7?\2\2\u0165\u0166\7?\2\2\u0166\u0167\7F\2"+
		"\2\u0167b\3\2\2\2\7\2\u0149\u0152\u0159\u015f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}