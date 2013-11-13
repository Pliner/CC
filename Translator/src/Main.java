import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        String a = "read a;" +
                "b = a - 1;" +
                "display a ** b * (-a + 2 * b + b / 2 - 1);" +
                "read c;" +
                "display a + c;";
        InputStream is = new ByteArrayInputStream(a.getBytes());
        ANTLRInputStream input = new ANTLRInputStream(is);
        //ANTLRInputStream input = new ANTLRInputStream(System.in);
        CalculatorLexer lexer = new CalculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.input();
        System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        CalculatorListenerImpl listener = new CalculatorListenerImpl();
        walker.walk(listener, tree);
    }
}