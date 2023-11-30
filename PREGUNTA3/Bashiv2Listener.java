// Generated from Bashiv2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Bashiv2Parser}.
 */
public interface Bashiv2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Bashiv2Parser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(Bashiv2Parser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bashiv2Parser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(Bashiv2Parser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bashiv2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Bashiv2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bashiv2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Bashiv2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bashiv2Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(Bashiv2Parser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bashiv2Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(Bashiv2Parser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bashiv2Parser#simpleCommand}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCommand(Bashiv2Parser.SimpleCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bashiv2Parser#simpleCommand}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCommand(Bashiv2Parser.SimpleCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bashiv2Parser#ifCommand}.
	 * @param ctx the parse tree
	 */
	void enterIfCommand(Bashiv2Parser.IfCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bashiv2Parser#ifCommand}.
	 * @param ctx the parse tree
	 */
	void exitIfCommand(Bashiv2Parser.IfCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bashiv2Parser#switchCommand}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCommand(Bashiv2Parser.SwitchCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bashiv2Parser#switchCommand}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCommand(Bashiv2Parser.SwitchCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bashiv2Parser#switchCases}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCases(Bashiv2Parser.SwitchCasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bashiv2Parser#switchCases}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCases(Bashiv2Parser.SwitchCasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bashiv2Parser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(Bashiv2Parser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bashiv2Parser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(Bashiv2Parser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bashiv2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Bashiv2Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bashiv2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Bashiv2Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bashiv2Parser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(Bashiv2Parser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bashiv2Parser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(Bashiv2Parser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bashiv2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(Bashiv2Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bashiv2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(Bashiv2Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bashiv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Bashiv2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bashiv2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Bashiv2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bashiv2Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(Bashiv2Parser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bashiv2Parser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(Bashiv2Parser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bashiv2Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Bashiv2Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bashiv2Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Bashiv2Parser.VariableContext ctx);
}