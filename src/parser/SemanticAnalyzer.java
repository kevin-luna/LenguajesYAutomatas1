package parser;

import parser.ast.ArrayDeclaration;
import parser.ast.ConstDeclaration;
import parser.ast.VariableDeclaration;

import java.util.Stack;

public class SemanticAnalyzer {
    private SymbolTable symbolTable;
    private SemanticStack semanticStack;
    private ErrorLog errorLog;

    public SemanticAnalyzer(SymbolTable symbolTable, ErrorLog errorLog) {

    }

    public SemanticAnalyzer(SymbolTable symbolTable, SemanticStack semanticStack, ErrorLog errorLog) {
        this.symbolTable = symbolTable;
        this.semanticStack = semanticStack;
        this.errorLog = errorLog;
    }

    public VariableDeclaration checkVariableRedefinition(SymbolEntry symbol){
        if(checkSymbolRedefinition(symbol))return null;
        return new VariableDeclaration(symbol.getDataType(),symbol.getName());
    }

    public ArrayDeclaration checkArrayRedefinition(SymbolEntry symbol){
        if(checkSymbolRedefinition(symbol))return null;
        return new ArrayDeclaration(symbol.getName(),symbol.getDataType(),symbol.getLen(),symbol.getDimension());
    }

    public ConstDeclaration checkConstantRedefinition(SymbolEntry symbol){
        if(checkSymbolRedefinition(symbol))return null;
        return new ConstDeclaration(symbol.getName(),symbol.getDataType());
    }

    private boolean checkSymbolRedefinition(SymbolEntry symbol){
        String name = symbol.getName();
        int defLine = symbol.getDefLine();
        String msg;
        switch (symbol.getType()){
            case SymbolType.VARIABLE -> msg = "la variable ";
            case SymbolType.CONSTANT -> msg = "la constante ";
            case SymbolType.ARRAY -> msg = "el arreglo ";
            default -> msg = "al simbolo ";
        }
        if(symbolTable.lookSymbol(name)){
            errorLog.logSemanticError(defLine,"Redeclaracion de "+msg+name);
            return true;
        }else{
            symbolTable.addSymbol(symbol);
        }
        return false;
    }
}
