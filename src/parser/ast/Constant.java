package parser.ast;

import parser.DataType;

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

    @Override
    public void generateCode() {

    }
}
