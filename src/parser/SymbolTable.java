package parser;
import java.util.HashMap;

public class SymbolTable {
    private HashMap<String,SymbolEntry> symbolTable;

    public SymbolTable() {
        this.symbolTable = new HashMap<>();
    }

    boolean lookSymbol(String symbol) {
        return symbolTable.containsKey(symbol);
    }

    SymbolEntry getSymbol(String symbol){
        return symbolTable.get(symbol);
    }

    void addSymbol(SymbolEntry symbol){
        symbolTable.put(symbol.getName(), symbol);
    }

    void removeSymbol(SymbolEntry symbol){
        symbolTable.remove(symbol.getName());
    }

}
