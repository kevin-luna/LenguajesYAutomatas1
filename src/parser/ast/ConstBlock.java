package parser.ast;

import parser.DataType;
import parser.IRInstruction;
import parser.Quadruple;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

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
    public void generateCode(BufferedWriter outputFile) {
        try{
            for(ConstDeclaration cd : constants){
                String dt = "";
                switch (cd.getDataType()){
                    case DataType.INTEGER -> dt = "int";
                    case DataType.REAL -> dt = "double";
                    case DataType.CHAR -> dt = "char";
                    case DataType.BOOLEAN -> dt = "bool";
                    case DataType.STRING -> dt = "string";
                    //default -> dt = "int";
                }
                outputFile.write("const "+dt+" "+cd.getName()+"="+cd.getValue()+";");
                outputFile.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
