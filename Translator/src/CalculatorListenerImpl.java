import org.antlr.v4.runtime.misc.NotNull;

public class CalculatorListenerImpl extends CalculatorBaseListener {
    @Override
    public void exitDisplayExpr(@NotNull CalculatorParser.DisplayExprContext ctx) {
        print(")");
    }

    @Override
    public void enterDisplayExpr(@NotNull CalculatorParser.DisplayExprContext ctx) {
        print("(display ");
    }

    @Override
    public void enterMultExpr(@NotNull CalculatorParser.MultExprContext ctx) {
        if(ctx.parent instanceof CalculatorParser.MultExprContext)
            return;
        print("(* ");
    }

    @Override
    public void exitMultExpr(@NotNull CalculatorParser.MultExprContext ctx) {
        if(ctx.parent instanceof CalculatorParser.MultExprContext)
            return;
        print(")");
    }

    @Override
    public void enterIdExpr(@NotNull CalculatorParser.IdExprContext ctx) {
        print(ctx.getText() + " ");
    }

    @Override
    public void exitLine(@NotNull CalculatorParser.LineContext ctx) {
        System.out.println();
    }

    @Override
    public void enterPlusExpr(@NotNull CalculatorParser.PlusExprContext ctx) {
        if(ctx.parent instanceof CalculatorParser.PlusExprContext)
            return;
        print("(+ ");
    }

    @Override
    public void exitPlusExpr(@NotNull CalculatorParser.PlusExprContext ctx) {
        if(ctx.parent instanceof CalculatorParser.PlusExprContext)
            return;
        print(")");
    }

    @Override
    public void enterUminusExpr(@NotNull CalculatorParser.UminusExprContext ctx) {
        print("(- ");
    }

    @Override
    public void exitUminusExpr(@NotNull CalculatorParser.UminusExprContext ctx) {
        print(")");
    }

    @Override
    public void enterParExpr(@NotNull CalculatorParser.ParExprContext ctx) {
        print("(");
    }

    @Override
    public void exitParExpr(@NotNull CalculatorParser.ParExprContext ctx) {
        print(")");
    }

    @Override
    public void enterMinusExpr(@NotNull CalculatorParser.MinusExprContext ctx) {
        print("(-");
    }

    @Override
    public void exitMinusExpr(@NotNull CalculatorParser.MinusExprContext ctx) {
        print(")");
    }

    @Override
    public void enterIntExpr(@NotNull CalculatorParser.IntExprContext ctx) {
        print(ctx.getText() + " ");
    }

    @Override
    public void enterPowerExpr(@NotNull CalculatorParser.PowerExprContext ctx) {
        print("(** ");
    }

    @Override
    public void exitPowerExpr(@NotNull CalculatorParser.PowerExprContext ctx) {
        print(")");
    }

    @Override
    public void enterEqExpr(@NotNull CalculatorParser.EqExprContext ctx) {
        print("(define " + ctx.ID().getText() + " ");
    }

    @Override
    public void exitEqExpr(@NotNull CalculatorParser.EqExprContext ctx) {
        print(")");
    }

    @Override
    public void enterReadExpr(@NotNull CalculatorParser.ReadExprContext ctx) {
        print("(define " + ctx.ID().getText() + " (read)");
    }

    @Override
    public void exitReadExpr(@NotNull CalculatorParser.ReadExprContext ctx) {
        print(")");
    }

    @Override
    public void enterDivExpr(@NotNull CalculatorParser.DivExprContext ctx) {
        print("(/");
    }

    @Override
    public void exitDivExpr(@NotNull CalculatorParser.DivExprContext ctx) {
        print(")");
    }

    private void print(String value) {
        System.out.print(value);
    }
}
