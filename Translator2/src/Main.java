import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {

        /*String a = "a=2\nread b\ndisplay b\na=(1 + 2 + 3)\ndisplay 1 + a\n";
        InputStream is = new ByteArrayInputStream(a.getBytes());
        ANTLRInputStream input = new ANTLRInputStream(is);
        /*/

        ANTLRInputStream input = new ANTLRInputStream(System.in);
        // create a lexer that feeds off of input CharStream
        calrLexer lexer = new calrLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        calrParser parser = new calrParser(tokens);
        // begin parsing at rule r
        calrParser.calc_return r = parser.calc();

        CommonTree t = (CommonTree)r.getTree();
        System.out.println(t.toStringTree());

        // Walk resulting tree; create treenode stream first
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        // AST nodes have payloads that point into token stream
        nodes.setTokenStream(tokens);
        // Create a tree Walker attached to the nodes stream
        calrtree walker = new calrtree(nodes);
        // Invoke the start symbol, rule program
        walker.calc();
        //
    }
}