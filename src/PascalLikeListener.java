// Generated from C:/Users/Usuario/OneDrive/Escritorio/Estudios/ProcesadoresDeLenguajes/Pascal_To_C/Pascal_To_C/src/PascalLike.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalLikeParser}.
 */
public interface PascalLikeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(PascalLikeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(PascalLikeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(PascalLikeParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(PascalLikeParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#declist}.
	 * @param ctx the parse tree
	 */
	void enterDeclist(PascalLikeParser.DeclistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#declist}.
	 * @param ctx the parse tree
	 */
	void exitDeclist(PascalLikeParser.DeclistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#declist_item_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclist_item_list(PascalLikeParser.Declist_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#declist_item_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclist_item_list(PascalLikeParser.Declist_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#declist_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclist_item(PascalLikeParser.Declist_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#declist_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclist_item(PascalLikeParser.Declist_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#constdecl}.
	 * @param ctx the parse tree
	 */
	void enterConstdecl(PascalLikeParser.ConstdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#constdecl}.
	 * @param ctx the parse tree
	 */
	void exitConstdecl(PascalLikeParser.ConstdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(PascalLikeParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(PascalLikeParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#ctelist_tail}.
	 * @param ctx the parse tree
	 */
	void enterCtelist_tail(PascalLikeParser.Ctelist_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#ctelist_tail}.
	 * @param ctx the parse tree
	 */
	void exitCtelist_tail(PascalLikeParser.Ctelist_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#simovalue}.
	 * @param ctx the parse tree
	 */
	void enterSimovalue(PascalLikeParser.SimovalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#simovalue}.
	 * @param ctx the parse tree
	 */
	void exitSimovalue(PascalLikeParser.SimovalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(PascalLikeParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(PascalLikeParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlist(PascalLikeParser.DefvarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlist(PascalLikeParser.DefvarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#defvarlist_tail}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlist_tail(PascalLikeParser.Defvarlist_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#defvarlist_tail}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlist_tail(PascalLikeParser.Defvarlist_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(PascalLikeParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(PascalLikeParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#varlist_tail}.
	 * @param ctx the parse tree
	 */
	void enterVarlist_tail(PascalLikeParser.Varlist_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#varlist_tail}.
	 * @param ctx the parse tree
	 */
	void exitVarlist_tail(PascalLikeParser.Varlist_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#tbas}.
	 * @param ctx the parse tree
	 */
	void enterTbas(PascalLikeParser.TbasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#tbas}.
	 * @param ctx the parse tree
	 */
	void exitTbas(PascalLikeParser.TbasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#procdecl}.
	 * @param ctx the parse tree
	 */
	void enterProcdecl(PascalLikeParser.ProcdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#procdecl}.
	 * @param ctx the parse tree
	 */
	void exitProcdecl(PascalLikeParser.ProcdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#funcdecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncdecl(PascalLikeParser.FuncdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#funcdecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncdecl(PascalLikeParser.FuncdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#formal_paramlist_opt}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist_opt(PascalLikeParser.Formal_paramlist_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#formal_paramlist_opt}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist_opt(PascalLikeParser.Formal_paramlist_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist(PascalLikeParser.Formal_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist(PascalLikeParser.Formal_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#formal_param_tail}.
	 * @param ctx the parse tree
	 */
	void enterFormal_param_tail(PascalLikeParser.Formal_param_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#formal_param_tail}.
	 * @param ctx the parse tree
	 */
	void exitFormal_param_tail(PascalLikeParser.Formal_param_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void enterFormal_param(PascalLikeParser.Formal_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void exitFormal_param(PascalLikeParser.Formal_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(PascalLikeParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(PascalLikeParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#sent_tail}.
	 * @param ctx the parse tree
	 */
	void enterSent_tail(PascalLikeParser.Sent_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#sent_tail}.
	 * @param ctx the parse tree
	 */
	void exitSent_tail(PascalLikeParser.Sent_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#sent_tail_aux}.
	 * @param ctx the parse tree
	 */
	void enterSent_tail_aux(PascalLikeParser.Sent_tail_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#sent_tail_aux}.
	 * @param ctx the parse tree
	 */
	void exitSent_tail_aux(PascalLikeParser.Sent_tail_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(PascalLikeParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(PascalLikeParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#sent_id_tail}.
	 * @param ctx the parse tree
	 */
	void enterSent_id_tail(PascalLikeParser.Sent_id_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#sent_id_tail}.
	 * @param ctx the parse tree
	 */
	void exitSent_id_tail(PascalLikeParser.Sent_id_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(PascalLikeParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(PascalLikeParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(PascalLikeParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(PascalLikeParser.Proc_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#subparamlist_opt}.
	 * @param ctx the parse tree
	 */
	void enterSubparamlist_opt(PascalLikeParser.Subparamlist_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#subparamlist_opt}.
	 * @param ctx the parse tree
	 */
	void exitSubparamlist_opt(PascalLikeParser.Subparamlist_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#subparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubparamlist(PascalLikeParser.SubparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#subparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubparamlist(PascalLikeParser.SubparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#explist_opt}.
	 * @param ctx the parse tree
	 */
	void enterExplist_opt(PascalLikeParser.Explist_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#explist_opt}.
	 * @param ctx the parse tree
	 */
	void exitExplist_opt(PascalLikeParser.Explist_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(PascalLikeParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(PascalLikeParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#explist_tail}.
	 * @param ctx the parse tree
	 */
	void enterExplist_tail(PascalLikeParser.Explist_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#explist_tail}.
	 * @param ctx the parse tree
	 */
	void exitExplist_tail(PascalLikeParser.Explist_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(PascalLikeParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(PascalLikeParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#exp_tail}.
	 * @param ctx the parse tree
	 */
	void enterExp_tail(PascalLikeParser.Exp_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#exp_tail}.
	 * @param ctx the parse tree
	 */
	void exitExp_tail(PascalLikeParser.Exp_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PascalLikeParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PascalLikeParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#term_tail}.
	 * @param ctx the parse tree
	 */
	void enterTerm_tail(PascalLikeParser.Term_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#term_tail}.
	 * @param ctx the parse tree
	 */
	void exitTerm_tail(PascalLikeParser.Term_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PascalLikeParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PascalLikeParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#exp_no_paren}.
	 * @param ctx the parse tree
	 */
	void enterExp_no_paren(PascalLikeParser.Exp_no_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#exp_no_paren}.
	 * @param ctx the parse tree
	 */
	void exitExp_no_paren(PascalLikeParser.Exp_no_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#term_no_paren}.
	 * @param ctx the parse tree
	 */
	void enterTerm_no_paren(PascalLikeParser.Term_no_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#term_no_paren}.
	 * @param ctx the parse tree
	 */
	void exitTerm_no_paren(PascalLikeParser.Term_no_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#factor_no_paren}.
	 * @param ctx the parse tree
	 */
	void enterFactor_no_paren(PascalLikeParser.Factor_no_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#factor_no_paren}.
	 * @param ctx the parse tree
	 */
	void exitFactor_no_paren(PascalLikeParser.Factor_no_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#expcond}.
	 * @param ctx the parse tree
	 */
	void enterExpcond(PascalLikeParser.ExpcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#expcond}.
	 * @param ctx the parse tree
	 */
	void exitExpcond(PascalLikeParser.ExpcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#expcond_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpcond_tail(PascalLikeParser.Expcond_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#expcond_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpcond_tail(PascalLikeParser.Expcond_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#and_term}.
	 * @param ctx the parse tree
	 */
	void enterAnd_term(PascalLikeParser.And_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#and_term}.
	 * @param ctx the parse tree
	 */
	void exitAnd_term(PascalLikeParser.And_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#and_term_tail}.
	 * @param ctx the parse tree
	 */
	void enterAnd_term_tail(PascalLikeParser.And_term_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#and_term_tail}.
	 * @param ctx the parse tree
	 */
	void exitAnd_term_tail(PascalLikeParser.And_term_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#not_term}.
	 * @param ctx the parse tree
	 */
	void enterNot_term(PascalLikeParser.Not_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#not_term}.
	 * @param ctx the parse tree
	 */
	void exitNot_term(PascalLikeParser.Not_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void enterFactorcond(PascalLikeParser.FactorcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void exitFactorcond(PascalLikeParser.FactorcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void enterOpcomp(PascalLikeParser.OpcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void exitOpcomp(PascalLikeParser.OpcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#if_sent}.
	 * @param ctx the parse tree
	 */
	void enterIf_sent(PascalLikeParser.If_sentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#if_sent}.
	 * @param ctx the parse tree
	 */
	void exitIf_sent(PascalLikeParser.If_sentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#else_block_opt}.
	 * @param ctx the parse tree
	 */
	void enterElse_block_opt(PascalLikeParser.Else_block_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#else_block_opt}.
	 * @param ctx the parse tree
	 */
	void exitElse_block_opt(PascalLikeParser.Else_block_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(PascalLikeParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(PascalLikeParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#while_sent}.
	 * @param ctx the parse tree
	 */
	void enterWhile_sent(PascalLikeParser.While_sentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#while_sent}.
	 * @param ctx the parse tree
	 */
	void exitWhile_sent(PascalLikeParser.While_sentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#repeat_sent}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_sent(PascalLikeParser.Repeat_sentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#repeat_sent}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_sent(PascalLikeParser.Repeat_sentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#for_sent}.
	 * @param ctx the parse tree
	 */
	void enterFor_sent(PascalLikeParser.For_sentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#for_sent}.
	 * @param ctx the parse tree
	 */
	void exitFor_sent(PascalLikeParser.For_sentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalLikeParser#inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(PascalLikeParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalLikeParser#inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(PascalLikeParser.IncContext ctx);
}