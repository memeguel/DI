package di_ut1_act01_miguel;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


/**
 *
 * @author CFGS
 */

class Ventana extends JFrame{
    public Ventana(){
        setSize(500, 400);
        Image imagen=new ImageIcon("JL");
        setIconImage(imagen);
        //setLocationRelativeTo(null);
        
//        int y=getMaximumSize().height/2;
//        int x=getMaximumSize().width/2;
//        setLocation(x, y);
    }
}

public class Ejercicio {
    public static void main(String[] args) {
        Ventana ventana1=new Ventana();
        ventana1.setName("Frame centrado en la ventana");
        ventana1.setVisible(true);
        
    } //Fin del main

} //Fin de la clase Ejercicio
