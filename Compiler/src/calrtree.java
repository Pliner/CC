// $ANTLR 3.5.1 calrtree.g 2013-12-08 14:01:12

import java.lang.Double;
import java.lang.Math;
import java.util.Map;
import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class calrtree extends TreeParser {
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

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("calrtreeTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return calrtree.tokenNames; }
	@Override public String getGrammarFileName() { return "calrtree.g"; }


	    Map<String, Integer> vars = new HashMap<String, Integer>();
	    int maxStackSize = 2;
	    int lastLocalVariable = 3;
	    int stackSize = 2;

	    void stackUp(int size) {
	        stackSize+= size;
	        if(stackSize > maxStackSize)
	            maxStackSize = stackSize;
	    }

	    void stackDown(int size) {
	        stackSize-= size;
	        if(stackSize < 2)
	             stackSize = 2;
	    }

	    void define(String var) {
	        if(vars.containsKey(var))
	            throw new RuntimeException("Variable " + var + " has been already defined");
	        vars.put(var, lastLocalVariable);
	        lastLocalVariable += 2;
	    }

	    int getIndex(String var) {
	        if(!vars.containsKey(var))
	            throw new RuntimeException("Variable " + var + " has not been defined");
	        return vars.get(var);
	    }


	public static class calc_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "calc"
	// calrtree.g:51:1: calc : lines -> main(e=$lines.stl=lastLocalVariables=maxStackSize);
	public final calrtree.calc_return calc() throws RecognitionException {
		calrtree.calc_return retval = new calrtree.calc_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope lines1 =null;

		try {
			// calrtree.g:52:5: ( lines -> main(e=$lines.stl=lastLocalVariables=maxStackSize))
			// calrtree.g:52:7: lines
			{
			pushFollow(FOLLOW_lines_in_calc65);
			lines1=lines();
			state._fsp--;

			// TEMPLATE REWRITE
			// 52:13: -> main(e=$lines.stl=lastLocalVariables=maxStackSize)
			{
				retval.st = templateLib.getInstanceOf("main",new STAttrMap().put("e", (lines1!=null?((StringTemplate)lines1.getTemplate()):null)).put("l", lastLocalVariable).put("s", maxStackSize));
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
		return retval;
	}
	// $ANTLR end "calc"


	public static class lines_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "lines"
	// calrtree.g:55:1: lines : ( (e+= expr )+ ) -> lines(e=$e);
	public final calrtree.lines_return lines() throws RecognitionException {
		calrtree.lines_return retval = new calrtree.lines_return();
		retval.start = input.LT(1);

		List<Object> list_e=null;
		RuleReturnScope e = null;
		try {
			// calrtree.g:56:5: ( ( (e+= expr )+ ) -> lines(e=$e))
			// calrtree.g:56:7: ( (e+= expr )+ )
			{
			// calrtree.g:56:7: ( (e+= expr )+ )
			// calrtree.g:56:8: (e+= expr )+
			{
			// calrtree.g:56:8: (e+= expr )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= DISPLAY && LA1_0 <= EQ)||(LA1_0 >= ID && LA1_0 <= INT)||(LA1_0 >= MINUS && LA1_0 <= MULT)||(LA1_0 >= PI && LA1_0 <= READ)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// calrtree.g:56:9: e+= expr
					{
					pushFollow(FOLLOW_expr_in_lines107);
					e=expr();
					state._fsp--;

					if (list_e==null) list_e=new ArrayList<Object>();
					list_e.add(e.getTemplate());
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

			// TEMPLATE REWRITE
			// 56:22: -> lines(e=$e)
			{
				retval.st = templateLib.getInstanceOf("lines",new STAttrMap().put("e", list_e));
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
		return retval;
	}
	// $ANTLR end "lines"


	public static class expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr"
	// calrtree.g:59:1: expr : ( ^( DISPLAY e= expr ) -> print(e=$e.st)| ^( READ ID ) -> read(i=getIndex($ID.text))| ^( EQ ID e= expr ) -> define(i=getIndex($ID.text)e=$e.st)| ^( PLUS left= expr right= expr ) -> add(left=$left.stright=$right.st)| ^( MINUS left= expr right= expr ) -> sub(left=$left.stright=$right.st)| ^( MULT left= expr right= expr ) -> mul(left=$left.stright=$right.st)| ^( DIV left= expr right= expr ) -> div(left=$left.stright=$right.st)| ^( POW base= expr power= expr ) -> pow(base=$base.stpower=$power.st)| INT -> intToDouble(n=$INT.text)| DOUBLE -> double(n=$DOUBLE.text)| PI -> double(n=Math.PI)| E -> double(n=Math.E)| ID -> resolve(i=getIndex($ID.text)));
	public final calrtree.expr_return expr() throws RecognitionException {
		calrtree.expr_return retval = new calrtree.expr_return();
		retval.start = input.LT(1);

		CommonTree ID2=null;
		CommonTree ID3=null;
		CommonTree INT4=null;
		CommonTree DOUBLE5=null;
		CommonTree ID6=null;
		TreeRuleReturnScope e =null;
		TreeRuleReturnScope left =null;
		TreeRuleReturnScope right =null;
		TreeRuleReturnScope base =null;
		TreeRuleReturnScope power =null;

		try {
			// calrtree.g:60:5: ( ^( DISPLAY e= expr ) -> print(e=$e.st)| ^( READ ID ) -> read(i=getIndex($ID.text))| ^( EQ ID e= expr ) -> define(i=getIndex($ID.text)e=$e.st)| ^( PLUS left= expr right= expr ) -> add(left=$left.stright=$right.st)| ^( MINUS left= expr right= expr ) -> sub(left=$left.stright=$right.st)| ^( MULT left= expr right= expr ) -> mul(left=$left.stright=$right.st)| ^( DIV left= expr right= expr ) -> div(left=$left.stright=$right.st)| ^( POW base= expr power= expr ) -> pow(base=$base.stpower=$power.st)| INT -> intToDouble(n=$INT.text)| DOUBLE -> double(n=$DOUBLE.text)| PI -> double(n=Math.PI)| E -> double(n=Math.E)| ID -> resolve(i=getIndex($ID.text)))
			int alt2=13;
			switch ( input.LA(1) ) {
			case DISPLAY:
				{
				alt2=1;
				}
				break;
			case READ:
				{
				alt2=2;
				}
				break;
			case EQ:
				{
				alt2=3;
				}
				break;
			case PLUS:
				{
				alt2=4;
				}
				break;
			case MINUS:
				{
				alt2=5;
				}
				break;
			case MULT:
				{
				alt2=6;
				}
				break;
			case DIV:
				{
				alt2=7;
				}
				break;
			case POW:
				{
				alt2=8;
				}
				break;
			case INT:
				{
				alt2=9;
				}
				break;
			case DOUBLE:
				{
				alt2=10;
				}
				break;
			case PI:
				{
				alt2=11;
				}
				break;
			case E:
				{
				alt2=12;
				}
				break;
			case ID:
				{
				alt2=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// calrtree.g:60:7: ^( DISPLAY e= expr )
					{
					match(input,DISPLAY,FOLLOW_DISPLAY_in_expr137); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr143);
					e=expr();
					state._fsp--;

					stackUp(1);
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 60:41: -> print(e=$e.st)
					{
						retval.st = templateLib.getInstanceOf("print",new STAttrMap().put("e", (e!=null?((StringTemplate)e.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// calrtree.g:61:7: ^( READ ID )
					{
					match(input,READ,FOLLOW_READ_in_expr164); 
					match(input, Token.DOWN, null); 
					ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_expr166); 
					define((ID2!=null?ID2.getText():null));
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 61:37: -> read(i=getIndex($ID.text))
					{
						retval.st = templateLib.getInstanceOf("read",new STAttrMap().put("i", getIndex((ID2!=null?ID2.getText():null))));
					}



					}
					break;
				case 3 :
					// calrtree.g:62:7: ^( EQ ID e= expr )
					{
					match(input,EQ,FOLLOW_EQ_in_expr186); 
					match(input, Token.DOWN, null); 
					ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_expr188); 
					pushFollow(FOLLOW_expr_in_expr192);
					e=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					define((ID3!=null?ID3.getText():null));
					// TEMPLATE REWRITE
					// 62:43: -> define(i=getIndex($ID.text)e=$e.st)
					{
						retval.st = templateLib.getInstanceOf("define",new STAttrMap().put("i", getIndex((ID3!=null?ID3.getText():null))).put("e", (e!=null?((StringTemplate)e.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// calrtree.g:63:7: ^( PLUS left= expr right= expr )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr218); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr222);
					left=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr226);
					right=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					stackDown(2);
					// TEMPLATE REWRITE
					// 63:52: -> add(left=$left.stright=$right.st)
					{
						retval.st = templateLib.getInstanceOf("add",new STAttrMap().put("left", (left!=null?((StringTemplate)left.getTemplate()):null)).put("right", (right!=null?((StringTemplate)right.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// calrtree.g:64:7: ^( MINUS left= expr right= expr )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr252); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr256);
					left=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr260);
					right=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					stackDown(2);
					// TEMPLATE REWRITE
					// 64:53: -> sub(left=$left.stright=$right.st)
					{
						retval.st = templateLib.getInstanceOf("sub",new STAttrMap().put("left", (left!=null?((StringTemplate)left.getTemplate()):null)).put("right", (right!=null?((StringTemplate)right.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// calrtree.g:65:7: ^( MULT left= expr right= expr )
					{
					match(input,MULT,FOLLOW_MULT_in_expr286); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr290);
					left=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr294);
					right=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					stackDown(2);
					// TEMPLATE REWRITE
					// 65:52: -> mul(left=$left.stright=$right.st)
					{
						retval.st = templateLib.getInstanceOf("mul",new STAttrMap().put("left", (left!=null?((StringTemplate)left.getTemplate()):null)).put("right", (right!=null?((StringTemplate)right.getTemplate()):null)));
					}



					}
					break;
				case 7 :
					// calrtree.g:66:7: ^( DIV left= expr right= expr )
					{
					match(input,DIV,FOLLOW_DIV_in_expr320); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr324);
					left=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr328);
					right=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					stackDown(2);
					// TEMPLATE REWRITE
					// 66:51: -> div(left=$left.stright=$right.st)
					{
						retval.st = templateLib.getInstanceOf("div",new STAttrMap().put("left", (left!=null?((StringTemplate)left.getTemplate()):null)).put("right", (right!=null?((StringTemplate)right.getTemplate()):null)));
					}



					}
					break;
				case 8 :
					// calrtree.g:67:7: ^( POW base= expr power= expr )
					{
					match(input,POW,FOLLOW_POW_in_expr354); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr358);
					base=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr362);
					power=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 67:35: -> pow(base=$base.stpower=$power.st)
					{
						retval.st = templateLib.getInstanceOf("pow",new STAttrMap().put("base", (base!=null?((StringTemplate)base.getTemplate()):null)).put("power", (power!=null?((StringTemplate)power.getTemplate()):null)));
					}



					}
					break;
				case 9 :
					// calrtree.g:68:7: INT
					{
					INT4=(CommonTree)match(input,INT,FOLLOW_INT_in_expr385); 
					stackUp(2);
					// TEMPLATE REWRITE
					// 68:24: -> intToDouble(n=$INT.text)
					{
						retval.st = templateLib.getInstanceOf("intToDouble",new STAttrMap().put("n", (INT4!=null?INT4.getText():null)));
					}



					}
					break;
				case 10 :
					// calrtree.g:69:7: DOUBLE
					{
					DOUBLE5=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_expr403); 
					stackUp(2);
					// TEMPLATE REWRITE
					// 69:27: -> double(n=$DOUBLE.text)
					{
						retval.st = templateLib.getInstanceOf("double",new STAttrMap().put("n", (DOUBLE5!=null?DOUBLE5.getText():null)));
					}



					}
					break;
				case 11 :
					// calrtree.g:70:7: PI
					{
					match(input,PI,FOLLOW_PI_in_expr421); 
					stackUp(2);
					// TEMPLATE REWRITE
					// 70:23: -> double(n=Math.PI)
					{
						retval.st = templateLib.getInstanceOf("double",new STAttrMap().put("n", Math.PI));
					}



					}
					break;
				case 12 :
					// calrtree.g:71:7: E
					{
					match(input,E,FOLLOW_E_in_expr439); 
					stackUp(2);
					// TEMPLATE REWRITE
					// 71:22: -> double(n=Math.E)
					{
						retval.st = templateLib.getInstanceOf("double",new STAttrMap().put("n", Math.E));
					}



					}
					break;
				case 13 :
					// calrtree.g:72:7: ID
					{
					ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_expr457); 
					stackUp(2);
					// TEMPLATE REWRITE
					// 72:23: -> resolve(i=getIndex($ID.text))
					{
						retval.st = templateLib.getInstanceOf("resolve",new STAttrMap().put("i", getIndex((ID6!=null?ID6.getText():null))));
					}



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
		return retval;
	}
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_lines_in_calc65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_lines107 = new BitSet(new long[]{0x00000000001ECDF2L});
	public static final BitSet FOLLOW_DISPLAY_in_expr137 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr143 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_READ_in_expr164 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr166 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr186 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr188 = new BitSet(new long[]{0x00000000001ECDF0L});
	public static final BitSet FOLLOW_expr_in_expr192 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr222 = new BitSet(new long[]{0x00000000001ECDF0L});
	public static final BitSet FOLLOW_expr_in_expr226 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr252 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr256 = new BitSet(new long[]{0x00000000001ECDF0L});
	public static final BitSet FOLLOW_expr_in_expr260 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULT_in_expr286 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr290 = new BitSet(new long[]{0x00000000001ECDF0L});
	public static final BitSet FOLLOW_expr_in_expr294 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_in_expr320 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr324 = new BitSet(new long[]{0x00000000001ECDF0L});
	public static final BitSet FOLLOW_expr_in_expr328 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POW_in_expr354 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr358 = new BitSet(new long[]{0x00000000001ECDF0L});
	public static final BitSet FOLLOW_expr_in_expr362 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_expr385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_expr403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PI_in_expr421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_E_in_expr439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr457 = new BitSet(new long[]{0x0000000000000002L});
}
