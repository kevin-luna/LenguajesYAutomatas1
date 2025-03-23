package parser.ast;

import parser.Quadruple;

import java.util.ArrayList;

public class ConstBlock extends Block{
    private ArrayList<ConstDeclaration> constants;

    public ConstBlock() {
        super(BlockType.CONST_BLOCK);
    }

    public ConstBlock(ArrayList<ConstDeclaration> constants) {
        super(BlockType.CONST_BLOCK);
        this.constants = constants;
    }


    @Override
    public void traverse() {

    }

    @Override
    public ArrayList<Quadruple> generateIntermediateCode(){
        return null;
    }

    @Override
    public void generateCode() {

    }
}
