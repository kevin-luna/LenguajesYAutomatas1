package parser;

public class ErrorEntry {
    private ErrorType errorType;
    private int lineNumber;
    private String description;

    public ErrorEntry(){}

    public ErrorEntry(ErrorType errorType, int lineNumber, String description) {
        this.errorType = errorType;
        this.lineNumber = lineNumber;
        this.description = description;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public void setErrorType(ErrorType errorType) {
        this.errorType = errorType;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        String str_errorType = "";
        switch (this.errorType){
            case LEXICAL_ERROR -> str_errorType ="ERROR LEXICO:";
            case SYNTAX_ERROR -> str_errorType = "ERROR DE SINTAXIS";
            case SEMANTIC_ERROR -> str_errorType = "ERROR SEMANTICO";
        }
        return str_errorType+": linea "+lineNumber+"\n\t"+description;
    }
}
