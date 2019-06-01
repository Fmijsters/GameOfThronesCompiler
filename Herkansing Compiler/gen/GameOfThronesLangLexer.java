// Generated from C:/Users/fmijs/Desktop/GameOfThronesCompiler/Herkansing Compiler\GameOfThronesLang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GameOfThronesLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, COMMENT=3, MUL=4, DIV=5, IF=6, ELSE=7, NOT=8, AND=9, OR=10, 
		WHILE=11, ADD=12, SUB=13, OPEN_P=14, CLOSE_P=15, STRING_TYPE=16, INT_TYPE=17, 
		PRINT=18, STRING=19, GT=20, LT=21, EQ=22, NE=23, EQUALS=24, SEMICOLON=25, 
		IDENTIFIER=26, INT=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "COMMENT", "MUL", "DIV", "IF", "ELSE", "NOT", "AND", 
			"OR", "WHILE", "ADD", "SUB", "OPEN_P", "CLOSE_P", "STRING_TYPE", "INT_TYPE", 
			"PRINT", "STRING", "GT", "LT", "EQ", "NE", "EQUALS", "SEMICOLON", "IDENTIFIER", 
			"INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", null, "'LORDUMBER'", "'NEDSTARK'", "'BELIEVE'", "'OR_DONT'", 
			"'NOT'", "'AND'", "'OR'", "'AS_LONG_AS'", "'REINFORCEMENTS_COMING'", 
			"'THE_ARMY_OF_THE_DEAD_IS_ATTACKING'", "'RIDERS_APPROACHING'", "'WILDLINGS_APPROACHING'", 
			"'BOOK'", "'COINS'", "'SPEAK'", null, "'MOUNTAIN_TYRION'", "'TYRION_MOUNTAIN'", 
			"'TYRION_TYRION'", "'NOT_EQUALS'", "'IS'", "'AND_NOW_YOUR_WATCH_HAS_ENDED'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "COMMENT", "MUL", "DIV", "IF", "ELSE", "NOT", "AND", 
			"OR", "WHILE", "ADD", "SUB", "OPEN_P", "CLOSE_P", "STRING_TYPE", "INT_TYPE", 
			"PRINT", "STRING", "GT", "LT", "EQ", "NE", "EQUALS", "SEMICOLON", "IDENTIFIER", 
			"INT", "WS"
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


	public GameOfThronesLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GameOfThronesLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0166\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\7\4B\n\4\f\4\16\4E\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00f6\n\24"+
		"\f\24\16\24\u00f9\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\6\33\u0157"+
		"\n\33\r\33\16\33\u0158\3\34\6\34\u015c\n\34\r\34\16\34\u015d\3\35\6\35"+
		"\u0161\n\35\r\35\16\35\u0162\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\7\4\2\f\f\17\17\3\2$$\4\2"+
		"C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u016b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\t"+
		"F\3\2\2\2\13P\3\2\2\2\rY\3\2\2\2\17a\3\2\2\2\21i\3\2\2\2\23m\3\2\2\2\25"+
		"q\3\2\2\2\27t\3\2\2\2\31\177\3\2\2\2\33\u0095\3\2\2\2\35\u00b7\3\2\2\2"+
		"\37\u00ca\3\2\2\2!\u00e0\3\2\2\2#\u00e5\3\2\2\2%\u00eb\3\2\2\2\'\u00f1"+
		"\3\2\2\2)\u00fc\3\2\2\2+\u010c\3\2\2\2-\u011c\3\2\2\2/\u012a\3\2\2\2\61"+
		"\u0135\3\2\2\2\63\u0138\3\2\2\2\65\u0156\3\2\2\2\67\u015b\3\2\2\29\u0160"+
		"\3\2\2\2;<\7}\2\2<\4\3\2\2\2=>\7\177\2\2>\6\3\2\2\2?C\7%\2\2@B\n\2\2\2"+
		"A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\b\3\2\2\2EC\3\2\2\2FG\7N\2\2"+
		"GH\7Q\2\2HI\7T\2\2IJ\7F\2\2JK\7W\2\2KL\7O\2\2LM\7D\2\2MN\7G\2\2NO\7T\2"+
		"\2O\n\3\2\2\2PQ\7P\2\2QR\7G\2\2RS\7F\2\2ST\7U\2\2TU\7V\2\2UV\7C\2\2VW"+
		"\7T\2\2WX\7M\2\2X\f\3\2\2\2YZ\7D\2\2Z[\7G\2\2[\\\7N\2\2\\]\7K\2\2]^\7"+
		"G\2\2^_\7X\2\2_`\7G\2\2`\16\3\2\2\2ab\7Q\2\2bc\7T\2\2cd\7a\2\2de\7F\2"+
		"\2ef\7Q\2\2fg\7P\2\2gh\7V\2\2h\20\3\2\2\2ij\7P\2\2jk\7Q\2\2kl\7V\2\2l"+
		"\22\3\2\2\2mn\7C\2\2no\7P\2\2op\7F\2\2p\24\3\2\2\2qr\7Q\2\2rs\7T\2\2s"+
		"\26\3\2\2\2tu\7C\2\2uv\7U\2\2vw\7a\2\2wx\7N\2\2xy\7Q\2\2yz\7P\2\2z{\7"+
		"I\2\2{|\7a\2\2|}\7C\2\2}~\7U\2\2~\30\3\2\2\2\177\u0080\7T\2\2\u0080\u0081"+
		"\7G\2\2\u0081\u0082\7K\2\2\u0082\u0083\7P\2\2\u0083\u0084\7H\2\2\u0084"+
		"\u0085\7Q\2\2\u0085\u0086\7T\2\2\u0086\u0087\7E\2\2\u0087\u0088\7G\2\2"+
		"\u0088\u0089\7O\2\2\u0089\u008a\7G\2\2\u008a\u008b\7P\2\2\u008b\u008c"+
		"\7V\2\2\u008c\u008d\7U\2\2\u008d\u008e\7a\2\2\u008e\u008f\7E\2\2\u008f"+
		"\u0090\7Q\2\2\u0090\u0091\7O\2\2\u0091\u0092\7K\2\2\u0092\u0093\7P\2\2"+
		"\u0093\u0094\7I\2\2\u0094\32\3\2\2\2\u0095\u0096\7V\2\2\u0096\u0097\7"+
		"J\2\2\u0097\u0098\7G\2\2\u0098\u0099\7a\2\2\u0099\u009a\7C\2\2\u009a\u009b"+
		"\7T\2\2\u009b\u009c\7O\2\2\u009c\u009d\7[\2\2\u009d\u009e\7a\2\2\u009e"+
		"\u009f\7Q\2\2\u009f\u00a0\7H\2\2\u00a0\u00a1\7a\2\2\u00a1\u00a2\7V\2\2"+
		"\u00a2\u00a3\7J\2\2\u00a3\u00a4\7G\2\2\u00a4\u00a5\7a\2\2\u00a5\u00a6"+
		"\7F\2\2\u00a6\u00a7\7G\2\2\u00a7\u00a8\7C\2\2\u00a8\u00a9\7F\2\2\u00a9"+
		"\u00aa\7a\2\2\u00aa\u00ab\7K\2\2\u00ab\u00ac\7U\2\2\u00ac\u00ad\7a\2\2"+
		"\u00ad\u00ae\7C\2\2\u00ae\u00af\7V\2\2\u00af\u00b0\7V\2\2\u00b0\u00b1"+
		"\7C\2\2\u00b1\u00b2\7E\2\2\u00b2\u00b3\7M\2\2\u00b3\u00b4\7K\2\2\u00b4"+
		"\u00b5\7P\2\2\u00b5\u00b6\7I\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7T\2\2\u00b8"+
		"\u00b9\7K\2\2\u00b9\u00ba\7F\2\2\u00ba\u00bb\7G\2\2\u00bb\u00bc\7T\2\2"+
		"\u00bc\u00bd\7U\2\2\u00bd\u00be\7a\2\2\u00be\u00bf\7C\2\2\u00bf\u00c0"+
		"\7R\2\2\u00c0\u00c1\7R\2\2\u00c1\u00c2\7T\2\2\u00c2\u00c3\7Q\2\2\u00c3"+
		"\u00c4\7C\2\2\u00c4\u00c5\7E\2\2\u00c5\u00c6\7J\2\2\u00c6\u00c7\7K\2\2"+
		"\u00c7\u00c8\7P\2\2\u00c8\u00c9\7I\2\2\u00c9\36\3\2\2\2\u00ca\u00cb\7"+
		"Y\2\2\u00cb\u00cc\7K\2\2\u00cc\u00cd\7N\2\2\u00cd\u00ce\7F\2\2\u00ce\u00cf"+
		"\7N\2\2\u00cf\u00d0\7K\2\2\u00d0\u00d1\7P\2\2\u00d1\u00d2\7I\2\2\u00d2"+
		"\u00d3\7U\2\2\u00d3\u00d4\7a\2\2\u00d4\u00d5\7C\2\2\u00d5\u00d6\7R\2\2"+
		"\u00d6\u00d7\7R\2\2\u00d7\u00d8\7T\2\2\u00d8\u00d9\7Q\2\2\u00d9\u00da"+
		"\7C\2\2\u00da\u00db\7E\2\2\u00db\u00dc\7J\2\2\u00dc\u00dd\7K\2\2\u00dd"+
		"\u00de\7P\2\2\u00de\u00df\7I\2\2\u00df \3\2\2\2\u00e0\u00e1\7D\2\2\u00e1"+
		"\u00e2\7Q\2\2\u00e2\u00e3\7Q\2\2\u00e3\u00e4\7M\2\2\u00e4\"\3\2\2\2\u00e5"+
		"\u00e6\7E\2\2\u00e6\u00e7\7Q\2\2\u00e7\u00e8\7K\2\2\u00e8\u00e9\7P\2\2"+
		"\u00e9\u00ea\7U\2\2\u00ea$\3\2\2\2\u00eb\u00ec\7U\2\2\u00ec\u00ed\7R\2"+
		"\2\u00ed\u00ee\7G\2\2\u00ee\u00ef\7C\2\2\u00ef\u00f0\7M\2\2\u00f0&\3\2"+
		"\2\2\u00f1\u00f7\7$\2\2\u00f2\u00f6\n\3\2\2\u00f3\u00f4\7^\2\2\u00f4\u00f6"+
		"\7$\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00fb\7$\2\2\u00fb(\3\2\2\2\u00fc\u00fd\7O\2\2\u00fd\u00fe"+
		"\7Q\2\2\u00fe\u00ff\7W\2\2\u00ff\u0100\7P\2\2\u0100\u0101\7V\2\2\u0101"+
		"\u0102\7C\2\2\u0102\u0103\7K\2\2\u0103\u0104\7P\2\2\u0104\u0105\7a\2\2"+
		"\u0105\u0106\7V\2\2\u0106\u0107\7[\2\2\u0107\u0108\7T\2\2\u0108\u0109"+
		"\7K\2\2\u0109\u010a\7Q\2\2\u010a\u010b\7P\2\2\u010b*\3\2\2\2\u010c\u010d"+
		"\7V\2\2\u010d\u010e\7[\2\2\u010e\u010f\7T\2\2\u010f\u0110\7K\2\2\u0110"+
		"\u0111\7Q\2\2\u0111\u0112\7P\2\2\u0112\u0113\7a\2\2\u0113\u0114\7O\2\2"+
		"\u0114\u0115\7Q\2\2\u0115\u0116\7W\2\2\u0116\u0117\7P\2\2\u0117\u0118"+
		"\7V\2\2\u0118\u0119\7C\2\2\u0119\u011a\7K\2\2\u011a\u011b\7P\2\2\u011b"+
		",\3\2\2\2\u011c\u011d\7V\2\2\u011d\u011e\7[\2\2\u011e\u011f\7T\2\2\u011f"+
		"\u0120\7K\2\2\u0120\u0121\7Q\2\2\u0121\u0122\7P\2\2\u0122\u0123\7a\2\2"+
		"\u0123\u0124\7V\2\2\u0124\u0125\7[\2\2\u0125\u0126\7T\2\2\u0126\u0127"+
		"\7K\2\2\u0127\u0128\7Q\2\2\u0128\u0129\7P\2\2\u0129.\3\2\2\2\u012a\u012b"+
		"\7P\2\2\u012b\u012c\7Q\2\2\u012c\u012d\7V\2\2\u012d\u012e\7a\2\2\u012e"+
		"\u012f\7G\2\2\u012f\u0130\7S\2\2\u0130\u0131\7W\2\2\u0131\u0132\7C\2\2"+
		"\u0132\u0133\7N\2\2\u0133\u0134\7U\2\2\u0134\60\3\2\2\2\u0135\u0136\7"+
		"K\2\2\u0136\u0137\7U\2\2\u0137\62\3\2\2\2\u0138\u0139\7C\2\2\u0139\u013a"+
		"\7P\2\2\u013a\u013b\7F\2\2\u013b\u013c\7a\2\2\u013c\u013d\7P\2\2\u013d"+
		"\u013e\7Q\2\2\u013e\u013f\7Y\2\2\u013f\u0140\7a\2\2\u0140\u0141\7[\2\2"+
		"\u0141\u0142\7Q\2\2\u0142\u0143\7W\2\2\u0143\u0144\7T\2\2\u0144\u0145"+
		"\7a\2\2\u0145\u0146\7Y\2\2\u0146\u0147\7C\2\2\u0147\u0148\7V\2\2\u0148"+
		"\u0149\7E\2\2\u0149\u014a\7J\2\2\u014a\u014b\7a\2\2\u014b\u014c\7J\2\2"+
		"\u014c\u014d\7C\2\2\u014d\u014e\7U\2\2\u014e\u014f\7a\2\2\u014f\u0150"+
		"\7G\2\2\u0150\u0151\7P\2\2\u0151\u0152\7F\2\2\u0152\u0153\7G\2\2\u0153"+
		"\u0154\7F\2\2\u0154\64\3\2\2\2\u0155\u0157\t\4\2\2\u0156\u0155\3\2\2\2"+
		"\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\66"+
		"\3\2\2\2\u015a\u015c\t\5\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e8\3\2\2\2\u015f\u0161\t\6\2\2"+
		"\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\b\35\2\2\u0165:\3\2\2\2\t\2C"+
		"\u00f5\u00f7\u0158\u015d\u0162\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}