package parser.ast;

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
    public void generateCode() {

    }
}
