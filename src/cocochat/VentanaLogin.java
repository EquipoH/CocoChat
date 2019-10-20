package cocochat;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.LEADING;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;

public class VentanaLogin extends JFrame
{
    public VentanaLogin()
    {   
        Font fuente = new Font("Gadugi",0,14);
        
        JLabel c1 = new JLabel("");
        JTextField c2 = new JTextField(" Nombre de usuario");
        c2.setFont(fuente); 
        c2.setBackground(new Color(200,255,255));
        c2.setBorder(null);

        JTextField c3 = new JTextField(" Contraseña");
        c3.setFont(fuente);
        c3.setBackground(new Color(200,255,255));
        c3.setBorder(null);
        
        JButton c4 = new JButton("Entrar");
        c4.setBackground(new Color(247,151,29));
        c4.setForeground(Color.black);
        c4.setFont(fuente);
        
        JLabel c5 = new JLabel("¿Olvidaste tu contraseña?");
        c5.setFont(fuente); 
        c5.setForeground(Color.white);
        
        JLabel c6 = new JLabel("¿No tienes una cuenta? ¡Regístrate gratis!");
        c6.setFont(fuente); 
        c6.setForeground(Color.white);

        GroupLayout layout = new GroupLayout( getContentPane() );
        getContentPane().setLayout( layout );
        layout.setAutoCreateGaps( true ); //Separación entre componentes
        layout.setAutoCreateContainerGaps( true ); // separación con la ventana
        
        layout.setHorizontalGroup(layout.createParallelGroup(LEADING)
                .addComponent(c1, 100, 300, 500)//version con nombre de componente, tamaño minimo, preferente y tamaño máximo)
                .addComponent(c2, 100, 300, 300)
                .addComponent(c3, 100, 300, 300)
                .addComponent(c4, 100, 300, 500)
                .addComponent(c5, 100, 200, 200)
                .addComponent(c6, 260, 265, 270)
        );
        
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addComponent(c1, 100, 150, 150)
                .addGap(30)
                .addComponent(c2, 30, 30,30)
                .addGap(15)
                .addComponent(c3, 30, 30, 30)
                .addGap(15)
                .addComponent(c4, 30,40,40)
                .addGap(15)
                .addComponent(c5, 40, 40, 40)
                .addGap(15)
                .addComponent(c6, 40, 40, 40)
        );
        
        this.getContentPane().setBackground(new Color(26,26,26));
        setTitle("Login");
        pack();
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/imagen/logo.png"));
        ImageIcon icono = new ImageIcon(logo.getImage().getScaledInstance(c1.getWidth(), c1.getWidth(), Image.SCALE_DEFAULT));
        
        c1.setIcon(icono);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }   
}