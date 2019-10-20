/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocochat;

import java.awt.Color;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.LEADING;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.WindowConstants;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Pintor
 */
public class VentanaRegistro1 extends JFrame {
    int x, y;
    VentanaRegistro1(){
        
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//DISPOSE cierra solo la ventana no la aplicacion y EXIT_ON_CLOSE cierra toda la aplicacion
      setUndecorated(false); 

        this.getContentPane().setBackground(Color.orange);
     //c1 -> Label con un mensaje
     // c2 -> Nombre del usuario.  c3 -> Apellidos del usuario
     //c4 -> Correo, c5 -> Contraseña, c6-> Pregunta, c7-> Button aceptar
    JLabel c1 = new JLabel("Abre una nueva cuenta");
    c1.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        c1.setText("REGISTRARSE");
        
        JLabel c8 = new JLabel("");
    c8.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
        c8.setText("NOMBRE:");
        
        JLabel c9 = new JLabel("");
    c9.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
        c9.setText("APELLIDO:");
        
        JLabel c10 = new JLabel("");
    c10.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
        c10.setText("E-MAIL:");
        
        JLabel c11 = new JLabel("");
    c11.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
        c11.setText("CONTRASEÑA:");
        
        JLabel c12 = new JLabel("");
    c12.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
        c12.setText("¿CUÁL ES TU COLOR FAVORIT?");
        
        JLabel c18 = new JLabel("");
        c18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        c18.setText("");
        c18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c18MouseClicked(evt);
            }
        });
        
        JLabel c19 = new JLabel("");
        c19.setText("");
        
    JTextField c2 = new JTextField();
     c2.setFont(new java.awt.Font("Segoe UI Black", 3, 15));
    c2.setBackground(java.awt.Color.ORANGE);
    c2.setBorder(null); 
     TextPrompt prueba = new TextPrompt("Mariana", c2 );
    
    JTextField c3 = new JTextField();
    c3.setFont(new java.awt.Font("Segoe UI Black", 3, 15));
    TextPrompt prueba3 = new TextPrompt("Anaya", c3 );
    c3.setBackground(java.awt.Color.ORANGE);
    c3.setBorder(null);
    
    JTextField c4 = new JTextField();
    c4.setFont(new java.awt.Font("Segoe UI Black", 3, 15));
    TextPrompt prueba4 = new TextPrompt("LaPantu@Palmers.com", c4 );
    c4.setBackground(java.awt.Color.ORANGE);
    c4.setBorder(null);
    
    JPasswordField c5 = new JPasswordField();
   c5.setFont(new java.awt.Font("Segoe UI Black", 3, 15));
   TextPrompt prueba5 = new TextPrompt("Password", c5);
    c5.setBackground(java.awt.Color.ORANGE);
    c5.setBorder(null);
    
    
   JTextField c6 = new JTextField();
    c6.setFont(new java.awt.Font("Segoe UI Black", 3, 15));
    TextPrompt prueba6 = new TextPrompt("Caqui", c6 );
    c6.setBackground(java.awt.Color.ORANGE);
    c6.setBorder(null);
    
     JButton c7 = new JButton("Registrar");
    
    JSeparator c13 = new JSeparator();
    JSeparator c14 = new JSeparator();
    JSeparator c15 = new JSeparator();
    JSeparator c16 = new JSeparator();
    JSeparator c17 = new JSeparator();
    
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setAutoCreateGaps(true); //Separación entre componentes
    layout.setAutoCreateContainerGaps(true); // separación con la ventana
    
     layout.setHorizontalGroup(layout.createParallelGroup(LEADING)
                    
                        .addComponent(c1,100,300,300)//version con nombre de componente, tamaño minimo, preferente y tamaño máximo) 
                        .addComponent(c19,100,300,300)
                        .addComponent(c8,100,300,300)
                        .addComponent(c2,100, 300,300)
                        .addComponent(c13,100,300,300)
                        .addComponent(c9,100,300,300)
                        .addComponent(c3,100,300,300)
                        .addComponent(c4, 100,300,300)
                        .addComponent(c14,100,300,300)
                        .addComponent(c10,100,300,300)
                        .addComponent(c5, 100, 300, 300)
                        .addComponent(c15,100,300,300)
                        .addComponent(c11,100,300,300)
                        .addComponent(c6, 100, 300,300)
                        .addComponent(c16,100,300,300)
                        .addComponent(c12,100,300,300)
                        .addComponent(c17,100,300,300)
                        .addComponent(c18, 100,300,500)
                     
        );

          layout.setVerticalGroup(layout.createSequentialGroup()
                        .addComponent(c1,30,30,30)
                        .addGap(0)
                        .addComponent(c19,100,200,200)
                        .addComponent(c8,30,30,30)
                        .addComponent(c2,30, 30,30)
                        .addGap(0)
                        .addComponent(c13,30,30,30)
                        .addComponent(c9,30,30,30)
                        .addComponent(c3,30,30,30)
                        .addGap(0)
                        .addComponent(c14,30,30,30)
                        .addComponent(c10,30,30,30)
                        .addComponent(c4, 30,40,40)
                        .addGap(0)
                        .addComponent(c15,30,30,30)
                        .addComponent(c11,30,30,30)
                        .addComponent(c5, 40, 40, 40)   
                        .addGap(0)
                        .addComponent(c16,30,30,30)
                        .addComponent(c12,30,30,30)
                        .addComponent(c6, 40,40,40)
                        .addGap(0)
                        .addComponent(c17,30,30,30)
                        .addComponent(c18,150,150,150)
                  
          );
 
        setTitle("REGISTRO");
        pack();
        ImageIcon logo = new ImageIcon(getClass().getResource("/imagen/REGISTRAR.png"));
        ImageIcon icono = new ImageIcon(logo.getImage().getScaledInstance(c18.getWidth(), c18.getWidth(), Image.SCALE_AREA_AVERAGING));
        c18.setIcon(icono);
        
        ImageIcon logo2 = new ImageIcon(getClass().getResource("/imagen/usuario amarillo.png"));
        ImageIcon icono2 = new ImageIcon(logo2.getImage().getScaledInstance(c19.getWidth(), c19.getWidth(), Image.SCALE_AREA_AVERAGING));
        c19.setIcon(icono2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
    }
    
    private void c18MouseClicked(java.awt.event.MouseEvent evt) {                                     
        System.out.println("REGISTRADO");
    }
    
    private void c5MouseClicked(java.awt.event.MouseEvent evt) {     
         JPasswordField c5 = new JPasswordField();
        c5.setText("");
    }
    private void formMousePressed(java.awt.event.MouseEvent evt) {                                  
        x=evt.getX();
        y= evt.getY();
    }   
    
     private void formMouseDragged(java.awt.event.MouseEvent evt) {                                  
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x-x, point.y-y);
    } 
    
}
