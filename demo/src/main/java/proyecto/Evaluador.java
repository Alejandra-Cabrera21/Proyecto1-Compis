package proyecto;

import proyecto.antlr.ExprBaseVisitor;
import proyecto.antlr.ExprParser.AsignacionContext;
import proyecto.antlr.ExprParser.BloqueContext;
import proyecto.antlr.ExprParser.BooleanoContext;
import proyecto.antlr.ExprParser.ContenidoContext;
import proyecto.antlr.ExprParser.DeclaracionContext;
import proyecto.antlr.ExprParser.Entrada_salidaContext;
import proyecto.antlr.ExprParser.Estructura_controlContext;
import proyecto.antlr.ExprParser.ExpresionContext;
import proyecto.antlr.ExprParser.Expresion_multiplicacionContext;
import proyecto.antlr.ExprParser.Expresion_parentesisContext;
import proyecto.antlr.ExprParser.Expresion_sumaContext;
import proyecto.antlr.ExprParser.FuncionContext;
import proyecto.antlr.ExprParser.Lista_declaracionesContext;
import proyecto.antlr.ExprParser.Lista_funcionesContext;
import proyecto.antlr.ExprParser.Lista_sentenciasContext;
import proyecto.antlr.ExprParser.Llamada_funcionContext;
import proyecto.antlr.ExprParser.ParametrosContext;
import proyecto.antlr.ExprParser.ProgramaContext;
import proyecto.antlr.ExprParser.SentenciaContext;

public class Evaluador extends ExprBaseVisitor<Integer> {

    @Override
    public Integer visitAsignacion(AsignacionContext ctx) {
        System.out.println("Visit: Asignacion");

        // TODO Auto-generated method stub
        return super.visitAsignacion(ctx);
    }

    @Override
    public Integer visitBloque(BloqueContext ctx) {
        System.out.println("Visit: Bloque");
        
        // TODO Auto-generated method stub
        return super.visitBloque(ctx);
    }

    @Override
    public Integer visitBooleano(BooleanoContext ctx) {
        System.out.println("Visit: Booleano");
        
        // TODO Auto-generated method stub
        return super.visitBooleano(ctx);
    }

    @Override
    public Integer visitContenido(ContenidoContext ctx) {
        System.out.println("Visit: Contenido");

        /*if (ctx.IDENT() != null){ //Es un identificador
            System.out.println("value: " + ctx.IDENT());

        } else {

        }*/
        // TODO Auto-generated method stub
        return super.visitContenido(ctx);
    }

    @Override
    public Integer visitDeclaracion(DeclaracionContext ctx) {
        System.out.println("Visit: Declaracion");
        
        // TODO Auto-generated method stub
        return super.visitDeclaracion(ctx);
    }

    @Override
    public Integer visitEntrada_salida(Entrada_salidaContext ctx) {
        System.out.println("Visit: Entrada_Salida");

        // TODO Auto-generated method stub
        return super.visitEntrada_salida(ctx);
    }

    @Override
    public Integer visitEstructura_control(Estructura_controlContext ctx) {
        System.out.println("Visit: Estructura_control");

        // TODO Auto-generated method stub
        return super.visitEstructura_control(ctx);
    }

    @Override
    public Integer visitExpresion(ExpresionContext ctx) {
        System.out.println("Visit: Expresion");

        // TODO Auto-generated method stub
        return super.visitExpresion(ctx);
    }

    @Override
    public Integer visitExpresion_multiplicacion(Expresion_multiplicacionContext ctx) {
        System.out.println("Visit: Expresion_multiplicacion");

        // TODO Auto-generated method stub
        return super.visitExpresion_multiplicacion(ctx);
    }

    @Override
    public Integer visitExpresion_parentesis(Expresion_parentesisContext ctx) {
        System.out.println("Visit: Expresion_parentesis");

        // TODO Auto-generated method stub
        return super.visitExpresion_parentesis(ctx);
    }

    @Override
    public Integer visitExpresion_suma(Expresion_sumaContext ctx) {
        System.out.println("Visit: Expresion_suma");

        // TODO Auto-generated method stub
        return super.visitExpresion_suma(ctx);
    }

    @Override
    public Integer visitFuncion(FuncionContext ctx) {
        System.out.println("Visit: Funcion");

        // TODO Auto-generated method stub
        return super.visitFuncion(ctx);
    }

    @Override
    public Integer visitLista_declaraciones(Lista_declaracionesContext ctx) {
        System.out.println("Visit: Lista_declaraciones");

        // TODO Auto-generated method stub
        return super.visitLista_declaraciones(ctx);
    }

    @Override
    public Integer visitLista_funciones(Lista_funcionesContext ctx) {
        System.out.println("Visit: Lista_funciones");

        // TODO Auto-generated method stub
        return super.visitLista_funciones(ctx);
    }

    @Override
    public Integer visitLista_sentencias(Lista_sentenciasContext ctx) {
        System.out.println("Visit: Lista_sentencias");

        // TODO Auto-generated method stub
        return super.visitLista_sentencias(ctx);
    }

    @Override
    public Integer visitLlamada_funcion(Llamada_funcionContext ctx) {
        System.out.println("Visit: Llamada_funcion");

        // TODO Auto-generated method stub
        return super.visitLlamada_funcion(ctx);
    }

    @Override
    public Integer visitParametros(ParametrosContext ctx) {
        System.out.println("Visit: Parametros");

        // TODO Auto-generated method stub
        return super.visitParametros(ctx);
    }

    @Override
    public Integer visitPrograma(ProgramaContext ctx) {
        System.out.println("Visit: Programa");

        // TODO Auto-generated method stub
        return super.visitPrograma(ctx);
    }

    @Override
    public Integer visitSentencia(SentenciaContext ctx) {
        System.out.println("Visit: Sentencia");

        // TODO Auto-generated method stub
        return super.visitSentencia(ctx);
    }
    
}
