package parser.ast;

import java.util.ArrayList;

public class CodeBlock extends Block{
    private ArrayList<Statement> statements;

    public CodeBlock(ArrayList<Statement> statements) {
        super(BlockType.CODE_BLOCK);
        this.statements = statements;
    }
}
