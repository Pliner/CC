// $ANTLR 3.5.1 calrtree.g 2013-11-20 18:03:17

import java.lang.Double;
import java.lang.Math;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class calrtree extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DISPLAY", "DIV", "DOUBLE", "E", 
		"EQ", "EXPR", "ID", "INT", "LPAR", "MINUS", "MULT", "NL", "PI", "PLUS", 
		"POW", "READ", "RPAR", "WHITESPACE"
	};
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public calrtree(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public calrtree(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return calrtree.tokenNames; }
	@Override public String getGrammarFileName() { return "calrtree.g"; }



	// $ANTLR start "calc"
	// calrtree.g:13:1: calc : ( expr ( NL )+ )+ ;
	public final void calc() throws RecognitionException {
		try {
			// calrtree.g:14:5: ( ( expr ( NL )+ )+ )
			// calrtree.g:14:7: ( expr ( NL )+ )+
			{
			// calrtree.g:14:7: ( expr ( NL )+ )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= DISPLAY && LA2_0 <= EQ)||LA2_0==ID||(LA2_0 >= MINUS && LA2_0 <= MULT)||(LA2_0 >= PI && LA2_0 <= READ)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// calrtree.g:14:8: expr ( NL )+
					{
					pushFollow(FOLLOW_expr_in_calc46);
					expr();
					state._fsp--;

					// calrtree.g:14:13: ( NL )+
					int cnt1=0;
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==NL) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// calrtree.g:14:13: NL
							{
							match(input,NL,FOLLOW_NL_in_calc48); 
							}
							break;

						default :
							if ( cnt1 >= 1 ) break loop1;
							EarlyExitException eee = new EarlyExitException(1, input);
							throw eee;
						}
						cnt1++;
					}

					System.out.println();
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "calc"



	// $ANTLR start "expr"
	// calrtree.g:17:1: expr : ( ^( PLUS expr ( expr )? ) | ^( MINUS expr ( expr )? ) | ^( MULT expr expr ) | ^( DIV expr expr ) | ^( POW expr expr ) | ^( EQ ID expr ) | ^( DISPLAY expr ) | ^( READ ID ) | DOUBLE | PI | E | ID );
	public final void expr() throws RecognitionException {
		CommonTree ID1=null;
		CommonTree ID2=null;
		CommonTree DOUBLE3=null;
		CommonTree ID4=null;

		try {
			// calrtree.g:18:5: ( ^( PLUS expr ( expr )? ) | ^( MINUS expr ( expr )? ) | ^( MULT expr expr ) | ^( DIV expr expr ) | ^( POW expr expr ) | ^( EQ ID expr ) | ^( DISPLAY expr ) | ^( READ ID ) | DOUBLE | PI | E | ID )
			int alt5=12;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt5=1;
				}
				break;
			case MINUS:
				{
				alt5=2;
				}
				break;
			case MULT:
				{
				alt5=3;
				}
				break;
			case DIV:
				{
				alt5=4;
				}
				break;
			case POW:
				{
				alt5=5;
				}
				break;
			case EQ:
				{
				alt5=6;
				}
				break;
			case DISPLAY:
				{
				alt5=7;
				}
				break;
			case READ:
				{
				alt5=8;
				}
				break;
			case DOUBLE:
				{
				alt5=9;
				}
				break;
			case PI:
				{
				alt5=10;
				}
				break;
			case E:
				{
				alt5=11;
				}
				break;
			case ID:
				{
				alt5=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// calrtree.g:18:7: ^( PLUS expr ( expr )? )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr70); 
					System.out.print("(+ ");
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr73);
					expr();
					state._fsp--;

					// calrtree.g:18:45: ( expr )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( ((LA3_0 >= DISPLAY && LA3_0 <= EQ)||LA3_0==ID||(LA3_0 >= MINUS && LA3_0 <= MULT)||(LA3_0 >= PI && LA3_0 <= READ)) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// calrtree.g:18:45: expr
							{
							pushFollow(FOLLOW_expr_in_expr75);
							expr();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					System.out.print(") ");
					}
					break;
				case 2 :
					// calrtree.g:19:7: ^( MINUS expr ( expr )? )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr89); 
					System.out.print("(- ");
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr92);
					expr();
					state._fsp--;

					// calrtree.g:19:46: ( expr )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( ((LA4_0 >= DISPLAY && LA4_0 <= EQ)||LA4_0==ID||(LA4_0 >= MINUS && LA4_0 <= MULT)||(LA4_0 >= PI && LA4_0 <= READ)) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// calrtree.g:19:46: expr
							{
							pushFollow(FOLLOW_expr_in_expr94);
							expr();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					System.out.print(") ");
					}
					break;
				case 3 :
					// calrtree.g:20:7: ^( MULT expr expr )
					{
					match(input,MULT,FOLLOW_MULT_in_expr107); 
					System.out.print("(* ");
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr110);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr112);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					System.out.print(") ");
					}
					break;
				case 4 :
					// calrtree.g:21:7: ^( DIV expr expr )
					{
					match(input,DIV,FOLLOW_DIV_in_expr126); 
					System.out.print("(/ ");
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr129);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr131);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					System.out.print(") ");
					}
					break;
				case 5 :
					// calrtree.g:22:7: ^( POW expr expr )
					{
					match(input,POW,FOLLOW_POW_in_expr146); 
					System.out.print("(expt ");
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr149);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr151);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					System.out.print(") ");
					}
					break;
				case 6 :
					// calrtree.g:23:7: ^( EQ ID expr )
					{
					match(input,EQ,FOLLOW_EQ_in_expr166); 
					System.out.print("(define ");
					match(input, Token.DOWN, null); 
					ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_expr169); 
					System.out.print((ID1!=null?ID1.getText():null) + " ");
					pushFollow(FOLLOW_expr_in_expr172);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					System.out.print(") ");
					}
					break;
				case 7 :
					// calrtree.g:24:7: ^( DISPLAY expr )
					{
					match(input,DISPLAY,FOLLOW_DISPLAY_in_expr187); 
					System.out.print("(display ");
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr190);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					System.out.print(") ");
					}
					break;
				case 8 :
					// calrtree.g:25:7: ^( READ ID )
					{
					match(input,READ,FOLLOW_READ_in_expr205); 
					System.out.print("(read ");
					match(input, Token.DOWN, null); 
					ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_expr208); 
					System.out.print((ID2!=null?ID2.getText():null) + " ");
					match(input, Token.UP, null); 

					System.out.print(") ");
					}
					break;
				case 9 :
					// calrtree.g:26:7: DOUBLE
					{
					DOUBLE3=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_expr223); 
					System.out.print((DOUBLE3!=null?DOUBLE3.getText():null) + " ");
					}
					break;
				case 10 :
					// calrtree.g:27:7: PI
					{
					match(input,PI,FOLLOW_PI_in_expr252); 
					System.out.print("PI ");
					}
					break;
				case 11 :
					// calrtree.g:28:7: E
					{
					match(input,E,FOLLOW_E_in_expr285); 
					System.out.print("E ");
					}
					break;
				case 12 :
					// calrtree.g:29:7: ID
					{
					ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_expr319); 
					System.out.print((ID4!=null?ID4.getText():null) + " ");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_calc46 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NL_in_calc48 = new BitSet(new long[]{0x00000000000FE5F2L});
	public static final BitSet FOLLOW_PLUS_in_expr70 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr73 = new BitSet(new long[]{0x00000000000F65F8L});
	public static final BitSet FOLLOW_expr_in_expr75 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr89 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr92 = new BitSet(new long[]{0x00000000000F65F8L});
	public static final BitSet FOLLOW_expr_in_expr94 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULT_in_expr107 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr110 = new BitSet(new long[]{0x00000000000F65F0L});
	public static final BitSet FOLLOW_expr_in_expr112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expr126 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr129 = new BitSet(new long[]{0x00000000000F65F0L});
	public static final BitSet FOLLOW_expr_in_expr131 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POW_in_expr146 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr149 = new BitSet(new long[]{0x00000000000F65F0L});
	public static final BitSet FOLLOW_expr_in_expr151 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr166 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr169 = new BitSet(new long[]{0x00000000000F65F0L});
	public static final BitSet FOLLOW_expr_in_expr172 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DISPLAY_in_expr187 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr190 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_in_expr205 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr208 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOUBLE_in_expr223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_in_expr252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_E_in_expr285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr319 = new BitSet(new long[]{0x0000000000000002L});
}
