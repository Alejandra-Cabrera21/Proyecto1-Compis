// Generated from Expr.g4 by ANTLR 4.13.2

        package proyecto.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ExprParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ExprParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#lista_declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterLista_declaraciones(ExprParser.Lista_declaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#lista_declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitLista_declaraciones(ExprParser.Lista_declaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(ExprParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(ExprParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(ExprParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(ExprParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expresion_suma}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_suma(ExprParser.Expresion_sumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expresion_suma}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_suma(ExprParser.Expresion_sumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expresion_multiplicacion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_multiplicacion(ExprParser.Expresion_multiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expresion_multiplicacion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_multiplicacion(ExprParser.Expresion_multiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expresion_parentesis}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_parentesis(ExprParser.Expresion_parentesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expresion_parentesis}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_parentesis(ExprParser.Expresion_parentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(ExprParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(ExprParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#lista_funciones}.
	 * @param ctx the parse tree
	 */
	void enterLista_funciones(ExprParser.Lista_funcionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#lista_funciones}.
	 * @param ctx the parse tree
	 */
	void exitLista_funciones(ExprParser.Lista_funcionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(ExprParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(ExprParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(ExprParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(ExprParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(ExprParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(ExprParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#lista_sentencias}.
	 * @param ctx the parse tree
	 */
	void enterLista_sentencias(ExprParser.Lista_sentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#lista_sentencias}.
	 * @param ctx the parse tree
	 */
	void exitLista_sentencias(ExprParser.Lista_sentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(ExprParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(ExprParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(ExprParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(ExprParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#estructura_control}.
	 * @param ctx the parse tree
	 */
	void enterEstructura_control(ExprParser.Estructura_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#estructura_control}.
	 * @param ctx the parse tree
	 */
	void exitEstructura_control(ExprParser.Estructura_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#entrada_salida}.
	 * @param ctx the parse tree
	 */
	void enterEntrada_salida(ExprParser.Entrada_salidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#entrada_salida}.
	 * @param ctx the parse tree
	 */
	void exitEntrada_salida(ExprParser.Entrada_salidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#contenido}.
	 * @param ctx the parse tree
	 */
	void enterContenido(ExprParser.ContenidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#contenido}.
	 * @param ctx the parse tree
	 */
	void exitContenido(ExprParser.ContenidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(ExprParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(ExprParser.Llamada_funcionContext ctx);
}