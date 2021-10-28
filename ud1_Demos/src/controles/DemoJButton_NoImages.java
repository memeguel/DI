package controles;


/**
 *
 * @author CFGS
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;
import javax.swing.SwingUtilities;

/**
*
@author CFGS
*/
public class DemoJButton_NoImages {

    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               new DemoJButton_NoImages().inicializarVentana();
            }
        });
        
    } //Fin del main

    private void inicializarVentana() {
        
        //1 Creamos 3 botones
        JButton boton1 = new JButton("Button One");
        JButton boton2 = new JButton("Button Two");
        JButton boton3 = new JButton("Button Three");
        
        //Cambiar la feunte a boton
        boton1.setFont(new Font("serif", Font.ITALIC, 20));
        boton1.setForeground(Color.BLUE);
        
        boton2.setEnabled(false);
        
        boton2.setPreferredSize(boton1.getPreferredSize());
        boton3.setPreferredSize(boton1.getPreferredSize());
        
        boton1.setMnemonic('o');
        boton2.setMnemonic('t');
        boton3.setMnemonic('h');
        
        boton1.setDisplayedMnemonicIndex(7);
        boton2.setDisplayedMnemonicIndex(7);
        
        JFrame frame = new JFrame("Demo JButton");
        
        //1.1AÃ±adir los botones al Frame
        frame.add(boton1);
        frame.add(boton2);
        frame.add(boton3);
        
        frame.setLayout(new FlowLayout());
        
        frame.setSize(180, 180);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getRootPane().setDefaultButton(boton3);
        
        
        
    }

} //Fin de la clase DemoJButton
