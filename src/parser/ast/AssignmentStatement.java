package parser.ast;

public class AssignmentStatement extends Statement{
    private Variable variable;
    private Expression expression;

    public AssignmentStatement(){}

    public AssignmentStatement(Variable variable, Expression expression){
        this.variable = variable;
        this.expression = expression;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }
}
