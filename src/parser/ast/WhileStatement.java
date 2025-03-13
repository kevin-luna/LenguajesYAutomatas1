package parser.ast;

public class WhileStatement extends Statement{
    private Expression expr;
    private Statement statement;
    private CodeBlock codeBlock;

    public WhileStatement(){}

    public WhileStatement(Expression expr, Statement statement){
        this.expr = expr;
        this.statement = statement;
    }

    public WhileStatement(Expression expr, CodeBlock codeBlock){
        this.expr = expr;
        this.codeBlock = codeBlock;
    }

    public Expression getExpr() {
        return expr;
    }

    public void setExpr(Expression expr) {
        this.expr = expr;
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
    public void generateCode() {

    }
}
