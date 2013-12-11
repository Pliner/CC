import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        StringTemplateGroup templates = new StringTemplateGroup(new InputStreamReader(Main.class.getResourceAsStream("calrtree.stg")));
        // create a CharStream that reads from standard input
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
        // Walk resulting tree; create treenode stream first
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        // AST nodes have payloads that point into token stream
        nodes.setTokenStream(tokens);
        // Create a tree Walker attached to the nodes stream
        calrtree walker = new calrtree(nodes);
        // use loaded templates
        walker.setTemplateLib(templates);
        System.out.println(walker.calc());
    }
}