/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.Image;
import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.LEADING;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;

/**
 *
 * @author migue
 */
public class VentanaRegistro extends JFrame {
    VentanaRegistro(){
     //c1 -> Label con un mensaje
     // c2 -> Nombre del usuario.  c3 -> Apellidos del usuario
     //c4 -> Correo, c5 -> Contraseña, c6-> Pregunta, c7-> Button aceptar
    JLabel c1 = new JLabel("Abre una nueva cuenta");
    JTextPane c2 = new JTextPane();
    c2.setText("Nombre(s)");
    JTextPane c3 = new JTextPane();
    c3.setText("Apellido(s)");
    JTextPane c4 = new JTextPane();
    c4.setText("Correo electrónico");
    JPasswordField c5 = new JPasswordField();
    c5.setText("Password");
    JTextPane c6 = new JTextPane();
    c6.setText("¿Cúal es tu color favorito?");
     JButton c7 = new JButton("Registrar");
    
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setAutoCreateGaps(true); //Separación entre componentes
    layout.setAutoCreateContainerGaps(true); // separación con la ventana
    
     layout.setHorizontalGroup(layout.createParallelGroup(LEADING)
                    
                        .addComponent(c1,100,300,300)//version con nombre de componente, tamaño minimo, preferente y tamaño máximo)
                        .addComponent(c2,100, 300,300)
                        .addComponent(c3,100,300,300)
                        .addComponent(c4, 100,300,300)
                        .addComponent(c5, 100, 300, 300)
                        .addComponent(c6, 100, 300,300)
                        .addComponent(c7, 100, 150, 150)
                     
        );

          layout.setVerticalGroup(layout.createSequentialGroup()
                        .addComponent(c1,30,30,30)
                        .addGap(20)
                        .addComponent(c2,30, 30,30)
                        .addGap(15)
                        .addComponent(c3,30,30,30)
                        .addGap(15)
                        .addComponent(c4, 30,40,40)
                        .addGap(15)
                        .addComponent(c5, 40, 40, 40)   
                        .addGap(15)
                        .addComponent(c6, 40,40,40)
                        .addGap(15)
                        .addComponent(c7,40,40,40)
                  
          );
 
        setTitle("REGISTRO");
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
    }
    
    
}
