package model;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private Scope parentScope;
    private Map<String, VariableSymbol> vars;
    private Scope childScope;

    private ParseTreeProperty<VariableSymbol> symbols;

    public Scope(ParseTreeProperty symbols) {
        this.symbols = symbols;
        vars = new HashMap<>();
    }

    public Scope getParentScope() {
        return parentScope;
    }

    private void addVars(Map<String, VariableSymbol> vars){
        this.vars.putAll(vars);
    }

    public void declare(ParseTree parseTree, VariableSymbol symbol) {
        symbols.put(parseTree, symbol);
    }

    public VariableSymbol lookup(ParseTree parseTree) {
        return symbols.get(parseTree);
    }

    public void declareVar(String name, VariableSymbol symbol){
        vars.put(name,symbol);
    }
    public VariableSymbol lookupVar(String name) {
        return vars.get(name);
    }

    private void setParentScope(Scope parentScope) {
        this.parentScope = parentScope;
    }

    public Scope getChildScope() {
        return childScope;
    }

    public Scope createChildScope() {
        Scope scope = new Scope(symbols);
        scope.setParentScope(this);
        scope.addVars(vars);
        this.childScope = scope;
        return scope;
    }

}
