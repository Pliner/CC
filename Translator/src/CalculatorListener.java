// Generated from Calculator.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(@NotNull CalculatorParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(@NotNull CalculatorParser.MultExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#displayExpr}.
	 * @param ctx the parse tree
	 */
	void enterDisplayExpr(@NotNull CalculatorParser.DisplayExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#displayExpr}.
	 * @param ctx the parse tree
	 */
	void exitDisplayExpr(@NotNull CalculatorParser.DisplayExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(@NotNull CalculatorParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(@NotNull CalculatorParser.IdExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull CalculatorParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull CalculatorParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#plusExpr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(@NotNull CalculatorParser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#plusExpr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(@NotNull CalculatorParser.PlusExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#uminusExpr}.
	 * @param ctx the parse tree
	 */
	void enterUminusExpr(@NotNull CalculatorParser.UminusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#uminusExpr}.
	 * @param ctx the parse tree
	 */
	void exitUminusExpr(@NotNull CalculatorParser.UminusExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#parExpr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull CalculatorParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#parExpr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull CalculatorParser.ParExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(@NotNull CalculatorParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(@NotNull CalculatorParser.MinusExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(@NotNull CalculatorParser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#intExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(@NotNull CalculatorParser.IntExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull CalculatorParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull CalculatorParser.InputContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#powerExpr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(@NotNull CalculatorParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#powerExpr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(@NotNull CalculatorParser.PowerExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(@NotNull CalculatorParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(@NotNull CalculatorParser.EqExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#readExpr}.
	 * @param ctx the parse tree
	 */
	void enterReadExpr(@NotNull CalculatorParser.ReadExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#readExpr}.
	 * @param ctx the parse tree
	 */
	void exitReadExpr(@NotNull CalculatorParser.ReadExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CalculatorParser#divExpr}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(@NotNull CalculatorParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#divExpr}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(@NotNull CalculatorParser.DivExprContext ctx);
}