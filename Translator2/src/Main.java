import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {

        InputStream is = new FileInputStream(new File("in.txt"));
        ANTLRInputStream input = new ANTLRInputStream(is);

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