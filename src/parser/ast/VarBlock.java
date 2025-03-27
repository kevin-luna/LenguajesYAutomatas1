package parser.ast;

import parser.DataType;
import parser.IRInstruction;
import parser.Quadruple;

import java.util.ArrayList;

public class VarBlock extends Block{
    private ArrayList<VariableDeclaration> variables;

    public VarBlock(){
        super(BlockType.VAR_BLOCK);
    }

    public VarBlock(ArrayList<VariableDeclaration> variables){
        super(BlockType.VAR_BLOCK);
        this.variables = variables;
    }

    @Override
    public ArrayList<Quadruple> generateIntermediateCode() {
        ArrayList<Quadruple> ir = new ArrayList<>();
        for(VariableDeclaration v : variables){
            if(v!=null){
                IRInstruction ins = null;
                switch (v.type){
                    case DataType.INTEGER -> {
                        ins = IRInstruction.DI;
                        break;
                    }
                    case DataType.REAL -> {
                        ins = IRInstruction.DR;
                        break;
                    }
                    case DataType.CHAR -> {
                        ins = IRInstruction.DC;
                        break;
                    }
                    case DataType.BOOLEAN ->{
                        ins = IRInstruction.DB;
                        break;
                    }
                    case DataType.STRING -> {
                        ins = IRInstruction.DS;
                        break;
                    }
                }
                if(v.getVariableType()== VariableDeclaration.VariableType.VARIABLE)ir.add(new Quadruple(ins,"1",null,v.name));
                else ir.add(new Quadruple(ins,Integer.toString(v.getLength()),null,v.name));
            }
        }
        return ir;
    }

    @Override
    public void generateCode() {}

    @Override
    public void print(int level) {
        Utils.printIntermediateBranch(level);
        System.out.println("VARBLOCK");
        for (int i=0;i<variables.size();i++){
            VariableDeclaration v = variables.get(i);
            if(v!=null){
                Utils.printBranch(i==variables.size()-1,level+1);
                v.print(level+1);
            }
        }
    }
}
