package parser.ast;

import java.util.ArrayList;

public class VarBlock {
    private ArrayList<VariableDeclaration> variables;

    public VarBlock(){

    }

    public VarBlock(ArrayList<VariableDeclaration> variables){
        this.variables = variables;
    }
}
