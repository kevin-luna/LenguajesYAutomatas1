import parser.*;
import parser.ast.Program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args)  {
        if (args.length == 0) {
            System.out.println("Debe proporcionarse una ruta de archivo");
            System.exit(0);
        }
        String ruta = args[0];
        PascalParser parser = null;
        try{
            parser = new PascalParser(new PascalParserTokenManager(new SimpleCharStream(new FileInputStream(ruta))));
            Program program = parser.Program();
            if(parser.thereAreErrors()){
                parser.printErrors();
            }else{
                System.out.println("No se encontraron errores");
                System.out.println("Imprimiendo el AST");
                program.print(0);
                System.out.println("Generando el codigo intermedio...");
                ArrayList<Quadruple> ir = program.generateIntermediateCode();
                for(Quadruple q: ir){
                    System.out.println(q);
                }
            }
        }catch(ParseException e){
            System.out.println("Error: " + e.getMessage());
            //e.printStackTrace();
        }catch(FileNotFoundException e){
            System.out.println("No se encontró el archivo: " + e.getMessage());
        }catch (TokenMgrError e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}