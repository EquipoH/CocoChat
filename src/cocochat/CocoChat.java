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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojos.pojoMensajesPendientes;

/**
 *
 * @author Lenovo
 */
public class CocoChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            HelperSocket s=new HelperSocket(); 



            if(s.cliente.isConnected()){
                System.out.println("Se conecto correctamente");
            }else{
                System.out.println("Ocurrio un error para conectarse");
            }
            String dato;
            dato=s.entrada.readUTF();
            System.out.println(dato);


            VentanaLogin a = new VentanaLogin(s.entrada,s.salida);
            a.setVisible(true);

        } catch (IOException ex) {
            Logger.getLogger(CocoChat.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        //VentanaLogin ventanaLogin= new VentanaLogin();
        //ventanaLogin.show();
    }
    
    
}