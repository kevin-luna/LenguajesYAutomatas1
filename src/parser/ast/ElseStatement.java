package parser.ast;

public class ElseStatement extends AST{
    private Statement statement;
    private CodeBlock codeBlock;

    public ElseStatement(){}

    public ElseStatement(Statement statement){
        this.statement = statement;
    }

    public ElseStatement(CodeBlock codeBlock){
        this.codeBlock = codeBlock;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public CodeBlock getCodeBlock() {
        return codeBlock;
    }

    public void setCodeBlock(CodeBlock codeBlock) {
        this.codeBlock = codeBlock;
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
