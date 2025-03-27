package parser.ast;

import parser.DataType;
import parser.IRInstruction;
import parser.Quadruple;

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
    public ArrayList<Quadruple> generateIntermediateCode() {
        ArrayList<Quadruple> ir = super.generateIntermediateCode();
        ir.add(new Quadruple(IRInstruction.PC,"\\n",null,null));
        return ir;
    }

    @Override
    public void generateCode() {

    }

    @Override
    public void print(int level){
        System.out.println("WRITELN_STATEMENT");
        for(int i = 1,j=0; i<expressions.size(); i++,j++){
            Utils.printBranch(i==expressions.size()-1,level+1);
            expressions.get(i).print(level+1);
        }
    }
}
