// $ANTLR 3.5.1 calr.g 2013-12-18 14:18:50

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class calrParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DISPLAY", "DIV", "DOUBLE", "E", 
		"EQ", "EXPR", "ID", "INT", "INTPart", "LPAR", "MINUS", "MULT", "NL", "PI", 
		"PLUS", "POW", "READ", "RPAR", "WHITESPACE"
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


	  //add new field
	  private List<RecognitionException> errors = new ArrayList<RecognitionException>();

	  //add new method
	  public List<RecognitionException> getAllErrors() {
	    return new ArrayList<RecognitionException>(errors);
	  }

	  //add new method
	  public boolean hasErrors() {
	    return !errors.isEmpty();
	  }

	  //override method
	  public void reportError(RecognitionException e) {
	    errors.add(e);
	    displayRecognitionError(this.getTokenNames(), e);
	  }



	public static class calc_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "calc"
	// calr.g:57:1: calc : lines EOF !;
	public final calrParser.calc_return calc() throws RecognitionException {
		calrParser.calc_return retval = new calrParser.calc_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope lines1 =null;

		Object EOF2_tree=null;

		try {
			// calr.g:58:5: ( lines EOF !)
			// calr.g:58:7: lines EOF !
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_lines_in_calc62);
			lines1=lines();
			state._fsp--;

			adaptor.addChild(root_0, lines1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_calc64); 
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
	// calr.g:61:1: lines : ( line NL !)+ ;
	public final calrParser.lines_return lines() throws RecognitionException {
		calrParser.lines_return retval = new calrParser.lines_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NL4=null;
		ParserRuleReturnScope line3 =null;

		Object NL4_tree=null;

		try {
			// calr.g:62:5: ( ( line NL !)+ )
			// calr.g:62:7: ( line NL !)+
			{
			root_0 = (Object)adaptor.nil();


			// calr.g:62:7: ( line NL !)+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==DISPLAY||(LA1_0 >= DOUBLE && LA1_0 <= E)||(LA1_0 >= ID && LA1_0 <= INT)||(LA1_0 >= LPAR && LA1_0 <= MINUS)||LA1_0==PI||LA1_0==READ) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// calr.g:62:8: line NL !
					{
					pushFollow(FOLLOW_line_in_lines83);
					line3=line();
					state._fsp--;

					adaptor.addChild(root_0, line3.getTree());

					NL4=(Token)match(input,NL,FOLLOW_NL_in_lines85); 
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
	// calr.g:65:1: line : expr ;
	public final calrParser.line_return line() throws RecognitionException {
		calrParser.line_return retval = new calrParser.line_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr5 =null;


		try {
			// calr.g:66:5: ( expr )
			// calr.g:66:7: expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_in_line105);
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
	// calr.g:69:1: expr : (t1= term ( PLUS ^t2= term | MINUS ^t2= term )* | ID EQ ^ expr | READ ^ ID | DISPLAY ^ expr );
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
			// calr.g:70:5: (t1= term ( PLUS ^t2= term | MINUS ^t2= term )* | ID EQ ^ expr | READ ^ ID | DISPLAY ^ expr )
			int alt3=4;
			switch ( input.LA(1) ) {
			case DOUBLE:
			case E:
			case INT:
			case LPAR:
			case MINUS:
			case PI:
				{
				alt3=1;
				}
				break;
			case ID:
				{
				int LA3_2 = input.LA(2);
				if ( (LA3_2==EQ) ) {
					alt3=2;
				}
				else if ( (LA3_2==DIV||(LA3_2 >= MINUS && LA3_2 <= NL)||(LA3_2 >= PLUS && LA3_2 <= POW)||LA3_2==RPAR) ) {
					alt3=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case READ:
				{
				alt3=3;
				}
				break;
			case DISPLAY:
				{
				alt3=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// calr.g:70:7: t1= term ( PLUS ^t2= term | MINUS ^t2= term )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_term_in_expr124);
					t1=term();
					state._fsp--;

					adaptor.addChild(root_0, t1.getTree());

					// calr.g:70:15: ( PLUS ^t2= term | MINUS ^t2= term )*
					loop2:
					while (true) {
						int alt2=3;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==PLUS) ) {
							alt2=1;
						}
						else if ( (LA2_0==MINUS) ) {
							alt2=2;
						}

						switch (alt2) {
						case 1 :
							// calr.g:70:16: PLUS ^t2= term
							{
							PLUS6=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr127); 
							PLUS6_tree = (Object)adaptor.create(PLUS6);
							root_0 = (Object)adaptor.becomeRoot(PLUS6_tree, root_0);

							pushFollow(FOLLOW_term_in_expr132);
							t2=term();
							state._fsp--;

							adaptor.addChild(root_0, t2.getTree());

							}
							break;
						case 2 :
							// calr.g:70:32: MINUS ^t2= term
							{
							MINUS7=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr136); 
							MINUS7_tree = (Object)adaptor.create(MINUS7);
							root_0 = (Object)adaptor.becomeRoot(MINUS7_tree, root_0);

							pushFollow(FOLLOW_term_in_expr141);
							t2=term();
							state._fsp--;

							adaptor.addChild(root_0, t2.getTree());

							}
							break;

						default :
							break loop2;
						}
					}

					}
					break;
				case 2 :
					// calr.g:71:7: ID EQ ^ expr
					{
					root_0 = (Object)adaptor.nil();


					ID8=(Token)match(input,ID,FOLLOW_ID_in_expr151); 
					ID8_tree = (Object)adaptor.create(ID8);
					adaptor.addChild(root_0, ID8_tree);

					EQ9=(Token)match(input,EQ,FOLLOW_EQ_in_expr153); 
					EQ9_tree = (Object)adaptor.create(EQ9);
					root_0 = (Object)adaptor.becomeRoot(EQ9_tree, root_0);

					pushFollow(FOLLOW_expr_in_expr156);
					expr10=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr10.getTree());

					}
					break;
				case 3 :
					// calr.g:72:7: READ ^ ID
					{
					root_0 = (Object)adaptor.nil();


					READ11=(Token)match(input,READ,FOLLOW_READ_in_expr164); 
					READ11_tree = (Object)adaptor.create(READ11);
					root_0 = (Object)adaptor.becomeRoot(READ11_tree, root_0);

					ID12=(Token)match(input,ID,FOLLOW_ID_in_expr167); 
					ID12_tree = (Object)adaptor.create(ID12);
					adaptor.addChild(root_0, ID12_tree);

					}
					break;
				case 4 :
					// calr.g:73:7: DISPLAY ^ expr
					{
					root_0 = (Object)adaptor.nil();


					DISPLAY13=(Token)match(input,DISPLAY,FOLLOW_DISPLAY_in_expr175); 
					DISPLAY13_tree = (Object)adaptor.create(DISPLAY13);
					root_0 = (Object)adaptor.becomeRoot(DISPLAY13_tree, root_0);

					pushFollow(FOLLOW_expr_in_expr178);
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
	// calr.g:76:1: term : f1= factor ( MULT ^f2= factor | DIV ^f2= factor )* ;
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
			// calr.g:77:5: (f1= factor ( MULT ^f2= factor | DIV ^f2= factor )* )
			// calr.g:77:7: f1= factor ( MULT ^f2= factor | DIV ^f2= factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_term197);
			f1=factor();
			state._fsp--;

			adaptor.addChild(root_0, f1.getTree());

			// calr.g:77:17: ( MULT ^f2= factor | DIV ^f2= factor )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==MULT) ) {
					alt4=1;
				}
				else if ( (LA4_0==DIV) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// calr.g:77:18: MULT ^f2= factor
					{
					MULT15=(Token)match(input,MULT,FOLLOW_MULT_in_term200); 
					MULT15_tree = (Object)adaptor.create(MULT15);
					root_0 = (Object)adaptor.becomeRoot(MULT15_tree, root_0);

					pushFollow(FOLLOW_factor_in_term205);
					f2=factor();
					state._fsp--;

					adaptor.addChild(root_0, f2.getTree());

					}
					break;
				case 2 :
					// calr.g:77:36: DIV ^f2= factor
					{
					DIV16=(Token)match(input,DIV,FOLLOW_DIV_in_term209); 
					DIV16_tree = (Object)adaptor.create(DIV16);
					root_0 = (Object)adaptor.becomeRoot(DIV16_tree, root_0);

					pushFollow(FOLLOW_factor_in_term214);
					f2=factor();
					state._fsp--;

					adaptor.addChild(root_0, f2.getTree());

					}
					break;

				default :
					break loop4;
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
	// calr.g:80:1: factor : ( MINUS ^f2= factor | power );
	public final calrParser.factor_return factor() throws RecognitionException {
		calrParser.factor_return retval = new calrParser.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MINUS17=null;
		ParserRuleReturnScope f2 =null;
		ParserRuleReturnScope power18 =null;

		Object MINUS17_tree=null;

		try {
			// calr.g:81:5: ( MINUS ^f2= factor | power )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==MINUS) ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= DOUBLE && LA5_0 <= E)||(LA5_0 >= ID && LA5_0 <= INT)||LA5_0==LPAR||LA5_0==PI) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// calr.g:81:7: MINUS ^f2= factor
					{
					root_0 = (Object)adaptor.nil();


					MINUS17=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor233); 
					MINUS17_tree = (Object)adaptor.create(MINUS17);
					root_0 = (Object)adaptor.becomeRoot(MINUS17_tree, root_0);

					pushFollow(FOLLOW_factor_in_factor238);
					f2=factor();
					state._fsp--;

					adaptor.addChild(root_0, f2.getTree());

					}
					break;
				case 2 :
					// calr.g:82:7: power
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_power_in_factor246);
					power18=power();
					state._fsp--;

					adaptor.addChild(root_0, power18.getTree());

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
	// calr.g:85:1: power : atom ( POW ^f= factor )? ;
	public final calrParser.power_return power() throws RecognitionException {
		calrParser.power_return retval = new calrParser.power_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token POW20=null;
		ParserRuleReturnScope f =null;
		ParserRuleReturnScope atom19 =null;

		Object POW20_tree=null;

		try {
			// calr.g:86:5: ( atom ( POW ^f= factor )? )
			// calr.g:86:7: atom ( POW ^f= factor )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_atom_in_power263);
			atom19=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom19.getTree());

			// calr.g:86:12: ( POW ^f= factor )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==POW) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// calr.g:86:13: POW ^f= factor
					{
					POW20=(Token)match(input,POW,FOLLOW_POW_in_power266); 
					POW20_tree = (Object)adaptor.create(POW20);
					root_0 = (Object)adaptor.becomeRoot(POW20_tree, root_0);

					pushFollow(FOLLOW_factor_in_power271);
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
	// calr.g:89:1: atom : ( INT | DOUBLE | PI | E | ID | LPAR ! expr RPAR !);
	public final calrParser.atom_return atom() throws RecognitionException {
		calrParser.atom_return retval = new calrParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT21=null;
		Token DOUBLE22=null;
		Token PI23=null;
		Token E24=null;
		Token ID25=null;
		Token LPAR26=null;
		Token RPAR28=null;
		ParserRuleReturnScope expr27 =null;

		Object INT21_tree=null;
		Object DOUBLE22_tree=null;
		Object PI23_tree=null;
		Object E24_tree=null;
		Object ID25_tree=null;
		Object LPAR26_tree=null;
		Object RPAR28_tree=null;

		try {
			// calr.g:90:5: ( INT | DOUBLE | PI | E | ID | LPAR ! expr RPAR !)
			int alt7=6;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt7=1;
				}
				break;
			case DOUBLE:
				{
				alt7=2;
				}
				break;
			case PI:
				{
				alt7=3;
				}
				break;
			case E:
				{
				alt7=4;
				}
				break;
			case ID:
				{
				alt7=5;
				}
				break;
			case LPAR:
				{
				alt7=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// calr.g:90:7: INT
					{
					root_0 = (Object)adaptor.nil();


					INT21=(Token)match(input,INT,FOLLOW_INT_in_atom290); 
					INT21_tree = (Object)adaptor.create(INT21);
					adaptor.addChild(root_0, INT21_tree);

					}
					break;
				case 2 :
					// calr.g:91:7: DOUBLE
					{
					root_0 = (Object)adaptor.nil();


					DOUBLE22=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom298); 
					DOUBLE22_tree = (Object)adaptor.create(DOUBLE22);
					adaptor.addChild(root_0, DOUBLE22_tree);

					}
					break;
				case 3 :
					// calr.g:92:7: PI
					{
					root_0 = (Object)adaptor.nil();


					PI23=(Token)match(input,PI,FOLLOW_PI_in_atom306); 
					PI23_tree = (Object)adaptor.create(PI23);
					adaptor.addChild(root_0, PI23_tree);

					}
					break;
				case 4 :
					// calr.g:93:7: E
					{
					root_0 = (Object)adaptor.nil();


					E24=(Token)match(input,E,FOLLOW_E_in_atom314); 
					E24_tree = (Object)adaptor.create(E24);
					adaptor.addChild(root_0, E24_tree);

					}
					break;
				case 5 :
					// calr.g:94:7: ID
					{
					root_0 = (Object)adaptor.nil();


					ID25=(Token)match(input,ID,FOLLOW_ID_in_atom322); 
					ID25_tree = (Object)adaptor.create(ID25);
					adaptor.addChild(root_0, ID25_tree);

					}
					break;
				case 6 :
					// calr.g:95:7: LPAR ! expr RPAR !
					{
					root_0 = (Object)adaptor.nil();


					LPAR26=(Token)match(input,LPAR,FOLLOW_LPAR_in_atom330); 
					pushFollow(FOLLOW_expr_in_atom333);
					expr27=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr27.getTree());

					RPAR28=(Token)match(input,RPAR,FOLLOW_RPAR_in_atom335); 
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



	public static final BitSet FOLLOW_lines_in_calc62 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_calc64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_in_lines83 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_NL_in_lines85 = new BitSet(new long[]{0x0000000000126CD2L});
	public static final BitSet FOLLOW_expr_in_line105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_expr124 = new BitSet(new long[]{0x0000000000044002L});
	public static final BitSet FOLLOW_PLUS_in_expr127 = new BitSet(new long[]{0x0000000000026CC0L});
	public static final BitSet FOLLOW_term_in_expr132 = new BitSet(new long[]{0x0000000000044002L});
	public static final BitSet FOLLOW_MINUS_in_expr136 = new BitSet(new long[]{0x0000000000026CC0L});
	public static final BitSet FOLLOW_term_in_expr141 = new BitSet(new long[]{0x0000000000044002L});
	public static final BitSet FOLLOW_ID_in_expr151 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_EQ_in_expr153 = new BitSet(new long[]{0x0000000000126CD0L});
	public static final BitSet FOLLOW_expr_in_expr156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_expr164 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_expr167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DISPLAY_in_expr175 = new BitSet(new long[]{0x0000000000126CD0L});
	public static final BitSet FOLLOW_expr_in_expr178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factor_in_term197 = new BitSet(new long[]{0x0000000000008022L});
	public static final BitSet FOLLOW_MULT_in_term200 = new BitSet(new long[]{0x0000000000026CC0L});
	public static final BitSet FOLLOW_factor_in_term205 = new BitSet(new long[]{0x0000000000008022L});
	public static final BitSet FOLLOW_DIV_in_term209 = new BitSet(new long[]{0x0000000000026CC0L});
	public static final BitSet FOLLOW_factor_in_term214 = new BitSet(new long[]{0x0000000000008022L});
	public static final BitSet FOLLOW_MINUS_in_factor233 = new BitSet(new long[]{0x0000000000026CC0L});
	public static final BitSet FOLLOW_factor_in_factor238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_power_in_factor246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_power263 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_POW_in_power266 = new BitSet(new long[]{0x0000000000026CC0L});
	public static final BitSet FOLLOW_factor_in_power271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_atom298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_in_atom306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_E_in_atom314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_atom330 = new BitSet(new long[]{0x0000000000126CD0L});
	public static final BitSet FOLLOW_expr_in_atom333 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_RPAR_in_atom335 = new BitSet(new long[]{0x0000000000000002L});
}
