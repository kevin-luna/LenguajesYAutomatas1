package parser.ast;

import parser.Quadruple;

import java.util.ArrayList;

public class CodeBlock extends Block{
    private ArrayList<Statement> statements;

    public CodeBlock() {}

    public CodeBlock(ArrayList<Statement> statements) {
        super(BlockType.CODE_BLOCK);
        this.statements = statements;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public ArrayList<Quadruple> generateIntermediateCode(){
        ArrayList<Quadruple> ir = new ArrayList<>();
        for(Statement s : statements){
            ir.addAll(s.generateIntermediateCode());
        }
        return ir;
    }

    public void setStatements(ArrayList<Statement> statements) {
        this.statements = statements;
    }
}
