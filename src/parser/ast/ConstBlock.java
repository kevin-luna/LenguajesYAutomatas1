package parser.ast;

import java.util.ArrayList;

public class ConstBlock extends AST{
    private ArrayList<ConstDeclaration> constants;

    public ConstBlock() {
    }

    public ConstBlock(ArrayList<ConstDeclaration> constants) {
        this.constants = constants;
    }

    @Override
    public void checkSemantics() {

    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }
}
