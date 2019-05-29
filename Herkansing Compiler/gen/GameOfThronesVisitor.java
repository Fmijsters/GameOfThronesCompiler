import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GameOfThronesVisitor extends GameOfThronesLangBaseVisitor<ArrayList<String>> {

    private Map<String, Integer> storage;
    private PrintWriter printWriter;

    public GameOfThronesVisitor(PrintWriter printWriter) {
        storage = new HashMap<String, Integer>();
        this.printWriter = printWriter;
    }

    @Override
    public ArrayList<String> visitInt(GameOfThronesLangParser.IntContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("ldc " + ctx.INT().getText());
        return code;
    }

    @Override
    public ArrayList<String> visitAddSub(GameOfThronesLangParser.AddSubContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.expr(0)));
        code.addAll(visit(ctx.expr(1)));
        if (ctx.op.getType() == GameOfThronesLangParser.ADD)
            code.add("iadd");
        else {
            code.add("isub");
        }
        return code;
    }

    @Override
    public ArrayList<String> visitSimple_expression(GameOfThronesLangParser.Simple_expressionContext ctx) {
        ArrayList<String> code = super.visit(ctx.expr());
        for (String string: code){
            printWriter.println(string);
        }
        return code;
    }

    @Override
    public ArrayList<String> visitPrintExpr(GameOfThronesLangParser.PrintExprContext ctx) {
        Object value = super.visit(ctx.expr());
        printWriter.println("ldc "+ value);
        printWriter.println("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        return super.visitPrintExpr(ctx);
    }

    //    @Override
//    public Integer visitAssign(GameOfThronesLangParser.AssignContext ctx) {
//        String id = ctx.IDENTIFIER().getText();  // id is left-hand side of '='
//        int value = super.visit(ctx.expr());   // compute value of expression on right
//        storage.put(id, value);           // store it in our memory
//        return value;
//    }
//
//    @Override
//    public Integer visitInt(GameOfThronesLangParser.IntContext ctx) {
//        return Integer.valueOf(ctx.INT().getText());
//    }
//
//    @Override
//    public Integer visitPrintExpr(GameOfThronesLangParser.PrintExprContext ctx) {
//        Integer value = super.visit(ctx.expr()); // evaluate the expr child
//        System.out.println(value);         // print the result
//        return 0;
//    }
//
//    @Override
//    public Integer visitAddSub(GameOfThronesLangParser.AddSubContext ctx) {
//        int left = super.visit(ctx.expr(0));  // get value of left subexpression
//        int right = super.visit(ctx.expr(1)); // get value of right subexpression
//        if (ctx.op.getType() == GameOfThronesLangParser.ADD) {
//            return left + right;
//        }
//        return left - right; // must be SUB
//    }
//
//    @Override
//    public Integer visitParens(GameOfThronesLangParser.ParensContext ctx) {
//        return super.visit(ctx.expr());
//    }
//
//    @Override
//    public Integer visitIdentifier(GameOfThronesLangParser.IdentifierContext ctx) {
//        String id = ctx.IDENTIFIER().getText();
//        if (storage.containsKey(id)) {
//            return storage.get(id);
//        }
//        return 0;
//    }
}
