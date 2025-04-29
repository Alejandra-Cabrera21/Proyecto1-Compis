// Generated from Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ExprParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#lista_declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_declaraciones(ExprParser.Lista_declaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(ExprParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(ExprParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expresion_suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_suma(ExprParser.Expresion_sumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expresion_multiplicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_multiplicacion(ExprParser.Expresion_multiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expresion_parentesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_parentesis(ExprParser.Expresion_parentesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(ExprParser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#lista_funciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_funciones(ExprParser.Lista_funcionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(ExprParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(ExprParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(ExprParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#lista_sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_sentencias(ExprParser.Lista_sentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(ExprParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(ExprParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#estructura_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura_control(ExprParser.Estructura_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#entrada_salida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrada_salida(ExprParser.Entrada_salidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#contenido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenido(ExprParser.ContenidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(ExprParser.Llamada_funcionContext ctx);
}