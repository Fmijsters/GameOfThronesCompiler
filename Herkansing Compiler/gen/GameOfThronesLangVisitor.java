// Generated from C:/Users/fmijs/Desktop/Herkansing Compiler\GameOfThronesLang.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GameOfThronesLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GameOfThronesLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GameOfThronesLangParser#winteriscoming}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWinteriscoming(GameOfThronesLangParser.WinteriscomingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link GameOfThronesLangParser#something_for_the_maesters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(GameOfThronesLangParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link GameOfThronesLangParser#something_for_the_maesters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(GameOfThronesLangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link GameOfThronesLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(GameOfThronesLangParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link GameOfThronesLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(GameOfThronesLangParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link GameOfThronesLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(GameOfThronesLangParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link GameOfThronesLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(GameOfThronesLangParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link GameOfThronesLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(GameOfThronesLangParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameOfThronesLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GameOfThronesLangParser.StatementContext ctx);
}