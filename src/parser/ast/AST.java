package parser.ast;

public abstract class AST {
    public abstract void traverse();
    public abstract void generateCode();
}
