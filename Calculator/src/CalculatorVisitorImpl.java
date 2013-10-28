import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculatorVisitorImpl extends CalculatorBaseVisitor<Integer> {
    private final Map<String, Integer> declaredVariables = new HashMap<>();

    @Override
    public Integer visitPower(@NotNull CalculatorParser.PowerContext ctx) {
        List<CalculatorParser.ExprContext> expr = ctx.expr();
        if (expr.size() != 2)
            throw new RuntimeException("+ is a binary op");
         return (int)Math.pow(visit(expr.get(0)), visit(expr.get(1)));
    }

    @Override
    public Integer visitId(@NotNull CalculatorParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (!declaredVariables.containsKey(id))
            throw new RuntimeException("Identifier " + id + " is not found");
        return declaredVariables.get(id);
    }

    @Override
    public Integer visitUminus(@NotNull CalculatorParser.UminusContext ctx) {
        Integer value = visit(ctx.expr());
        return -value;
    }

    @Override
    public Integer visitPars(@NotNull CalculatorParser.ParsContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitPlus(@NotNull CalculatorParser.PlusContext ctx) {
        List<CalculatorParser.ExprContext> expr = ctx.expr();
        if (expr.size() != 2)
            throw new RuntimeException("+ is a binary op");
        return visit(expr.get(0)) + visit(expr.get(1));
    }

    @Override
    public Integer visitMult(@NotNull CalculatorParser.MultContext ctx) {
        List<CalculatorParser.ExprContext> expr = ctx.expr();
        if (expr.size() != 2)
            throw new RuntimeException("* is a binary op");
        return visit(expr.get(0)) * visit(expr.get(1));
    }

    @Override
    public Integer visitMinus(@NotNull CalculatorParser.MinusContext ctx) {

        List<CalculatorParser.ExprContext> expr = ctx.expr();
        if (expr.size() != 2)
            throw new RuntimeException("- is a binary op");
        return visit(expr.get(0)) - visit(expr.get(1));
    }

    @Override
    public Integer visitDeclaration(@NotNull CalculatorParser.DeclarationContext ctx) {

        String id = ctx.ID().getText();
        if (declaredVariables.containsKey(id))
            throw new RuntimeException("Variable " + id + " was already declared");
        Integer value = visit(ctx.expr());
        declaredVariables.put(id, value);
        return value;
    }

    @Override
    public Integer visitInt(@NotNull CalculatorParser.IntContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    @Override
    public Integer visitDiv(@NotNull CalculatorParser.DivContext ctx) {

        List<CalculatorParser.ExprContext> expr = ctx.expr();
        if (expr.size() != 2)
            throw new RuntimeException("/ is a binary op");
        return visit(expr.get(0)) / visit(expr.get(1));
    }

    @Override
    public Integer visitPrint(@NotNull CalculatorParser.PrintContext ctx) {
        Integer result = 0;
        for (CalculatorParser.ExprContext expr : ctx.expr())
            result = visit(expr);
        System.out.println(result);
        return 0;
    }
}
