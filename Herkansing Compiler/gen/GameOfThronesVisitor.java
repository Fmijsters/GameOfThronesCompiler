import com.oracle.jrockit.jfr.DataType;
import model.Scope;
import model.VariableSymbol;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GameOfThronesVisitor extends GameOfThronesLangBaseVisitor<ArrayList<String>> {

    private Map<String, Integer> storage;
    private PrintWriter printWriter;
    private Scope currentScope;
    private int counter = 0;
    private int labelCount = 0;

    public GameOfThronesVisitor(PrintWriter printWriter, Scope scope) {
        storage = new HashMap<String, Integer>();
        this.currentScope = scope;
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
        if (ctx.op.getType() == GameOfThronesLangParser.ADD) {
            code.add("iadd");
        } else {
            code.add("isub");
        }
        return code;
    }

    @Override
    public ArrayList<String> visitMulDiv(GameOfThronesLangParser.MulDivContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.expr(0)));
        code.addAll(visit(ctx.expr(1)));
        if (ctx.op.getType() == GameOfThronesLangParser.MUL) {
            code.add("imul");
        } else if (ctx.op.getType() == GameOfThronesLangParser.DIV) {
            code.add("idiv");
        }
        return code;
    }

    @Override
    public ArrayList<String> visitPrintExpr(GameOfThronesLangParser.PrintExprContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        code.addAll(super.visit(ctx.expr()));
        VariableSymbol symbol = currentScope.lookup(ctx);
        if (symbol.getType() == DataType.STRING) {
            code.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        } else {
            code.add("invokevirtual java/io/PrintStream/println(I)V");
        }
        return code;
    }

    @Override
    public ArrayList<String> visitWinteriscoming(GameOfThronesLangParser.WinteriscomingContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        for (GameOfThronesLangParser.StatementContext sc : ctx.statement()) {
            ArrayList<String> result = super.visit(sc);
            if (result != null) {
                code.addAll(result);
            }
        }
        for (String string : code) {
            printWriter.println(string);
        }
        return null;
    }

    @Override
    public ArrayList<String> visitParens(GameOfThronesLangParser.ParensContext ctx) {
        return super.visit(ctx.expr());
    }

    @Override
    public ArrayList<String> visitIdentifier(GameOfThronesLangParser.IdentifierContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String id = ctx.IDENTIFIER().getText();
        VariableSymbol symbol = currentScope.lookup(ctx);
        int memoryIndex = storage.get(id);
        if (symbol.getType() == DataType.INTEGER) {
            code.add("iload " + memoryIndex);
        } else if (symbol.getType() == DataType.STRING) {
            code.add("aload " + memoryIndex);
        }
        return code;

    }


    @Override
    public ArrayList<String> visitAssign(GameOfThronesLangParser.AssignContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String id = ctx.IDENTIFIER().getText();
        int index = counter;
        if (storage.get(id)!=null){
            index = storage.get(id);
        }
        code.addAll(super.visit(ctx.expr()));
        VariableSymbol symbol = currentScope.lookup(ctx);
        if (symbol.getType() == DataType.STRING) {
            code.add("astore " + index);
        } else {
            code.add("istore " + index);
        }
        storage.put(id, index);
        counter++;

        return code;
    }

    @Override
    public ArrayList<String> visitIf(GameOfThronesLangParser.IfContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.leftExpr));
        code.addAll(visit(ctx.rightExpr));
        this.currentScope = currentScope.getChildScope();
        String label = "endif_" + (labelCount++);

        if (ctx.LT() != null) {
            code.add("if_icmpgt " + label);
        } else if (ctx.EQ() != null) {
            code.add("if_icmpne " + label);
        } else if (ctx.NE() != null) {
            code.add("if_icmpeq " + label);
        } else if (ctx.GT() != null) {
            code.add("if_icmplt " + label);
        }
        code.addAll(super.visit(ctx.block()));

        code.add(label + ":");
        this.currentScope = currentScope.getParentScope();
        return code;
    }

    @Override
    public ArrayList<String> visitBlock(GameOfThronesLangParser.BlockContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        for (GameOfThronesLangParser.StatementContext statementContext : ctx.statement()) {
            code.addAll(super.visit(statementContext));
        }
        return code;
    }

    @Override
    public ArrayList<String> visitString(GameOfThronesLangParser.StringContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("ldc " + ctx.STRING().getText());
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
