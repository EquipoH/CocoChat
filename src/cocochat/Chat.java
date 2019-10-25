/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocochat;
import java.awt.Color;
import java.awt.Image;
import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.LEADING;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author migue
 */
public class Chat extends JFrame{
    
    Chat(){
    JFormattedTextField c1 =  new javax.swing.JFormattedTextField();
    c1.setText("");
    c1.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
    c1.setText("PERFIL");
    c1.setEditable(false);
    c1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
    
    JTextArea c2 = new javax.swing.JTextArea();
    c2.setEditable(false);
    c2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
    
     JTextField c3 = new JTextField();
     c3.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
     TextPrompt prueba4 = new TextPrompt("Escribe un mensaje...", c3 );
     
     
     JButton c4 = new JButton("OK");
     
      JLabel c5 = new JLabel("");
      c5.setText("");
      c5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
     
     GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setAutoCreateGaps(true); //Separación entre componentes
    layout.setAutoCreateContainerGaps(true); // separación con la ventana
    
     layout.setHorizontalGroup(layout.createParallelGroup(LEADING)
             .addGroup(layout.createSequentialGroup()
                .addComponent(c5, 20,20,20)
                .addComponent(c1, 265, 265, 265)//version con nombre de componente, tamaño minimo, preferente y tamaño máximo)
             )
             .addGroup(layout.createParallelGroup()
              .addComponent(c2, 100, 300, 300))
             .addGroup(layout.createSequentialGroup()
                .addComponent(c3, 215, 215, 215)
                .addComponent(c4, 80, 80, 80))
        );
        
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                 .addComponent(c5, 50,50,50)
                 .addComponent(c1, 50, 50, 50)
                )
                .addGroup(layout.createSequentialGroup()
                .addComponent(c2, 300, 300,300)
                .addGap(15))
                
                .addGroup(layout.createParallelGroup()
                .addComponent(c3, 30, 30, 30)
                .addComponent(c4, 30,30,30))
        );
        
        this.getContentPane();
        setTitle("CHAT");
        pack();
        
        ImageIcon logo2 = new ImageIcon(getClass().getResource("/imagen/flecha5.png"));
        ImageIcon icono2 = new ImageIcon(logo2.getImage().getScaledInstance(c5.getWidth(), c5.getWidth(), Image.SCALE_AREA_AVERAGING));
        c5.setIcon(icono2);
    }
    
}
