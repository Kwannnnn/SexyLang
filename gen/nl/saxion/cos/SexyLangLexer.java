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
			"'SafeWord'", "'bodyCounts'", "'lengths'", "'bulges'", "'SafeWords'", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0158\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\7-\u0138\n-\f-\16-\u013b\13-\3"+
		"-\3-\3.\3.\7.\u0141\n.\f.\16.\u0144\13.\3/\3/\7/\u0148\n/\f/\16/\u014b"+
		"\13/\3\60\6\60\u014e\n\60\r\60\16\60\u014f\3\60\3\60\3\61\3\61\3\61\3"+
		"\61\3\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\b"+
		"\6\2\f\f\17\17$$^^\4\2C\\c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\5\2\13\f\17"+
		"\17\"\"\2\u015b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7g\3\2\2\2\tm\3\2\2\2\13s\3"+
		"\2\2\2\r}\3\2\2\2\17\u0084\3\2\2\2\21\u008d\3\2\2\2\23\u0098\3\2\2\2\25"+
		"\u00a0\3\2\2\2\27\u00a7\3\2\2\2\31\u00b1\3\2\2\2\33\u00b8\3\2\2\2\35\u00bb"+
		"\3\2\2\2\37\u00c0\3\2\2\2!\u00c9\3\2\2\2#\u00d5\3\2\2\2%\u00df\3\2\2\2"+
		"\'\u00e2\3\2\2\2)\u00ea\3\2\2\2+\u00ef\3\2\2\2-\u00f4\3\2\2\2/\u00f9\3"+
		"\2\2\2\61\u00fe\3\2\2\2\63\u0100\3\2\2\2\65\u0102\3\2\2\2\67\u0104\3\2"+
		"\2\29\u0106\3\2\2\2;\u0108\3\2\2\2=\u010a\3\2\2\2?\u010c\3\2\2\2A\u010e"+
		"\3\2\2\2C\u0110\3\2\2\2E\u0112\3\2\2\2G\u0114\3\2\2\2I\u0116\3\2\2\2K"+
		"\u0119\3\2\2\2M\u011b\3\2\2\2O\u011d\3\2\2\2Q\u0120\3\2\2\2S\u0123\3\2"+
		"\2\2U\u0127\3\2\2\2W\u012a\3\2\2\2Y\u0135\3\2\2\2[\u013e\3\2\2\2]\u0145"+
		"\3\2\2\2_\u014d\3\2\2\2a\u0153\3\2\2\2cd\7\62\2\2d\4\3\2\2\2ef\7\60\2"+
		"\2f\6\3\2\2\2gh\7g\2\2hi\7o\2\2ij\7r\2\2jk\7v\2\2kl\7{\2\2l\b\3\2\2\2"+
		"mn\7d\2\2no\7w\2\2op\7n\2\2pq\7i\2\2qr\7g\2\2r\n\3\2\2\2st\7d\2\2tu\7"+
		"q\2\2uv\7f\2\2vw\7{\2\2wx\7E\2\2xy\7q\2\2yz\7w\2\2z{\7p\2\2{|\7v\2\2|"+
		"\f\3\2\2\2}~\7n\2\2~\177\7g\2\2\177\u0080\7p\2\2\u0080\u0081\7i\2\2\u0081"+
		"\u0082\7v\2\2\u0082\u0083\7j\2\2\u0083\16\3\2\2\2\u0084\u0085\7U\2\2\u0085"+
		"\u0086\7c\2\2\u0086\u0087\7h\2\2\u0087\u0088\7g\2\2\u0088\u0089\7Y\2\2"+
		"\u0089\u008a\7q\2\2\u008a\u008b\7t\2\2\u008b\u008c\7f\2\2\u008c\20\3\2"+
		"\2\2\u008d\u008e\7d\2\2\u008e\u008f\7q\2\2\u008f\u0090\7f\2\2\u0090\u0091"+
		"\7{\2\2\u0091\u0092\7E\2\2\u0092\u0093\7q\2\2\u0093\u0094\7w\2\2\u0094"+
		"\u0095\7p\2\2\u0095\u0096\7v\2\2\u0096\u0097\7u\2\2\u0097\22\3\2\2\2\u0098"+
		"\u0099\7n\2\2\u0099\u009a\7g\2\2\u009a\u009b\7p\2\2\u009b\u009c\7i\2\2"+
		"\u009c\u009d\7v\2\2\u009d\u009e\7j\2\2\u009e\u009f\7u\2\2\u009f\24\3\2"+
		"\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4"+
		"\7i\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7u\2\2\u00a6\26\3\2\2\2\u00a7\u00a8"+
		"\7U\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"\u00ac\7Y\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7f\2\2"+
		"\u00af\u00b0\7u\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7"+
		"p\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7"+
		"\7v\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7p\2\2\u00ba\34"+
		"\3\2\2\2\u00bb\u00bc\7o\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7c\2\2\u00be"+
		"\u00bf\7p\2\2\u00bf\36\3\2\2\2\u00c0\u00c1\7o\2\2\u00c1\u00c2\7q\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7N\2\2\u00c5\u00c6\7q\2\2"+
		"\u00c6\u00c7\7w\2\2\u00c7\u00c8\7f\2\2\u00c8 \3\2\2\2\u00c9\u00ca\7d\2"+
		"\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7f\2\2\u00cc\u00cd\7C\2\2\u00cd\u00ce"+
		"\7e\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7x\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7{\2\2\u00d4\"\3\2\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6\u00d7\7l\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7e\2\2"+
		"\u00d9\u00da\7w\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd"+
		"\7v\2\2\u00dd\u00de\7g\2\2\u00de$\3\2\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1"+
		"\7h\2\2\u00e1&\3\2\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5"+
		"\7u\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7\"\2\2\u00e7\u00e8\7k\2\2\u00e8"+
		"\u00e9\7h\2\2\u00e9(\3\2\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7n\2\2\u00ec"+
		"\u00ed\7u\2\2\u00ed\u00ee\7g\2\2\u00ee*\3\2\2\2\u00ef\u00f0\7n\2\2\u00f0"+
		"\u00f1\7w\2\2\u00f1\u00f2\7d\2\2\u00f2\u00f3\7g\2\2\u00f3,\3\2\2\2\u00f4"+
		"\u00f5\7j\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7f\2\2"+
		"\u00f8.\3\2\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7h\2"+
		"\2\u00fc\u00fd\7v\2\2\u00fd\60\3\2\2\2\u00fe\u00ff\7*\2\2\u00ff\62\3\2"+
		"\2\2\u0100\u0101\7+\2\2\u0101\64\3\2\2\2\u0102\u0103\7}\2\2\u0103\66\3"+
		"\2\2\2\u0104\u0105\7\177\2\2\u01058\3\2\2\2\u0106\u0107\7]\2\2\u0107:"+
		"\3\2\2\2\u0108\u0109\7_\2\2\u0109<\3\2\2\2\u010a\u010b\7.\2\2\u010b>\3"+
		"\2\2\2\u010c\u010d\7-\2\2\u010d@\3\2\2\2\u010e\u010f\7/\2\2\u010fB\3\2"+
		"\2\2\u0110\u0111\7,\2\2\u0111D\3\2\2\2\u0112\u0113\7\61\2\2\u0113F\3\2"+
		"\2\2\u0114\u0115\7#\2\2\u0115H\3\2\2\2\u0116\u0117\7?\2\2\u0117\u0118"+
		"\7?\2\2\u0118J\3\2\2\2\u0119\u011a\7@\2\2\u011aL\3\2\2\2\u011b\u011c\7"+
		">\2\2\u011cN\3\2\2\2\u011d\u011e\7@\2\2\u011e\u011f\7?\2\2\u011fP\3\2"+
		"\2\2\u0120\u0121\7>\2\2\u0121\u0122\7?\2\2\u0122R\3\2\2\2\u0123\u0124"+
		"\7c\2\2\u0124\u0125\7p\2\2\u0125\u0126\7f\2\2\u0126T\3\2\2\2\u0127\u0128"+
		"\7q\2\2\u0128\u0129\7t\2\2\u0129V\3\2\2\2\u012a\u012b\7y\2\2\u012b\u012c"+
		"\7j\2\2\u012c\u012d\7c\2\2\u012d\u012e\7v\2\2\u012e\u012f\7N\2\2\u012f"+
		"\u0130\7g\2\2\u0130\u0131\7p\2\2\u0131\u0132\7i\2\2\u0132\u0133\7v\2\2"+
		"\u0133\u0134\7j\2\2\u0134X\3\2\2\2\u0135\u0139\7$\2\2\u0136\u0138\n\2"+
		"\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7$"+
		"\2\2\u013dZ\3\2\2\2\u013e\u0142\t\3\2\2\u013f\u0141\t\4\2\2\u0140\u013f"+
		"\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\\\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0149\t\5\2\2\u0146\u0148\t\6\2\2"+
		"\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a^\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\t\7\2\2\u014d"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151\u0152\b\60\2\2\u0152`\3\2\2\2\u0153\u0154"+
		"\7\65\2\2\u0154\u0155\7?\2\2\u0155\u0156\7?\2\2\u0156\u0157\7F\2\2\u0157"+
		"b\3\2\2\2\7\2\u0139\u0142\u0149\u014f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}