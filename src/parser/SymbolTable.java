package parser;
import java.util.HashMap;

public class SymbolTable {
    private HashMap<String,SymbolEntry> symbolTable;

    public SymbolTable() {
        this.symbolTable = new HashMap<>();
    }

    public boolean lookSymbol(String symbol) {
        return symbolTable.containsKey(symbol);
    }

    public SymbolEntry getSymbol(String symbol){
        return symbolTable.get(symbol);
    }

    public void addSymbol(SymbolEntry symbol){
        symbolTable.put(symbol.getName(), symbol);
    }

    public void removeSymbol(SymbolEntry symbol){
        symbolTable.remove(symbol.getName());
    }

}
