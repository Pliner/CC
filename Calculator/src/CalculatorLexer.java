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
		INT=1, WS=2, ID=3, PLUS=4, MINUS=5, MULT=6, DIV=7, EQ=8, POWER=9, LPAR=10, 
		RPAR=11, DELIMETER=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"INT", "WS", "ID", "'+'", "'-'", "'*'", "'/'", "'='", "'**'", "'('", "')'", 
		"';'"
	};
	public static final String[] ruleNames = {
		"INT", "WS", "ID", "PLUS", "MINUS", "MULT", "DIV", "EQ", "POWER", "LPAR", 
		"RPAR", "DELIMETER"
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
		case 1: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\16A\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\6\2\35\n\2\r\2\16\2\36\3\3\6\3\"\n\3\r\3\16\3"+
		"#\3\3\3\3\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\2\16\3\3\1\5\4\2\7"+
		"\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\3"+
		"\2\6\3\2\62;\5\2\13\f\17\17\"\"\5\2C\\aac|\7\2\"\"\62;C\\aac|C\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\3\34\3\2\2\2\5!\3\2\2\2\7\'\3\2\2\2\t.\3\2\2\2\13\60\3\2\2\2\r\62"+
		"\3\2\2\2\17\64\3\2\2\2\21\66\3\2\2\2\238\3\2\2\2\25;\3\2\2\2\27=\3\2\2"+
		"\2\31?\3\2\2\2\33\35\t\2\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2"+
		"\36\37\3\2\2\2\37\4\3\2\2\2 \"\t\3\2\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2"+
		"#$\3\2\2\2$%\3\2\2\2%&\b\3\2\2&\6\3\2\2\2\'+\t\4\2\2(*\t\5\2\2)(\3\2\2"+
		"\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\b\3\2\2\2-+\3\2\2\2./\7-\2\2/\n\3\2"+
		"\2\2\60\61\7/\2\2\61\f\3\2\2\2\62\63\7,\2\2\63\16\3\2\2\2\64\65\7\61\2"+
		"\2\65\20\3\2\2\2\66\67\7?\2\2\67\22\3\2\2\289\7,\2\29:\7,\2\2:\24\3\2"+
		"\2\2;<\7*\2\2<\26\3\2\2\2=>\7+\2\2>\30\3\2\2\2?@\7=\2\2@\32\3\2\2\2\6"+
		"\2\36#+";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}