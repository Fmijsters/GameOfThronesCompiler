import com.oracle.jrockit.jfr.DataType;
import model.VariableSymbol;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GameOfThronesVisitor extends GameOfThronesLangBaseVisitor<ArrayList<String>> {

    private Map<String, VariableSymbol> storage;
    private PrintWriter printWriter;
    private int counter = 0;
    private int labelCount = 0;
    private int whileLabelCount = 0;
    private ParseTreeProperty<VariableSymbol> symbols;


    public GameOfThronesVisitor(PrintWriter printWriter, ParseTreeProperty symbols) {
        storage = new HashMap<String, VariableSymbol>();
        this.printWriter = printWriter;
        this.symbols = symbols;
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
        VariableSymbol symbol = symbols.get(ctx);
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
        VariableSymbol symbol = storage.get(id);
        int memoryIndex = storage.get(id).getStorageIndex();
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
        if (storage.get(id) != null) {
            index = storage.get(id).getStorageIndex();
        }
        code.addAll(super.visit(ctx.expr()));
        VariableSymbol symbol = symbols.get(ctx);

        if (symbol.getType() == DataType.STRING) {
            code.add("astore " + index);
        } else {
            code.add("istore " + index);
        }

        symbol.setStorageIndex(index);
        storage.put(id, symbol);
        counter++;

        return code;
    }

    @Override
    public ArrayList<String> visitCondition(GameOfThronesLangParser.ConditionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.leftExpr));
        code.addAll(visit(ctx.rightExpr));
        String label = "endif_" + (labelCount);

        if (ctx.LT() != null) {
            if (ctx.NOT() != null) {
                code.add("if_icmpgt  " + label);
            } else
                code.add("if_icmplt " + label);
        } else if (ctx.EQ() != null) {
            if (ctx.NOT() != null) {
                code.add("if_icmpne  " + label);
            } else
                code.add("if_icmpeq " + label);
        } else if (ctx.NE() != null) {
            if (ctx.NOT() != null) {
                code.add("if_icmpeq  " + label);
            } else
                code.add("if_icmpne " + label);
        } else if (ctx.GT() != null) {
            if (ctx.NOT() != null) {
                code.add("if_icmplt  " + label);
            } else
                code.add("if_icmpgt  " + label);
        }
        return code;
    }

    @Override
    public ArrayList<String> visitIfElse(GameOfThronesLangParser.IfElseContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(super.visit(ctx.condition_statement()));
        String label = "endif_" + (labelCount);
        String end = "endif_" + (labelCount++) + "end";
        if (ctx.ELSE() != null) {
            code.addAll(super.visit(ctx.block(1)));
            code.add("goto " + end);
        }
        code.add("goto " + end);
        code.add(label + ":");
        code.addAll(super.visit(ctx.block(0)));
        code.add(end + ":");
        return code;
    }

    @Override
    public ArrayList<String> visitWhile(GameOfThronesLangParser.WhileContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String whileLabel = "startWhile_" + (whileLabelCount++);
        code.add(whileLabel + ":");
        code.addAll(super.visit(ctx.condition_statement()));
        String label = "endif_" + (labelCount);
        String end = "endif_" + (labelCount++) + "end";
        code.add("goto " + end);
        code.add(label + ":");
        code.addAll(super.visit(ctx.block()));
        code.add("goto " + whileLabel);
        code.add(end + ":");
        return code;
    }

    @Override
    public ArrayList<String> visitCondition_statement(GameOfThronesLangParser.Condition_statementContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        for (GameOfThronesLangParser.ConditionContext c : ctx.condition()) {
            code.addAll(super.visit(c));
        }
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
}
