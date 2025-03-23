package parser.ast;

import java.util.ArrayList;

public class WritelnCall extends WriteCall{

    public WritelnCall(){}

    public WritelnCall(ArrayList<Expression> expressions){
        super(expressions);
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }
}
