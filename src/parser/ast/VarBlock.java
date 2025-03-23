package parser.ast;

import parser.Quadruple;

import java.util.ArrayList;

public class VarBlock extends Block{
    private ArrayList<VariableDeclaration> variables;

    public VarBlock(){
        super(BlockType.VAR_BLOCK);
    }

    public VarBlock(ArrayList<VariableDeclaration> variables){
        super(BlockType.VAR_BLOCK);
        this.variables = variables;
    }

    @Override
    public ArrayList<Quadruple> generateIntermediateCode() {
        return null;
    }

    @Override
    public void generateCode() {}
}
