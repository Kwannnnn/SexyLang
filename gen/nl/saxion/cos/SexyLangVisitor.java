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
	 * Visit a parse tree produced by the {@code BedActivityCallExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBedActivityCallExpression(SexyLangParser.BedActivityCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BodyCountLiteralExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyCountLiteralExpression(SexyLangParser.BodyCountLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LengthLiteralExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthLiteralExpression(SexyLangParser.LengthLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SafeWordArrayLiteralExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeWordArrayLiteralExpression(SexyLangParser.SafeWordArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GroupExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupExpression(SexyLangParser.GroupExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BodyCountArrayLiteralExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyCountArrayLiteralExpression(SexyLangParser.BodyCountArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LengthArrayLiteralExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthArrayLiteralExpression(SexyLangParser.LengthArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(SexyLangParser.IdentifierExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code BulgeArrayLiteralExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulgeArrayLiteralExpression(SexyLangParser.BulgeArrayLiteralExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code WhatLengthCallExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhatLengthCallExpression(SexyLangParser.WhatLengthCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegationExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationExpression(SexyLangParser.NegationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpression(SexyLangParser.ArrayAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpression}
	 * labeled alternative in {@link SexyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(SexyLangParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#whatLengthCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhatLengthCall(SexyLangParser.WhatLengthCallContext ctx);
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
	 * Visit a parse tree produced by {@link SexyLangParser#methodBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBlock(SexyLangParser.MethodBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#arrayValueChangeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValueChangeStmt(SexyLangParser.ArrayValueChangeStmtContext ctx);
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
	 * Visit a parse tree produced by {@link SexyLangParser#elseIfStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStmt(SexyLangParser.ElseIfStmtContext ctx);
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
	 * Visit a parse tree produced by {@link SexyLangParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(SexyLangParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(SexyLangParser.ParameterDeclarationContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#bodyCountElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyCountElements(SexyLangParser.BodyCountElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#bodyCountArrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyCountArrayLiteral(SexyLangParser.BodyCountArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#lengthArrayElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthArrayElements(SexyLangParser.LengthArrayElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#lengthArrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthArrayLiteral(SexyLangParser.LengthArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#bulgeArrayElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulgeArrayElements(SexyLangParser.BulgeArrayElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#bulgeArrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulgeArrayLiteral(SexyLangParser.BulgeArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#safeWordArrayElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeWordArrayElements(SexyLangParser.SafeWordArrayElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#safeWordArrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafeWordArrayLiteral(SexyLangParser.SafeWordArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SexyLangParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(SexyLangParser.ArrayAccessContext ctx);
}