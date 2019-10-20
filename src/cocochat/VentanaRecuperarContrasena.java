/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocochat;

import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.LEADING;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;

public class VentanaRecuperarContrasena extends JFrame 
{
    
    public VentanaRecuperarContrasena()
    {
        Font fuente = new Font("Gadugi",0,14);
        Font fuente2 = new Font("Gadugi",0,18);
        
        this.getContentPane().setBackground(new Color(26,26,26));
        
        JLabel c1 = new JLabel("�Cu�l es tu color favorito?");
        c1.setFont(fuente); 
        c1.setForeground(Color.white);
        
        JTextPane c2 = new JTextPane();
        c2.setText("");
        c2.setFont(fuente2); 
        c2.setBackground(new Color(200,255,255));
        c2.setBorder(null);
        
        JButton c3 = new JButton("Recuperar mi contrase�a");
        c3.setFont(fuente); 
        c3.setBackground(new Color(247,151,29));
    
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

           setTitle("Recuperar mi contrase�a");
           pack();
           setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }
}