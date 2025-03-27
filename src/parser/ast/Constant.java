package parser.ast;

import parser.DataType;
import parser.Quadruple;

import java.util.ArrayList;

public class Constant extends UnsignedConstant{
    private String sign;

    public Constant(){}

    public Constant(String value,DataType type){
        this.value = value;
        this.type = type;
    }

    public Constant(String value, DataType type, String sign) {
        super(value, type);
        this.sign = sign;
    }


    @Override
    public void traverse() {

    }

    public ArrayList<Quadruple> generateIntermediateCode(){
        return null;
    }

    @Override
    public void generateCode() {

    }

    @Override
    public void print(int level) {

    }
}
