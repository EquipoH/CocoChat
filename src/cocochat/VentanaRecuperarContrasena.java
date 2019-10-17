/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.LEADING;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;

/**
 *
 * @author migue
 */
public class VentanaRecuperarContrasena extends JFrame {
    
    public VentanaRecuperarContrasena(){
    JLabel c1 = new JLabel("¿Cúal es tu color favorito?");
    JTextPane c2 = new JTextPane();
    c2.setText("");
    JButton c3 = new JButton("RECUPERAR");
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setAutoCreateGaps(true); //Separación entre componentes
    layout.setAutoCreateContainerGaps(true); // separación con la ventana
    
     layout.setHorizontalGroup(layout.createParallelGroup(LEADING)
                    
                        .addComponent(c1,100,200,300)//version con nombre de componente, tamaño minimo, preferente y tamaño máximo)
                        .addComponent(c2,100, 200,300)
                        .addComponent(c3,100,200,300)
     );
     
      layout.setVerticalGroup(layout.createSequentialGroup()
                        .addComponent(c1,30,30,30)
                        .addComponent(c2,30, 30,30)
                        .addGap(15)
                        .addComponent(c3,30,30,30)
      );
      
       setTitle("Recuperar Contraseña");
       pack();
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     
    }
    
}
