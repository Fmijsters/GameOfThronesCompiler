import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GameOfThronesVisitor extends GameOfThronesLangBaseVisitor<ArrayList<String>> {

    private Map<String, Integer> storage;

    public GameOfThronesVisitor() {
        storage = new HashMap<String, Integer>();
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
