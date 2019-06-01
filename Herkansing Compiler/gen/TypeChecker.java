import com.oracle.jrockit.jfr.DataType;
import model.CheckerError;
import model.Scope;
import model.VariableSymbol;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;

public class TypeChecker extends GameOfThronesLangBaseVisitor<DataType> {

    private Scope currentScope;
    private ParseTreeProperty<VariableSymbol> symbols;


    public ArrayList<CheckerError> errors = new ArrayList<>();

    public TypeChecker(Scope currentScope, ParseTreeProperty symbols) {
        this.currentScope = currentScope;
        this.symbols = symbols;
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
                addErrorToList(ctx.getRuleIndex(), "Var \"" + name + "\" already defined");
                return null;
            }
            currentScope.declare(ctx, currentScope.lookupVar(name));
            return null;
        } else {
            if (ctx.INT_TYPE() == null && ctx.STRING_TYPE() == null) {
                addErrorToList(ctx.getRuleIndex(), "Var \"" + name + "\" not yet defined");
                return null;
            }
        }
        if (ctx.INT_TYPE() == null) {
            if (typeOfAssignment == DataType.INTEGER) {
                addErrorToList(ctx.getRuleIndex(), "Can't create string of int");
            }
        } else {
            if (typeOfAssignment == DataType.STRING) {
                addErrorToList(ctx.getRuleIndex(), "Can't create int of String");
            }
        }
        VariableSymbol symbol =
                new VariableSymbol(name, typeOfAssignment);
        currentScope.declare(ctx, symbol);
        currentScope.declareVar(name, symbol);
        return null;
    }

    @Override
    public DataType visitCondition_statement(GameOfThronesLangParser.Condition_statementContext ctx) {
        for (GameOfThronesLangParser.ConditionContext c : ctx.condition()){
            if (super.visit(c)!= DataType.BOOLEAN){
                addErrorToList(ctx.getRuleIndex(),"Not a valid boolean statement");
            }
        }
        return DataType.BOOLEAN;
    }

    @Override
    public DataType visitIfElse(GameOfThronesLangParser.IfElseContext ctx) {
        super.visit(ctx.condition_statement());
        currentScope = currentScope.createChildScope();
        super.visit(ctx.block(0));
        currentScope = currentScope.getParentScope();
        if (ctx.ELSE() != null) {
            currentScope = currentScope.createChildScope();
            super.visit(ctx.block(1));
            currentScope = currentScope.getParentScope();
        }
        return null;
    }

    @Override
    public DataType visitWhile(GameOfThronesLangParser.WhileContext ctx) {
        super.visit(ctx.condition_statement());
        currentScope = currentScope.createChildScope();
        super.visit(ctx.block());
        currentScope = currentScope.getParentScope();
        return null;
    }

    @Override
    public DataType visitCondition(GameOfThronesLangParser.ConditionContext ctx) {
        DataType leftType = visit(ctx.leftExpr);
        DataType rightType = visit(ctx.rightExpr);
        if (leftType == rightType) {
            currentScope.declare(ctx, new VariableSymbol("condition", DataType.BOOLEAN));
            symbols.put(ctx, new VariableSymbol("condition", DataType.BOOLEAN));
        } else {
            addErrorToList(ctx.getRuleIndex(), "Can only check the same types");
        }
        return DataType.BOOLEAN;
    }

    @Override
    public DataType visitIdentifier(GameOfThronesLangParser.IdentifierContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        VariableSymbol symbol = currentScope.lookupVar(name);
        if (symbol == null) {
            addErrorToList(0, "Unknown variable \"" + name + "\" either not declared or out of scope");
            return null;
        }
        currentScope.declare(ctx, symbol);
        symbols.put(ctx, symbol);
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
        symbols.put(ctx, symbol);
        return dataType;
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
