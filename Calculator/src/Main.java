import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File in = new File("in");
        InputStream is = new FileInputStream(in);
        /*String a = "1;";
        InputStream is = new ByteArrayInputStream(a.getBytes());
        */
        ANTLRInputStream input = new ANTLRInputStream(is);

        //ANTLRInputStream input = new ANTLRInputStream(System.in);
        CalculatorLexer lexer = new CalculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.input();
        System.out.println(tree.toStringTree(parser));
        CalculatorVisitorImpl calcVisitor = new CalculatorVisitorImpl();
        int result = calcVisitor.visit(tree);
    }

}

