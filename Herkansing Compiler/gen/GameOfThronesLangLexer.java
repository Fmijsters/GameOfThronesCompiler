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
		T__0=1, T__1=2, COMMENT=3, MUL=4, DIV=5, IF=6, ADD=7, SUB=8, OPEN_P=9, 
		CLOSE_P=10, STRING_TYPE=11, INT_TYPE=12, PRINT=13, STRING=14, GT=15, LT=16, 
		EQ=17, NE=18, EQUALS=19, SEMICOLON=20, IDENTIFIER=21, INT=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "COMMENT", "MUL", "DIV", "IF", "ADD", "SUB", "OPEN_P", 
			"CLOSE_P", "STRING_TYPE", "INT_TYPE", "PRINT", "STRING", "GT", "LT", 
			"EQ", "NE", "EQUALS", "SEMICOLON", "IDENTIFIER", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", null, "'LORDUMBER'", "'NEDSTARK'", "'BELIEVE'", "'REINFORCEMENTS_COMING'", 
			"'THE_ARMY_OF_THE_DEAD_IS_ATTACKING'", "'RIDERS_APPROACHING'", "'WILDLINGS_APPROACHING'", 
			"'STRING'", "'INT'", "'SPEAK'", null, "'MOUNTAIN_TYRION'", "'TYRION_MOUNTAIN'", 
			"'TYRION_TYRION'", "'NOT_EQUALS'", "'='", "'AND_NOW_YOUR_WATCH_HAS_ENDED'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "COMMENT", "MUL", "DIV", "IF", "ADD", "SUB", "OPEN_P", 
			"CLOSE_P", "STRING_TYPE", "INT_TYPE", "PRINT", "STRING", "GT", "LT", 
			"EQ", "NE", "EQUALS", "SEMICOLON", "IDENTIFIER", "INT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u013d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\7\17\u00ce\n\17\f\17\16\17\u00d1\13\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\6\26\u012e\n\26\r\26\16\26\u012f\3\27"+
		"\6\27\u0133\n\27\r\27\16\27\u0134\3\30\6\30\u0138\n\30\r\30\16\30\u0139"+
		"\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\7\4\2\f\f\17"+
		"\17\3\2$$\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0142\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5"+
		"\63\3\2\2\2\7\65\3\2\2\2\t<\3\2\2\2\13F\3\2\2\2\rO\3\2\2\2\17W\3\2\2\2"+
		"\21m\3\2\2\2\23\u008f\3\2\2\2\25\u00a2\3\2\2\2\27\u00b8\3\2\2\2\31\u00bf"+
		"\3\2\2\2\33\u00c3\3\2\2\2\35\u00c9\3\2\2\2\37\u00d4\3\2\2\2!\u00e4\3\2"+
		"\2\2#\u00f4\3\2\2\2%\u0102\3\2\2\2\'\u010d\3\2\2\2)\u010f\3\2\2\2+\u012d"+
		"\3\2\2\2-\u0132\3\2\2\2/\u0137\3\2\2\2\61\62\7}\2\2\62\4\3\2\2\2\63\64"+
		"\7\177\2\2\64\6\3\2\2\2\659\7%\2\2\668\n\2\2\2\67\66\3\2\2\28;\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:\b\3\2\2\2;9\3\2\2\2<=\7N\2\2=>\7Q\2\2>?\7T\2\2"+
		"?@\7F\2\2@A\7W\2\2AB\7O\2\2BC\7D\2\2CD\7G\2\2DE\7T\2\2E\n\3\2\2\2FG\7"+
		"P\2\2GH\7G\2\2HI\7F\2\2IJ\7U\2\2JK\7V\2\2KL\7C\2\2LM\7T\2\2MN\7M\2\2N"+
		"\f\3\2\2\2OP\7D\2\2PQ\7G\2\2QR\7N\2\2RS\7K\2\2ST\7G\2\2TU\7X\2\2UV\7G"+
		"\2\2V\16\3\2\2\2WX\7T\2\2XY\7G\2\2YZ\7K\2\2Z[\7P\2\2[\\\7H\2\2\\]\7Q\2"+
		"\2]^\7T\2\2^_\7E\2\2_`\7G\2\2`a\7O\2\2ab\7G\2\2bc\7P\2\2cd\7V\2\2de\7"+
		"U\2\2ef\7a\2\2fg\7E\2\2gh\7Q\2\2hi\7O\2\2ij\7K\2\2jk\7P\2\2kl\7I\2\2l"+
		"\20\3\2\2\2mn\7V\2\2no\7J\2\2op\7G\2\2pq\7a\2\2qr\7C\2\2rs\7T\2\2st\7"+
		"O\2\2tu\7[\2\2uv\7a\2\2vw\7Q\2\2wx\7H\2\2xy\7a\2\2yz\7V\2\2z{\7J\2\2{"+
		"|\7G\2\2|}\7a\2\2}~\7F\2\2~\177\7G\2\2\177\u0080\7C\2\2\u0080\u0081\7"+
		"F\2\2\u0081\u0082\7a\2\2\u0082\u0083\7K\2\2\u0083\u0084\7U\2\2\u0084\u0085"+
		"\7a\2\2\u0085\u0086\7C\2\2\u0086\u0087\7V\2\2\u0087\u0088\7V\2\2\u0088"+
		"\u0089\7C\2\2\u0089\u008a\7E\2\2\u008a\u008b\7M\2\2\u008b\u008c\7K\2\2"+
		"\u008c\u008d\7P\2\2\u008d\u008e\7I\2\2\u008e\22\3\2\2\2\u008f\u0090\7"+
		"T\2\2\u0090\u0091\7K\2\2\u0091\u0092\7F\2\2\u0092\u0093\7G\2\2\u0093\u0094"+
		"\7T\2\2\u0094\u0095\7U\2\2\u0095\u0096\7a\2\2\u0096\u0097\7C\2\2\u0097"+
		"\u0098\7R\2\2\u0098\u0099\7R\2\2\u0099\u009a\7T\2\2\u009a\u009b\7Q\2\2"+
		"\u009b\u009c\7C\2\2\u009c\u009d\7E\2\2\u009d\u009e\7J\2\2\u009e\u009f"+
		"\7K\2\2\u009f\u00a0\7P\2\2\u00a0\u00a1\7I\2\2\u00a1\24\3\2\2\2\u00a2\u00a3"+
		"\7Y\2\2\u00a3\u00a4\7K\2\2\u00a4\u00a5\7N\2\2\u00a5\u00a6\7F\2\2\u00a6"+
		"\u00a7\7N\2\2\u00a7\u00a8\7K\2\2\u00a8\u00a9\7P\2\2\u00a9\u00aa\7I\2\2"+
		"\u00aa\u00ab\7U\2\2\u00ab\u00ac\7a\2\2\u00ac\u00ad\7C\2\2\u00ad\u00ae"+
		"\7R\2\2\u00ae\u00af\7R\2\2\u00af\u00b0\7T\2\2\u00b0\u00b1\7Q\2\2\u00b1"+
		"\u00b2\7C\2\2\u00b2\u00b3\7E\2\2\u00b3\u00b4\7J\2\2\u00b4\u00b5\7K\2\2"+
		"\u00b5\u00b6\7P\2\2\u00b6\u00b7\7I\2\2\u00b7\26\3\2\2\2\u00b8\u00b9\7"+
		"U\2\2\u00b9\u00ba\7V\2\2\u00ba\u00bb\7T\2\2\u00bb\u00bc\7K\2\2\u00bc\u00bd"+
		"\7P\2\2\u00bd\u00be\7I\2\2\u00be\30\3\2\2\2\u00bf\u00c0\7K\2\2\u00c0\u00c1"+
		"\7P\2\2\u00c1\u00c2\7V\2\2\u00c2\32\3\2\2\2\u00c3\u00c4\7U\2\2\u00c4\u00c5"+
		"\7R\2\2\u00c5\u00c6\7G\2\2\u00c6\u00c7\7C\2\2\u00c7\u00c8\7M\2\2\u00c8"+
		"\34\3\2\2\2\u00c9\u00cf\7$\2\2\u00ca\u00ce\n\3\2\2\u00cb\u00cc\7^\2\2"+
		"\u00cc\u00ce\7$\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\7$\2\2\u00d3\36\3\2\2\2\u00d4\u00d5\7O\2\2"+
		"\u00d5\u00d6\7Q\2\2\u00d6\u00d7\7W\2\2\u00d7\u00d8\7P\2\2\u00d8\u00d9"+
		"\7V\2\2\u00d9\u00da\7C\2\2\u00da\u00db\7K\2\2\u00db\u00dc\7P\2\2\u00dc"+
		"\u00dd\7a\2\2\u00dd\u00de\7V\2\2\u00de\u00df\7[\2\2\u00df\u00e0\7T\2\2"+
		"\u00e0\u00e1\7K\2\2\u00e1\u00e2\7Q\2\2\u00e2\u00e3\7P\2\2\u00e3 \3\2\2"+
		"\2\u00e4\u00e5\7V\2\2\u00e5\u00e6\7[\2\2\u00e6\u00e7\7T\2\2\u00e7\u00e8"+
		"\7K\2\2\u00e8\u00e9\7Q\2\2\u00e9\u00ea\7P\2\2\u00ea\u00eb\7a\2\2\u00eb"+
		"\u00ec\7O\2\2\u00ec\u00ed\7Q\2\2\u00ed\u00ee\7W\2\2\u00ee\u00ef\7P\2\2"+
		"\u00ef\u00f0\7V\2\2\u00f0\u00f1\7C\2\2\u00f1\u00f2\7K\2\2\u00f2\u00f3"+
		"\7P\2\2\u00f3\"\3\2\2\2\u00f4\u00f5\7V\2\2\u00f5\u00f6\7[\2\2\u00f6\u00f7"+
		"\7T\2\2\u00f7\u00f8\7K\2\2\u00f8\u00f9\7Q\2\2\u00f9\u00fa\7P\2\2\u00fa"+
		"\u00fb\7a\2\2\u00fb\u00fc\7V\2\2\u00fc\u00fd\7[\2\2\u00fd\u00fe\7T\2\2"+
		"\u00fe\u00ff\7K\2\2\u00ff\u0100\7Q\2\2\u0100\u0101\7P\2\2\u0101$\3\2\2"+
		"\2\u0102\u0103\7P\2\2\u0103\u0104\7Q\2\2\u0104\u0105\7V\2\2\u0105\u0106"+
		"\7a\2\2\u0106\u0107\7G\2\2\u0107\u0108\7S\2\2\u0108\u0109\7W\2\2\u0109"+
		"\u010a\7C\2\2\u010a\u010b\7N\2\2\u010b\u010c\7U\2\2\u010c&\3\2\2\2\u010d"+
		"\u010e\7?\2\2\u010e(\3\2\2\2\u010f\u0110\7C\2\2\u0110\u0111\7P\2\2\u0111"+
		"\u0112\7F\2\2\u0112\u0113\7a\2\2\u0113\u0114\7P\2\2\u0114\u0115\7Q\2\2"+
		"\u0115\u0116\7Y\2\2\u0116\u0117\7a\2\2\u0117\u0118\7[\2\2\u0118\u0119"+
		"\7Q\2\2\u0119\u011a\7W\2\2\u011a\u011b\7T\2\2\u011b\u011c\7a\2\2\u011c"+
		"\u011d\7Y\2\2\u011d\u011e\7C\2\2\u011e\u011f\7V\2\2\u011f\u0120\7E\2\2"+
		"\u0120\u0121\7J\2\2\u0121\u0122\7a\2\2\u0122\u0123\7J\2\2\u0123\u0124"+
		"\7C\2\2\u0124\u0125\7U\2\2\u0125\u0126\7a\2\2\u0126\u0127\7G\2\2\u0127"+
		"\u0128\7P\2\2\u0128\u0129\7F\2\2\u0129\u012a\7G\2\2\u012a\u012b\7F\2\2"+
		"\u012b*\3\2\2\2\u012c\u012e\t\4\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3"+
		"\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130,\3\2\2\2\u0131\u0133"+
		"\t\5\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135.\3\2\2\2\u0136\u0138\t\6\2\2\u0137\u0136\3\2\2\2"+
		"\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013c\b\30\2\2\u013c\60\3\2\2\2\t\29\u00cd\u00cf\u012f"+
		"\u0134\u0139\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}