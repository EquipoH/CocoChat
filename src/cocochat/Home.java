package cocochat;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import pojos.pojoUsuario;

public class Home extends JFrame
{
    HelperSocket hSocket;
    pojoUsuario myUser;
    public Home(HelperSocket hSocket,pojoUsuario myUser)
    {
        this.hSocket=hSocket;
        this.myUser=myUser;
        
        this.setMinimumSize(new Dimension(350, 500));

        this.getContentPane().setBackground(new Color(26,26,26));
        Font fuente = new Font("Gadugi",0,14);

        JLabel c1 = new JLabel("Conectados");
        JLabel c2 = new JLabel("Grupos");
        JLabel c3 = new JLabel("Amigos");
        JComboBox c4 = new JComboBox();
        JComboBox c5 = new JComboBox();
        JComboBox c6 = new JComboBox();
        
        c1.setHorizontalAlignment(JLabel.CENTER);
        c1.setVerticalAlignment(JLabel.CENTER);
        c1.setFont(fuente);
        c1.setOpaque(true);
        c1.setBackground(new Color(247,151,29));
        c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //actualizar usuaruos conectados
                try{
                hSocket.salida.writeUTF("f");
                String usuarioS=hSocket.entrada.readUTF();
                String[] usuarios=usuarioS.split("/");
                for (String usuario:usuarios){
                    c4.addItem(usuario);
                    System.out.println(usuario);
                }
                
                
                
                }catch(IOException e){
                }                
            }
        }); ;

        c2.setHorizontalAlignment(JLabel.CENTER);
        c2.setVerticalAlignment(JLabel.CENTER);
        c2.setFont(fuente);
        c2.setOpaque(true);
        c2.setBackground(new Color(247,151,29));
        
        c3.setHorizontalAlignment(JLabel.CENTER);
        c3.setVerticalAlignment(JLabel.CENTER);
        c3.setFont(fuente);
        c3.setOpaque(true);
        c3.setBackground(new Color(247,151,29));
                
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
 
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(c1, 150, 300, 450)
                        .addComponent(c4, 150, 300, 450)
                )
                .addGroup(layout.createParallelGroup()
                        .addComponent(c2, 150, 300, 450)
                        .addComponent(c5, 150, 300, 450)
                )
                .addGroup(layout.createParallelGroup()
                        .addComponent(c3 ,150, 300, 450)
                        .addComponent(c6, 150, 300, 450)
                )
        );
        
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(c1)
                        .addComponent(c2)
                        .addComponent(c3)
                )
                .addGroup(layout.createParallelGroup()
                        .addComponent(c4, 20, 30, 40)
                        .addComponent(c5, 20, 30, 40)
                        .addComponent(c6, 20, 30, 40)
                )
        );
 
        setTitle("CocoChat");
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
  }
