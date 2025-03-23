package parser.ast;

import java.util.ArrayList;

public class WriteCall extends Statement{

    protected ArrayList<Expression> expressions;

    public WriteCall(){}

    public WriteCall(ArrayList<Expression> expressions) {
        this.expressions = expressions;
    }

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(ArrayList<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }
}
