import parser.*;
import parser.ast.Program;

import java.io.*;
import java.sql.SQLOutput;
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
//                parser.printUsages();
//                System.out.println("Generando el codigo intermedio...");
//                ArrayList<Quadruple> ir = program.generateIntermediateCode();
//                for(Quadruple q: ir){
//                    System.out.println(q);
//                }
                File inputFile = new File(ruta);
                BufferedWriter tmpCFile = new BufferedWriter(new FileWriter(inputFile.getParent()+"/tmp.c"));
                program.generateCode(tmpCFile);
                tmpCFile.close();
            }
        }catch(ParseException e){
            //System.out.println("Error: " + e.getMessage());
            System.out.println("Hubo errores Sintacticos");
        //    e.printStackTrace();
        }catch(FileNotFoundException e){
            System.out.println("No se encontró el archivo: " + e.getMessage());
        }catch (TokenMgrError e){
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("No se pudo escribir el archivo de salida");
        }

    }
}