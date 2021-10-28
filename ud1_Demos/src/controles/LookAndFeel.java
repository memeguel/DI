package controles;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


/**
 *
 * @author CFGS
 */

public class LookAndFeel {
    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new EventDispatchThread().inicializarInterfaz();
//            }
//        });
        
        SwingUtilities.invokeLater(() -> {
            new LookAndFeel().inicializarInterfaz();
        });
    } //Fin del main
    public void inicializarInterfaz(){
        //Creamos una etiqueta
        //JLabel saludo=new JLabel("Hola mundo!",JLabel.CENTER);
        JLabel saludo=new JLabel("Hola mundo!");
        
        //saludo.setHorizontalAlignment(SwingConstants.CENTER);
        saludo.setHorizontalAlignment(JLabel.CENTER);
        saludo.setFont(new Font("verdana", Font.ITALIC, 32));
        saludo.setForeground(Color.red);
        
        //Creamos la ventana
        JFrame ventana=new JFrame("Demo Event Dispatch Thread");
        ventana.add(saludo);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 200);
        ventana.setLocationRelativeTo(null);
        
    }
} //Fin de la clase LookAndFeel
