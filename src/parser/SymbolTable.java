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

    public SymbolType getSymbolType(String name) {
        if(symbolTable.containsKey(name)) {
            return symbolTable.get(name).getType();
        }
        return null;
    }

    public DataType getDataType(String name) {
        if(symbolTable.containsKey(name)) {
            return symbolTable.get(name).getDataType();
        }
        return null;
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

    public void printUsages(){
        for(SymbolEntry se: symbolTable.values()){
            System.out.println(se.getName()+" "+se.getUsages());
        }
    }

    public void print(){
        System.out.println("--TABLA DE SIMBOLOS--");
        System.out.println("NAME" + "|" + "VALUE" + "|" + "DEFLINE" + "|" + "TYPE" + "|" + "TYPE" + "|" + "LEN" + "|" + "SIZE" + "|" + "DIMENSION" + "|");
        for(SymbolEntry symbol : symbolTable.values()) {
            System.out.println(symbol);
        }
    }

}
