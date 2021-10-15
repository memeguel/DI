package d02_ColocarFrame;

import java.awt.Color;
import javax.swing.JFrame;

class Marco1 extends JFrame{
    public Marco1(){
        //Tamaño de la ventana
        //setSize(500, 300);
        
        //Colocar la ventana
        //setLocation(100, 100);
        
        //Fusion de las 2
        setBounds(100, 100, 500, 300);
        
        setResizable(false);

        
    }
}
/**
 *
 * @author CFGS
 */

public class ColocarFrame {
    public static void main(String[] args) {
        Marco1 marco1=new Marco1();
        
        marco1.setVisible(true);
        
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } //Fin del main

} //Fin de la clase ColocarFrame
