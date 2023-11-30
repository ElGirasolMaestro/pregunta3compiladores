
// Generated from Bashiv2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue" })
public class Bashiv2Parser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
			T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
			T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, WORD = 23, ARG = 24, STRING = 25,
			NUMBER = 26, WS = 27, NEWLINE = 28, COMMENT = 29;
	public static final int RULE_script = 0, RULE_statement = 1, RULE_command = 2, RULE_simpleCommand = 3,
			RULE_ifCommand = 4, RULE_switchCommand = 5, RULE_switchCases = 6, RULE_loop = 7,
			RULE_assignment = 8, RULE_listDeclaration = 9, RULE_condition = 10, RULE_expression = 11,
			RULE_simpleExpression = 12, RULE_variable = 13;

	private static String[] makeRuleNames() {
		return new String[] {
				"script", "statement", "command", "simpleCommand", "ifCommand", "switchCommand",
				"switchCases", "loop", "assignment", "listDeclaration", "condition",
				"expression", "simpleExpression", "variable"
		};
	}

	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'if'", "'then'", "'else'", "'fi'", "'switch'", "'in'", "'{'",
				"'}'", "'esac'", "'case'", "':'", "'for'", "','", "'do'", "'done'", "'while'",
				"'='", "'('", "')'", "'&&'", "'||'", "'$'"
		};
	}

	private static final String[] _LITERAL_NAMES = makeLiteralNames();

	private static String[] makeSymbolicNames() {
		return new String[] {
				null, null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null, null, "WORD",
				"ARG", "STRING", "NUMBER", "WS", "NEWLINE", "COMMENT"
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
	public String getGrammarFileName() {
		return "Bashiv2.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public Bashiv2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_script;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).enterScript(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 545329186L) != 0)) {
					{
						{
							setState(28);
							statement();
						}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class, 0);
		}

		public LoopContext loop() {
			return getRuleContext(LoopContext.class, 0);
		}

		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class, 0);
		}

		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class, 0);
		}

		public TerminalNode COMMENT() {
			return getToken(Bashiv2Parser.COMMENT, 0);
		}

		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).enterStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1); {
					setState(34);
					command();
				}
					break;
				case 2:
					enterOuterAlt(_localctx, 2); {
					setState(35);
					loop();
				}
					break;
				case 3:
					enterOuterAlt(_localctx, 3); {
					setState(36);
					assignment();
				}
					break;
				case 4:
					enterOuterAlt(_localctx, 4); {
					setState(37);
					listDeclaration();
				}
					break;
				case 5:
					enterOuterAlt(_localctx, 5); {
					setState(38);
					match(COMMENT);
				}
					break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public SimpleCommandContext simpleCommand() {
			return getRuleContext(SimpleCommandContext.class, 0);
		}

		public IfCommandContext ifCommand() {
			return getRuleContext(IfCommandContext.class, 0);
		}

		public SwitchCommandContext switchCommand() {
			return getRuleContext(SwitchCommandContext.class, 0);
		}

		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_command;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).enterCommand(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case WORD:
					enterOuterAlt(_localctx, 1); {
					setState(41);
					simpleCommand();
				}
					break;
				case T__0:
					enterOuterAlt(_localctx, 2); {
					setState(42);
					ifCommand();
				}
					break;
				case T__4:
					enterOuterAlt(_localctx, 3); {
					setState(43);
					switchCommand();
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCommandContext extends ParserRuleContext {
		public TerminalNode WORD() {
			return getToken(Bashiv2Parser.WORD, 0);
		}

		public List<TerminalNode> ARG() {
			return getTokens(Bashiv2Parser.ARG);
		}

		public TerminalNode ARG(int i) {
			return getToken(Bashiv2Parser.ARG, i);
		}

		public SimpleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_simpleCommand;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).enterSimpleCommand(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).exitSimpleCommand(this);
		}
	}

	public final SimpleCommandContext simpleCommand() throws RecognitionException {
		SimpleCommandContext _localctx = new SimpleCommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simpleCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(46);
				match(WORD);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == ARG) {
					{
						setState(48);
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
								{
									setState(47);
									match(ARG);
								}
							}
							setState(50);
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while (_la == ARG);
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfCommandContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class, 0);
		}

		public List<ScriptContext> script() {
			return getRuleContexts(ScriptContext.class);
		}

		public ScriptContext script(int i) {
			return getRuleContext(ScriptContext.class, i);
		}

		public IfCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifCommand;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).enterIfCommand(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).exitIfCommand(this);
		}
	}

	public final IfCommandContext ifCommand() throws RecognitionException {
		IfCommandContext _localctx = new IfCommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(54);
				match(T__0);
				setState(55);
				condition();
				setState(56);
				match(T__1);
				setState(57);
				script();
				setState(58);
				match(T__2);
				setState(59);
				script();
				setState(60);
				match(T__3);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchCommandContext extends ParserRuleContext {
		public TerminalNode WORD() {
			return getToken(Bashiv2Parser.WORD, 0);
		}

		public List<SwitchCasesContext> switchCases() {
			return getRuleContexts(SwitchCasesContext.class);
		}

		public SwitchCasesContext switchCases(int i) {
			return getRuleContext(SwitchCasesContext.class, i);
		}

		public SwitchCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_switchCommand;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).enterSwitchCommand(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).exitSwitchCommand(this);
		}
	}

	public final SwitchCommandContext switchCommand() throws RecognitionException {
		SwitchCommandContext _localctx = new SwitchCommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_switchCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(62);
				match(T__4);
				setState(63);
				match(WORD);
				setState(64);
				match(T__5);
				setState(65);
				match(T__6);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == T__9) {
					{
						{
							setState(66);
							switchCases();
						}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(T__7);
				setState(73);
				match(T__8);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchCasesContext extends ParserRuleContext {
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class, 0);
		}

		public TerminalNode WORD() {
			return getToken(Bashiv2Parser.WORD, 0);
		}

		public TerminalNode NUMBER() {
			return getToken(Bashiv2Parser.NUMBER, 0);
		}

		public SwitchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_switchCases;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).enterSwitchCases(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).exitSwitchCases(this);
		}
	}

	public final SwitchCasesContext switchCases() throws RecognitionException {
		SwitchCasesContext _localctx = new SwitchCasesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_switchCases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(75);
				match(T__9);
				setState(76);
				_la = _input.LA(1);
				if (!(_la == WORD || _la == NUMBER)) {
					_errHandler.recoverInline(this);
				} else {
					if (_input.LA(1) == Token.EOF)
						matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(77);
				match(T__10);
				setState(78);
				script();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public List<TerminalNode> WORD() {
			return getTokens(Bashiv2Parser.WORD);
		}

		public TerminalNode WORD(int i) {
			return getToken(Bashiv2Parser.WORD, i);
		}

		public ScriptContext script() {
			return getRuleContext(ScriptContext.class, 0);
		}

		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class, 0);
		}

		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_loop;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).enterLoop(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__11:
					enterOuterAlt(_localctx, 1); {
					setState(80);
					match(T__11);
					setState(81);
					match(WORD);
					setState(82);
					match(T__5);
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la == WORD) {
						{
							setState(83);
							match(WORD);
							setState(88);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == T__12) {
								{
									{
										setState(84);
										match(T__12);
										setState(85);
										match(WORD);
									}
								}
								setState(90);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
						}
					}

					setState(93);
					match(T__13);
					setState(94);
					script();
					setState(95);
					match(T__14);
				}
					break;
				case T__15:
					enterOuterAlt(_localctx, 2); {
					setState(97);
					match(T__15);
					setState(98);
					condition();
					setState(99);
					match(T__13);
					setState(100);
					script();
					setState(101);
					match(T__14);
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode WORD() {
			return getToken(Bashiv2Parser.WORD, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public List<TerminalNode> WS() {
			return getTokens(Bashiv2Parser.WS);
		}

		public TerminalNode WS(int i) {
			return getToken(Bashiv2Parser.WS, i);
		}

		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assignment;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).enterAssignment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(105);
				match(WORD);
				setState(106);
				match(T__16);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == WS) {
					{
						{
							setState(107);
							match(WS);
						}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				expression(0);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListDeclarationContext extends ParserRuleContext {
		public TerminalNode WORD() {
			return getToken(Bashiv2Parser.WORD, 0);
		}

		public List<TerminalNode> WS() {
			return getTokens(Bashiv2Parser.WS);
		}

		public TerminalNode WS(int i) {
			return getToken(Bashiv2Parser.WS, i);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public ListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_listDeclaration;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).enterListDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).exitListDeclaration(this);
		}
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(115);
				match(WORD);
				setState(116);
				match(T__16);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == WS) {
					{
						{
							setState(117);
							match(WS);
						}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(T__17);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 96468992L) != 0)) {
					{
						setState(124);
						expression(0);
						setState(129);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == T__12) {
							{
								{
									setState(125);
									match(T__12);
									setState(126);
									expression(0);
								}
							}
							setState(131);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(134);
				match(T__18);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode WORD() {
			return getToken(Bashiv2Parser.WORD, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_condition;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).enterCondition(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1); {
					setState(136);
					match(WORD);
				}
					break;
				case 2:
					enterOuterAlt(_localctx, 2); {
					setState(137);
					expression(0);
				}
					break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class, 0);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).enterExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).exitExpression(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(141);
					simpleExpression();
				}
				_ctx.stop = _input.LT(-1);
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(149);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
								case 1: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(143);
									if (!(precpred(_ctx, 2)))
										throw new FailedPredicateException(this, "precpred(_ctx, 2)");
									setState(144);
									match(T__19);
									setState(145);
									expression(3);
								}
									break;
								case 2: {
									_localctx = new ExpressionContext(_parentctx, _parentState);
									pushNewRecursionContext(_localctx, _startState, RULE_expression);
									setState(146);
									if (!(precpred(_ctx, 1)))
										throw new FailedPredicateException(this, "precpred(_ctx, 1)");
									setState(147);
									match(T__20);
									setState(148);
									expression(2);
								}
									break;
							}
						}
					}
					setState(153);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExpressionContext extends ParserRuleContext {
		public TerminalNode WORD() {
			return getToken(Bashiv2Parser.WORD, 0);
		}

		public TerminalNode ARG() {
			return getToken(Bashiv2Parser.ARG, 0);
		}

		public TerminalNode NUMBER() {
			return getToken(Bashiv2Parser.NUMBER, 0);
		}

		public VariableContext variable() {
			return getRuleContext(VariableContext.class, 0);
		}

		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_simpleExpression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).enterSimpleExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleExpression);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case WORD:
					enterOuterAlt(_localctx, 1); {
					setState(154);
					match(WORD);
				}
					break;
				case ARG:
					enterOuterAlt(_localctx, 2); {
					setState(155);
					match(ARG);
				}
					break;
				case NUMBER:
					enterOuterAlt(_localctx, 3); {
					setState(156);
					match(NUMBER);
				}
					break;
				case T__21:
					enterOuterAlt(_localctx, 4); {
					setState(157);
					variable();
				}
					break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode WORD() {
			return getToken(Bashiv2Parser.WORD, 0);
		}

		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_variable;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).enterVariable(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof Bashiv2Listener)
				((Bashiv2Listener) listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(160);
				match(T__21);
				setState(161);
				match(WORD);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 11:
				return expression_sempred((ExpressionContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 2);
			case 1:
				return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN = "\u0004\u0001\u001d\u00a4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"
			+
			"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004" +
			"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007" +
			"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b" +
			"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000" +
			"\n\u0000\f\u0000!\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
			"\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002" +
			"\u0003\u0002-\b\u0002\u0001\u0003\u0001\u0003\u0004\u00031\b\u0003\u000b" +
			"\u0003\f\u00032\u0003\u00035\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004" +
			"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005" +
			"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005D\b\u0005" +
			"\n\u0005\f\u0005G\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006" +
			"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007" +
			"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007W\b\u0007" +
			"\n\u0007\f\u0007Z\t\u0007\u0003\u0007\\\b\u0007\u0001\u0007\u0001\u0007" +
			"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007" +
			"\u0001\u0007\u0001\u0007\u0003\u0007h\b\u0007\u0001\b\u0001\b\u0001\b" +
			"\u0005\bm\b\b\n\b\f\bp\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005" +
			"\tw\b\t\n\t\f\tz\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0080\b\t" +
			"\n\t\f\t\u0083\t\t\u0003\t\u0085\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003" +
			"\n\u008b\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b" +
			"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0096\b\u000b" +
			"\n\u000b\f\u000b\u0099\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f" +
			"\u009f\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0000\u0001\u0016\u000e\u0000" +
			"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000" +
			"\u0001\u0002\u0000\u0017\u0017\u001a\u001a\u00ac\u0000\u001f\u0001\u0000" +
			"\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000" +
			"\u0000\u0006.\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000\n>\u0001" +
			"\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000\u000eg\u0001\u0000\u0000" +
			"\u0000\u0010i\u0001\u0000\u0000\u0000\u0012s\u0001\u0000\u0000\u0000\u0014" +
			"\u008a\u0001\u0000\u0000\u0000\u0016\u008c\u0001\u0000\u0000\u0000\u0018" +
			"\u009e\u0001\u0000\u0000\u0000\u001a\u00a0\u0001\u0000\u0000\u0000\u001c" +
			"\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e" +
			"!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001" +
			"\u0000\u0000\u0000 \u0001\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000" +
			"\u0000\"(\u0003\u0004\u0002\u0000#(\u0003\u000e\u0007\u0000$(\u0003\u0010" +
			"\b\u0000%(\u0003\u0012\t\u0000&(\u0005\u001d\u0000\u0000\'\"\u0001\u0000" +
			"\u0000\u0000\'#\u0001\u0000\u0000\u0000\'$\u0001\u0000\u0000\u0000\'%" +
			"\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(\u0003\u0001\u0000" +
			"\u0000\u0000)-\u0003\u0006\u0003\u0000*-\u0003\b\u0004\u0000+-\u0003\n" +
			"\u0005\u0000,)\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,+\u0001" +
			"\u0000\u0000\u0000-\u0005\u0001\u0000\u0000\u0000.4\u0005\u0017\u0000" +
			"\u0000/1\u0005\u0018\u0000\u00000/\u0001\u0000\u0000\u000012\u0001\u0000" +
			"\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001" +
			"\u0000\u0000\u000040\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000" +
			"5\u0007\u0001\u0000\u0000\u000067\u0005\u0001\u0000\u000078\u0003\u0014" +
			"\n\u000089\u0005\u0002\u0000\u00009:\u0003\u0000\u0000\u0000:;\u0005\u0003" +
			"\u0000\u0000;<\u0003\u0000\u0000\u0000<=\u0005\u0004\u0000\u0000=\t\u0001" +
			"\u0000\u0000\u0000>?\u0005\u0005\u0000\u0000?@\u0005\u0017\u0000\u0000" +
			"@A\u0005\u0006\u0000\u0000AE\u0005\u0007\u0000\u0000BD\u0003\f\u0006\u0000" +
			"CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000" +
			"\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000" +
			"\u0000\u0000HI\u0005\b\u0000\u0000IJ\u0005\t\u0000\u0000J\u000b\u0001" +
			"\u0000\u0000\u0000KL\u0005\n\u0000\u0000LM\u0007\u0000\u0000\u0000MN\u0005" +
			"\u000b\u0000\u0000NO\u0003\u0000\u0000\u0000O\r\u0001\u0000\u0000\u0000" +
			"PQ\u0005\f\u0000\u0000QR\u0005\u0017\u0000\u0000R[\u0005\u0006\u0000\u0000" +
			"SX\u0005\u0017\u0000\u0000TU\u0005\r\u0000\u0000UW\u0005\u0017\u0000\u0000" +
			"VT\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000" +
			"\u0000XY\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000" +
			"\u0000\u0000[S\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001" +
			"\u0000\u0000\u0000]^\u0005\u000e\u0000\u0000^_\u0003\u0000\u0000\u0000" +
			"_`\u0005\u000f\u0000\u0000`h\u0001\u0000\u0000\u0000ab\u0005\u0010\u0000" +
			"\u0000bc\u0003\u0014\n\u0000cd\u0005\u000e\u0000\u0000de\u0003\u0000\u0000" +
			"\u0000ef\u0005\u000f\u0000\u0000fh\u0001\u0000\u0000\u0000gP\u0001\u0000" +
			"\u0000\u0000ga\u0001\u0000\u0000\u0000h\u000f\u0001\u0000\u0000\u0000" +
			"ij\u0005\u0017\u0000\u0000jn\u0005\u0011\u0000\u0000km\u0005\u001b\u0000" +
			"\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000" +
			"\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001" +
			"\u0000\u0000\u0000qr\u0003\u0016\u000b\u0000r\u0011\u0001\u0000\u0000" +
			"\u0000st\u0005\u0017\u0000\u0000tx\u0005\u0011\u0000\u0000uw\u0005\u001b" +
			"\u0000\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001" +
			"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000" +
			"zx\u0001\u0000\u0000\u0000{\u0084\u0005\u0012\u0000\u0000|\u0081\u0003" +
			"\u0016\u000b\u0000}~\u0005\r\u0000\u0000~\u0080\u0003\u0016\u000b\u0000" +
			"\u007f}\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081" +
			"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082" +
			"\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084" +
			"|\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086" +
			"\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0013\u0000\u0000\u0087\u0013" +
			"\u0001\u0000\u0000\u0000\u0088\u008b\u0005\u0017\u0000\u0000\u0089\u008b" +
			"\u0003\u0016\u000b\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089" +
			"\u0001\u0000\u0000\u0000\u008b\u0015\u0001\u0000\u0000\u0000\u008c\u008d" +
			"\u0006\u000b\uffff\uffff\u0000\u008d\u008e\u0003\u0018\f\u0000\u008e\u0097" +
			"\u0001\u0000\u0000\u0000\u008f\u0090\n\u0002\u0000\u0000\u0090\u0091\u0005" +
			"\u0014\u0000\u0000\u0091\u0096\u0003\u0016\u000b\u0003\u0092\u0093\n\u0001" +
			"\u0000\u0000\u0093\u0094\u0005\u0015\u0000\u0000\u0094\u0096\u0003\u0016" +
			"\u000b\u0002\u0095\u008f\u0001\u0000\u0000\u0000\u0095\u0092\u0001\u0000" +
			"\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000" +
			"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0017\u0001\u0000" +
			"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009f\u0005\u0017" +
			"\u0000\u0000\u009b\u009f\u0005\u0018\u0000\u0000\u009c\u009f\u0005\u001a" +
			"\u0000\u0000\u009d\u009f\u0003\u001a\r\u0000\u009e\u009a\u0001\u0000\u0000" +
			"\u0000\u009e\u009b\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000" +
			"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u0019\u0001\u0000\u0000" +
			"\u0000\u00a0\u00a1\u0005\u0016\u0000\u0000\u00a1\u00a2\u0005\u0017\u0000" +
			"\u0000\u00a2\u001b\u0001\u0000\u0000\u0000\u0011\u001f\',24EX[gnx\u0081" +
			"\u0084\u008a\u0095\u0097\u009e";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}