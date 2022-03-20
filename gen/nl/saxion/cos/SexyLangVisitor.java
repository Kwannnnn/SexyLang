// Generated from /Users/kristiyan/Documents/Saxion/Y2/Q3/compilers-and-os/61/src/SexyLang.g4 by ANTLR 4.9.2
package nl.saxion.cos;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SexyLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SexyLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SexyLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(SexyLangParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChainedLogicExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainedLogicExpression(SexyLangParser.ChainedLogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BulgeLiteralExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulgeLiteralExpression(SexyLangParser.BulgeLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BodyCountLiteralExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyCountLiteralExpression(SexyLangParser.BodyCountLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpression(SexyLangParser.LogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SafeWordLiteralExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeWordLiteralExpression(SexyLangParser.SafeWordLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LengthLiteralExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthLiteralExpression(SexyLangParser.LengthLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BedActivitCallExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBedActivitCallExpression(SexyLangParser.BedActivitCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GroupExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupExpression(SexyLangParser.GroupExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegationExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationExpression(SexyLangParser.NegationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(SexyLangParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(SexyLangParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#bedActivityCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBedActivityCall(SexyLangParser.BedActivityCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(SexyLangParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SexyLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(SexyLangParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SexyLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(SexyLangParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#varAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(SexyLangParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#moanStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoanStmt(SexyLangParser.MoanStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#ejaculateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEjaculateStmt(SexyLangParser.EjaculateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(SexyLangParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(SexyLangParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#lubeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLubeStmt(SexyLangParser.LubeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#bedActivityStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBedActivityStmt(SexyLangParser.BedActivityStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#paramsDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsDeclaration(SexyLangParser.ParamsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SexyLangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#bulgeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulgeLiteral(SexyLangParser.BulgeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#safeWordLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeWordLiteral(SexyLangParser.SafeWordLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#bodyCountLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyCountLiteral(SexyLangParser.BodyCountLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#lengthLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthLiteral(SexyLangParser.LengthLiteralContext ctx);
}