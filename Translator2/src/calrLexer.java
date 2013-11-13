// $ANTLR 3.5.1 calr.g 2013-11-14 02:06:40

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
	public static final int LPAR=12;
	public static final int MINUS=13;
	public static final int MULT=14;
	public static final int NL=15;
	public static final int PI=16;
	public static final int PLUS=17;
	public static final int POW=18;
	public static final int READ=19;
	public static final int RPAR=20;
	public static final int WHITESPACE=21;

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
			// calr.g:53:5: ( 'read' )
			// calr.g:53:7: 'read'
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
			// calr.g:57:5: ( 'display' )
			// calr.g:57:7: 'display'
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
			// calr.g:60:5: ( 'PI' )
			// calr.g:60:7: 'PI'
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
			// calr.g:64:5: ( 'E' )
			// calr.g:64:7: 'E'
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
			// calr.g:67:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// calr.g:67:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// calr.g:67:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:71:5: ( INT | '.' INT | INT '.' | INT '.' INT )
			int alt2=4;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// calr.g:71:7: INT
					{
					mINT(); 

					}
					break;
				case 2 :
					// calr.g:72:7: '.' INT
					{
					match('.'); 
					mINT(); 

					}
					break;
				case 3 :
					// calr.g:73:7: INT '.'
					{
					mINT(); 

					match('.'); 
					}
					break;
				case 4 :
					// calr.g:74:7: INT '.' INT
					{
					mINT(); 

					match('.'); 
					mINT(); 

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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			// calr.g:78:5: ( ( '0' .. '9' )+ )
			// calr.g:78:7: ( '0' .. '9' )+
			{
			// calr.g:78:7: ( '0' .. '9' )+
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
	// $ANTLR end "INT"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:82:5: ( '+' )
			// calr.g:82:7: '+'
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
			// calr.g:86:5: ( '-' )
			// calr.g:86:7: '-'
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
			// calr.g:90:5: ( '*' )
			// calr.g:90:7: '*'
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
			// calr.g:94:5: ( '/' )
			// calr.g:94:7: '/'
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
			// calr.g:98:5: ( '^' )
			// calr.g:98:7: '^'
			{
			match('^'); 
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
			// calr.g:102:5: ( '(' )
			// calr.g:102:7: '('
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
			// calr.g:106:5: ( ')' )
			// calr.g:106:7: ')'
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

	// $ANTLR start "NL"
	public final void mNL() throws RecognitionException {
		try {
			int _type = NL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:110:5: ( '\\r' | '\\n' )
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
			// calr.g:114:5: ( ( '\\t' | ' ' | '\\u000C' )+ )
			// calr.g:114:7: ( '\\t' | ' ' | '\\u000C' )+
			{
			// calr.g:114:7: ( '\\t' | ' ' | '\\u000C' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\t'||LA4_0=='\f'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// calr.g:118:5: ( '=' )
			// calr.g:118:7: '='
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

	@Override
	public void mTokens() throws RecognitionException {
		// calr.g:1:8: ( READ | DISPLAY | PI | E | ID | DOUBLE | PLUS | MINUS | MULT | DIV | POW | LPAR | RPAR | NL | WHITESPACE | EQ )
		int alt5=16;
		switch ( input.LA(1) ) {
		case 'r':
			{
			int LA5_1 = input.LA(2);
			if ( (LA5_1=='e') ) {
				int LA5_17 = input.LA(3);
				if ( (LA5_17=='a') ) {
					int LA5_21 = input.LA(4);
					if ( (LA5_21=='d') ) {
						int LA5_24 = input.LA(5);
						if ( ((LA5_24 >= '0' && LA5_24 <= '9')||(LA5_24 >= 'A' && LA5_24 <= 'Z')||(LA5_24 >= 'a' && LA5_24 <= 'z')) ) {
							alt5=5;
						}

						else {
							alt5=1;
						}

					}

					else {
						alt5=5;
					}

				}

				else {
					alt5=5;
				}

			}

			else {
				alt5=5;
			}

			}
			break;
		case 'd':
			{
			int LA5_2 = input.LA(2);
			if ( (LA5_2=='i') ) {
				int LA5_18 = input.LA(3);
				if ( (LA5_18=='s') ) {
					int LA5_22 = input.LA(4);
					if ( (LA5_22=='p') ) {
						int LA5_25 = input.LA(5);
						if ( (LA5_25=='l') ) {
							int LA5_27 = input.LA(6);
							if ( (LA5_27=='a') ) {
								int LA5_28 = input.LA(7);
								if ( (LA5_28=='y') ) {
									int LA5_29 = input.LA(8);
									if ( ((LA5_29 >= '0' && LA5_29 <= '9')||(LA5_29 >= 'A' && LA5_29 <= 'Z')||(LA5_29 >= 'a' && LA5_29 <= 'z')) ) {
										alt5=5;
									}

									else {
										alt5=2;
									}

								}

								else {
									alt5=5;
								}

							}

							else {
								alt5=5;
							}

						}

						else {
							alt5=5;
						}

					}

					else {
						alt5=5;
					}

				}

				else {
					alt5=5;
				}

			}

			else {
				alt5=5;
			}

			}
			break;
		case 'P':
			{
			int LA5_3 = input.LA(2);
			if ( (LA5_3=='I') ) {
				int LA5_19 = input.LA(3);
				if ( ((LA5_19 >= '0' && LA5_19 <= '9')||(LA5_19 >= 'A' && LA5_19 <= 'Z')||(LA5_19 >= 'a' && LA5_19 <= 'z')) ) {
					alt5=5;
				}

				else {
					alt5=3;
				}

			}

			else {
				alt5=5;
			}

			}
			break;
		case 'E':
			{
			int LA5_4 = input.LA(2);
			if ( ((LA5_4 >= '0' && LA5_4 <= '9')||(LA5_4 >= 'A' && LA5_4 <= 'Z')||(LA5_4 >= 'a' && LA5_4 <= 'z')) ) {
				alt5=5;
			}

			else {
				alt5=4;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt5=5;
			}
			break;
		case '.':
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt5=6;
			}
			break;
		case '+':
			{
			alt5=7;
			}
			break;
		case '-':
			{
			alt5=8;
			}
			break;
		case '*':
			{
			alt5=9;
			}
			break;
		case '/':
			{
			alt5=10;
			}
			break;
		case '^':
			{
			alt5=11;
			}
			break;
		case '(':
			{
			alt5=12;
			}
			break;
		case ')':
			{
			alt5=13;
			}
			break;
		case '\n':
		case '\r':
			{
			alt5=14;
			}
			break;
		case '\t':
		case '\f':
		case ' ':
			{
			alt5=15;
			}
			break;
		case '=':
			{
			alt5=16;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
		switch (alt5) {
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
				// calr.g:1:31: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 7 :
				// calr.g:1:38: PLUS
				{
				mPLUS(); 

				}
				break;
			case 8 :
				// calr.g:1:43: MINUS
				{
				mMINUS(); 

				}
				break;
			case 9 :
				// calr.g:1:49: MULT
				{
				mMULT(); 

				}
				break;
			case 10 :
				// calr.g:1:54: DIV
				{
				mDIV(); 

				}
				break;
			case 11 :
				// calr.g:1:58: POW
				{
				mPOW(); 

				}
				break;
			case 12 :
				// calr.g:1:62: LPAR
				{
				mLPAR(); 

				}
				break;
			case 13 :
				// calr.g:1:67: RPAR
				{
				mRPAR(); 

				}
				break;
			case 14 :
				// calr.g:1:72: NL
				{
				mNL(); 

				}
				break;
			case 15 :
				// calr.g:1:75: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;
			case 16 :
				// calr.g:1:86: EQ
				{
				mEQ(); 

				}
				break;

		}
	}


	protected DFA2 dfa2 = new DFA2(this);
	static final String DFA2_eotS =
		"\1\uffff\1\3\2\uffff\1\5\2\uffff";
	static final String DFA2_eofS =
		"\7\uffff";
	static final String DFA2_minS =
		"\2\56\2\uffff\1\60\2\uffff";
	static final String DFA2_maxS =
		"\2\71\2\uffff\1\71\2\uffff";
	static final String DFA2_acceptS =
		"\2\uffff\1\2\1\1\1\uffff\1\3\1\4";
	static final String DFA2_specialS =
		"\7\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\4\1\uffff\12\1",
			"",
			"",
			"\12\6",
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
			return "70:1: DOUBLE : ( INT | '.' INT | INT '.' | INT '.' INT );";
		}
	}

}
