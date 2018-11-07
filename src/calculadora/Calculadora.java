/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import Analizadores.Lexer;
import Analizadores.LexerSin;
import Analizadores.Sintactica;
import Analizadores.arbol;
import Analizadores.arbol.Nodo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mazinger
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);  
        System.out.println("Ingrese etapa (scan, parser, ast): ");
        String stage = reader.nextLine(); 
        stage=stage.toString();
        
        if("scan".equals(stage)){
            System.out.println("Ingrese expresion a operar: ");
            String operacion = reader.nextLine();
            scaner(operacion);
            
        }
        else if("parser".equals(stage)){
            System.out.println("Ingrese expresion a operar: ");
            String operacion = reader.nextLine();
            scaner(operacion);
            parser(operacion);
            
            
        }
        else if("ast".equals(stage)){
            System.out.println("Ingrese expresion a operar: ");
            String operacion = reader.nextLine();
            ast(operacion);
        }
        else if ("comando".equals(stage)){
            String ip = "google.com";
		runSystemCommand("cd C:/");
        }
         else if ("prueba".equals(stage)){
             System.out.println("Ingrese expresion a operar: ");
            String operacion = reader.nextLine();
            prueba(operacion);
        }
    
        
      
     
    }
    
    public static void runSystemCommand(String command) {

		try {
			Process p = Runtime.getRuntime().exec(command);
			BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(p.getInputStream()));

			String s = "";
			// reading output stream of the command
			while ((s = inputStream.readLine()) != null) {
				System.out.println(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    public static void scaner(String operacion) throws Exception{
    
        StringReader br = new StringReader(operacion);
        Lexer lexico = new Lexer(new BufferedReader(br));
        LexerSin sintactico = new LexerSin(lexico);
        sintactico.parse();
        System.out.println(" ");
        System.out.println("TOKENS ENCONTRADOS");
        for (int i=0;i<lexico.Tokensrec.size();i++){
            System.out.println(lexico.Tokensrec.get(i));
        }
        System.out.println(" ");
    }
    public static void parser(String operacion) throws Exception{
        StringReader br = new StringReader(operacion);
        Lexer lexico = new Lexer(new BufferedReader(br));
        Sintactica sintactico = new Sintactica(lexico);
        sintactico.parse();
        System.out.println(" ");
        System.out.println("GRAMATICAS ENCONTRADAS");
        for (int i=0;i<sintactico.Gramaticas.size();i++){
            System.out.println(sintactico.Gramaticas.get(i));
        }
        System.out.println(" ");
    }
    public static void ast(String operacion) throws Exception{
        FileReader fr = null;
        File output = new File ("D:\\Sexto Semestre\\Compiladores\\Calculadora\\src\\Analizadores\\grafo.gv");
        try ( //vaciamos el archivo de output
                BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {
            bw.write(" ");
        }
        StringReader br = new StringReader(operacion);
        Lexer lexico = new Lexer(new BufferedReader(br));
        Sintactica sintactico = new Sintactica(lexico);
        sintactico.parse();
        scaner(operacion);
        System.out.println(" ");
        System.out.println("GRAMATICAS ENCONTRADAS");
        for (int i=0;i<sintactico.Gramaticas.size();i++){
            System.out.println(sintactico.Gramaticas.get(i));
        }
        System.out.println(" ");
        int contador=sintactico.Gramaticas.size()-2;
        

        List<String> T = new ArrayList<String>();
        T.add("Inicial");
        
        imprimir("digraph example {"+"\n");
       while(contador>=0){
            String j=sintactico.Gramaticas.get(contador);
            if (isNumeric(j)){
                imprimir(T.get(T.size()-1)+" -> "+j+"\n");
                T.remove(T.get(T.size()-1));
            } 
            else if ("E".equals(j)){
                imprimir(T.get(T.size()-1)+" -> "+j+"\n");
                T.remove(T.get(T.size()-1));
                T.add(T.size(), j);
            }
            else {
                imprimir(T.get(T.size()-1)+" -> "+j+"\n");
                T.remove(T.get(T.size()-1));
                T.add(T.size(), j);
                T.add(T.size(), j);
            }
        
        contador=contador-1;
        }
       imprimir("}"+"\n");
    }
     public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
public static void prueba(String operacion) throws Exception{
        StringReader br = new StringReader(operacion);
        Lexer lexico = new Lexer(new BufferedReader(br));
        Sintactica sintactico = new Sintactica(lexico);
        sintactico.parse();
        System.out.println(" ");
        System.out.println("GRAMATICAS ENCONTRADAS");
        for (int i=0;i<sintactico.Gramaticas.size();i++){
            System.out.println(sintactico.Gramaticas.get(i));
        }
        System.out.println(sintactico.resultado);
    }
        public static void imprimir(String argumento){
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {

            File file = new File("D:\\Sexto Semestre\\Compiladores\\Calculadora\\src\\Analizadores\\grafo.gv");
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(argumento);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
        
}
