package parser.ast;

import parser.Quadruple;

import java.util.ArrayList;

public abstract class Statement extends AST{
    @Override
    public void traverse() {

    }

    @Override
    public ArrayList<Quadruple> generateIntermediateCode() {
        if(this instanceof IfStatement){
            return ((IfStatement) this).generateIntermediateCode();
        }else if(this instanceof WhileStatement){
            return ((WhileStatement) this).generateIntermediateCode();
        }else if(this instanceof ForStatement){
            return ((ForStatement) this).generateIntermediateCode();
        }else if(this instanceof AssignmentStatement){
            return ((AssignmentStatement) this).generateIntermediateCode();
        }else if(this instanceof WriteCall){
            return ((WriteCall) this).generateIntermediateCode();
        }else if(this instanceof WritelnCall){
            return ((WritelnCall) this).generateIntermediateCode();
        }else if(this instanceof ReadCall){
            return ((ReadCall) this).generateIntermediateCode();
        }else if(this instanceof ReadlnCall){
            return ((ReadlnCall) this).generateIntermediateCode();
        }else if(this instanceof BreakStatement){
            return ((BreakStatement) this).generateIntermediateCode();
        }
        return ((ContinueStatement) this).generateIntermediateCode();
    }

    @Override
    public void generateCode() {

    }
}
