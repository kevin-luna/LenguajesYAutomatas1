package parser.ast;

import parser.Quadruple;
import parser.SymbolTable;

import java.io.BufferedWriter;
import java.util.ArrayList;

public abstract class AST {
    protected SymbolTable symbolTableCpy;
    public abstract void traverse();
    public abstract ArrayList<Quadruple> generateIntermediateCode();
    public abstract void generateCode(BufferedWriter outputFile);
    public abstract void print(int level);
    public void attachSymbolTable(SymbolTable symbolTable) {
        this.symbolTableCpy = symbolTable;
    }
}
