// Generated from Calculator.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull CalculatorParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(@NotNull CalculatorParser.PlusContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(@NotNull CalculatorParser.MultContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(@NotNull CalculatorParser.MinusContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull CalculatorParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#uminus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUminus(@NotNull CalculatorParser.UminusContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull CalculatorParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(@NotNull CalculatorParser.DivContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(@NotNull CalculatorParser.PowerContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#pars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPars(@NotNull CalculatorParser.ParsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalculatorParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull CalculatorParser.PrintContext ctx);
}