//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.13.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from c:/Users/USUARIO/Desktop/design-and-implementation-of-your-own-shell-main/Bashiv2.g4 by ANTLR 4.13.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="Bashiv2Parser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.13.1")]
[System.CLSCompliant(false)]
public interface IBashiv2Visitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="Bashiv2Parser.script"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitScript([NotNull] Bashiv2Parser.ScriptContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="Bashiv2Parser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStatement([NotNull] Bashiv2Parser.StatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="Bashiv2Parser.command"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitCommand([NotNull] Bashiv2Parser.CommandContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="Bashiv2Parser.simpleCommand"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSimpleCommand([NotNull] Bashiv2Parser.SimpleCommandContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="Bashiv2Parser.ifCommand"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIfCommand([NotNull] Bashiv2Parser.IfCommandContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="Bashiv2Parser.switchCommand"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSwitchCommand([NotNull] Bashiv2Parser.SwitchCommandContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="Bashiv2Parser.switchCases"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSwitchCases([NotNull] Bashiv2Parser.SwitchCasesContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="Bashiv2Parser.loop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLoop([NotNull] Bashiv2Parser.LoopContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="Bashiv2Parser.assignment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAssignment([NotNull] Bashiv2Parser.AssignmentContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="Bashiv2Parser.listDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitListDeclaration([NotNull] Bashiv2Parser.ListDeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="Bashiv2Parser.condition"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitCondition([NotNull] Bashiv2Parser.ConditionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="Bashiv2Parser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpression([NotNull] Bashiv2Parser.ExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>Word</c>
	/// labeled alternative in <see cref="Bashiv2Parser.simpleExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitWord([NotNull] Bashiv2Parser.WordContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>Arg</c>
	/// labeled alternative in <see cref="Bashiv2Parser.simpleExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitArg([NotNull] Bashiv2Parser.ArgContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>Number</c>
	/// labeled alternative in <see cref="Bashiv2Parser.simpleExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitNumber([NotNull] Bashiv2Parser.NumberContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>Var</c>
	/// labeled alternative in <see cref="Bashiv2Parser.simpleExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitVar([NotNull] Bashiv2Parser.VarContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="Bashiv2Parser.variable"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitVariable([NotNull] Bashiv2Parser.VariableContext context);
}
