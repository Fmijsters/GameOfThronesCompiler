// Generated from C:/Users/fmijs/Desktop/Herkansing Compiler\GameOfThronesLang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GameOfThronesLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MUL=1, DIV=2, ADD=3, SUB=4, OPEN_P=5, CLOSE_P=6, PRINT=7, EQUALS=8, SEMICOLON=9, 
		IDENTIFIER=10, INT=11, WS=12;
	public static final int
		RULE_winteriscoming = 0, RULE_something_for_the_maesters = 1, RULE_expr = 2, 
		RULE_statement = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"winteriscoming", "something_for_the_maesters", "expr", "statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'SPEAK'", "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MUL", "DIV", "ADD", "SUB", "OPEN_P", "CLOSE_P", "PRINT", "EQUALS", 
			"SEMICOLON", "IDENTIFIER", "INT", "WS"
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
	public String getGrammarFileName() { return "GameOfThronesLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GameOfThronesLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class WinteriscomingContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GameOfThronesLangParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WinteriscomingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winteriscoming; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitWinteriscoming(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinteriscomingContext winteriscoming() throws RecognitionException {
		WinteriscomingContext _localctx = new WinteriscomingContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_winteriscoming);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINT || _la==IDENTIFIER) {
				{
				{
				setState(8);
				statement();
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
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

	public static class Something_for_the_maestersContext extends ParserRuleContext {
		public Something_for_the_maestersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_something_for_the_maesters; }
	 
		public Something_for_the_maestersContext() { }
		public void copyFrom(Something_for_the_maestersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintExprContext extends Something_for_the_maestersContext {
		public TerminalNode PRINT() { return getToken(GameOfThronesLangParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GameOfThronesLangParser.SEMICOLON, 0); }
		public PrintExprContext(Something_for_the_maestersContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends Something_for_the_maestersContext {
		public TerminalNode IDENTIFIER() { return getToken(GameOfThronesLangParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(GameOfThronesLangParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GameOfThronesLangParser.SEMICOLON, 0); }
		public AssignContext(Something_for_the_maestersContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Something_for_the_maestersContext something_for_the_maesters() throws RecognitionException {
		Something_for_the_maestersContext _localctx = new Something_for_the_maestersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_something_for_the_maesters);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(PRINT);
				setState(17);
				expr(0);
				setState(18);
				match(SEMICOLON);
				}
				break;
			case IDENTIFIER:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(IDENTIFIER);
				setState(21);
				match(EQUALS);
				setState(22);
				expr(0);
				setState(23);
				match(SEMICOLON);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(GameOfThronesLangParser.IDENTIFIER, 0); }
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public TerminalNode OPEN_P() { return getToken(GameOfThronesLangParser.OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_P() { return getToken(GameOfThronesLangParser.CLOSE_P, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(GameOfThronesLangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GameOfThronesLangParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(GameOfThronesLangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GameOfThronesLangParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(GameOfThronesLangParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(28);
				match(INT);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(IDENTIFIER);
				}
				break;
			case OPEN_P:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(OPEN_P);
				setState(31);
				expr(0);
				setState(32);
				match(CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(42);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(36);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(37);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(38);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(39);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(40);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(41);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(46);
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

	public static class StatementContext extends ParserRuleContext {
		public Something_for_the_maestersContext something_for_the_maesters() {
			return getRuleContext(Something_for_the_maestersContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			something_for_the_maesters();
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"%\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\5\3\5\3\5\2"+
		"\3\6\6\2\4\6\b\2\4\3\2\3\4\3\2\5\6\2\65\2\r\3\2\2\2\4\33\3\2\2\2\6$\3"+
		"\2\2\2\b\61\3\2\2\2\n\f\5\b\5\2\13\n\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2"+
		"\r\16\3\2\2\2\16\20\3\2\2\2\17\r\3\2\2\2\20\21\7\2\2\3\21\3\3\2\2\2\22"+
		"\23\7\t\2\2\23\24\5\6\4\2\24\25\7\13\2\2\25\34\3\2\2\2\26\27\7\f\2\2\27"+
		"\30\7\n\2\2\30\31\5\6\4\2\31\32\7\13\2\2\32\34\3\2\2\2\33\22\3\2\2\2\33"+
		"\26\3\2\2\2\34\5\3\2\2\2\35\36\b\4\1\2\36%\7\r\2\2\37%\7\f\2\2 !\7\7\2"+
		"\2!\"\5\6\4\2\"#\7\b\2\2#%\3\2\2\2$\35\3\2\2\2$\37\3\2\2\2$ \3\2\2\2%"+
		".\3\2\2\2&\'\f\7\2\2\'(\t\2\2\2(-\5\6\4\b)*\f\6\2\2*+\t\3\2\2+-\5\6\4"+
		"\7,&\3\2\2\2,)\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\7\3\2\2\2\60."+
		"\3\2\2\2\61\62\5\4\3\2\62\t\3\2\2\2\7\r\33$,.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}