// Generated from C:/Users/Usuario/OneDrive/Escritorio/Estudios/ProcesadoresDeLenguajes/Pascal_To_C/Pascal_To_C/src/PascalLike.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PascalLikeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, ID=42, CONSTINT=43, CONSTREAL=44, CONSTLIT=45, 
		WS=46, COMMENT=47;
	public static final int
		RULE_programa = 0, RULE_bloque = 1, RULE_declist = 2, RULE_declist_item_list = 3, 
		RULE_declist_item = 4, RULE_constdecl = 5, RULE_ctelist = 6, RULE_ctelist_tail = 7, 
		RULE_simovalue = 8, RULE_vardecl = 9, RULE_defvarlist = 10, RULE_defvarlist_tail = 11, 
		RULE_varlist = 12, RULE_varlist_tail = 13, RULE_tbas = 14, RULE_procdecl = 15, 
		RULE_funcdecl = 16, RULE_formal_paramlist_opt = 17, RULE_formal_paramlist = 18, 
		RULE_formal_param_tail = 19, RULE_formal_param = 20, RULE_sentlist = 21, 
		RULE_sent_tail = 22, RULE_sent_tail_aux = 23, RULE_sent = 24, RULE_sent_id_tail = 25, 
		RULE_asig = 26, RULE_proc_call = 27, RULE_subparamlist_opt = 28, RULE_subparamlist = 29, 
		RULE_explist_opt = 30, RULE_explist = 31, RULE_explist_tail = 32, RULE_exp = 33, 
		RULE_exp_tail = 34, RULE_term = 35, RULE_term_tail = 36, RULE_factor = 37, 
		RULE_exp_no_paren = 38, RULE_term_no_paren = 39, RULE_factor_no_paren = 40, 
		RULE_expcond = 41, RULE_expcond_tail = 42, RULE_and_term = 43, RULE_and_term_tail = 44, 
		RULE_not_term = 45, RULE_factorcond = 46, RULE_opcomp = 47, RULE_if_sent = 48, 
		RULE_else_block_opt = 49, RULE_else_block = 50, RULE_while_sent = 51, 
		RULE_repeat_sent = 52, RULE_for_sent = 53, RULE_inc = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "bloque", "declist", "declist_item_list", "declist_item", 
			"constdecl", "ctelist", "ctelist_tail", "simovalue", "vardecl", "defvarlist", 
			"defvarlist_tail", "varlist", "varlist_tail", "tbas", "procdecl", "funcdecl", 
			"formal_paramlist_opt", "formal_paramlist", "formal_param_tail", "formal_param", 
			"sentlist", "sent_tail", "sent_tail_aux", "sent", "sent_id_tail", "asig", 
			"proc_call", "subparamlist_opt", "subparamlist", "explist_opt", "explist", 
			"explist_tail", "exp", "exp_tail", "term", "term_tail", "factor", "exp_no_paren", 
			"term_no_paren", "factor_no_paren", "expcond", "expcond_tail", "and_term", 
			"and_term_tail", "not_term", "factorcond", "opcomp", "if_sent", "else_block_opt", 
			"else_block", "while_sent", "repeat_sent", "for_sent", "inc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'.'", "'unit'", "'begin'", "'end'", "'const'", 
			"'='", "'var'", "':'", "','", "'INTEGER'", "'REAL'", "'procedure'", "'function'", 
			"'('", "')'", "':='", "'+'", "'-'", "'*'", "'div'", "'mod'", "'or'", 
			"'and'", "'not'", "'<>'", "'<'", "'>'", "'<='", "'>='", "'if'", "'then'", 
			"'else'", "'while'", "'do'", "'repeat'", "'until'", "'for'", "'to'", 
			"'downto'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "CONSTINT", "CONSTREAL", "CONSTLIT", 
			"WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PascalLike.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private int tabLevel = 0;
	    private final String TAB = "\t"; 
	    private boolean programVars = true;
	    private String globalVars = "";
	    
	    private String funcName = null;
	    
	    private String getTab() {
	        return TAB.repeat(tabLevel);
	    }
	    
	    private void increaseTab() {
	        tabLevel++;
	    }
	    
	    private void decreaseTab() {
	    	if(tabLevel > 0) tabLevel--;
	    }

	public PascalLikeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public BloqueContext main;
		public TerminalNode ID() { return getToken(PascalLikeParser.ID, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public DeclistContext declist() {
			return getRuleContext(DeclistContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__0);
				setState(111);
				match(ID);
				setState(112);
				match(T__1);
				setState(113);
				((ProgramaContext)_localctx).main = bloque();
				setState(114);
				match(T__2);
				System.out.print("void main ( void ) {\n" + globalVars + "\t" + ((ProgramaContext)_localctx).main.main.replace("\n", "\n\t")); System.out.print("\n}");
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__3);
				setState(118);
				match(ID);
				setState(119);
				match(T__1);
				setState(120);
				declist();
				setState(121);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public String main;
		public SentlistContext s;
		public DeclistContext declist() {
			return getRuleContext(DeclistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitBloque(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			if(!programVars)increaseTab();
			setState(126);
			declist();
			setState(127);
			match(T__4);
			setState(128);
			((BloqueContext)_localctx).s = sentlist();
			setState(129);
			match(T__5);
			((BloqueContext)_localctx).main =  ((BloqueContext)_localctx).s.content.replace("write", "printf"); decreaseTab();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclistContext extends ParserRuleContext {
		public Declist_item_listContext declist_item_list() {
			return getRuleContext(Declist_item_listContext.class,0);
		}
		public DeclistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterDeclist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitDeclist(this);
		}
	}

	public final DeclistContext declist() throws RecognitionException {
		DeclistContext _localctx = new DeclistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			declist_item_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declist_item_listContext extends ParserRuleContext {
		public Declist_itemContext declist_item() {
			return getRuleContext(Declist_itemContext.class,0);
		}
		public Declist_item_listContext declist_item_list() {
			return getRuleContext(Declist_item_listContext.class,0);
		}
		public Declist_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declist_item_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterDeclist_item_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitDeclist_item_list(this);
		}
	}

	public final Declist_item_listContext declist_item_list() throws RecognitionException {
		Declist_item_listContext _localctx = new Declist_item_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declist_item_list);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__8:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				declist_item();
				System.out.print("\n");
				setState(136);
				declist_item_list();
				}
				break;
			case T__2:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declist_itemContext extends ParserRuleContext {
		public ConstdeclContext constdecl() {
			return getRuleContext(ConstdeclContext.class,0);
		}
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public ProcdeclContext procdecl() {
			return getRuleContext(ProcdeclContext.class,0);
		}
		public FuncdeclContext funcdecl() {
			return getRuleContext(FuncdeclContext.class,0);
		}
		public Declist_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declist_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterDeclist_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitDeclist_item(this);
		}
	}

	public final Declist_itemContext declist_item() throws RecognitionException {
		Declist_itemContext _localctx = new Declist_itemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declist_item);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				constdecl();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				vardecl();
				programVars = false;
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				programVars = false;
				setState(146);
				procdecl();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				programVars = false;
				setState(148);
				funcdecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstdeclContext extends ParserRuleContext {
		public CtelistContext ctelist;
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public ConstdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterConstdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitConstdecl(this);
		}
	}

	public final ConstdeclContext constdecl() throws RecognitionException {
		ConstdeclContext _localctx = new ConstdeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__6);
			setState(152);
			((ConstdeclContext)_localctx).ctelist = ctelist();
			System.out.print(((ConstdeclContext)_localctx).ctelist.result);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CtelistContext extends ParserRuleContext {
		public String result;
		public Token ID;
		public SimovalueContext simovalue;
		public Ctelist_tailContext ctelist_tail;
		public TerminalNode ID() { return getToken(PascalLikeParser.ID, 0); }
		public SimovalueContext simovalue() {
			return getRuleContext(SimovalueContext.class,0);
		}
		public Ctelist_tailContext ctelist_tail() {
			return getRuleContext(Ctelist_tailContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitCtelist(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ctelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((CtelistContext)_localctx).ID = match(ID);
			setState(156);
			match(T__7);
			setState(157);
			((CtelistContext)_localctx).simovalue = simovalue();
			setState(158);
			match(T__1);
			((CtelistContext)_localctx).result =  "#define " + (((CtelistContext)_localctx).ID!=null?((CtelistContext)_localctx).ID.getText():null) + " " + (((CtelistContext)_localctx).simovalue!=null?_input.getText(((CtelistContext)_localctx).simovalue.start,((CtelistContext)_localctx).simovalue.stop):null) + "\n";
			setState(160);
			((CtelistContext)_localctx).ctelist_tail = ctelist_tail();
			_localctx.result += ((CtelistContext)_localctx).ctelist_tail.result;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ctelist_tailContext extends ParserRuleContext {
		public String result;
		public CtelistContext ctelist;
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public Ctelist_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterCtelist_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitCtelist_tail(this);
		}
	}

	public final Ctelist_tailContext ctelist_tail() throws RecognitionException {
		Ctelist_tailContext _localctx = new Ctelist_tailContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ctelist_tail);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				((Ctelist_tailContext)_localctx).ctelist = ctelist();
				((Ctelist_tailContext)_localctx).result =  ((Ctelist_tailContext)_localctx).ctelist.result;
				}
				break;
			case T__2:
			case T__4:
			case T__6:
			case T__8:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				((Ctelist_tailContext)_localctx).result =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimovalueContext extends ParserRuleContext {
		public TerminalNode CONSTREAL() { return getToken(PascalLikeParser.CONSTREAL, 0); }
		public TerminalNode CONSTINT() { return getToken(PascalLikeParser.CONSTINT, 0); }
		public TerminalNode CONSTLIT() { return getToken(PascalLikeParser.CONSTLIT, 0); }
		public SimovalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simovalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterSimovalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitSimovalue(this);
		}
	}

	public final SimovalueContext simovalue() throws RecognitionException {
		SimovalueContext _localctx = new SimovalueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simovalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651155456L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VardeclContext extends ParserRuleContext {
		public DefvarlistContext defvarlist;
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vardecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__8);
			setState(172);
			((VardeclContext)_localctx).defvarlist = defvarlist();

			    	if(programVars){
			    		globalVars += ((VardeclContext)_localctx).defvarlist.result;
			    	}else{
			    		System.out.print(((VardeclContext)_localctx).defvarlist.result);
			    	}
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefvarlistContext extends ParserRuleContext {
		public String result;
		public VarlistContext varlist;
		public TbasContext tbas;
		public Defvarlist_tailContext defvarlist_tail;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Defvarlist_tailContext defvarlist_tail() {
			return getRuleContext(Defvarlist_tailContext.class,0);
		}
		public DefvarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvarlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterDefvarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitDefvarlist(this);
		}
	}

	public final DefvarlistContext defvarlist() throws RecognitionException {
		DefvarlistContext _localctx = new DefvarlistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defvarlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((DefvarlistContext)_localctx).varlist = varlist();
			setState(176);
			match(T__9);
			setState(177);
			((DefvarlistContext)_localctx).tbas = tbas();

			    	if(programVars) ((DefvarlistContext)_localctx).result =  "\t" + ((DefvarlistContext)_localctx).tbas.type + " " + ((DefvarlistContext)_localctx).varlist.result + ";\n";
			    	else ((DefvarlistContext)_localctx).result =  getTab() + ((DefvarlistContext)_localctx).tbas.type + " " + ((DefvarlistContext)_localctx).varlist.result + ";\n";
			    	
			    
			setState(179);
			match(T__1);
			setState(180);
			((DefvarlistContext)_localctx).defvarlist_tail = defvarlist_tail();
			_localctx.result += ((DefvarlistContext)_localctx).defvarlist_tail.result;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Defvarlist_tailContext extends ParserRuleContext {
		public String result;
		public DefvarlistContext defvarlist;
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
		public Defvarlist_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvarlist_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterDefvarlist_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitDefvarlist_tail(this);
		}
	}

	public final Defvarlist_tailContext defvarlist_tail() throws RecognitionException {
		Defvarlist_tailContext _localctx = new Defvarlist_tailContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defvarlist_tail);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((Defvarlist_tailContext)_localctx).defvarlist = defvarlist();
				((Defvarlist_tailContext)_localctx).result =  ((Defvarlist_tailContext)_localctx).defvarlist.result;
				}
				break;
			case T__2:
			case T__4:
			case T__6:
			case T__8:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				((Defvarlist_tailContext)_localctx).result =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistContext extends ParserRuleContext {
		public String result;
		public Token ID;
		public Varlist_tailContext varlist_tail;
		public TerminalNode ID() { return getToken(PascalLikeParser.ID, 0); }
		public Varlist_tailContext varlist_tail() {
			return getRuleContext(Varlist_tailContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitVarlist(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			((VarlistContext)_localctx).ID = match(ID);
			((VarlistContext)_localctx).result =  (((VarlistContext)_localctx).ID!=null?((VarlistContext)_localctx).ID.getText():null);
			setState(191);
			((VarlistContext)_localctx).varlist_tail = varlist_tail();
			_localctx.result += ((VarlistContext)_localctx).varlist_tail.result;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Varlist_tailContext extends ParserRuleContext {
		public String result;
		public VarlistContext varlist;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Varlist_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterVarlist_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitVarlist_tail(this);
		}
	}

	public final Varlist_tailContext varlist_tail() throws RecognitionException {
		Varlist_tailContext _localctx = new Varlist_tailContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varlist_tail);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(T__10);
				setState(195);
				((Varlist_tailContext)_localctx).varlist = varlist();
				((Varlist_tailContext)_localctx).result =  ", " + ((Varlist_tailContext)_localctx).varlist.result;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				((Varlist_tailContext)_localctx).result =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TbasContext extends ParserRuleContext {
		public String type;
		public TbasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterTbas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitTbas(this);
		}
	}

	public final TbasContext tbas() throws RecognitionException {
		TbasContext _localctx = new TbasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tbas);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(T__11);
				((TbasContext)_localctx).type =  "int";
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__12);
				((TbasContext)_localctx).type =  "float";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcdeclContext extends ParserRuleContext {
		public Token ID;
		public Formal_paramlist_optContext p;
		public BloqueContext bloque;
		public TerminalNode ID() { return getToken(PascalLikeParser.ID, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Formal_paramlist_optContext formal_paramlist_opt() {
			return getRuleContext(Formal_paramlist_optContext.class,0);
		}
		public ProcdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterProcdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitProcdecl(this);
		}
	}

	public final ProcdeclContext procdecl() throws RecognitionException {
		ProcdeclContext _localctx = new ProcdeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_procdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__13);
			setState(208);
			((ProcdeclContext)_localctx).ID = match(ID);
			funcName = (((ProcdeclContext)_localctx).ID!=null?((ProcdeclContext)_localctx).ID.getText():null);
			setState(210);
			((ProcdeclContext)_localctx).p = formal_paramlist_opt();
			System.out.print("void " + (((ProcdeclContext)_localctx).ID!=null?((ProcdeclContext)_localctx).ID.getText():null) + " ( " );
			    	if(((ProcdeclContext)_localctx).p.param != ""){System.out.print(((ProcdeclContext)_localctx).p.param);}
			    	else {System.out.print("void");}
			    	System.out.print(" ) { \n");
			setState(212);
			match(T__1);
			setState(213);
			((ProcdeclContext)_localctx).bloque = bloque();
			setState(214);
			match(T__1);

			    	System.out.print(((ProcdeclContext)_localctx).bloque.main);
			    	System.out.print("\n} \n");
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncdeclContext extends ParserRuleContext {
		public Token ID;
		public Formal_paramlist_optContext p;
		public TbasContext t;
		public BloqueContext bloque;
		public TerminalNode ID() { return getToken(PascalLikeParser.ID, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Formal_paramlist_optContext formal_paramlist_opt() {
			return getRuleContext(Formal_paramlist_optContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public FuncdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterFuncdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitFuncdecl(this);
		}
	}

	public final FuncdeclContext funcdecl() throws RecognitionException {
		FuncdeclContext _localctx = new FuncdeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__14);
			setState(218);
			((FuncdeclContext)_localctx).ID = match(ID);
			funcName = (((FuncdeclContext)_localctx).ID!=null?((FuncdeclContext)_localctx).ID.getText():null);
			setState(220);
			((FuncdeclContext)_localctx).p = formal_paramlist_opt();
			setState(221);
			match(T__9);
			setState(222);
			((FuncdeclContext)_localctx).t = tbas();
			System.out.print(((FuncdeclContext)_localctx).t.type+ " " + (((FuncdeclContext)_localctx).ID!=null?((FuncdeclContext)_localctx).ID.getText():null) + " ( " );
			    	if(((FuncdeclContext)_localctx).p.param != ""){System.out.print(((FuncdeclContext)_localctx).p.param);}
			    	else {System.out.print("void");}
			    	System.out.print(" ) { \n");
			setState(224);
			match(T__1);
			setState(225);
			((FuncdeclContext)_localctx).bloque = bloque();
			setState(226);
			match(T__1);

			    	System.out.print(((FuncdeclContext)_localctx).bloque.main);
			    	System.out.print("\n} \n");
			    	funcName = null;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_paramlist_optContext extends ParserRuleContext {
		public String param;
		public Formal_paramlistContext fp;
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Formal_paramlist_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterFormal_paramlist_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitFormal_paramlist_opt(this);
		}
	}

	public final Formal_paramlist_optContext formal_paramlist_opt() throws RecognitionException {
		Formal_paramlist_optContext _localctx = new Formal_paramlist_optContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_formal_paramlist_opt);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				((Formal_paramlist_optContext)_localctx).fp = formal_paramlist();
				((Formal_paramlist_optContext)_localctx).param =  ((Formal_paramlist_optContext)_localctx).fp.param;
				}
				break;
			case T__1:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				((Formal_paramlist_optContext)_localctx).param =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_paramlistContext extends ParserRuleContext {
		public String param;
		public Formal_paramContext fp;
		public Formal_param_tailContext tail;
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_param_tailContext formal_param_tail() {
			return getRuleContext(Formal_param_tailContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitFormal_paramlist(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formal_paramlist);
		 StringBuilder sb = new StringBuilder(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__15);
			setState(236);
			((Formal_paramlistContext)_localctx).fp = formal_param();
			 sb.append(((Formal_paramlistContext)_localctx).fp.param); 
			setState(238);
			((Formal_paramlistContext)_localctx).tail = formal_param_tail();
			if(((Formal_paramlistContext)_localctx).tail.param != ""){sb.append(", " + ((Formal_paramlistContext)_localctx).tail.param);}
			setState(240);
			match(T__16);
			((Formal_paramlistContext)_localctx).param =  sb.toString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_param_tailContext extends ParserRuleContext {
		public String param;
		public Formal_paramContext fp;
		public Formal_param_tailContext tail;
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_param_tailContext formal_param_tail() {
			return getRuleContext(Formal_param_tailContext.class,0);
		}
		public Formal_param_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_param_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterFormal_param_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitFormal_param_tail(this);
		}
	}

	public final Formal_param_tailContext formal_param_tail() throws RecognitionException {
		Formal_param_tailContext _localctx = new Formal_param_tailContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formal_param_tail);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(T__1);
				setState(244);
				((Formal_param_tailContext)_localctx).fp = formal_param();
				((Formal_param_tailContext)_localctx).param =  ((Formal_param_tailContext)_localctx).fp.param;
				setState(246);
				((Formal_param_tailContext)_localctx).tail = formal_param_tail();
					
				    	if (!((Formal_param_tailContext)_localctx).tail.param.isEmpty()) ((Formal_param_tailContext)_localctx).param =  ((Formal_param_tailContext)_localctx).fp.param + ", " + ((Formal_param_tailContext)_localctx).tail.param;
				    
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				((Formal_param_tailContext)_localctx).param =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_paramContext extends ParserRuleContext {
		public String param;
		public VarlistContext varlist;
		public TbasContext t;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Formal_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterFormal_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitFormal_param(this);
		}
	}

	public final Formal_paramContext formal_param() throws RecognitionException {
		Formal_paramContext _localctx = new Formal_paramContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_formal_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			((Formal_paramContext)_localctx).varlist = varlist();
			setState(253);
			match(T__9);
			setState(254);
			((Formal_paramContext)_localctx).t = tbas();
			((Formal_paramContext)_localctx).param =  ((Formal_paramContext)_localctx).t.type + " " + (((Formal_paramContext)_localctx).varlist!=null?_input.getText(((Formal_paramContext)_localctx).varlist.start,((Formal_paramContext)_localctx).varlist.stop):null) + " ";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentlistContext extends ParserRuleContext {
		public String content;
		public SentContext sent;
		public Sent_tailContext sent_tail;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sent_tailContext sent_tail() {
			return getRuleContext(Sent_tailContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitSentlist(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			((SentlistContext)_localctx).sent = sent();
			setState(258);
			((SentlistContext)_localctx).sent_tail = sent_tail();
			((SentlistContext)_localctx).content =  ((SentlistContext)_localctx).sent.result + ((SentlistContext)_localctx).sent_tail.result;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sent_tailContext extends ParserRuleContext {
		public String result;
		public Sent_tail_auxContext sent_tail_aux;
		public Sent_tail_auxContext sent_tail_aux() {
			return getRuleContext(Sent_tail_auxContext.class,0);
		}
		public Sent_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterSent_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitSent_tail(this);
		}
	}

	public final Sent_tailContext sent_tail() throws RecognitionException {
		Sent_tailContext _localctx = new Sent_tailContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sent_tail);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(T__1);
				setState(262);
				((Sent_tailContext)_localctx).sent_tail_aux = sent_tail_aux();
				((Sent_tailContext)_localctx).result =  ((Sent_tailContext)_localctx).sent_tail_aux.result;
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				((Sent_tailContext)_localctx).result =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sent_tail_auxContext extends ParserRuleContext {
		public String result;
		public SentContext sent;
		public Sent_tailContext sent_tail;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sent_tailContext sent_tail() {
			return getRuleContext(Sent_tailContext.class,0);
		}
		public Sent_tail_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_tail_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterSent_tail_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitSent_tail_aux(this);
		}
	}

	public final Sent_tail_auxContext sent_tail_aux() throws RecognitionException {
		Sent_tail_auxContext _localctx = new Sent_tail_auxContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sent_tail_aux);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__34:
			case T__36:
			case T__38:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				((Sent_tail_auxContext)_localctx).sent = sent();
				((Sent_tail_auxContext)_localctx).result =  ((Sent_tail_auxContext)_localctx).sent.result;
				setState(270);
				((Sent_tail_auxContext)_localctx).sent_tail = sent_tail();
				_localctx.result += ((Sent_tail_auxContext)_localctx).sent_tail.result;
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				((Sent_tail_auxContext)_localctx).result =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentContext extends ParserRuleContext {
		public String result;
		public Token ID;
		public Sent_id_tailContext tail;
		public If_sentContext if_sent;
		public While_sentContext while_sent;
		public Repeat_sentContext repeat_sent;
		public For_sentContext for_sent;
		public TerminalNode ID() { return getToken(PascalLikeParser.ID, 0); }
		public Sent_id_tailContext sent_id_tail() {
			return getRuleContext(Sent_id_tailContext.class,0);
		}
		public If_sentContext if_sent() {
			return getRuleContext(If_sentContext.class,0);
		}
		public While_sentContext while_sent() {
			return getRuleContext(While_sentContext.class,0);
		}
		public Repeat_sentContext repeat_sent() {
			return getRuleContext(Repeat_sentContext.class,0);
		}
		public For_sentContext for_sent() {
			return getRuleContext(For_sentContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitSent(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sent);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				((SentContext)_localctx).ID = match(ID);
				setState(277);
				((SentContext)_localctx).tail = sent_id_tail();

				      	if(funcName.equals((((SentContext)_localctx).ID!=null?((SentContext)_localctx).ID.getText():null))){
				      		((SentContext)_localctx).result =  getTab() + "return" + ((SentContext)_localctx).tail.code + ";\n";
				      	}else{
				        	((SentContext)_localctx).result =  getTab() + (((SentContext)_localctx).ID!=null?((SentContext)_localctx).ID.getText():null) + ((SentContext)_localctx).tail.code + ";\n";
				        }
				      
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				((SentContext)_localctx).if_sent = if_sent();

				        ((SentContext)_localctx).result =  getTab() + ((SentContext)_localctx).if_sent.result;
				      
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				((SentContext)_localctx).while_sent = while_sent();

				        ((SentContext)_localctx).result =  getTab() + ((SentContext)_localctx).while_sent.result;
				      
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				((SentContext)_localctx).repeat_sent = repeat_sent();

				        ((SentContext)_localctx).result =  getTab() + ((SentContext)_localctx).repeat_sent.result;
				      
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 5);
				{
				setState(289);
				((SentContext)_localctx).for_sent = for_sent();

				        ((SentContext)_localctx).result =  getTab() + ((SentContext)_localctx).for_sent.result;
				      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sent_id_tailContext extends ParserRuleContext {
		public String code;
		public AsigContext asig;
		public Proc_callContext proc_call;
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public Sent_id_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_id_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterSent_id_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitSent_id_tail(this);
		}
	}

	public final Sent_id_tailContext sent_id_tail() throws RecognitionException {
		Sent_id_tailContext _localctx = new Sent_id_tailContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sent_id_tail);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				((Sent_id_tailContext)_localctx).asig = asig();
				 ((Sent_id_tailContext)_localctx).code =  ((Sent_id_tailContext)_localctx).asig.result; 
				}
				break;
			case T__1:
			case T__5:
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				((Sent_id_tailContext)_localctx).proc_call = proc_call();
				 ((Sent_id_tailContext)_localctx).code =  ((Sent_id_tailContext)_localctx).proc_call.result; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsigContext extends ParserRuleContext {
		public String result;
		public ExpContext exp;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitAsig(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__17);
			setState(303);
			((AsigContext)_localctx).exp = exp();
			((AsigContext)_localctx).result =  " = " + ((AsigContext)_localctx).exp.result;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Proc_callContext extends ParserRuleContext {
		public String result;
		public Subparamlist_optContext subparamlist_opt;
		public Subparamlist_optContext subparamlist_opt() {
			return getRuleContext(Subparamlist_optContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitProc_call(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			((Proc_callContext)_localctx).subparamlist_opt = subparamlist_opt();
			((Proc_callContext)_localctx).result =  ((Proc_callContext)_localctx).subparamlist_opt.result;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subparamlist_optContext extends ParserRuleContext {
		public String result;
		public SubparamlistContext subparamlist;
		public SubparamlistContext subparamlist() {
			return getRuleContext(SubparamlistContext.class,0);
		}
		public Subparamlist_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subparamlist_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterSubparamlist_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitSubparamlist_opt(this);
		}
	}

	public final Subparamlist_optContext subparamlist_opt() throws RecognitionException {
		Subparamlist_optContext _localctx = new Subparamlist_optContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_subparamlist_opt);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				((Subparamlist_optContext)_localctx).subparamlist = subparamlist();
				((Subparamlist_optContext)_localctx).result =  ((Subparamlist_optContext)_localctx).subparamlist.result;
				}
				break;
			case T__1:
			case T__5:
			case T__7:
			case T__10:
			case T__16:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__32:
			case T__35:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				((Subparamlist_optContext)_localctx).result =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubparamlistContext extends ParserRuleContext {
		public String result;
		public Explist_optContext explist_opt;
		public Explist_optContext explist_opt() {
			return getRuleContext(Explist_optContext.class,0);
		}
		public SubparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterSubparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitSubparamlist(this);
		}
	}

	public final SubparamlistContext subparamlist() throws RecognitionException {
		SubparamlistContext _localctx = new SubparamlistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_subparamlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__15);
			setState(316);
			((SubparamlistContext)_localctx).explist_opt = explist_opt();
			setState(317);
			match(T__16);
			((SubparamlistContext)_localctx).result =  "( " + ((SubparamlistContext)_localctx).explist_opt.result + " )";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Explist_optContext extends ParserRuleContext {
		public String result;
		public ExplistContext explist;
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Explist_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterExplist_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitExplist_opt(this);
		}
	}

	public final Explist_optContext explist_opt() throws RecognitionException {
		Explist_optContext _localctx = new Explist_optContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_explist_opt);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case ID:
			case CONSTINT:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				((Explist_optContext)_localctx).explist = explist();
				((Explist_optContext)_localctx).result =  ((Explist_optContext)_localctx).explist.result;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				((Explist_optContext)_localctx).result =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplistContext extends ParserRuleContext {
		public String result;
		public ExpContext exp;
		public Explist_tailContext explist_tail;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Explist_tailContext explist_tail() {
			return getRuleContext(Explist_tailContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitExplist(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_explist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			((ExplistContext)_localctx).exp = exp();
			setState(327);
			((ExplistContext)_localctx).explist_tail = explist_tail();
			((ExplistContext)_localctx).result =  ((ExplistContext)_localctx).exp.result + ((ExplistContext)_localctx).explist_tail.result;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Explist_tailContext extends ParserRuleContext {
		public String result;
		public ExplistContext explist;
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Explist_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterExplist_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitExplist_tail(this);
		}
	}

	public final Explist_tailContext explist_tail() throws RecognitionException {
		Explist_tailContext _localctx = new Explist_tailContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_explist_tail);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(T__10);
				setState(331);
				((Explist_tailContext)_localctx).explist = explist();
				((Explist_tailContext)_localctx).result =  ", " + ((Explist_tailContext)_localctx).explist.result;
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				((Explist_tailContext)_localctx).result =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public String result;
		public TermContext term;
		public Exp_tailContext exp_tail;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Exp_tailContext exp_tail() {
			return getRuleContext(Exp_tailContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			((ExpContext)_localctx).term = term();
			setState(338);
			((ExpContext)_localctx).exp_tail = exp_tail();
			((ExpContext)_localctx).result =  ((ExpContext)_localctx).term.result + ((ExpContext)_localctx).exp_tail.result;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_tailContext extends ParserRuleContext {
		public String result;
		public TermContext term;
		public Exp_tailContext tail;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Exp_tailContext exp_tail() {
			return getRuleContext(Exp_tailContext.class,0);
		}
		public Exp_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterExp_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitExp_tail(this);
		}
	}

	public final Exp_tailContext exp_tail() throws RecognitionException {
		Exp_tailContext _localctx = new Exp_tailContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_exp_tail);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(T__18);
				setState(342);
				((Exp_tailContext)_localctx).term = term();
				setState(343);
				((Exp_tailContext)_localctx).tail = exp_tail();
				((Exp_tailContext)_localctx).result =  " + " + ((Exp_tailContext)_localctx).term.result + " " + ((Exp_tailContext)_localctx).tail.result;
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(T__19);
				setState(347);
				((Exp_tailContext)_localctx).term = term();
				setState(348);
				((Exp_tailContext)_localctx).tail = exp_tail();
				((Exp_tailContext)_localctx).result =  " - " + ((Exp_tailContext)_localctx).term.result + " " + ((Exp_tailContext)_localctx).tail.result;
				}
				break;
			case T__1:
			case T__5:
			case T__7:
			case T__10:
			case T__16:
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__32:
			case T__35:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 3);
				{
				((Exp_tailContext)_localctx).result =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public String result;
		public FactorContext factor;
		public Term_tailContext term_tail;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_tailContext term_tail() {
			return getRuleContext(Term_tailContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			((TermContext)_localctx).factor = factor();
			setState(355);
			((TermContext)_localctx).term_tail = term_tail();
			((TermContext)_localctx).result =  ((TermContext)_localctx).factor.result + ((TermContext)_localctx).term_tail.result;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Term_tailContext extends ParserRuleContext {
		public String result;
		public FactorContext factor;
		public Term_tailContext term_tail;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_tailContext term_tail() {
			return getRuleContext(Term_tailContext.class,0);
		}
		public Term_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterTerm_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitTerm_tail(this);
		}
	}

	public final Term_tailContext term_tail() throws RecognitionException {
		Term_tailContext _localctx = new Term_tailContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_term_tail);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(T__20);
				setState(359);
				((Term_tailContext)_localctx).factor = factor();
				setState(360);
				((Term_tailContext)_localctx).term_tail = term_tail();
				((Term_tailContext)_localctx).result =  " * " + ((Term_tailContext)_localctx).factor.result + " " + ((Term_tailContext)_localctx).term_tail.result;
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(T__21);
				setState(364);
				((Term_tailContext)_localctx).factor = factor();
				setState(365);
				((Term_tailContext)_localctx).term_tail = term_tail();
				((Term_tailContext)_localctx).result =  " / " + ((Term_tailContext)_localctx).factor.result + " " + ((Term_tailContext)_localctx).term_tail.result;
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				match(T__22);
				setState(369);
				((Term_tailContext)_localctx).factor = factor();
				setState(370);
				((Term_tailContext)_localctx).term_tail = term_tail();
				((Term_tailContext)_localctx).result =  " % " + ((Term_tailContext)_localctx).factor.result + " " + ((Term_tailContext)_localctx).term_tail.result;
				}
				break;
			case T__1:
			case T__5:
			case T__7:
			case T__10:
			case T__16:
			case T__18:
			case T__19:
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__32:
			case T__35:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 4);
				{
				((Term_tailContext)_localctx).result =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public String result;
		public SimovalueContext simovalue;
		public ExpContext exp;
		public Token ID;
		public Subparamlist_optContext subparamlist_opt;
		public SimovalueContext simovalue() {
			return getRuleContext(SimovalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(PascalLikeParser.ID, 0); }
		public Subparamlist_optContext subparamlist_opt() {
			return getRuleContext(Subparamlist_optContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_factor);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTINT:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				((FactorContext)_localctx).simovalue = simovalue();
				((FactorContext)_localctx).result =  (((FactorContext)_localctx).simovalue!=null?_input.getText(((FactorContext)_localctx).simovalue.start,((FactorContext)_localctx).simovalue.stop):null);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(T__15);
				setState(380);
				((FactorContext)_localctx).exp = exp();
				setState(381);
				match(T__16);
				((FactorContext)_localctx).result =  "( " + ((FactorContext)_localctx).exp.result + " )";
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				((FactorContext)_localctx).ID = match(ID);
				setState(385);
				((FactorContext)_localctx).subparamlist_opt = subparamlist_opt();
				((FactorContext)_localctx).result =  (((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getText():null) + ((FactorContext)_localctx).subparamlist_opt.result;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_no_parenContext extends ParserRuleContext {
		public String result;
		public Term_no_parenContext term_no_paren;
		public Exp_tailContext exp_tail;
		public Term_no_parenContext term_no_paren() {
			return getRuleContext(Term_no_parenContext.class,0);
		}
		public Exp_tailContext exp_tail() {
			return getRuleContext(Exp_tailContext.class,0);
		}
		public Exp_no_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_no_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterExp_no_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitExp_no_paren(this);
		}
	}

	public final Exp_no_parenContext exp_no_paren() throws RecognitionException {
		Exp_no_parenContext _localctx = new Exp_no_parenContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp_no_paren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			((Exp_no_parenContext)_localctx).term_no_paren = term_no_paren();
			setState(391);
			((Exp_no_parenContext)_localctx).exp_tail = exp_tail();
			((Exp_no_parenContext)_localctx).result =  ((Exp_no_parenContext)_localctx).term_no_paren.result + ((Exp_no_parenContext)_localctx).exp_tail.result;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Term_no_parenContext extends ParserRuleContext {
		public String result;
		public Factor_no_parenContext factor_no_paren;
		public Term_tailContext term_tail;
		public Factor_no_parenContext factor_no_paren() {
			return getRuleContext(Factor_no_parenContext.class,0);
		}
		public Term_tailContext term_tail() {
			return getRuleContext(Term_tailContext.class,0);
		}
		public Term_no_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_no_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterTerm_no_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitTerm_no_paren(this);
		}
	}

	public final Term_no_parenContext term_no_paren() throws RecognitionException {
		Term_no_parenContext _localctx = new Term_no_parenContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_term_no_paren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			((Term_no_parenContext)_localctx).factor_no_paren = factor_no_paren();
			setState(395);
			((Term_no_parenContext)_localctx).term_tail = term_tail();
			((Term_no_parenContext)_localctx).result =  ((Term_no_parenContext)_localctx).factor_no_paren.result + ((Term_no_parenContext)_localctx).term_tail.result;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Factor_no_parenContext extends ParserRuleContext {
		public String result;
		public SimovalueContext simovalue;
		public Token ID;
		public Subparamlist_optContext subparamlist_opt;
		public SimovalueContext simovalue() {
			return getRuleContext(SimovalueContext.class,0);
		}
		public TerminalNode ID() { return getToken(PascalLikeParser.ID, 0); }
		public Subparamlist_optContext subparamlist_opt() {
			return getRuleContext(Subparamlist_optContext.class,0);
		}
		public Factor_no_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_no_paren; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterFactor_no_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitFactor_no_paren(this);
		}
	}

	public final Factor_no_parenContext factor_no_paren() throws RecognitionException {
		Factor_no_parenContext _localctx = new Factor_no_parenContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_factor_no_paren);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTINT:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				((Factor_no_parenContext)_localctx).simovalue = simovalue();
				((Factor_no_parenContext)_localctx).result =  (((Factor_no_parenContext)_localctx).simovalue!=null?_input.getText(((Factor_no_parenContext)_localctx).simovalue.start,((Factor_no_parenContext)_localctx).simovalue.stop):null);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				((Factor_no_parenContext)_localctx).ID = match(ID);
				setState(402);
				((Factor_no_parenContext)_localctx).subparamlist_opt = subparamlist_opt();
				((Factor_no_parenContext)_localctx).result =  (((Factor_no_parenContext)_localctx).ID!=null?((Factor_no_parenContext)_localctx).ID.getText():null) + ((Factor_no_parenContext)_localctx).subparamlist_opt.result;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpcondContext extends ParserRuleContext {
		public String result;
		public And_termContext and_term;
		public Expcond_tailContext expcond_tail;
		public And_termContext and_term() {
			return getRuleContext(And_termContext.class,0);
		}
		public Expcond_tailContext expcond_tail() {
			return getRuleContext(Expcond_tailContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitExpcond(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			((ExpcondContext)_localctx).and_term = and_term();
			setState(408);
			((ExpcondContext)_localctx).expcond_tail = expcond_tail();
				((ExpcondContext)_localctx).result =  ((ExpcondContext)_localctx).and_term.result + ((ExpcondContext)_localctx).expcond_tail.result;    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expcond_tailContext extends ParserRuleContext {
		public String result;
		public And_termContext and_term;
		public Expcond_tailContext expcond_tail;
		public And_termContext and_term() {
			return getRuleContext(And_termContext.class,0);
		}
		public Expcond_tailContext expcond_tail() {
			return getRuleContext(Expcond_tailContext.class,0);
		}
		public Expcond_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterExpcond_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitExpcond_tail(this);
		}
	}

	public final Expcond_tailContext expcond_tail() throws RecognitionException {
		Expcond_tailContext _localctx = new Expcond_tailContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expcond_tail);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(T__23);
				setState(412);
				((Expcond_tailContext)_localctx).and_term = and_term();
				setState(413);
				((Expcond_tailContext)_localctx).expcond_tail = expcond_tail();
				((Expcond_tailContext)_localctx).result =  "||" + ((Expcond_tailContext)_localctx).and_term.result + ((Expcond_tailContext)_localctx).expcond_tail.result;
				}
				break;
			case T__1:
			case T__5:
			case T__16:
			case T__32:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				((Expcond_tailContext)_localctx).result =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class And_termContext extends ParserRuleContext {
		public String result;
		public Not_termContext not_term;
		public And_term_tailContext and_term_tail;
		public Not_termContext not_term() {
			return getRuleContext(Not_termContext.class,0);
		}
		public And_term_tailContext and_term_tail() {
			return getRuleContext(And_term_tailContext.class,0);
		}
		public And_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterAnd_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitAnd_term(this);
		}
	}

	public final And_termContext and_term() throws RecognitionException {
		And_termContext _localctx = new And_termContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_and_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			((And_termContext)_localctx).not_term = not_term();
			setState(420);
			((And_termContext)_localctx).and_term_tail = and_term_tail();
			((And_termContext)_localctx).result =  ((And_termContext)_localctx).not_term.result + ((And_termContext)_localctx).and_term_tail.result;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class And_term_tailContext extends ParserRuleContext {
		public String result;
		public Not_termContext not_term;
		public And_term_tailContext and_term_tail;
		public Not_termContext not_term() {
			return getRuleContext(Not_termContext.class,0);
		}
		public And_term_tailContext and_term_tail() {
			return getRuleContext(And_term_tailContext.class,0);
		}
		public And_term_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_term_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterAnd_term_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitAnd_term_tail(this);
		}
	}

	public final And_term_tailContext and_term_tail() throws RecognitionException {
		And_term_tailContext _localctx = new And_term_tailContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_and_term_tail);
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(T__24);
				setState(424);
				((And_term_tailContext)_localctx).not_term = not_term();
				setState(425);
				((And_term_tailContext)_localctx).and_term_tail = and_term_tail();
				((And_term_tailContext)_localctx).result =  "&&" + ((And_term_tailContext)_localctx).not_term.result + ((And_term_tailContext)_localctx).and_term_tail.result;
				}
				break;
			case T__1:
			case T__5:
			case T__16:
			case T__23:
			case T__32:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				((And_term_tailContext)_localctx).result =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Not_termContext extends ParserRuleContext {
		public String result;
		public Not_termContext not_term;
		public FactorcondContext factorcond;
		public Not_termContext not_term() {
			return getRuleContext(Not_termContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Not_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterNot_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitNot_term(this);
		}
	}

	public final Not_termContext not_term() throws RecognitionException {
		Not_termContext _localctx = new Not_termContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_not_term);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(T__25);
				setState(432);
				((Not_termContext)_localctx).not_term = not_term();
				((Not_termContext)_localctx).result =  "!" + ((Not_termContext)_localctx).not_term.result;
				}
				break;
			case T__15:
			case ID:
			case CONSTINT:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				((Not_termContext)_localctx).factorcond = factorcond();
				((Not_termContext)_localctx).result =  ((Not_termContext)_localctx).factorcond.result;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorcondContext extends ParserRuleContext {
		public String result;
		public ExpcondContext expcond;
		public Exp_no_parenContext e1;
		public OpcompContext opcomp;
		public ExpContext e2;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public Exp_no_parenContext exp_no_paren() {
			return getRuleContext(Exp_no_parenContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FactorcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitFactorcond(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_factorcond);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				match(T__15);
				setState(441);
				((FactorcondContext)_localctx).expcond = expcond();
				setState(442);
				match(T__16);
				 ((FactorcondContext)_localctx).result =  "(" + ((FactorcondContext)_localctx).expcond.result + ")"; 
				}
				break;
			case ID:
			case CONSTINT:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				((FactorcondContext)_localctx).e1 = exp_no_paren();
				setState(446);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(447);
				((FactorcondContext)_localctx).e2 = exp();
				 ((FactorcondContext)_localctx).result =  ((FactorcondContext)_localctx).e1.result + ((FactorcondContext)_localctx).opcomp.result + ((FactorcondContext)_localctx).e2.result; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpcompContext extends ParserRuleContext {
		public String result;
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitOpcomp(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_opcomp);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(T__7);
				((OpcompContext)_localctx).result =  "==";
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(T__26);
				((OpcompContext)_localctx).result =  "!=";
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				match(T__27);
				((OpcompContext)_localctx).result =  "<";
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(458);
				match(T__28);
				((OpcompContext)_localctx).result =  ">";
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(460);
				match(T__29);
				((OpcompContext)_localctx).result =  "<=";
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(462);
				match(T__30);
				((OpcompContext)_localctx).result =  ">=";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_sentContext extends ParserRuleContext {
		public String result;
		public ExpcondContext expcond;
		public BloqueContext bloque;
		public Else_block_optContext else_block_opt;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Else_block_optContext else_block_opt() {
			return getRuleContext(Else_block_optContext.class,0);
		}
		public If_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterIf_sent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitIf_sent(this);
		}
	}

	public final If_sentContext if_sent() throws RecognitionException {
		If_sentContext _localctx = new If_sentContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_if_sent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(T__31);
			setState(467);
			((If_sentContext)_localctx).expcond = expcond();

			    	((If_sentContext)_localctx).result =  "if( " + ((If_sentContext)_localctx).expcond.result + " ) {\n";
			    
			setState(469);
			match(T__32);
			setState(470);
			((If_sentContext)_localctx).bloque = bloque();

			    	_localctx.result += ((If_sentContext)_localctx).bloque.main + "\n" + getTab() + "}";
			    
			setState(472);
			((If_sentContext)_localctx).else_block_opt = else_block_opt();

			    	_localctx.result += ((If_sentContext)_localctx).else_block_opt.result;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_block_optContext extends ParserRuleContext {
		public String result;
		public Else_blockContext else_block;
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public Else_block_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterElse_block_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitElse_block_opt(this);
		}
	}

	public final Else_block_optContext else_block_opt() throws RecognitionException {
		Else_block_optContext _localctx = new Else_block_optContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_else_block_opt);
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				match(T__33);
				((Else_block_optContext)_localctx).result =  "else ";
				setState(477);
				((Else_block_optContext)_localctx).else_block = else_block();
				_localctx.result += ((Else_block_optContext)_localctx).else_block.result;
				}
				break;
			case T__1:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				((Else_block_optContext)_localctx).result =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_blockContext extends ParserRuleContext {
		public String result;
		public BloqueContext bloque;
		public If_sentContext if_sent;
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public If_sentContext if_sent() {
			return getRuleContext(If_sentContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitElse_block(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_else_block);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__6:
			case T__8:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				((Else_blockContext)_localctx).bloque = bloque();
				((Else_blockContext)_localctx).result =  "{\n" + ((Else_blockContext)_localctx).bloque.main + "\n" + getTab() + "}";
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				((Else_blockContext)_localctx).if_sent = if_sent();
				((Else_blockContext)_localctx).result =  ((Else_blockContext)_localctx).if_sent.result;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_sentContext extends ParserRuleContext {
		public String result;
		public ExpcondContext expcond;
		public BloqueContext bloque;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public While_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterWhile_sent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitWhile_sent(this);
		}
	}

	public final While_sentContext while_sent() throws RecognitionException {
		While_sentContext _localctx = new While_sentContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_while_sent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(T__34);
			setState(492);
			((While_sentContext)_localctx).expcond = expcond();
			setState(493);
			match(T__35);
			((While_sentContext)_localctx).result =  "while(" + ((While_sentContext)_localctx).expcond.result + ") {\n";
			setState(495);
			((While_sentContext)_localctx).bloque = bloque();
			_localctx.result += ((While_sentContext)_localctx).bloque.main + getTab() + "}\n";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Repeat_sentContext extends ParserRuleContext {
		public String result;
		public BloqueContext bloque;
		public ExpcondContext expcond;
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public Repeat_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterRepeat_sent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitRepeat_sent(this);
		}
	}

	public final Repeat_sentContext repeat_sent() throws RecognitionException {
		Repeat_sentContext _localctx = new Repeat_sentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_repeat_sent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(T__36);
			((Repeat_sentContext)_localctx).result =  "do {\n";
			setState(500);
			((Repeat_sentContext)_localctx).bloque = bloque();
			_localctx.result += ((Repeat_sentContext)_localctx).bloque.main + "\n" + getTab() + "}";
			setState(502);
			match(T__37);
			setState(503);
			((Repeat_sentContext)_localctx).expcond = expcond();
			_localctx.result += "until(" + ((Repeat_sentContext)_localctx).expcond.result + ");";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_sentContext extends ParserRuleContext {
		public String result;
		public Token ID;
		public ExpContext e1;
		public IncContext inc;
		public ExpContext e2;
		public BloqueContext bloque;
		public TerminalNode ID() { return getToken(PascalLikeParser.ID, 0); }
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public For_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterFor_sent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitFor_sent(this);
		}
	}

	public final For_sentContext for_sent() throws RecognitionException {
		For_sentContext _localctx = new For_sentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_for_sent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(T__38);
			setState(507);
			((For_sentContext)_localctx).ID = match(ID);
			setState(508);
			match(T__17);
			setState(509);
			((For_sentContext)_localctx).e1 = exp();
			setState(510);
			((For_sentContext)_localctx).inc = inc();
			setState(511);
			((For_sentContext)_localctx).e2 = exp();
			setState(512);
			match(T__35);

			    	((For_sentContext)_localctx).result =  "for(" + (((For_sentContext)_localctx).ID!=null?((For_sentContext)_localctx).ID.getText():null) + "=" + (((For_sentContext)_localctx).e1!=null?_input.getText(((For_sentContext)_localctx).e1.start,((For_sentContext)_localctx).e1.stop):null) + "; " ;
			    	if(((For_sentContext)_localctx).inc.result == "to") _localctx.result += (((For_sentContext)_localctx).ID!=null?((For_sentContext)_localctx).ID.getText():null) + "<=" + (((For_sentContext)_localctx).e2!=null?_input.getText(((For_sentContext)_localctx).e2.start,((For_sentContext)_localctx).e2.stop):null) + "; " + (((For_sentContext)_localctx).ID!=null?((For_sentContext)_localctx).ID.getText():null) + "++)";
			    	else if(((For_sentContext)_localctx).inc.result == "downto") _localctx.result += (((For_sentContext)_localctx).ID!=null?((For_sentContext)_localctx).ID.getText():null) + ">=" + (((For_sentContext)_localctx).e2!=null?_input.getText(((For_sentContext)_localctx).e2.start,((For_sentContext)_localctx).e2.stop):null) + "; " + (((For_sentContext)_localctx).ID!=null?((For_sentContext)_localctx).ID.getText():null) + "--)";
			    	_localctx.result += " {\n";
			    
			setState(514);
			((For_sentContext)_localctx).bloque = bloque();
			_localctx.result += ((For_sentContext)_localctx).bloque.main + "\n" + getTab() + "}";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncContext extends ParserRuleContext {
		public String result;
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalLikeListener ) ((PascalLikeListener)listener).exitInc(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_inc);
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				match(T__39);
				((IncContext)_localctx).result =  "to";
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(T__40);
				((IncContext)_localctx).result =  "downto";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u020c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000|\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008c"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0096\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a8\b\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00bc\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c8\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ce\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00ea\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00fb\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u010b\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0113\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0125\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u012d\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u013a\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0145\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0150\b "+
		"\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0161\b\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0177"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u0185\b%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u0196\b(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u01a2\b*\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0003,\u01ae\b,\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0003-\u01b7\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0003.\u01c3\b.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u01d1"+
		"\b/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00031\u01e2\b1\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00032\u01ea\b2\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00016\u00016\u00016\u00016\u00036\u020a\b6\u00016\u0000\u0000"+
		"7\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjl\u0000\u0001\u0001"+
		"\u0000+-\u01fd\u0000{\u0001\u0000\u0000\u0000\u0002}\u0001\u0000\u0000"+
		"\u0000\u0004\u0084\u0001\u0000\u0000\u0000\u0006\u008b\u0001\u0000\u0000"+
		"\u0000\b\u0095\u0001\u0000\u0000\u0000\n\u0097\u0001\u0000\u0000\u0000"+
		"\f\u009b\u0001\u0000\u0000\u0000\u000e\u00a7\u0001\u0000\u0000\u0000\u0010"+
		"\u00a9\u0001\u0000\u0000\u0000\u0012\u00ab\u0001\u0000\u0000\u0000\u0014"+
		"\u00af\u0001\u0000\u0000\u0000\u0016\u00bb\u0001\u0000\u0000\u0000\u0018"+
		"\u00bd\u0001\u0000\u0000\u0000\u001a\u00c7\u0001\u0000\u0000\u0000\u001c"+
		"\u00cd\u0001\u0000\u0000\u0000\u001e\u00cf\u0001\u0000\u0000\u0000 \u00d9"+
		"\u0001\u0000\u0000\u0000\"\u00e9\u0001\u0000\u0000\u0000$\u00eb\u0001"+
		"\u0000\u0000\u0000&\u00fa\u0001\u0000\u0000\u0000(\u00fc\u0001\u0000\u0000"+
		"\u0000*\u0101\u0001\u0000\u0000\u0000,\u010a\u0001\u0000\u0000\u0000."+
		"\u0112\u0001\u0000\u0000\u00000\u0124\u0001\u0000\u0000\u00002\u012c\u0001"+
		"\u0000\u0000\u00004\u012e\u0001\u0000\u0000\u00006\u0132\u0001\u0000\u0000"+
		"\u00008\u0139\u0001\u0000\u0000\u0000:\u013b\u0001\u0000\u0000\u0000<"+
		"\u0144\u0001\u0000\u0000\u0000>\u0146\u0001\u0000\u0000\u0000@\u014f\u0001"+
		"\u0000\u0000\u0000B\u0151\u0001\u0000\u0000\u0000D\u0160\u0001\u0000\u0000"+
		"\u0000F\u0162\u0001\u0000\u0000\u0000H\u0176\u0001\u0000\u0000\u0000J"+
		"\u0184\u0001\u0000\u0000\u0000L\u0186\u0001\u0000\u0000\u0000N\u018a\u0001"+
		"\u0000\u0000\u0000P\u0195\u0001\u0000\u0000\u0000R\u0197\u0001\u0000\u0000"+
		"\u0000T\u01a1\u0001\u0000\u0000\u0000V\u01a3\u0001\u0000\u0000\u0000X"+
		"\u01ad\u0001\u0000\u0000\u0000Z\u01b6\u0001\u0000\u0000\u0000\\\u01c2"+
		"\u0001\u0000\u0000\u0000^\u01d0\u0001\u0000\u0000\u0000`\u01d2\u0001\u0000"+
		"\u0000\u0000b\u01e1\u0001\u0000\u0000\u0000d\u01e9\u0001\u0000\u0000\u0000"+
		"f\u01eb\u0001\u0000\u0000\u0000h\u01f2\u0001\u0000\u0000\u0000j\u01fa"+
		"\u0001\u0000\u0000\u0000l\u0209\u0001\u0000\u0000\u0000no\u0005\u0001"+
		"\u0000\u0000op\u0005*\u0000\u0000pq\u0005\u0002\u0000\u0000qr\u0003\u0002"+
		"\u0001\u0000rs\u0005\u0003\u0000\u0000st\u0006\u0000\uffff\uffff\u0000"+
		"t|\u0001\u0000\u0000\u0000uv\u0005\u0004\u0000\u0000vw\u0005*\u0000\u0000"+
		"wx\u0005\u0002\u0000\u0000xy\u0003\u0004\u0002\u0000yz\u0005\u0003\u0000"+
		"\u0000z|\u0001\u0000\u0000\u0000{n\u0001\u0000\u0000\u0000{u\u0001\u0000"+
		"\u0000\u0000|\u0001\u0001\u0000\u0000\u0000}~\u0006\u0001\uffff\uffff"+
		"\u0000~\u007f\u0003\u0004\u0002\u0000\u007f\u0080\u0005\u0005\u0000\u0000"+
		"\u0080\u0081\u0003*\u0015\u0000\u0081\u0082\u0005\u0006\u0000\u0000\u0082"+
		"\u0083\u0006\u0001\uffff\uffff\u0000\u0083\u0003\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0003\u0006\u0003\u0000\u0085\u0005\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0003\b\u0004\u0000\u0087\u0088\u0006\u0003\uffff\uffff\u0000"+
		"\u0088\u0089\u0003\u0006\u0003\u0000\u0089\u008c\u0001\u0000\u0000\u0000"+
		"\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0086\u0001\u0000\u0000\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u0007\u0001\u0000\u0000\u0000"+
		"\u008d\u0096\u0003\n\u0005\u0000\u008e\u008f\u0003\u0012\t\u0000\u008f"+
		"\u0090\u0006\u0004\uffff\uffff\u0000\u0090\u0096\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0006\u0004\uffff\uffff\u0000\u0092\u0096\u0003\u001e\u000f"+
		"\u0000\u0093\u0094\u0006\u0004\uffff\uffff\u0000\u0094\u0096\u0003 \u0010"+
		"\u0000\u0095\u008d\u0001\u0000\u0000\u0000\u0095\u008e\u0001\u0000\u0000"+
		"\u0000\u0095\u0091\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0096\t\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0007\u0000\u0000"+
		"\u0098\u0099\u0003\f\u0006\u0000\u0099\u009a\u0006\u0005\uffff\uffff\u0000"+
		"\u009a\u000b\u0001\u0000\u0000\u0000\u009b\u009c\u0005*\u0000\u0000\u009c"+
		"\u009d\u0005\b\u0000\u0000\u009d\u009e\u0003\u0010\b\u0000\u009e\u009f"+
		"\u0005\u0002\u0000\u0000\u009f\u00a0\u0006\u0006\uffff\uffff\u0000\u00a0"+
		"\u00a1\u0003\u000e\u0007\u0000\u00a1\u00a2\u0006\u0006\uffff\uffff\u0000"+
		"\u00a2\r\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003\f\u0006\u0000\u00a4"+
		"\u00a5\u0006\u0007\uffff\uffff\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a8\u0006\u0007\uffff\uffff\u0000\u00a7\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u000f\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0007\u0000\u0000\u0000\u00aa\u0011\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005\t\u0000\u0000\u00ac\u00ad\u0003\u0014\n\u0000"+
		"\u00ad\u00ae\u0006\t\uffff\uffff\u0000\u00ae\u0013\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0003\u0018\f\u0000\u00b0\u00b1\u0005\n\u0000\u0000\u00b1"+
		"\u00b2\u0003\u001c\u000e\u0000\u00b2\u00b3\u0006\n\uffff\uffff\u0000\u00b3"+
		"\u00b4\u0005\u0002\u0000\u0000\u00b4\u00b5\u0003\u0016\u000b\u0000\u00b5"+
		"\u00b6\u0006\n\uffff\uffff\u0000\u00b6\u0015\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0003\u0014\n\u0000\u00b8\u00b9\u0006\u000b\uffff\uffff\u0000\u00b9"+
		"\u00bc\u0001\u0000\u0000\u0000\u00ba\u00bc\u0006\u000b\uffff\uffff\u0000"+
		"\u00bb\u00b7\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bc\u0017\u0001\u0000\u0000\u0000\u00bd\u00be\u0005*\u0000\u0000\u00be"+
		"\u00bf\u0006\f\uffff\uffff\u0000\u00bf\u00c0\u0003\u001a\r\u0000\u00c0"+
		"\u00c1\u0006\f\uffff\uffff\u0000\u00c1\u0019\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005\u000b\u0000\u0000\u00c3\u00c4\u0003\u0018\f\u0000\u00c4\u00c5"+
		"\u0006\r\uffff\uffff\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c8"+
		"\u0006\r\uffff\uffff\u0000\u00c7\u00c2\u0001\u0000\u0000\u0000\u00c7\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u001b\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0005\f\u0000\u0000\u00ca\u00ce\u0006\u000e\uffff\uffff\u0000\u00cb\u00cc"+
		"\u0005\r\u0000\u0000\u00cc\u00ce\u0006\u000e\uffff\uffff\u0000\u00cd\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u001d"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u000e\u0000\u0000\u00d0\u00d1"+
		"\u0005*\u0000\u0000\u00d1\u00d2\u0006\u000f\uffff\uffff\u0000\u00d2\u00d3"+
		"\u0003\"\u0011\u0000\u00d3\u00d4\u0006\u000f\uffff\uffff\u0000\u00d4\u00d5"+
		"\u0005\u0002\u0000\u0000\u00d5\u00d6\u0003\u0002\u0001\u0000\u00d6\u00d7"+
		"\u0005\u0002\u0000\u0000\u00d7\u00d8\u0006\u000f\uffff\uffff\u0000\u00d8"+
		"\u001f\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u000f\u0000\u0000\u00da"+
		"\u00db\u0005*\u0000\u0000\u00db\u00dc\u0006\u0010\uffff\uffff\u0000\u00dc"+
		"\u00dd\u0003\"\u0011\u0000\u00dd\u00de\u0005\n\u0000\u0000\u00de\u00df"+
		"\u0003\u001c\u000e\u0000\u00df\u00e0\u0006\u0010\uffff\uffff\u0000\u00e0"+
		"\u00e1\u0005\u0002\u0000\u0000\u00e1\u00e2\u0003\u0002\u0001\u0000\u00e2"+
		"\u00e3\u0005\u0002\u0000\u0000\u00e3\u00e4\u0006\u0010\uffff\uffff\u0000"+
		"\u00e4!\u0001\u0000\u0000\u0000\u00e5\u00e6\u0003$\u0012\u0000\u00e6\u00e7"+
		"\u0006\u0011\uffff\uffff\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8"+
		"\u00ea\u0006\u0011\uffff\uffff\u0000\u00e9\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea#\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0005\u0010\u0000\u0000\u00ec\u00ed\u0003(\u0014\u0000\u00ed\u00ee"+
		"\u0006\u0012\uffff\uffff\u0000\u00ee\u00ef\u0003&\u0013\u0000\u00ef\u00f0"+
		"\u0006\u0012\uffff\uffff\u0000\u00f0\u00f1\u0005\u0011\u0000\u0000\u00f1"+
		"\u00f2\u0006\u0012\uffff\uffff\u0000\u00f2%\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005\u0002\u0000\u0000\u00f4\u00f5\u0003(\u0014\u0000\u00f5\u00f6"+
		"\u0006\u0013\uffff\uffff\u0000\u00f6\u00f7\u0003&\u0013\u0000\u00f7\u00f8"+
		"\u0006\u0013\uffff\uffff\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fb\u0006\u0013\uffff\uffff\u0000\u00fa\u00f3\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\'\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0003\u0018\f\u0000\u00fd\u00fe\u0005\n\u0000\u0000\u00fe\u00ff"+
		"\u0003\u001c\u000e\u0000\u00ff\u0100\u0006\u0014\uffff\uffff\u0000\u0100"+
		")\u0001\u0000\u0000\u0000\u0101\u0102\u00030\u0018\u0000\u0102\u0103\u0003"+
		",\u0016\u0000\u0103\u0104\u0006\u0015\uffff\uffff\u0000\u0104+\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0005\u0002\u0000\u0000\u0106\u0107\u0003.\u0017"+
		"\u0000\u0107\u0108\u0006\u0016\uffff\uffff\u0000\u0108\u010b\u0001\u0000"+
		"\u0000\u0000\u0109\u010b\u0006\u0016\uffff\uffff\u0000\u010a\u0105\u0001"+
		"\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b-\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u00030\u0018\u0000\u010d\u010e\u0006\u0017\uffff"+
		"\uffff\u0000\u010e\u010f\u0003,\u0016\u0000\u010f\u0110\u0006\u0017\uffff"+
		"\uffff\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u0113\u0006\u0017"+
		"\uffff\uffff\u0000\u0112\u010c\u0001\u0000\u0000\u0000\u0112\u0111\u0001"+
		"\u0000\u0000\u0000\u0113/\u0001\u0000\u0000\u0000\u0114\u0115\u0005*\u0000"+
		"\u0000\u0115\u0116\u00032\u0019\u0000\u0116\u0117\u0006\u0018\uffff\uffff"+
		"\u0000\u0117\u0125\u0001\u0000\u0000\u0000\u0118\u0119\u0003`0\u0000\u0119"+
		"\u011a\u0006\u0018\uffff\uffff\u0000\u011a\u0125\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0003f3\u0000\u011c\u011d\u0006\u0018\uffff\uffff\u0000\u011d"+
		"\u0125\u0001\u0000\u0000\u0000\u011e\u011f\u0003h4\u0000\u011f\u0120\u0006"+
		"\u0018\uffff\uffff\u0000\u0120\u0125\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0003j5\u0000\u0122\u0123\u0006\u0018\uffff\uffff\u0000\u0123\u0125\u0001"+
		"\u0000\u0000\u0000\u0124\u0114\u0001\u0000\u0000\u0000\u0124\u0118\u0001"+
		"\u0000\u0000\u0000\u0124\u011b\u0001\u0000\u0000\u0000\u0124\u011e\u0001"+
		"\u0000\u0000\u0000\u0124\u0121\u0001\u0000\u0000\u0000\u01251\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u00034\u001a\u0000\u0127\u0128\u0006\u0019\uffff"+
		"\uffff\u0000\u0128\u012d\u0001\u0000\u0000\u0000\u0129\u012a\u00036\u001b"+
		"\u0000\u012a\u012b\u0006\u0019\uffff\uffff\u0000\u012b\u012d\u0001\u0000"+
		"\u0000\u0000\u012c\u0126\u0001\u0000\u0000\u0000\u012c\u0129\u0001\u0000"+
		"\u0000\u0000\u012d3\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u0012\u0000"+
		"\u0000\u012f\u0130\u0003B!\u0000\u0130\u0131\u0006\u001a\uffff\uffff\u0000"+
		"\u01315\u0001\u0000\u0000\u0000\u0132\u0133\u00038\u001c\u0000\u0133\u0134"+
		"\u0006\u001b\uffff\uffff\u0000\u01347\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0003:\u001d\u0000\u0136\u0137\u0006\u001c\uffff\uffff\u0000\u0137\u013a"+
		"\u0001\u0000\u0000\u0000\u0138\u013a\u0006\u001c\uffff\uffff\u0000\u0139"+
		"\u0135\u0001\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a"+
		"9\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u0010\u0000\u0000\u013c\u013d"+
		"\u0003<\u001e\u0000\u013d\u013e\u0005\u0011\u0000\u0000\u013e\u013f\u0006"+
		"\u001d\uffff\uffff\u0000\u013f;\u0001\u0000\u0000\u0000\u0140\u0141\u0003"+
		">\u001f\u0000\u0141\u0142\u0006\u001e\uffff\uffff\u0000\u0142\u0145\u0001"+
		"\u0000\u0000\u0000\u0143\u0145\u0006\u001e\uffff\uffff\u0000\u0144\u0140"+
		"\u0001\u0000\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145=\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0003B!\u0000\u0147\u0148\u0003@ \u0000"+
		"\u0148\u0149\u0006\u001f\uffff\uffff\u0000\u0149?\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0005\u000b\u0000\u0000\u014b\u014c\u0003>\u001f\u0000\u014c"+
		"\u014d\u0006 \uffff\uffff\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e"+
		"\u0150\u0006 \uffff\uffff\u0000\u014f\u014a\u0001\u0000\u0000\u0000\u014f"+
		"\u014e\u0001\u0000\u0000\u0000\u0150A\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0003F#\u0000\u0152\u0153\u0003D\"\u0000\u0153\u0154\u0006!\uffff\uffff"+
		"\u0000\u0154C\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u0013\u0000\u0000"+
		"\u0156\u0157\u0003F#\u0000\u0157\u0158\u0003D\"\u0000\u0158\u0159\u0006"+
		"\"\uffff\uffff\u0000\u0159\u0161\u0001\u0000\u0000\u0000\u015a\u015b\u0005"+
		"\u0014\u0000\u0000\u015b\u015c\u0003F#\u0000\u015c\u015d\u0003D\"\u0000"+
		"\u015d\u015e\u0006\"\uffff\uffff\u0000\u015e\u0161\u0001\u0000\u0000\u0000"+
		"\u015f\u0161\u0006\"\uffff\uffff\u0000\u0160\u0155\u0001\u0000\u0000\u0000"+
		"\u0160\u015a\u0001\u0000\u0000\u0000\u0160\u015f\u0001\u0000\u0000\u0000"+
		"\u0161E\u0001\u0000\u0000\u0000\u0162\u0163\u0003J%\u0000\u0163\u0164"+
		"\u0003H$\u0000\u0164\u0165\u0006#\uffff\uffff\u0000\u0165G\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u0005\u0015\u0000\u0000\u0167\u0168\u0003J%\u0000"+
		"\u0168\u0169\u0003H$\u0000\u0169\u016a\u0006$\uffff\uffff\u0000\u016a"+
		"\u0177\u0001\u0000\u0000\u0000\u016b\u016c\u0005\u0016\u0000\u0000\u016c"+
		"\u016d\u0003J%\u0000\u016d\u016e\u0003H$\u0000\u016e\u016f\u0006$\uffff"+
		"\uffff\u0000\u016f\u0177\u0001\u0000\u0000\u0000\u0170\u0171\u0005\u0017"+
		"\u0000\u0000\u0171\u0172\u0003J%\u0000\u0172\u0173\u0003H$\u0000\u0173"+
		"\u0174\u0006$\uffff\uffff\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175"+
		"\u0177\u0006$\uffff\uffff\u0000\u0176\u0166\u0001\u0000\u0000\u0000\u0176"+
		"\u016b\u0001\u0000\u0000\u0000\u0176\u0170\u0001\u0000\u0000\u0000\u0176"+
		"\u0175\u0001\u0000\u0000\u0000\u0177I\u0001\u0000\u0000\u0000\u0178\u0179"+
		"\u0003\u0010\b\u0000\u0179\u017a\u0006%\uffff\uffff\u0000\u017a\u0185"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u0010\u0000\u0000\u017c\u017d"+
		"\u0003B!\u0000\u017d\u017e\u0005\u0011\u0000\u0000\u017e\u017f\u0006%"+
		"\uffff\uffff\u0000\u017f\u0185\u0001\u0000\u0000\u0000\u0180\u0181\u0005"+
		"*\u0000\u0000\u0181\u0182\u00038\u001c\u0000\u0182\u0183\u0006%\uffff"+
		"\uffff\u0000\u0183\u0185\u0001\u0000\u0000\u0000\u0184\u0178\u0001\u0000"+
		"\u0000\u0000\u0184\u017b\u0001\u0000\u0000\u0000\u0184\u0180\u0001\u0000"+
		"\u0000\u0000\u0185K\u0001\u0000\u0000\u0000\u0186\u0187\u0003N\'\u0000"+
		"\u0187\u0188\u0003D\"\u0000\u0188\u0189\u0006&\uffff\uffff\u0000\u0189"+
		"M\u0001\u0000\u0000\u0000\u018a\u018b\u0003P(\u0000\u018b\u018c\u0003"+
		"H$\u0000\u018c\u018d\u0006\'\uffff\uffff\u0000\u018dO\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0003\u0010\b\u0000\u018f\u0190\u0006(\uffff\uffff"+
		"\u0000\u0190\u0196\u0001\u0000\u0000\u0000\u0191\u0192\u0005*\u0000\u0000"+
		"\u0192\u0193\u00038\u001c\u0000\u0193\u0194\u0006(\uffff\uffff\u0000\u0194"+
		"\u0196\u0001\u0000\u0000\u0000\u0195\u018e\u0001\u0000\u0000\u0000\u0195"+
		"\u0191\u0001\u0000\u0000\u0000\u0196Q\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0003V+\u0000\u0198\u0199\u0003T*\u0000\u0199\u019a\u0006)\uffff\uffff"+
		"\u0000\u019aS\u0001\u0000\u0000\u0000\u019b\u019c\u0005\u0018\u0000\u0000"+
		"\u019c\u019d\u0003V+\u0000\u019d\u019e\u0003T*\u0000\u019e\u019f\u0006"+
		"*\uffff\uffff\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0\u01a2\u0006"+
		"*\uffff\uffff\u0000\u01a1\u019b\u0001\u0000\u0000\u0000\u01a1\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a2U\u0001\u0000\u0000\u0000\u01a3\u01a4\u0003Z-"+
		"\u0000\u01a4\u01a5\u0003X,\u0000\u01a5\u01a6\u0006+\uffff\uffff\u0000"+
		"\u01a6W\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005\u0019\u0000\u0000\u01a8"+
		"\u01a9\u0003Z-\u0000\u01a9\u01aa\u0003X,\u0000\u01aa\u01ab\u0006,\uffff"+
		"\uffff\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac\u01ae\u0006,\uffff"+
		"\uffff\u0000\u01ad\u01a7\u0001\u0000\u0000\u0000\u01ad\u01ac\u0001\u0000"+
		"\u0000\u0000\u01aeY\u0001\u0000\u0000\u0000\u01af\u01b0\u0005\u001a\u0000"+
		"\u0000\u01b0\u01b1\u0003Z-\u0000\u01b1\u01b2\u0006-\uffff\uffff\u0000"+
		"\u01b2\u01b7\u0001\u0000\u0000\u0000\u01b3\u01b4\u0003\\.\u0000\u01b4"+
		"\u01b5\u0006-\uffff\uffff\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6"+
		"\u01af\u0001\u0000\u0000\u0000\u01b6\u01b3\u0001\u0000\u0000\u0000\u01b7"+
		"[\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005\u0010\u0000\u0000\u01b9\u01ba"+
		"\u0003R)\u0000\u01ba\u01bb\u0005\u0011\u0000\u0000\u01bb\u01bc\u0006."+
		"\uffff\uffff\u0000\u01bc\u01c3\u0001\u0000\u0000\u0000\u01bd\u01be\u0003"+
		"L&\u0000\u01be\u01bf\u0003^/\u0000\u01bf\u01c0\u0003B!\u0000\u01c0\u01c1"+
		"\u0006.\uffff\uffff\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2\u01b8"+
		"\u0001\u0000\u0000\u0000\u01c2\u01bd\u0001\u0000\u0000\u0000\u01c3]\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c5\u0005\b\u0000\u0000\u01c5\u01d1\u0006/"+
		"\uffff\uffff\u0000\u01c6\u01c7\u0005\u001b\u0000\u0000\u01c7\u01d1\u0006"+
		"/\uffff\uffff\u0000\u01c8\u01c9\u0005\u001c\u0000\u0000\u01c9\u01d1\u0006"+
		"/\uffff\uffff\u0000\u01ca\u01cb\u0005\u001d\u0000\u0000\u01cb\u01d1\u0006"+
		"/\uffff\uffff\u0000\u01cc\u01cd\u0005\u001e\u0000\u0000\u01cd\u01d1\u0006"+
		"/\uffff\uffff\u0000\u01ce\u01cf\u0005\u001f\u0000\u0000\u01cf\u01d1\u0006"+
		"/\uffff\uffff\u0000\u01d0\u01c4\u0001\u0000\u0000\u0000\u01d0\u01c6\u0001"+
		"\u0000\u0000\u0000\u01d0\u01c8\u0001\u0000\u0000\u0000\u01d0\u01ca\u0001"+
		"\u0000\u0000\u0000\u01d0\u01cc\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001"+
		"\u0000\u0000\u0000\u01d1_\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005 \u0000"+
		"\u0000\u01d3\u01d4\u0003R)\u0000\u01d4\u01d5\u00060\uffff\uffff\u0000"+
		"\u01d5\u01d6\u0005!\u0000\u0000\u01d6\u01d7\u0003\u0002\u0001\u0000\u01d7"+
		"\u01d8\u00060\uffff\uffff\u0000\u01d8\u01d9\u0003b1\u0000\u01d9\u01da"+
		"\u00060\uffff\uffff\u0000\u01daa\u0001\u0000\u0000\u0000\u01db\u01dc\u0005"+
		"\"\u0000\u0000\u01dc\u01dd\u00061\uffff\uffff\u0000\u01dd\u01de\u0003"+
		"d2\u0000\u01de\u01df\u00061\uffff\uffff\u0000\u01df\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e2\u00061\uffff\uffff\u0000\u01e1\u01db\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2c\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e4\u0003\u0002\u0001\u0000\u01e4\u01e5\u00062\uffff\uffff"+
		"\u0000\u01e5\u01ea\u0001\u0000\u0000\u0000\u01e6\u01e7\u0003`0\u0000\u01e7"+
		"\u01e8\u00062\uffff\uffff\u0000\u01e8\u01ea\u0001\u0000\u0000\u0000\u01e9"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e9\u01e6\u0001\u0000\u0000\u0000\u01ea"+
		"e\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005#\u0000\u0000\u01ec\u01ed\u0003"+
		"R)\u0000\u01ed\u01ee\u0005$\u0000\u0000\u01ee\u01ef\u00063\uffff\uffff"+
		"\u0000\u01ef\u01f0\u0003\u0002\u0001\u0000\u01f0\u01f1\u00063\uffff\uffff"+
		"\u0000\u01f1g\u0001\u0000\u0000\u0000\u01f2\u01f3\u0005%\u0000\u0000\u01f3"+
		"\u01f4\u00064\uffff\uffff\u0000\u01f4\u01f5\u0003\u0002\u0001\u0000\u01f5"+
		"\u01f6\u00064\uffff\uffff\u0000\u01f6\u01f7\u0005&\u0000\u0000\u01f7\u01f8"+
		"\u0003R)\u0000\u01f8\u01f9\u00064\uffff\uffff\u0000\u01f9i\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u0005\'\u0000\u0000\u01fb\u01fc\u0005*\u0000"+
		"\u0000\u01fc\u01fd\u0005\u0012\u0000\u0000\u01fd\u01fe\u0003B!\u0000\u01fe"+
		"\u01ff\u0003l6\u0000\u01ff\u0200\u0003B!\u0000\u0200\u0201\u0005$\u0000"+
		"\u0000\u0201\u0202\u00065\uffff\uffff\u0000\u0202\u0203\u0003\u0002\u0001"+
		"\u0000\u0203\u0204\u00065\uffff\uffff\u0000\u0204k\u0001\u0000\u0000\u0000"+
		"\u0205\u0206\u0005(\u0000\u0000\u0206\u020a\u00066\uffff\uffff\u0000\u0207"+
		"\u0208\u0005)\u0000\u0000\u0208\u020a\u00066\uffff\uffff\u0000\u0209\u0205"+
		"\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u020am\u0001"+
		"\u0000\u0000\u0000\u001c{\u008b\u0095\u00a7\u00bb\u00c7\u00cd\u00e9\u00fa"+
		"\u010a\u0112\u0124\u012c\u0139\u0144\u014f\u0160\u0176\u0184\u0195\u01a1"+
		"\u01ad\u01b6\u01c2\u01d0\u01e1\u01e9\u0209";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}