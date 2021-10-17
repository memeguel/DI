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
            Image imagen=new ImageIcon(getClass().getResource("../imagenes/icono.png")).getImage();
            //ImageIcon imagen=new ImageIcon("C:\\Users\\CFGS\\Pictures\\icono.png");
            setIconImage(imagen.getScaledInstance(100, 50, 0));
            //setIconImage(imagen.getImage());
                
            //Intento de reescalado de icono
            //setIconImage(imagen.getScaledInstance(WIDTH, HEIGHT, WIDTH));
            
            setLocationRelativeTo(null);
            setName("Frame centrado en la ventana");
            setVisible(true);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
            
            

    //        int y=getMaximumSize().height/2;
    //        int x=getMaximumSize().width/2;
    //        setLocation(x, y);
        }

public class Ejercicio extends JFrame{
        
        

    
    public static void main(String[] args) {
        JFrame ventana1=new Ventana();
        
        
        
    } //Fin del main

    

} //Fin de la clase Ejercicio
