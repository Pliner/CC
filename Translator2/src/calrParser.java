// $ANTLR 3.5.1 calr.g 2013-11-20 18:03:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class calrParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public calrParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public calrParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return calrParser.tokenNames; }
	@Override public String getGrammarFileName() { return "calr.g"; }


	public static class calc_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "calc"
	// calr.g:11:1: calc : lines EOF !;
	public final calrParser.calc_return calc() throws RecognitionException {
		calrParser.calc_return retval = new calrParser.calc_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope lines1 =null;

		Object EOF2_tree=null;

		try {
			// calr.g:12:5: ( lines EOF !)
			// calr.g:12:7: lines EOF !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_lines_in_calc42);
			lines1=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_calc44); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "calc"


	public static class lines_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lines"
	// calr.g:15:1: lines : ( line ( ( NL )+ ) !)+ ;
	public final calrParser.lines_return lines() throws RecognitionException {
		calrParser.lines_return retval = new calrParser.lines_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NL4=null;
		ParserRuleReturnScope line3 =null;

		Object NL4_tree=null;

		try {
			// calr.g:16:5: ( ( line ( ( NL )+ ) !)+ )
			// calr.g:16:7: ( line ( ( NL )+ ) !)+
			{
			root_0 = (Object)adaptor.nil();


			// calr.g:16:7: ( line ( ( NL )+ ) !)+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DISPLAY||(LA2_0 >= DOUBLE && LA2_0 <= E)||LA2_0==ID||(LA2_0 >= LPAR && LA2_0 <= MINUS)||(LA2_0 >= PI && LA2_0 <= PLUS)||LA2_0==READ) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// calr.g:16:8: line ( ( NL )+ ) !
					{
					pushFollow(FOLLOW_line_in_lines63);
					line3=line();
					state._fsp--;

					adaptor.addChild(root_0, line3.getTree());

					// calr.g:16:13: ( ( NL )+ )
					// calr.g:16:14: ( NL )+
					{
					// calr.g:16:14: ( NL )+
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
							// calr.g:16:14: NL
							{
							NL4=(Token)match(input,NL,FOLLOW_NL_in_lines66); 
							NL4_tree = (Object)adaptor.create(NL4);
							adaptor.addChild(root_0, NL4_tree);

							}
							break;

						default :
							if ( cnt1 >= 1 ) break loop1;
							EarlyExitException eee = new EarlyExitException(1, input);
							throw eee;
						}
						cnt1++;
					}

					}

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

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lines"


	public static class line_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "line"
	// calr.g:19:1: line : expr ;
	public final calrParser.line_return line() throws RecognitionException {
		calrParser.line_return retval = new calrParser.line_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr5 =null;


		try {
			// calr.g:20:5: ( expr )
			// calr.g:20:7: expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_in_line88);
			expr5=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr5.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "line"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// calr.g:23:1: expr : (t1= term ( PLUS ^t2= term | MINUS ^t2= term )* | ID EQ ^ expr | READ ^ ID | DISPLAY ^ expr );
	public final calrParser.expr_return expr() throws RecognitionException {
		calrParser.expr_return retval = new calrParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS6=null;
		Token MINUS7=null;
		Token ID8=null;
		Token EQ9=null;
		Token READ11=null;
		Token ID12=null;
		Token DISPLAY13=null;
		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;
		ParserRuleReturnScope expr10 =null;
		ParserRuleReturnScope expr14 =null;

		Object PLUS6_tree=null;
		Object MINUS7_tree=null;
		Object ID8_tree=null;
		Object EQ9_tree=null;
		Object READ11_tree=null;
		Object ID12_tree=null;
		Object DISPLAY13_tree=null;

		try {
			// calr.g:24:5: (t1= term ( PLUS ^t2= term | MINUS ^t2= term )* | ID EQ ^ expr | READ ^ ID | DISPLAY ^ expr )
			int alt4=4;
			switch ( input.LA(1) ) {
			case DOUBLE:
			case E:
			case LPAR:
			case MINUS:
			case PI:
			case PLUS:
				{
				alt4=1;
				}
				break;
			case ID:
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2==EQ) ) {
					alt4=2;
				}
				else if ( (LA4_2==DIV||(LA4_2 >= MINUS && LA4_2 <= NL)||(LA4_2 >= PLUS && LA4_2 <= POW)||LA4_2==RPAR) ) {
					alt4=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case READ:
				{
				alt4=3;
				}
				break;
			case DISPLAY:
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// calr.g:24:7: t1= term ( PLUS ^t2= term | MINUS ^t2= term )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_term_in_expr107);
					t1=term();
					state._fsp--;

					adaptor.addChild(root_0, t1.getTree());

					// calr.g:24:15: ( PLUS ^t2= term | MINUS ^t2= term )*
					loop3:
					while (true) {
						int alt3=3;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==PLUS) ) {
							alt3=1;
						}
						else if ( (LA3_0==MINUS) ) {
							alt3=2;
						}

						switch (alt3) {
						case 1 :
							// calr.g:24:16: PLUS ^t2= term
							{
							PLUS6=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr110); 
							PLUS6_tree = (Object)adaptor.create(PLUS6);
							root_0 = (Object)adaptor.becomeRoot(PLUS6_tree, root_0);

							pushFollow(FOLLOW_term_in_expr115);
							t2=term();
							state._fsp--;

							adaptor.addChild(root_0, t2.getTree());

							}
							break;
						case 2 :
							// calr.g:24:32: MINUS ^t2= term
							{
							MINUS7=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr119); 
							MINUS7_tree = (Object)adaptor.create(MINUS7);
							root_0 = (Object)adaptor.becomeRoot(MINUS7_tree, root_0);

							pushFollow(FOLLOW_term_in_expr124);
							t2=term();
							state._fsp--;

							adaptor.addChild(root_0, t2.getTree());

							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;
				case 2 :
					// calr.g:25:7: ID EQ ^ expr
					{
					root_0 = (Object)adaptor.nil();


					ID8=(Token)match(input,ID,FOLLOW_ID_in_expr134); 
					ID8_tree = (Object)adaptor.create(ID8);
					adaptor.addChild(root_0, ID8_tree);

					EQ9=(Token)match(input,EQ,FOLLOW_EQ_in_expr136); 
					EQ9_tree = (Object)adaptor.create(EQ9);
					root_0 = (Object)adaptor.becomeRoot(EQ9_tree, root_0);

					pushFollow(FOLLOW_expr_in_expr139);
					expr10=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr10.getTree());

					}
					break;
				case 3 :
					// calr.g:26:7: READ ^ ID
					{
					root_0 = (Object)adaptor.nil();


					READ11=(Token)match(input,READ,FOLLOW_READ_in_expr147); 
					READ11_tree = (Object)adaptor.create(READ11);
					root_0 = (Object)adaptor.becomeRoot(READ11_tree, root_0);

					ID12=(Token)match(input,ID,FOLLOW_ID_in_expr150); 
					ID12_tree = (Object)adaptor.create(ID12);
					adaptor.addChild(root_0, ID12_tree);

					}
					break;
				case 4 :
					// calr.g:27:7: DISPLAY ^ expr
					{
					root_0 = (Object)adaptor.nil();


					DISPLAY13=(Token)match(input,DISPLAY,FOLLOW_DISPLAY_in_expr158); 
					DISPLAY13_tree = (Object)adaptor.create(DISPLAY13);
					root_0 = (Object)adaptor.becomeRoot(DISPLAY13_tree, root_0);

					pushFollow(FOLLOW_expr_in_expr161);
					expr14=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr14.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// calr.g:30:1: term : f1= factor ( MULT ^f2= factor | DIV ^f2= factor )* ;
	public final calrParser.term_return term() throws RecognitionException {
		calrParser.term_return retval = new calrParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT15=null;
		Token DIV16=null;
		ParserRuleReturnScope f1 =null;
		ParserRuleReturnScope f2 =null;

		Object MULT15_tree=null;
		Object DIV16_tree=null;

		try {
			// calr.g:31:5: (f1= factor ( MULT ^f2= factor | DIV ^f2= factor )* )
			// calr.g:31:7: f1= factor ( MULT ^f2= factor | DIV ^f2= factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_term180);
			f1=factor();
			state._fsp--;

			adaptor.addChild(root_0, f1.getTree());

			// calr.g:31:17: ( MULT ^f2= factor | DIV ^f2= factor )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==MULT) ) {
					alt5=1;
				}
				else if ( (LA5_0==DIV) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// calr.g:31:18: MULT ^f2= factor
					{
					MULT15=(Token)match(input,MULT,FOLLOW_MULT_in_term183); 
					MULT15_tree = (Object)adaptor.create(MULT15);
					root_0 = (Object)adaptor.becomeRoot(MULT15_tree, root_0);

					pushFollow(FOLLOW_factor_in_term188);
					f2=factor();
					state._fsp--;

					adaptor.addChild(root_0, f2.getTree());

					}
					break;
				case 2 :
					// calr.g:31:36: DIV ^f2= factor
					{
					DIV16=(Token)match(input,DIV,FOLLOW_DIV_in_term192); 
					DIV16_tree = (Object)adaptor.create(DIV16);
					root_0 = (Object)adaptor.becomeRoot(DIV16_tree, root_0);

					pushFollow(FOLLOW_factor_in_term197);
					f2=factor();
					state._fsp--;

					adaptor.addChild(root_0, f2.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// calr.g:34:1: factor : ( PLUS ^f1= factor | MINUS ^f2= factor | power );
	public final calrParser.factor_return factor() throws RecognitionException {
		calrParser.factor_return retval = new calrParser.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS17=null;
		Token MINUS18=null;
		ParserRuleReturnScope f1 =null;
		ParserRuleReturnScope f2 =null;
		ParserRuleReturnScope power19 =null;

		Object PLUS17_tree=null;
		Object MINUS18_tree=null;

		try {
			// calr.g:35:5: ( PLUS ^f1= factor | MINUS ^f2= factor | power )
			int alt6=3;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt6=1;
				}
				break;
			case MINUS:
				{
				alt6=2;
				}
				break;
			case DOUBLE:
			case E:
			case ID:
			case LPAR:
			case PI:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// calr.g:35:7: PLUS ^f1= factor
					{
					root_0 = (Object)adaptor.nil();


					PLUS17=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor216); 
					PLUS17_tree = (Object)adaptor.create(PLUS17);
					root_0 = (Object)adaptor.becomeRoot(PLUS17_tree, root_0);

					pushFollow(FOLLOW_factor_in_factor221);
					f1=factor();
					state._fsp--;

					adaptor.addChild(root_0, f1.getTree());

					}
					break;
				case 2 :
					// calr.g:36:7: MINUS ^f2= factor
					{
					root_0 = (Object)adaptor.nil();


					MINUS18=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor229); 
					MINUS18_tree = (Object)adaptor.create(MINUS18);
					root_0 = (Object)adaptor.becomeRoot(MINUS18_tree, root_0);

					pushFollow(FOLLOW_factor_in_factor234);
					f2=factor();
					state._fsp--;

					adaptor.addChild(root_0, f2.getTree());

					}
					break;
				case 3 :
					// calr.g:37:7: power
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_power_in_factor242);
					power19=power();
					state._fsp--;

					adaptor.addChild(root_0, power19.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class power_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "power"
	// calr.g:40:1: power : atom ( POW ^f= factor )? ;
	public final calrParser.power_return power() throws RecognitionException {
		calrParser.power_return retval = new calrParser.power_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token POW21=null;
		ParserRuleReturnScope f =null;
		ParserRuleReturnScope atom20 =null;

		Object POW21_tree=null;

		try {
			// calr.g:41:5: ( atom ( POW ^f= factor )? )
			// calr.g:41:7: atom ( POW ^f= factor )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_atom_in_power259);
			atom20=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom20.getTree());

			// calr.g:41:12: ( POW ^f= factor )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==POW) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// calr.g:41:13: POW ^f= factor
					{
					POW21=(Token)match(input,POW,FOLLOW_POW_in_power262); 
					POW21_tree = (Object)adaptor.create(POW21);
					root_0 = (Object)adaptor.becomeRoot(POW21_tree, root_0);

					pushFollow(FOLLOW_factor_in_power267);
					f=factor();
					state._fsp--;

					adaptor.addChild(root_0, f.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "power"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// calr.g:44:1: atom : ( DOUBLE | PI | E | ID | LPAR ! expr RPAR !);
	public final calrParser.atom_return atom() throws RecognitionException {
		calrParser.atom_return retval = new calrParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DOUBLE22=null;
		Token PI23=null;
		Token E24=null;
		Token ID25=null;
		Token LPAR26=null;
		Token RPAR28=null;
		ParserRuleReturnScope expr27 =null;

		Object DOUBLE22_tree=null;
		Object PI23_tree=null;
		Object E24_tree=null;
		Object ID25_tree=null;
		Object LPAR26_tree=null;
		Object RPAR28_tree=null;

		try {
			// calr.g:45:5: ( DOUBLE | PI | E | ID | LPAR ! expr RPAR !)
			int alt8=5;
			switch ( input.LA(1) ) {
			case DOUBLE:
				{
				alt8=1;
				}
				break;
			case PI:
				{
				alt8=2;
				}
				break;
			case E:
				{
				alt8=3;
				}
				break;
			case ID:
				{
				alt8=4;
				}
				break;
			case LPAR:
				{
				alt8=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// calr.g:45:7: DOUBLE
					{
					root_0 = (Object)adaptor.nil();


					DOUBLE22=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom286); 
					DOUBLE22_tree = (Object)adaptor.create(DOUBLE22);
					adaptor.addChild(root_0, DOUBLE22_tree);

					}
					break;
				case 2 :
					// calr.g:46:7: PI
					{
					root_0 = (Object)adaptor.nil();


					PI23=(Token)match(input,PI,FOLLOW_PI_in_atom294); 
					PI23_tree = (Object)adaptor.create(PI23);
					adaptor.addChild(root_0, PI23_tree);

					}
					break;
				case 3 :
					// calr.g:47:7: E
					{
					root_0 = (Object)adaptor.nil();


					E24=(Token)match(input,E,FOLLOW_E_in_atom302); 
					E24_tree = (Object)adaptor.create(E24);
					adaptor.addChild(root_0, E24_tree);

					}
					break;
				case 4 :
					// calr.g:48:7: ID
					{
					root_0 = (Object)adaptor.nil();


					ID25=(Token)match(input,ID,FOLLOW_ID_in_atom310); 
					ID25_tree = (Object)adaptor.create(ID25);
					adaptor.addChild(root_0, ID25_tree);

					}
					break;
				case 5 :
					// calr.g:49:7: LPAR ! expr RPAR !
					{
					root_0 = (Object)adaptor.nil();


					LPAR26=(Token)match(input,LPAR,FOLLOW_LPAR_in_atom318); 
					pushFollow(FOLLOW_expr_in_atom321);
					expr27=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr27.getTree());

					RPAR28=(Token)match(input,RPAR,FOLLOW_RPAR_in_atom323); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_lines_in_calc42 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_calc44 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_in_lines63 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NL_in_lines66 = new BitSet(new long[]{0x00000000000BB4D2L});
	public static final BitSet FOLLOW_expr_in_line88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_expr107 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_PLUS_in_expr110 = new BitSet(new long[]{0x00000000000334C0L});
	public static final BitSet FOLLOW_term_in_expr115 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_MINUS_in_expr119 = new BitSet(new long[]{0x00000000000334C0L});
	public static final BitSet FOLLOW_term_in_expr124 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_ID_in_expr134 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EQ_in_expr136 = new BitSet(new long[]{0x00000000000B34D0L});
	public static final BitSet FOLLOW_expr_in_expr139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_expr147 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_expr150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISPLAY_in_expr158 = new BitSet(new long[]{0x00000000000B34D0L});
	public static final BitSet FOLLOW_expr_in_expr161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factor_in_term180 = new BitSet(new long[]{0x0000000000004022L});
	public static final BitSet FOLLOW_MULT_in_term183 = new BitSet(new long[]{0x00000000000334C0L});
	public static final BitSet FOLLOW_factor_in_term188 = new BitSet(new long[]{0x0000000000004022L});
	public static final BitSet FOLLOW_DIV_in_term192 = new BitSet(new long[]{0x00000000000334C0L});
	public static final BitSet FOLLOW_factor_in_term197 = new BitSet(new long[]{0x0000000000004022L});
	public static final BitSet FOLLOW_PLUS_in_factor216 = new BitSet(new long[]{0x00000000000334C0L});
	public static final BitSet FOLLOW_factor_in_factor221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_factor229 = new BitSet(new long[]{0x00000000000334C0L});
	public static final BitSet FOLLOW_factor_in_factor234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_power_in_factor242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_power259 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_POW_in_power262 = new BitSet(new long[]{0x00000000000334C0L});
	public static final BitSet FOLLOW_factor_in_power267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_atom286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_in_atom294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_E_in_atom302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_atom318 = new BitSet(new long[]{0x00000000000B34D0L});
	public static final BitSet FOLLOW_expr_in_atom321 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_RPAR_in_atom323 = new BitSet(new long[]{0x0000000000000002L});
}
