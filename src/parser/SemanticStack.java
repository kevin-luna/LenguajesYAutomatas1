package parser;

import java.util.Stack;

public class SemanticStack extends Stack<BlockType> {

    public SemanticStack() {
        super();
    }

    public BlockType pushBlock(BlockType type) {
        this.push(type);
        return type;
    }

    public BlockType popBlock() {
        return this.pop();
    }

    public boolean lookBlock(BlockType type) {
        return this.contains(type);
    }
}
