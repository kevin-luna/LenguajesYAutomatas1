package parser.ast;

import parser.DataType;
import parser.IRInstruction;
import parser.IRInstruction.*;
import parser.Quadruple;

import java.util.ArrayList;

import parser.IRInstruction;

public class ConstBlock extends Block{
    private ArrayList<ConstDeclaration> constants;

    public ConstBlock() {
        super(BlockType.CONST_BLOCK);
    }

    public ConstBlock(ArrayList<ConstDeclaration> constants) {
        super(BlockType.CONST_BLOCK);
        this.constants = constants;
    }


    @Override
    public void traverse() {

    }

    @Override
    public ArrayList<Quadruple> generateIntermediateCode(){
        ArrayList<Quadruple> ir = new ArrayList<>();
        for(ConstDeclaration cd : constants){
            if(cd!=null && this.symbolTableCpy.getUsages(cd.getName())>0){
                IRInstruction ins = null;
                switch (cd.getDataType()){
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
                ir.add(new Quadruple(ins,cd.getName()));
            }
        }
        return ir;
    }

    @Override
    public void generateCode() {

    }

    @Override
    public void print(int level){
        Utils.printIntermediateBranch(level);
        System.out.println("CONST");
        for(int i=0; i<constants.size(); i++){
            ConstDeclaration cd = constants.get(i);
            if(cd!=null){
                Utils.printBranch(i==constants.size()-1,level+1);
                cd.print(level+1);
            }
        }
    }
}
