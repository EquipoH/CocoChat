/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocochat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class CocoChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Socket cliente;
        String msg;
        byte[] recepcion = new byte[100];
        int resultado;
        
        try {

            
         
            cliente = new Socket ("192.168.0.5", 1234);

                   DataInputStream entrada=new DataInputStream( cliente.getInputStream());
                   DataOutputStream salida=new DataOutputStream(cliente.getOutputStream());
            //resultado = cliente.getInputStream().read(); //toma un ascii
            //System.out.println(""+resultado);
            //cliente.getOutputStream().write('7');
         
           // cliente.getOutputStream().write(msg.getBytes());
            if(cliente.isConnected()){
                 System.out.println("Se conecto correctamente");
            }else{
                System.out.println("Ocurrio un error para conectarse");
            }
             String dato;
           dato=entrada.readUTF();
            System.out.println(dato);
            
           
           VentanaLogin a = new VentanaLogin(cliente);
                 a.show();
                 
                 
           
           
           
        } catch (IOException ex) {
            Logger.getLogger(CocoChat.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        //VentanaLogin ventanaLogin= new VentanaLogin();
        //ventanaLogin.show();
    }
    
    
}
