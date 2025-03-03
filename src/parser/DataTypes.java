package parser;

public class DataTypes {
    /*Tamano de los tipos primitivos en bytes
     */
    public static final int INT_SIZE = 4;
    public static final int REAL_SIZE = 4;
    public static final int CHAR_SIZE = 1;
    public static final int BOOLEAN_SIZE = 1;

    public static int getSize(String dataType){
        DataType dt = DataTypes.getDataType(dataType);
        return DataTypes.getSize(dt);
    }

    public static int getSize(DataType dataType){
        switch (dataType){
            case INTEGER:
                return INT_SIZE;
            case REAL:
                return REAL_SIZE;
            case CHAR,STRING:
                return CHAR_SIZE;
            default:
                return 0;
        }
    }

    public static DataType getDataType(String dataType){
        DataType dt = null;
        switch (dataType){
            case "integer":
                dt = DataType.INTEGER;
            case "real":
                dt = DataType.REAL;
            case "char":
                dt = DataType.CHAR;
            case "boolean":
                dt = DataType.BOOLEAN;
            case "string":
                dt = DataType.STRING;
        }
        return dt;
    }
}
