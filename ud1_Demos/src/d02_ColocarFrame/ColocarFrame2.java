package d02_ColocarFrame;

import java.awt.Font;
import javax.swing.JFrame;


/**
 *
 * @author CFGS
 */

class Marco2 extends JFrame{
    public Marco2() {
        //setBounds(400, 200, 400, 400);
        
        //setResizable(false);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}

public class ColocarFrame2 {
    public static void main(String[] args) {
        Marco2 marco2=new Marco2();
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setVisible(true);
        
    } //Fin del main

} //Fin de la clase ColocarFrame2
