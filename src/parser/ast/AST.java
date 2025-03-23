package parser.ast;

import parser.Quadruple;

import java.util.ArrayList;

public abstract class AST {
    public abstract void traverse();
    public abstract ArrayList<Quadruple> generateIntermediateCode();
    public abstract void generateCode();
}
