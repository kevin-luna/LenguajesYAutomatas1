package parser;

public enum IRInstruction {
    ADD, // Suma op1+op2 y lo pone en res
    SUB, // Resta op1-op2 y lo pone en res
    MUL, //Multiplica op1*op2 y lo pone en res
    DIV, //Divide op1/op2 y lo pone en res
    MOD, //Calcula el modulo op1 % op2 y lo pone en res
    AND, //Calcula la operacion op1 AND op2 y lo pone en res
    OR, // Calcula la operacion op1 OR op2 y lo pone en res
    XOR, // Calcula la operacion op1 XOR op2 y lo pone en res
    NOT, // Calcula la operacion NOT op1 y lo pone en res
    EQ, //Comprueba que op1 = op2 y lo pone en res
    NEQ, //Comprueba que op1 != op2 y lo pone en res
    LT, //Comprueba que op1 < op2 y lo pone en res
    GT, //Comprueba que op1 > op2 y lo pone en res
    LEQ, //Comprueba que op1 <= op2 y lo pone en res
    GEQ, //Comprueba que op1 >= op2 y lo pone en res
    IF, //Si op1 es verdadero salta hacia op2
    DI, //Reserva espacio para op2 enteros con el identificador op1
    DR, //Reserva espacio para op2 reales con el identificador op1
    DC, //Reserva espacio para op2 caracteres con el identificador op1
    DS, //Reserva espacio para op2 cadenas con el identificador op1
    DB, //Reserva espacio para op2 booleanos con el identificador op1
    PI, //Imprime op1 como entero
    PR, //Imprime op1 como real
    PC, //Imprime op1 como caracter
    PB, //Imprime op1 como booleano
    PS, //Imprime op1 como cadena
    RI, //Lee un entero y lo pone en res
    RR, //Lee un real y lo pone en res
    RC, //Lee un caracter y lo pone en res
    RB, //Lee un booleano y lo pone en res
    RS, //Lee una cadena y la pone en res
    LBL, //Crea una etiqueta con el nombre res
    JMP, //Salta a la posicion op1
    ENDL, //Marca el fin de la etiqueta op1
    PGRM, //Indica el inicio del programa res
    MOV; //Asigna op1 a res

    public String toString() {
        switch (this) {
            case ADD:
                return "ADD";
            case SUB:
                return "SUB";
            case MUL:
                return "MUL";
            case DIV:
                return "DIV";
            case MOD:
                return "MOD";
            case AND:
                return "AND";
            case OR:
                return "OR";
            case XOR:
                return "XOR";
            case NOT:
                return "NOT";
            case EQ:
                return "EQ";
            case NEQ:
                return "NEQ";
            case LT:
                return "LT";
            case GT:
                return "GT";
            case LEQ:
                return "LEQ";
            case GEQ:
                return "GEQ";
            case IF:
                return "IF";
            case DI:
                return "DI";
            case DR:
                return "DR";
            case DC:
                return "DC";
            case DS:
                return "DS";
            case DB:
                return "DB";
            case PI:
                return "PI";
            case PR:
                return "PR";
            case PC:
                return "PC";
            case PB:
                return "PB";
            case PS:
                return "PS";
            case RR:
                return "RR";
            case RC:
                return "RC";
            case RB:
                return "RB";
            case RS:
                return "RS";
            case LBL:
                return "LBL";
            case JMP:
                return "JMP";
            case ENDL:
                return "ENDL";
            case PGRM:
                return "PGRM";
            case MOV:
                return "MOV";
            default:
                return "";
        }
    }
}
