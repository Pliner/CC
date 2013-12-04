// $ANTLR 3.5.1 calr.g 2013-12-04 18:56:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class calrLexer extends Lexer {
	public static final int EOF=-1;
	public static final int DISPLAY=4;
	public static final int DIV=5;
	public static final int DOUBLE=6;
	public static final int E=7;
	public static final int EQ=8;
	public static final int EXPR=9;
	public static final int ID=10;
	public static final int INT=11;
	public static final int INTPart=12;
	public static final int LPAR=13;
	public static final int MINUS=14;
	public static final int MULT=15;
	public static final int NL=16;
	public static final int PI=17;
	public static final int PLUS=18;
	public static final int POW=19;
	public static final int READ=20;
	public static final int RPAR=21;
	public static final int WHITESPACE=22;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public calrLexer() {} 
	public calrLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public calrLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "calr.g"; }

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:54:5: ( 'read' )
			// calr.g:54:7: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "DISPLAY"
	public final void mDISPLAY() throws RecognitionException {
		try {
			int _type = DISPLAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:58:5: ( 'display' )
			// calr.g:58:7: 'display'
			{
			match("display"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DISPLAY"

	// $ANTLR start "PI"
	public final void mPI() throws RecognitionException {
		try {
			int _type = PI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:61:5: ( 'PI' )
			// calr.g:61:7: 'PI'
			{
			match("PI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PI"

	// $ANTLR start "E"
	public final void mE() throws RecognitionException {
		try {
			int _type = E;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:65:5: ( 'E' )
			// calr.g:65:7: 'E'
			{
			match('E'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "E"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:68:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// calr.g:68:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// calr.g:68:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// calr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:72:5: ( INTPart )
			// calr.g:72:7: INTPart
			{
			mINTPart(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:76:5: ( '.' INTPart | INTPart '.' | INTPart '.' INTPart )
			int alt2=3;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// calr.g:76:7: '.' INTPart
					{
					match('.'); 
					mINTPart(); 

					}
					break;
				case 2 :
					// calr.g:77:7: INTPart '.'
					{
					mINTPart(); 

					match('.'); 
					}
					break;
				case 3 :
					// calr.g:78:7: INTPart '.' INTPart
					{
					mINTPart(); 

					match('.'); 
					mINTPart(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "INTPart"
	public final void mINTPart() throws RecognitionException {
		try {
			// calr.g:82:5: ( ( '0' .. '9' )+ )
			// calr.g:82:7: ( '0' .. '9' )+
			{
			// calr.g:82:7: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// calr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTPart"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:86:5: ( '+' )
			// calr.g:86:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:90:5: ( '-' )
			// calr.g:90:7: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:94:5: ( '*' )
			// calr.g:94:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:98:5: ( '/' )
			// calr.g:98:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "POW"
	public final void mPOW() throws RecognitionException {
		try {
			int _type = POW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:102:5: ( '**' )
			// calr.g:102:7: '**'
			{
			match("**"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POW"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:106:5: ( '(' )
			// calr.g:106:7: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAR"

	// $ANTLR start "RPAR"
	public final void mRPAR() throws RecognitionException {
		try {
			int _type = RPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:110:5: ( ')' )
			// calr.g:110:7: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAR"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:114:5: ( '=' )
			// calr.g:114:7: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NL"
	public final void mNL() throws RecognitionException {
		try {
			int _type = NL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:118:5: ( ( '\\r' | '\\n' )+ )
			// calr.g:118:7: ( '\\r' | '\\n' )+
			{
			// calr.g:118:7: ( '\\r' | '\\n' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\n'||LA4_0=='\r') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// calr.g:
					{
					if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NL"

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:122:5: ( ( '\\t' | ' ' | '\\u000C' )+ )
			// calr.g:122:7: ( '\\t' | ' ' | '\\u000C' )+
			{
			// calr.g:122:7: ( '\\t' | ' ' | '\\u000C' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\t'||LA5_0=='\f'||LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// calr.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPACE"

	@Override
	public void mTokens() throws RecognitionException {
		// calr.g:1:8: ( READ | DISPLAY | PI | E | ID | INT | DOUBLE | PLUS | MINUS | MULT | DIV | POW | LPAR | RPAR | EQ | NL | WHITESPACE )
		int alt6=17;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// calr.g:1:10: READ
				{
				mREAD(); 

				}
				break;
			case 2 :
				// calr.g:1:15: DISPLAY
				{
				mDISPLAY(); 

				}
				break;
			case 3 :
				// calr.g:1:23: PI
				{
				mPI(); 

				}
				break;
			case 4 :
				// calr.g:1:26: E
				{
				mE(); 

				}
				break;
			case 5 :
				// calr.g:1:28: ID
				{
				mID(); 

				}
				break;
			case 6 :
				// calr.g:1:31: INT
				{
				mINT(); 

				}
				break;
			case 7 :
				// calr.g:1:35: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 8 :
				// calr.g:1:42: PLUS
				{
				mPLUS(); 

				}
				break;
			case 9 :
				// calr.g:1:47: MINUS
				{
				mMINUS(); 

				}
				break;
			case 10 :
				// calr.g:1:53: MULT
				{
				mMULT(); 

				}
				break;
			case 11 :
				// calr.g:1:58: DIV
				{
				mDIV(); 

				}
				break;
			case 12 :
				// calr.g:1:62: POW
				{
				mPOW(); 

				}
				break;
			case 13 :
				// calr.g:1:66: LPAR
				{
				mLPAR(); 

				}
				break;
			case 14 :
				// calr.g:1:71: RPAR
				{
				mRPAR(); 

				}
				break;
			case 15 :
				// calr.g:1:76: EQ
				{
				mEQ(); 

				}
				break;
			case 16 :
				// calr.g:1:79: NL
				{
				mNL(); 

				}
				break;
			case 17 :
				// calr.g:1:82: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;

		}
	}


	protected DFA2 dfa2 = new DFA2(this);
	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA2_eotS =
		"\3\uffff\1\4\2\uffff";
	static final String DFA2_eofS =
		"\6\uffff";
	static final String DFA2_minS =
		"\1\56\1\uffff\1\56\1\60\2\uffff";
	static final String DFA2_maxS =
		"\1\71\1\uffff\2\71\2\uffff";
	static final String DFA2_acceptS =
		"\1\uffff\1\1\2\uffff\1\2\1\3";
	static final String DFA2_specialS =
		"\6\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\1\1\uffff\12\2",
			"",
			"\1\3\1\uffff\12\2",
			"\12\5",
			"",
			""
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "75:1: DOUBLE : ( '.' INTPart | INTPart '.' | INTPart '.' INTPart );";
		}
	}

	static final String DFA6_eotS =
		"\1\uffff\3\5\1\24\1\uffff\1\25\3\uffff\1\27\6\uffff\2\5\1\32\4\uffff\2"+
		"\5\1\uffff\1\35\1\5\1\uffff\2\5\1\41\1\uffff";
	static final String DFA6_eofS =
		"\42\uffff";
	static final String DFA6_minS =
		"\1\11\1\145\1\151\1\111\1\60\1\uffff\1\56\3\uffff\1\52\6\uffff\1\141\1"+
		"\163\1\60\4\uffff\1\144\1\160\1\uffff\1\60\1\154\1\uffff\1\141\1\171\1"+
		"\60\1\uffff";
	static final String DFA6_maxS =
		"\1\172\1\145\1\151\1\111\1\172\1\uffff\1\71\3\uffff\1\52\6\uffff\1\141"+
		"\1\163\1\172\4\uffff\1\144\1\160\1\uffff\1\172\1\154\1\uffff\1\141\1\171"+
		"\1\172\1\uffff";
	static final String DFA6_acceptS =
		"\5\uffff\1\5\1\uffff\1\7\1\10\1\11\1\uffff\1\13\1\15\1\16\1\17\1\20\1"+
		"\21\3\uffff\1\4\1\6\1\14\1\12\2\uffff\1\3\2\uffff\1\1\3\uffff\1\2";
	static final String DFA6_specialS =
		"\42\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\20\1\17\1\uffff\1\20\1\17\22\uffff\1\20\7\uffff\1\14\1\15\1\12\1\10"+
			"\1\uffff\1\11\1\7\1\13\12\6\3\uffff\1\16\3\uffff\4\5\1\4\12\5\1\3\12"+
			"\5\6\uffff\3\5\1\2\15\5\1\1\10\5",
			"\1\21",
			"\1\22",
			"\1\23",
			"\12\5\7\uffff\32\5\6\uffff\32\5",
			"",
			"\1\7\1\uffff\12\6",
			"",
			"",
			"",
			"\1\26",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\30",
			"\1\31",
			"\12\5\7\uffff\32\5\6\uffff\32\5",
			"",
			"",
			"",
			"",
			"\1\33",
			"\1\34",
			"",
			"\12\5\7\uffff\32\5\6\uffff\32\5",
			"\1\36",
			"",
			"\1\37",
			"\1\40",
			"\12\5\7\uffff\32\5\6\uffff\32\5",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( READ | DISPLAY | PI | E | ID | INT | DOUBLE | PLUS | MINUS | MULT | DIV | POW | LPAR | RPAR | EQ | NL | WHITESPACE );";
		}
	}

}
