package controles;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


/**
 *
 * @author CFGS
 */

public class HelloWorldLabel {
    public static void main(String[] args) {
        JLabel saludo=new JLabel("Hello World!", JLabel.CENTER);
        JFrame ventana=new JFrame("Demo JLabel(etiqueta)");
        
        ventana.add(saludo);
        //ventana.setSize(400,200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //saludo.setHorizontalAlignment(JLabel.RIGHT);
        saludo.setFont(new Font("Courier New", Font.BOLD, 32));
        saludo.setForeground(Color.yellow);
        saludo.setBackground(Color.red);
        saludo.setOpaque(true);
        
        saludo.setBorder(BorderFactory.createEmptyBorder(12, 20, 12, 20));
        ventana.pack();
    } //Fin del main

} //Fin de la clase HelloWorldLabel
