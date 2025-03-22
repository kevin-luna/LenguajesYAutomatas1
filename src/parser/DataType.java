package parser;

public enum DataType {
    INTEGER, REAL, CHAR, STRING, BOOLEAN,UNKNOWN;

    @Override
    public String toString() {
        String dt = null;
        switch (this){
            case INTEGER -> dt = "ENTERO";
            case REAL -> dt = "REAL";
            case CHAR -> dt = "CARACTER";
            case BOOLEAN -> dt = "BOOLEANO";
            case STRING -> dt = "CADENA";
            default -> dt="DESCONOCIDO";
        }
        return dt;
    }
}
