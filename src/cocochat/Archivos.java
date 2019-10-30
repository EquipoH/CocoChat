/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocochat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Rafael
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Archivos archivo = new Archivos();
        archivo.leerMensaje();
    }
    public void escribirMensaje(String nick, String mensaje, String fechaYHora){
        try{
            //¶
            PrintWriter pw = new PrintWriter("archivo.txt");
            String texto="Hello everyone";
            pw.println(texto);
            pw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void leerMensaje(){
        try{
            String linea,nick,mensaje,fechaYHora;
            File archivo = new File("archivo.txt");//Con esta clase podemos saber si un archivo existe o no
            archivo.exists();//este metodo nos indica si el archivo existe o no
            FileReader fr = new FileReader("archivo.txt");
            BufferedReader br = new BufferedReader(fr);
            while((linea=br.readLine())!=null){
                for(int i=0;i<linea.length();i++){
                    if(linea.substring(i, 4).equals("nick:")){
                        int finNick;
                        for(int j=i+4;linea.charAt(j)!='/';j++){
                            
                        }
                        nick = linea.substring(i,4);
                        System.out.println("Nick: "+nick);
                    }else if(linea.substring(i, 7).equals("mensaje:")){
                        mensaje = linea.substring(i,7);
                        System.out.println("Mensaje: "+mensaje);
                    }
                    else if(linea.substring(i, 11).equals("fechaYHora:")){
                        fechaYHora = linea.substring(i,11);
                        System.out.println("Fecha Y Hora: "+fechaYHora);
                    }
                }
            }
        }catch(FileNotFoundException err){
            System.out.println(err.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
