// Generated from C:/Users/fmijs/Desktop/GameOfThronesCompiler/Herkansing Compiler\GameOfThronesLang.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, COMMENT=3, MUL=4, DIV=5, IF=6, ADD=7, SUB=8, OPEN_P=9, 
		CLOSE_P=10, STRING_TYPE=11, INT_TYPE=12, PRINT=13, STRING=14, GT=15, LT=16, 
		EQ=17, NE=18, EQUALS=19, SEMICOLON=20, IDENTIFIER=21, INT=22, WS=23;
	public static final int
		RULE_winteriscoming = 0, RULE_something_for_the_maesters = 1, RULE_block = 2, 
		RULE_expr = 3, RULE_statement = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"winteriscoming", "something_for_the_maesters", "block", "expr", "statement"
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
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << COMMENT) | (1L << IF) | (1L << OPEN_P) | (1L << STRING_TYPE) | (1L << INT_TYPE) | (1L << PRINT) | (1L << STRING) | (1L << IDENTIFIER) | (1L << INT))) != 0)) {
				{
				{
				setState(10);
				statement();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
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
	public static class IfContext extends Something_for_the_maestersContext {
		public ExprContext leftExpr;
		public ExprContext rightExpr;
		public TerminalNode IF() { return getToken(GameOfThronesLangParser.IF, 0); }
		public TerminalNode OPEN_P() { return getToken(GameOfThronesLangParser.OPEN_P, 0); }
		public TerminalNode CLOSE_P() { return getToken(GameOfThronesLangParser.CLOSE_P, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(GameOfThronesLangParser.GT, 0); }
		public TerminalNode LT() { return getToken(GameOfThronesLangParser.LT, 0); }
		public TerminalNode EQ() { return getToken(GameOfThronesLangParser.EQ, 0); }
		public TerminalNode NE() { return getToken(GameOfThronesLangParser.NE, 0); }
		public IfContext(Something_for_the_maestersContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode INT_TYPE() { return getToken(GameOfThronesLangParser.INT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(GameOfThronesLangParser.STRING_TYPE, 0); }
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
		int _la;
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(PRINT);
				setState(19);
				expr(0);
				setState(20);
				match(SEMICOLON);
				}
				break;
			case STRING_TYPE:
			case INT_TYPE:
			case IDENTIFIER:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TYPE:
					{
					setState(22);
					match(INT_TYPE);
					}
					break;
				case STRING_TYPE:
					{
					setState(23);
					match(STRING_TYPE);
					}
					break;
				case IDENTIFIER:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(27);
				match(IDENTIFIER);
				setState(28);
				match(EQUALS);
				setState(29);
				expr(0);
				setState(30);
				match(SEMICOLON);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(IF);
				setState(33);
				match(OPEN_P);
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(34);
					((IfContext)_localctx).leftExpr = expr(0);
					setState(35);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ) | (1L << NE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(36);
					((IfContext)_localctx).rightExpr = expr(0);
					}
					break;
				case 2:
					{
					setState(38);
					expr(0);
					}
					break;
				}
				setState(41);
				match(CLOSE_P);
				setState(42);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << COMMENT) | (1L << IF) | (1L << OPEN_P) | (1L << STRING_TYPE) | (1L << INT_TYPE) | (1L << PRINT) | (1L << STRING) | (1L << IDENTIFIER) | (1L << INT))) != 0)) {
				{
				{
				setState(47);
				statement();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(T__1);
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
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(GameOfThronesLangParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public ExprContext leftExpr;
		public Token op;
		public ExprContext rightExpr;
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
		public ExprContext leftExpr;
		public Token op;
		public ExprContext rightExpr;
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
	public static class CommentContext extends ExprContext {
		public TerminalNode COMMENT() { return getToken(GameOfThronesLangParser.COMMENT, 0); }
		public CommentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitComment(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(56);
				match(INT);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(STRING);
				}
				break;
			case COMMENT:
				{
				_localctx = new CommentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(COMMENT);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(IDENTIFIER);
				}
				break;
			case OPEN_P:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(OPEN_P);
				setState(61);
				expr(0);
				setState(62);
				match(CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						((MulDivContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(67);
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
						setState(68);
						((MulDivContext)_localctx).rightExpr = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(70);
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
						setState(71);
						((AddSubContext)_localctx).rightExpr = expr(7);
						}
						break;
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				something_for_the_maesters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				block();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31U\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3*\n\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\7\4\63\n\4\f\4\16"+
		"\4\66\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\6\3\6\3\6\5\6S\n\6\3\6\2"+
		"\3\b\7\2\4\6\b\n\2\5\3\2\21\24\3\2\6\7\3\2\t\n\2^\2\17\3\2\2\2\4.\3\2"+
		"\2\2\6\60\3\2\2\2\bB\3\2\2\2\nR\3\2\2\2\f\16\5\n\6\2\r\f\3\2\2\2\16\21"+
		"\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21\17\3\2\2\2\22\23"+
		"\7\2\2\3\23\3\3\2\2\2\24\25\7\17\2\2\25\26\5\b\5\2\26\27\7\26\2\2\27/"+
		"\3\2\2\2\30\34\7\16\2\2\31\34\7\r\2\2\32\34\3\2\2\2\33\30\3\2\2\2\33\31"+
		"\3\2\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\36\7\27\2\2\36\37\7\25\2\2\37"+
		" \5\b\5\2 !\7\26\2\2!/\3\2\2\2\"#\7\b\2\2#)\7\13\2\2$%\5\b\5\2%&\t\2\2"+
		"\2&\'\5\b\5\2\'*\3\2\2\2(*\5\b\5\2)$\3\2\2\2)(\3\2\2\2*+\3\2\2\2+,\7\f"+
		"\2\2,-\5\6\4\2-/\3\2\2\2.\24\3\2\2\2.\33\3\2\2\2.\"\3\2\2\2/\5\3\2\2\2"+
		"\60\64\7\3\2\2\61\63\5\n\6\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2"+
		"\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\4\2\28\7\3\2\2\29:\b"+
		"\5\1\2:C\7\30\2\2;C\7\20\2\2<C\7\5\2\2=C\7\27\2\2>?\7\13\2\2?@\5\b\5\2"+
		"@A\7\f\2\2AC\3\2\2\2B9\3\2\2\2B;\3\2\2\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2"+
		"CL\3\2\2\2DE\f\t\2\2EF\t\3\2\2FK\5\b\5\nGH\f\b\2\2HI\t\4\2\2IK\5\b\5\t"+
		"JD\3\2\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\t\3\2\2\2NL\3\2\2"+
		"\2OS\5\4\3\2PS\5\b\5\2QS\5\6\4\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\13\3\2"+
		"\2\2\13\17\33).\64BJLR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}