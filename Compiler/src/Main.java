import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import java.io.*;
import java.util.List;

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
        if (lexer.hasErrors()) {
            List<RecognitionException> allErrors = parser.getAllErrors();
            for (RecognitionException e : allErrors) {
                CharStream inputStream = e.token.getInputStream();
                int begin = Math.max(0, e.index - 10);
                int end =  Math.min(e.index + 10, inputStream.size());
                String error = "Lexer error\r\n----snippet begin---\r\n"
                        .concat(inputStream.substring(begin, e.index))
                        .concat("[error here-->]")
                        .concat(inputStream.substring(e.index + 1, end))
                        .concat("\r\n----snippet end---\r\n");
                throw new RuntimeException(error, e);
            }
        }
        if(parser.hasErrors()) {
           List<RecognitionException> allErrors = parser.getAllErrors();
            for (RecognitionException e : allErrors) {
                CharStream inputStream = e.token.getInputStream();
                int begin = Math.max(0, e.index - 10);
                int end =  Math.min(e.index + 10, inputStream.size());
                String error = "Parser error\r\n----snippet begin---\r\n"
                        .concat(inputStream.substring(begin, e.index))
                        .concat("[error here-->]")
                        .concat(inputStream.substring(e.index + 1, end))
                        .concat("\r\n----snippet end---\r\n");
                throw new RuntimeException(error, e);
            }
        }
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