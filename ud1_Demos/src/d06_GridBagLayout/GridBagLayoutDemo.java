package d06_GridBagLayout;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


/**
 *
 * @author CFGS
 */

public class GridBagLayoutDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        GridBagLayoutDemo.inicializarVentana();
        });
    } //Fin del main
    private static void inicializarVentana(){
        //JFrame ventana=new Ventana();
        //JFrame ventana=new Ventana2();
        JFrame ventana=new Ventana3();
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    
} //Fin de la clase GridBagLayoutDemo
