package parser.ast;

public class IfStatement extends Statement{

    private Expression condition;
    private Statement statement;
    private CodeBlock block;
    private ElseStatement elseStatement;

    public IfStatement(){}

    public IfStatement(Expression condition, Statement statement){
        this.condition = condition;
        this.statement = statement;
    }

    public IfStatement(Expression condition, Statement statement, ElseStatement elseStatement){
        this.condition = condition;
        this.statement = statement;
        this.elseStatement = elseStatement;
    }

    public IfStatement(Expression condition, CodeBlock block){
        this.condition = condition;
        this.block = block;
    }

    public IfStatement(Expression condition, CodeBlock block, ElseStatement elseStatement){
        this.condition = condition;
        this.block = block;
        this.elseStatement = elseStatement;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public CodeBlock getCodeBlock() {
        return block;
    }

    public void setBlock(CodeBlock block) {
        this.block = block;
    }

    public ElseStatement getElseStatement() {
        return elseStatement;
    }

    public void setElseStatement(ElseStatement elseStatement) {
        this.elseStatement = elseStatement;
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }
}
