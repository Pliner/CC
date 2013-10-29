// Generated from Calculator.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		READ=1, DISPLAY=2, POWER=3, INT=4, WS=5, ID=6, PLUS=7, MINUS=8, MULT=9, 
		DIV=10, EQ=11, LPAR=12, RPAR=13, DELIMITER=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'read'", "'display'", "'**'", "INT", "WS", "ID", "'+'", "'-'", "'*'", 
		"'/'", "'='", "'('", "')'", "';'"
	};
	public static final String[] ruleNames = {
		"READ", "DISPLAY", "POWER", "INT", "WS", "ID", "PLUS", "MINUS", "MULT", 
		"DIV", "EQ", "LPAR", "RPAR", "DELIMITER"
	};


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\20R\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\6\5\61\n\5\r\5\16\5\62\3\6\6\6"+
		"\66\n\6\r\6\16\6\67\3\6\3\6\3\7\3\7\7\7>\n\7\f\7\16\7A\13\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\2\20\3\3"+
		"\1\5\4\1\7\5\1\t\6\1\13\7\2\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1"+
		"\31\16\1\33\17\1\35\20\1\3\2\6\3\2\62;\5\2\13\f\17\17\"\"\5\2C\\aac|\6"+
		"\2\62;C\\aac|T\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5$\3"+
		"\2\2\2\7,\3\2\2\2\t\60\3\2\2\2\13\65\3\2\2\2\r;\3\2\2\2\17B\3\2\2\2\21"+
		"D\3\2\2\2\23F\3\2\2\2\25H\3\2\2\2\27J\3\2\2\2\31L\3\2\2\2\33N\3\2\2\2"+
		"\35P\3\2\2\2\37 \7t\2\2 !\7g\2\2!\"\7c\2\2\"#\7f\2\2#\4\3\2\2\2$%\7f\2"+
		"\2%&\7k\2\2&\'\7u\2\2\'(\7r\2\2()\7n\2\2)*\7c\2\2*+\7{\2\2+\6\3\2\2\2"+
		",-\7,\2\2-.\7,\2\2.\b\3\2\2\2/\61\t\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\n\3\2\2\2\64\66\t\3\2\2\65\64\3\2\2\2\66"+
		"\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29:\b\6\2\2:\f\3\2\2\2;"+
		"?\t\4\2\2<>\t\5\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\16\3\2\2"+
		"\2A?\3\2\2\2BC\7-\2\2C\20\3\2\2\2DE\7/\2\2E\22\3\2\2\2FG\7,\2\2G\24\3"+
		"\2\2\2HI\7\61\2\2I\26\3\2\2\2JK\7?\2\2K\30\3\2\2\2LM\7*\2\2M\32\3\2\2"+
		"\2NO\7+\2\2O\34\3\2\2\2PQ\7=\2\2Q\36\3\2\2\2\6\2\62\67?";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}