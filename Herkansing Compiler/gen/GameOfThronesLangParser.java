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
		T__0=1, T__1=2, COMMENT=3, MUL=4, DIV=5, IF=6, ELSE=7, NOT=8, AND=9, OR=10, 
		WHILE=11, ADD=12, SUB=13, OPEN_P=14, CLOSE_P=15, STRING_TYPE=16, INT_TYPE=17, 
		PRINT=18, STRING=19, GT=20, LT=21, EQ=22, NE=23, EQUALS=24, SEMICOLON=25, 
		IDENTIFIER=26, INT=27, WS=28;
	public static final int
		RULE_winteriscoming = 0, RULE_something_for_the_maesters = 1, RULE_block = 2, 
		RULE_condition_statement = 3, RULE_condition = 4, RULE_expr = 5, RULE_statement = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"winteriscoming", "something_for_the_maesters", "block", "condition_statement", 
			"condition", "expr", "statement"
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
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << COMMENT) | (1L << IF) | (1L << WHILE) | (1L << OPEN_P) | (1L << STRING_TYPE) | (1L << INT_TYPE) | (1L << PRINT) | (1L << STRING) | (1L << IDENTIFIER) | (1L << INT))) != 0)) {
				{
				{
				setState(14);
				statement();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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
	public static class WhileContext extends Something_for_the_maestersContext {
		public TerminalNode WHILE() { return getToken(GameOfThronesLangParser.WHILE, 0); }
		public Condition_statementContext condition_statement() {
			return getRuleContext(Condition_statementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(Something_for_the_maestersContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseContext extends Something_for_the_maestersContext {
		public TerminalNode IF() { return getToken(GameOfThronesLangParser.IF, 0); }
		public Condition_statementContext condition_statement() {
			return getRuleContext(Condition_statementContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GameOfThronesLangParser.ELSE, 0); }
		public IfElseContext(Something_for_the_maestersContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitIfElse(this);
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
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(PRINT);
				setState(23);
				expr(0);
				setState(24);
				match(SEMICOLON);
				}
				break;
			case STRING_TYPE:
			case INT_TYPE:
			case IDENTIFIER:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TYPE:
					{
					setState(26);
					match(INT_TYPE);
					}
					break;
				case STRING_TYPE:
					{
					setState(27);
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
				setState(31);
				match(IDENTIFIER);
				setState(32);
				match(EQUALS);
				setState(33);
				expr(0);
				setState(34);
				match(SEMICOLON);
				}
				break;
			case IF:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(IF);
				setState(37);
				condition_statement();
				setState(38);
				block();
				setState(42);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(39);
					match(ELSE);
					setState(40);
					block();
					}
					break;
				case EOF:
				case T__0:
				case T__1:
				case COMMENT:
				case IF:
				case WHILE:
				case OPEN_P:
				case STRING_TYPE:
				case INT_TYPE:
				case PRINT:
				case STRING:
				case IDENTIFIER:
				case INT:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(WHILE);
				setState(45);
				condition_statement();
				setState(46);
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
			setState(50);
			match(T__0);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << COMMENT) | (1L << IF) | (1L << WHILE) | (1L << OPEN_P) | (1L << STRING_TYPE) | (1L << INT_TYPE) | (1L << PRINT) | (1L << STRING) | (1L << IDENTIFIER) | (1L << INT))) != 0)) {
				{
				{
				setState(51);
				statement();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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

	public static class Condition_statementContext extends ParserRuleContext {
		public TerminalNode OPEN_P() { return getToken(GameOfThronesLangParser.OPEN_P, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode CLOSE_P() { return getToken(GameOfThronesLangParser.CLOSE_P, 0); }
		public List<TerminalNode> AND() { return getTokens(GameOfThronesLangParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(GameOfThronesLangParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(GameOfThronesLangParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GameOfThronesLangParser.OR, i);
		}
		public Condition_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitCondition_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_statementContext condition_statement() throws RecognitionException {
		Condition_statementContext _localctx = new Condition_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(OPEN_P);
			setState(60);
			condition();
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(61);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(62);
					condition();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				}
				break;
			}
			setState(71);
			match(CLOSE_P);
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

	public static class ConditionContext extends ParserRuleContext {
		public ExprContext leftExpr;
		public ExprContext rightExpr;
		public TerminalNode NOT() { return getToken(GameOfThronesLangParser.NOT, 0); }
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
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameOfThronesLangVisitor ) return ((GameOfThronesLangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(73);
				match(NOT);
				}
				break;
			case COMMENT:
			case OPEN_P:
			case STRING:
			case IDENTIFIER:
			case INT:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(77);
				((ConditionContext)_localctx).leftExpr = expr(0);
				setState(78);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ) | (1L << NE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(79);
				((ConditionContext)_localctx).rightExpr = expr(0);
				}
				break;
			case 2:
				{
				setState(81);
				expr(0);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(85);
				match(INT);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(STRING);
				}
				break;
			case COMMENT:
				{
				_localctx = new CommentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(COMMENT);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(IDENTIFIER);
				}
				break;
			case OPEN_P:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(OPEN_P);
				setState(90);
				expr(0);
				setState(91);
				match(CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						((MulDivContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(95);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(96);
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
						setState(97);
						((MulDivContext)_localctx).rightExpr = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(99);
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
						setState(100);
						((AddSubContext)_localctx).rightExpr = expr(7);
						}
						break;
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				something_for_the_maesters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
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
		case 5:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\3\3\3\5\3\63\n\3\3\4\3\4\7"+
		"\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5B\n\5\f\5\16\5E\13"+
		"\5\3\5\5\5H\n\5\3\5\3\5\3\6\3\6\5\6N\n\6\3\6\3\6\3\6\3\6\3\6\5\6U\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7h\n\7\f\7\16\7k\13\7\3\b\3\b\3\b\5\bp\n\b\3\b\2\3\f\t\2\4\6\b\n\f"+
		"\16\2\6\3\2\13\f\3\2\26\31\3\2\6\7\3\2\16\17\2~\2\23\3\2\2\2\4\62\3\2"+
		"\2\2\6\64\3\2\2\2\b=\3\2\2\2\nM\3\2\2\2\f_\3\2\2\2\16o\3\2\2\2\20\22\5"+
		"\16\b\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26"+
		"\3\2\2\2\25\23\3\2\2\2\26\27\7\2\2\3\27\3\3\2\2\2\30\31\7\24\2\2\31\32"+
		"\5\f\7\2\32\33\7\33\2\2\33\63\3\2\2\2\34 \7\23\2\2\35 \7\22\2\2\36 \3"+
		"\2\2\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 !\3\2\2\2!\"\7\34\2\2"+
		"\"#\7\32\2\2#$\5\f\7\2$%\7\33\2\2%\63\3\2\2\2&\'\7\b\2\2\'(\5\b\5\2(,"+
		"\5\6\4\2)*\7\t\2\2*-\5\6\4\2+-\3\2\2\2,)\3\2\2\2,+\3\2\2\2-\63\3\2\2\2"+
		"./\7\r\2\2/\60\5\b\5\2\60\61\5\6\4\2\61\63\3\2\2\2\62\30\3\2\2\2\62\37"+
		"\3\2\2\2\62&\3\2\2\2\62.\3\2\2\2\63\5\3\2\2\2\648\7\3\2\2\65\67\5\16\b"+
		"\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2"+
		";<\7\4\2\2<\7\3\2\2\2=>\7\20\2\2>G\5\n\6\2?@\t\2\2\2@B\5\n\6\2A?\3\2\2"+
		"\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DH\3\2\2\2EC\3\2\2\2FH\3\2\2\2GC\3\2\2"+
		"\2GF\3\2\2\2HI\3\2\2\2IJ\7\21\2\2J\t\3\2\2\2KN\7\n\2\2LN\3\2\2\2MK\3\2"+
		"\2\2ML\3\2\2\2NT\3\2\2\2OP\5\f\7\2PQ\t\3\2\2QR\5\f\7\2RU\3\2\2\2SU\5\f"+
		"\7\2TO\3\2\2\2TS\3\2\2\2U\13\3\2\2\2VW\b\7\1\2W`\7\35\2\2X`\7\25\2\2Y"+
		"`\7\5\2\2Z`\7\34\2\2[\\\7\20\2\2\\]\5\f\7\2]^\7\21\2\2^`\3\2\2\2_V\3\2"+
		"\2\2_X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2`i\3\2\2\2ab\f\t\2\2bc\t\4"+
		"\2\2ch\5\f\7\nde\f\b\2\2ef\t\5\2\2fh\5\f\7\tga\3\2\2\2gd\3\2\2\2hk\3\2"+
		"\2\2ig\3\2\2\2ij\3\2\2\2j\r\3\2\2\2ki\3\2\2\2lp\5\4\3\2mp\5\f\7\2np\5"+
		"\6\4\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\17\3\2\2\2\17\23\37,\628CGMT_gi"+
		"o";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}