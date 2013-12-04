// $ANTLR 3.5.1 calrtree.g 2013-12-04 18:56:04

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
	    int stackSize = 0;
	    void stackUp(int size) {
	        stackSize+= size;
	        if(stackSize > maxStackSize)
	            maxStackSize = stackSize;
	    }

	    void define(String var) {
	        if(vars.containsKey(var))
	            throw new RuntimeException("Variable " + var + " has been already defined");
	        vars.put(var, lastLocalVariable);
	        lastLocalVariable += 2;
	    }

	    int getIndex(String var) {
	        if(!vars.containsKey(var))
	            throw new RuntimeException("Variable " + var + " has been already defined");
	        return vars.get(var);
	    }


	public static class calc_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "calc"
	// calrtree.g:44:1: calc : lines -> main(e=$lines.stl=lastLocalVariables=maxStackSize);
	public final calrtree.calc_return calc() throws RecognitionException {
		calrtree.calc_return retval = new calrtree.calc_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope lines1 =null;

		try {
			// calrtree.g:45:5: ( lines -> main(e=$lines.stl=lastLocalVariables=maxStackSize))
			// calrtree.g:45:7: lines
			{
			pushFollow(FOLLOW_lines_in_calc65);
			lines1=lines();
			state._fsp--;

			// TEMPLATE REWRITE
			// 45:13: -> main(e=$lines.stl=lastLocalVariables=maxStackSize)
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
	// calrtree.g:48:1: lines : ( (e+= expr )+ ) -> lines(e=$e);
	public final calrtree.lines_return lines() throws RecognitionException {
		calrtree.lines_return retval = new calrtree.lines_return();
		retval.start = input.LT(1);

		List<Object> list_e=null;
		RuleReturnScope e = null;
		try {
			// calrtree.g:49:5: ( ( (e+= expr )+ ) -> lines(e=$e))
			// calrtree.g:49:7: ( (e+= expr )+ )
			{
			// calrtree.g:49:7: ( (e+= expr )+ )
			// calrtree.g:49:8: (e+= expr )+
			{
			// calrtree.g:49:8: (e+= expr )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==DISPLAY||LA1_0==DOUBLE||LA1_0==EQ||LA1_0==INT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// calrtree.g:49:9: e+= expr
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
			// 49:22: -> lines(e=$e)
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
	// calrtree.g:52:1: expr : ( ^( DISPLAY e= expr ) -> print(e=$e.st)| ^( EQ ID e= expr ) -> define(i=getIndex($ID.text)e=$e.stv=$ID.text)| INT -> intToDouble(n=$INT.text)| DOUBLE -> double(n=$DOUBLE.text));
	public final calrtree.expr_return expr() throws RecognitionException {
		calrtree.expr_return retval = new calrtree.expr_return();
		retval.start = input.LT(1);

		CommonTree ID2=null;
		CommonTree INT3=null;
		CommonTree DOUBLE4=null;
		TreeRuleReturnScope e =null;

		try {
			// calrtree.g:53:5: ( ^( DISPLAY e= expr ) -> print(e=$e.st)| ^( EQ ID e= expr ) -> define(i=getIndex($ID.text)e=$e.stv=$ID.text)| INT -> intToDouble(n=$INT.text)| DOUBLE -> double(n=$DOUBLE.text))
			int alt2=4;
			switch ( input.LA(1) ) {
			case DISPLAY:
				{
				alt2=1;
				}
				break;
			case EQ:
				{
				alt2=2;
				}
				break;
			case INT:
				{
				alt2=3;
				}
				break;
			case DOUBLE:
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// calrtree.g:53:7: ^( DISPLAY e= expr )
					{
					match(input,DISPLAY,FOLLOW_DISPLAY_in_expr137); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr143);
					e=expr();
					state._fsp--;

					stackUp(1);
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 53:40: -> print(e=$e.st)
					{
						retval.st = templateLib.getInstanceOf("print",new STAttrMap().put("e", (e!=null?((StringTemplate)e.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// calrtree.g:54:7: ^( EQ ID e= expr )
					{
					match(input,EQ,FOLLOW_EQ_in_expr163); 
					match(input, Token.DOWN, null); 
					ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_expr165); 
					pushFollow(FOLLOW_expr_in_expr169);
					e=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					define((ID2!=null?ID2.getText():null));
					// TEMPLATE REWRITE
					// 54:42: -> define(i=getIndex($ID.text)e=$e.stv=$ID.text)
					{
						retval.st = templateLib.getInstanceOf("define",new STAttrMap().put("i", getIndex((ID2!=null?ID2.getText():null))).put("e", (e!=null?((StringTemplate)e.getTemplate()):null)).put("v", (ID2!=null?ID2.getText():null)));
					}



					}
					break;
				case 3 :
					// calrtree.g:55:7: INT
					{
					INT3=(CommonTree)match(input,INT,FOLLOW_INT_in_expr198); 
					stackUp(2);
					// TEMPLATE REWRITE
					// 55:24: -> intToDouble(n=$INT.text)
					{
						retval.st = templateLib.getInstanceOf("intToDouble",new STAttrMap().put("n", (INT3!=null?INT3.getText():null)));
					}



					}
					break;
				case 4 :
					// calrtree.g:56:7: DOUBLE
					{
					DOUBLE4=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_expr216); 
					stackUp(2);
					// TEMPLATE REWRITE
					// 56:27: -> double(n=$DOUBLE.text)
					{
						retval.st = templateLib.getInstanceOf("double",new STAttrMap().put("n", (DOUBLE4!=null?DOUBLE4.getText():null)));
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
	public static final BitSet FOLLOW_expr_in_lines107 = new BitSet(new long[]{0x0000000000000952L});
	public static final BitSet FOLLOW_DISPLAY_in_expr137 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr143 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr163 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr165 = new BitSet(new long[]{0x0000000000000950L});
	public static final BitSet FOLLOW_expr_in_expr169 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_expr198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_expr216 = new BitSet(new long[]{0x0000000000000002L});
}
