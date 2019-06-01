import com.oracle.jrockit.jfr.DataType;
import model.CheckerError;
import model.Scope;
import model.VariableSymbol;

import java.util.ArrayList;

public class TypeChecker extends GameOfThronesLangBaseVisitor<DataType> {

    private Scope currentScope;

    public ArrayList<CheckerError> errors = new ArrayList<>();

    public TypeChecker(Scope currentScope) {
        this.currentScope = currentScope;
    }

    @Override
    public DataType visitInt(GameOfThronesLangParser.IntContext ctx) {
        return DataType.INTEGER;
    }

    @Override
    public DataType visitString(GameOfThronesLangParser.StringContext ctx) {
        return DataType.STRING;
    }

    @Override
    public DataType visitAssign(GameOfThronesLangParser.AssignContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        DataType typeOfAssignment = super.visit(ctx.expr());
        if (currentScope.lookupVar(name) != null) {
            if (currentScope.lookupVar(name).getType() != typeOfAssignment) {
                addErrorToList(ctx.getRuleIndex(), "Cant assign other data type than assigned");
                return null;
            }
        }
        if (currentScope.lookupVar(name) != null) {
            if (ctx.INT_TYPE() != null || ctx.STRING_TYPE() != null) {
                addErrorToList(ctx.getRuleIndex(), "Var " + name + " already defined");
                return null;
            }
            currentScope.declare(ctx, currentScope.lookupVar(name));
            return null;
        } else {
            if (ctx.INT_TYPE() == null && ctx.STRING_TYPE() == null) {
                addErrorToList(ctx.getRuleIndex(), "Var " + name + " not yet defined");
                return null;
            }
        }
        if (ctx.INT_TYPE() == null) {
            if (typeOfAssignment == DataType.INTEGER) {
                addErrorToList(ctx.getRuleIndex(), "Cant create string of int");
            }
        } else {
            if (typeOfAssignment == DataType.STRING) {
                addErrorToList(ctx.getRuleIndex(), "Cant create int of String");
            }
        }
        VariableSymbol symbol =
                new VariableSymbol(name, typeOfAssignment);
        currentScope.declare(ctx, symbol);
        currentScope.declareVar(name, symbol);
        return null;
    }


    @Override
    public DataType visitIdentifier(GameOfThronesLangParser.IdentifierContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        VariableSymbol symbol = currentScope.lookupVar(name);
        if (symbol == null) {
            addErrorToList(0, "Unknown variable either not declared or out of scope");
            return null;
        }
        currentScope.declare(ctx, symbol);
        return symbol.getType();
    }


    @Override
    public DataType visitAddSub(GameOfThronesLangParser.AddSubContext ctx) {
        DataType leftType = visit(ctx.leftExpr);
        DataType rightType = visit(ctx.rightExpr);
        if (leftType == rightType && leftType == DataType.STRING)
            addErrorToList(ctx.getRuleIndex(), "Can only ints similar values");
        return leftType;
    }

    @Override
    public DataType visitMulDiv(GameOfThronesLangParser.MulDivContext ctx) {
        DataType leftType = visit(ctx.leftExpr);
        DataType rightType = visit(ctx.rightExpr);
        if (leftType == rightType && leftType == DataType.STRING)
            addErrorToList(ctx.getRuleIndex(), "Undefined var");
        return leftType;
    }

    @Override
    public DataType visitPrintExpr(GameOfThronesLangParser.PrintExprContext ctx) {
        DataType dataType = visit(ctx.expr());
        VariableSymbol symbol = new VariableSymbol("printfunction", dataType);
        currentScope.declare(ctx, symbol);
        return dataType;
    }

    @Override
    public DataType visitIf(GameOfThronesLangParser.IfContext ctx) {
        DataType leftType = visit(ctx.leftExpr);
        DataType rightType = visit(ctx.rightExpr);
        currentScope = currentScope.createChildScope();

        if (leftType == rightType) {
            currentScope.declare(ctx, new VariableSymbol("iffunction", DataType.INTEGER));
        } else {
            addErrorToList(ctx.getRuleIndex(), "Can only check the same types");
        }
        super.visit(ctx.block());
        currentScope = currentScope.getParentScope();
        return null;
    }

    @Override
    public DataType visitBlock(GameOfThronesLangParser.BlockContext ctx) {
        for (GameOfThronesLangParser.StatementContext statementContext : ctx.statement()) {
            super.visit(statementContext);
        }
        return null;
    }

    private void addErrorToList(int lineNumber, String errorMessage) {
        errors.add(new CheckerError(lineNumber, errorMessage));
    }


}
