grammar PascalLike;

@parser::members {
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
}

// ------------------ Reglas principales ------------------

programa
    : 'program' ID ';' main=bloque '.'	{System.out.print("void main ( void ) {\n" + globalVars + "\t" + $main.main.replace("\n", "\n\t")); System.out.print("\n}");}
    | 'unit' ID ';' declist '.'
    ;

bloque returns [String main]
    : {if(!programVars)increaseTab();} declist 'begin' s=sentlist 'end' {$main = $s.content.replace("write", "printf"); decreaseTab();}
    ;

declist 
    : declist_item_list
    ;

declist_item_list 
    : declist_item			{System.out.print("\n");}
    declist_item_list
    | /* vacío*/ 
    ;

declist_item
    : constdecl
    | vardecl				{programVars = false;}
    | {programVars = false;} procdecl				
    | {programVars = false;} funcdecl				
    ;

// ------------------ Constantes ------------------

constdecl
    : 'const' ctelist {System.out.print($ctelist.result);}
    ;

ctelist returns [String result]
    : ID '=' simovalue ';' 	{$result = "#define " + $ID.text + " " + $simovalue.text + "\n";}
    ctelist_tail			{$result += $ctelist_tail.result;}
    ;

ctelist_tail returns [String result]
    : ctelist		{$result = $ctelist.result;}
    | /*vacío*/		{$result = "";}
    ;

simovalue
    : CONSTREAL
    | CONSTINT
    | CONSTLIT
    ;

// ------------------ Variables ------------------

vardecl
    : 'var' defvarlist	{
    	if(programVars){
    		globalVars += $defvarlist.result;
    	}else{
    		System.out.print($defvarlist.result);
    	}
    }
    ;

defvarlist returns [String result]
    : varlist ':' tbas 		
    {
    	if(programVars) $result = "\t" + $tbas.type + " " + $varlist.result + ";\n";
    	else $result = getTab() + $tbas.type + " " + $varlist.result + ";\n";
    	
    }
    ';' defvarlist_tail			{$result += $defvarlist_tail.result;}
    ;

defvarlist_tail returns [String result]
    : defvarlist	{$result = $defvarlist.result;}
    | /*vacio*/					{$result = "";}
    ;


varlist returns [String result]
    : ID {$result = $ID.text;} varlist_tail	{$result += $varlist_tail.result;}
    ;

varlist_tail returns [String result]
    : ',' varlist			{$result = ", " + $varlist.result;}
    | /*vacio*/				{$result = "";}
    ;

tbas returns [String type]
    : 'INTEGER'		{$type = "int";}
    | 'REAL'		{$type = "float";}
    ;

// ------------------ Procedimientos y Funciones ------------------

procdecl
    : 'procedure' ID {funcName = $ID.text;} p=formal_paramlist_opt 
    {System.out.print("void " + $ID.text + " ( " );
    	if($p.param != ""){System.out.print($p.param);}
    	else {System.out.print("void");}
    	System.out.print(" ) { \n");}
    ';' bloque ';'
    {
    	System.out.print($bloque.main);
    	System.out.print("\n} \n");
    }
    ;

funcdecl
    : 'function' ID {funcName = $ID.text;} p=formal_paramlist_opt ':' t=tbas 
    {System.out.print($t.type+ " " + $ID.text + " ( " );
    	if($p.param != ""){System.out.print($p.param);}
    	else {System.out.print("void");}
    	System.out.print(" ) { \n");}
    ';' bloque ';'
    {
    	System.out.print($bloque.main);
    	System.out.print("\n} \n");
    	funcName = null;
    }
    ;

formal_paramlist_opt returns [String param]
	: fp=formal_paramlist		{$param = $fp.param;}
    | /* vacío */ 				{$param = "";}
    ;

formal_paramlist returns [String param]
    @init { StringBuilder sb = new StringBuilder(); }
    : '(' fp=formal_param { sb.append($fp.param); }
     tail=formal_param_tail {if($tail.param != ""){sb.append(", " + $tail.param);}}
     ')'
    {$param = sb.toString();}
    ;

formal_param_tail returns [String param]
    : ';' fp=formal_param 
    {$param = $fp.param;}
    tail=formal_param_tail     
    {	
    	if (!$tail.param.isEmpty()) $param = $fp.param + ", " + $tail.param;
    }
    | /* vacío*/		{$param = "";}
    ;

formal_param returns [String param]
    : varlist ':' t=tbas {$param = $t.type + " " + $varlist.text + " ";}
    ;

// ------------------ Sentencias ------------------

sentlist returns [String content]
    : sent sent_tail	{$content = $sent.result + $sent_tail.result;}
    ;

sent_tail returns [String result]
    : ';' sent_tail_aux {$result = $sent_tail_aux.result;}
    | /*vacio */ {$result = "";}
    ;
    
sent_tail_aux returns [String result]
	: sent {$result = $sent.result;} sent_tail  {$result += $sent_tail.result;}
	| /*vacio */ {$result = "";}
	;

sent returns [String result]
    : ID tail=sent_id_tail
      {
      	if(funcName.equals($ID.text)){
      		$result = getTab() + "return" + $tail.code + ";\n";
      	}else{
        	$result = getTab() + $ID.text + $tail.code + ";\n";
        }
      }
    | if_sent
      {
        $result = getTab() + $if_sent.result;
      }
    | while_sent
      {
        $result = getTab() + $while_sent.result;
      }
    | repeat_sent
      {
        $result = getTab() + $repeat_sent.result;
      }
    | for_sent
      {
        $result = getTab() + $for_sent.result;
      }
    ;

sent_id_tail returns [String code]
    : asig    { $code = $asig.result; }
    | proc_call { $code = $proc_call.result; }
    ;

// ------------------ Sentencias simples ------------------

asig returns [String result]
    : ':=' exp	{$result = " = " + $exp.result;}
    ;

proc_call returns [String result]
    : subparamlist_opt {$result = $subparamlist_opt.result;}
    ;

subparamlist_opt returns [String result]
    : subparamlist 	{$result = $subparamlist.result;}
    | /* vacío*/	{$result = "";}
    ;

subparamlist returns [String result]
    : '(' explist_opt ')'	{$result = "( " + $explist_opt.result + " )";}
    ;

explist_opt returns [String result]
    : explist		{$result = $explist.result;}
    | /* vacío*/	{$result = "";}
    ;

explist returns [String result]
    : exp explist_tail	{$result = $exp.result + $explist_tail.result;}
    ;

explist_tail returns [String result]
    : ',' explist		{$result = ", " + $explist.result;}
    | /* vacío*/		{$result = "";}
    ;

// ------------------ Expresiones aritméticas ------------------

exp returns [String result]
    : term exp_tail {$result = $term.result + $exp_tail.result;}
    ;

exp_tail returns [String result]
    : '+' term tail=exp_tail	{$result = " + " + $term.result + " " + $tail.result;}
    | '-' term tail=exp_tail	{$result = " - " + $term.result + " " + $tail.result;} 
    | /*vacío*/					{$result = "";}
    ;

term returns [String result]
    : factor term_tail {$result = $factor.result + $term_tail.result;}
    ;

term_tail returns [String result]
    : '*' factor term_tail		{$result = " * " + $factor.result + " " + $term_tail.result;}
    | 'div' factor term_tail	{$result = " / " + $factor.result + " " + $term_tail.result;}
    | 'mod' factor term_tail	{$result = " % " + $factor.result + " " + $term_tail.result;}
    | /*vacio */				{$result = "";}
    ;

factor returns [String result]
    : simovalue {$result = $simovalue.text;}
    | '(' exp ')' {$result = "( " + $exp.result + " )";}
    | ID subparamlist_opt {$result = $ID.text + $subparamlist_opt.result;}
    ;
    
exp_no_paren returns [String result]
	: term_no_paren exp_tail {$result = $term_no_paren.result + $exp_tail.result;}
	;

term_no_paren returns [String result]
	: factor_no_paren term_tail {$result = $factor_no_paren.result + $term_tail.result;}
	;


factor_no_paren returns [String result]
    : simovalue {$result = $simovalue.text;}
    | ID subparamlist_opt {$result = $ID.text + $subparamlist_opt.result;}
    ;

// ------------------ Condicionales ------------------

expcond returns [String result]
    : and_term expcond_tail
    {	$result = $and_term.result + $expcond_tail.result;    }
    ;

expcond_tail returns [String result]
    : 'or' and_term expcond_tail
    {$result = "||" + $and_term.result + $expcond_tail.result;}
    | /*vacío*/ {$result = "";}
    ;

and_term returns [String result]
    : not_term and_term_tail {$result = $not_term.result + $and_term_tail.result;}
    ;

and_term_tail returns [String result]
    : 'and' not_term and_term_tail
    {$result = "&&" + $not_term.result + $and_term_tail.result;}
    | /*vacío*/ {$result = "";}
    ;

not_term returns [String result]
    : 'not' not_term 	{$result = "!" + $not_term.result;}
    | factorcond		{$result = $factorcond.result;}
    ;


factorcond returns [String result]
    : '(' expcond ')'
        { $result = "(" + $expcond.result + ")"; }
    | e1=exp_no_paren opcomp e2=exp
        { $result = $e1.result + $opcomp.result + $e2.result; }
    ;

opcomp returns [String result]
    : '=' 	{$result = "==";}
    | '<>' 	{$result = "!=";}
    | '<' 	{$result = "<";}
    | '>' 	{$result = ">";}
    | '<=' 	{$result = "<=";}
    | '>='	{$result = ">=";}
    ;

// ------------------ Sentencias de control ------------------

if_sent returns[String result]
    : 'if' expcond
    {
    	$result = "if( " + $expcond.result + " ) {\n";
    }
     'then' bloque 
    {
    	$result += $bloque.main + "\n" + getTab() + "}";
    }
    else_block_opt
    {
    	$result += $else_block_opt.result;
    }
    ;

else_block_opt returns [String result]
    : 'else'{$result = "else ";} else_block {$result += $else_block.result;}
    | /*vacio */	{$result = "";}
    ;
    
else_block returns [String result]
	: bloque {$result = "{\n" + $bloque.main + "\n" + getTab() + "}";}
    | if_sent {$result = $if_sent.result;}
	;

while_sent returns [String result]
    : 'while' expcond 'do'	{$result = "while(" + $expcond.result + ") {\n";}
    	bloque				{$result += $bloque.main + getTab() + "}\n";}
    ;

repeat_sent returns [String result]
    : 'repeat'{$result = "do {\n";} bloque {$result += $bloque.main + "\n" + getTab() + "}";} 
    	'until' expcond		{$result += "until(" + $expcond.result + ");";}
    ;

for_sent returns [String result]
    : 'for' ID ':=' e1=exp inc e2=exp 'do' 
    {
    	$result = "for(" + $ID.text + "=" + $e1.text + "; " ;
    	if($inc.result == "to") $result += $ID.text + "<=" + $e2.text + "; " + $ID.text + "++)";
    	else if($inc.result == "downto") $result += $ID.text + ">=" + $e2.text + "; " + $ID.text + "--)";
    	$result += " {\n";
    } 
    bloque
 	{$result += $bloque.main + "\n" + getTab() + "}";}
    ;

inc returns [String result]
    : 'to'		{$result = "to";}
    | 'downto'	{$result = "downto";}
    ;

// ------------------ Tokens léxicos ------------------

ID         : [a-zA-Z_] [a-zA-Z_0-9]* ;
CONSTINT   : [0-9]+
		   | [+-] [0-9]+;
CONSTREAL
    :   [+-] [0-9]+ '.' [0-9]+                          // Punto fijo con signo
    |   [0-9]+ '.' [0-9]+                               // Punto fijo sin signo
    |   [+-] [0-9]+ [Ee] [+-] [0-9]+                    // Exponencial con ambos signos
    |   [+-] [0-9]+ [Ee] [0-9]+                         // Exponencial con signo solo al inicio
    |   [0-9]+ [Ee] [+-] [0-9]+                         // Exponencial con signo solo en exponente
    |   [0-9]+ [Ee] [0-9]+                              // Exponencial sin ningún signo
    |   [+-] [0-9]+ '.' [0-9]+ [Ee] [+-] [0-9]+         // Mixto con ambos signos
    |   [+-] [0-9]+ '.' [0-9]+ [Ee] [0-9]+              // Mixto con signo solo al inicio
    |   [0-9]+ '.' [0-9]+ [Ee] [+-] [0-9]+              // Mixto con signo solo en exponente
    |   [0-9]+ '.' [0-9]+ [Ee] [0-9]+                   // Mixto sin ningún signo
    ;
CONSTLIT   : '\'' (~['\r\n])* '\'' ;

WS         : [ \t\r\n]+ -> skip ;
COMMENT    : '//' ~[\r\n]* -> skip ;
  