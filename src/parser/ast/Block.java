package parser.ast;

public class Block extends AST {

    protected BlockType blockType;

    public enum BlockType{
        VAR_BLOCK,CONST_BLOCK,CODE_BLOCK;
    }

    public Block(){}

    public Block(BlockType blockType) {
        this.blockType = blockType;
    }

    public BlockType getBlockType() {
        return blockType;
    }

    public void setBlockType(BlockType blockType) {
        this.blockType = blockType;
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateIntermediateCode() {

    }

    @Override
    public void generateCode() {

    }
}
