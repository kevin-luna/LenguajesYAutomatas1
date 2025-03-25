package parser;

public enum SymbolType {
    VARIABLE, CONSTANT, ARRAY, PROCEDURE, FUNCTION, RECORD, SET;

    public String toString() {
        switch (this) {
            case VARIABLE:
                return "VARIABLE";
            case CONSTANT:
                return "CONSTANT";
            case ARRAY:
                return "ARRAY";
            case PROCEDURE:
                return "PROCEDURE";
            case FUNCTION:
                return "FUNCTION";
            case RECORD:
                return "RECORD";
            case SET:
                return "SET";
            default:
                return "UNKNOWN";
        }
    }
}
