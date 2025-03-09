package parser.ast;

public class Variable extends AST{
    private String name;

    public Variable(){}

    public Variable(String name){
        this.name = name;
    }

    @Override
    public void traverse() {

    }

    @Override
    public void generateCode() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
