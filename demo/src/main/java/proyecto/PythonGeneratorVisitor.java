package proyecto;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import proyecto.antlr.ExprBaseVisitor;
import proyecto.antlr.ExprParser;


public class PythonGeneratorVisitor extends ExprBaseVisitor<Integer> {


    private PrintWriter writer;
    private int indentLevel = 0;

    public PythonGeneratorVisitor() {
        try {
            writer = new PrintWriter(new FileWriter("salida.py"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeln(String line) {
        for (int i = 0; i < indentLevel; i++) {
            writer.print("    ");
        }
        writer.println(line);
    }

    @Override
    public Integer visitAsignacion(ExprParser .AsignacionContext ctx) {
        System.out.println("Visit: asignacion");

        String varName = ctx.IDENT().getText();
        String value = ctx.expresion() != null ? ctx.expresion().getText() :
                       ctx.STRING() != null ? ctx.STRING().getText() :
                       ctx.booleano() != null ? ctx.booleano().getText() : "";

        writeln(varName + " = " + value);
        return visitChildren(ctx);
    }

    @Override
    public Integer visitDeclaracion(ExprParser .DeclaracionContext ctx) {
        System.out.println("Visit: declaracion");
        return visitChildren(ctx);
    }

    @Override
    public Integer visitBloque(ExprParser .BloqueContext ctx) {
        System.out.println("Visit: bloque");
        indentLevel++;
        Integer result = visitChildren(ctx);
        indentLevel--;
        return result;
    }

    @Override
    public Integer visitBooleano(ExprParser .BooleanoContext ctx) {
        System.out.println("Visit: booleano");
        return visitChildren(ctx);
    }

    @Override
    public Integer visitContenido(ExprParser .ContenidoContext ctx) {
        System.out.println("Visit: contenido");
        if (ctx.IDENT() != null) {
            writeln(ctx.IDENT().getText());
        } else if (ctx.STRING() != null) {
            writeln(ctx.STRING().getText());
        }
        return visitChildren(ctx);
    }

    @Override
    public Integer visitEntrada_salida(ExprParser.Entrada_salidaContext ctx) {
        System.out.println("Visit: entrada_salida");

        if (ctx.getChild(0).getText().equals("print")) {
            String contenido = ctx.contenido().getText();
            writeln("print(" + contenido + ")");
        } else if (ctx.getChild(0).getText().equals("write")) {
            String dato = ctx.contenido().getText();
            String archivo = ctx.STRING().getText();
            writeln("with open(" + archivo + ", 'w') as f:");
            indentLevel++;
            writeln("f.write(str(" + dato + "))");
            indentLevel--;
        } else if (ctx.getChild(0).getText().equals("read")) {
            String archivo = ctx.STRING().getText();
            writeln("with open(" + archivo + ", 'r') as f:");
            indentLevel++;
            writeln("contenido = f.read()");
            indentLevel--;
        }

        return null;
    }

    @Override
    public Integer visitSentencia(ExprParser.SentenciaContext ctx) {
        System.out.println("Visit: sentencia");
        return visitChildren(ctx);
    }

    @Override
    public Integer visitLista_sentencias(ExprParser.Lista_sentenciasContext ctx) {
        System.out.println("Visit: lista_sentencias");
        return visitChildren(ctx);
    }


    public void close() {
        writer.close();
    }
}