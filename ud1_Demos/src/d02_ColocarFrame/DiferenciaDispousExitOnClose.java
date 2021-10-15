package d02_ColocarFrame;

import javax.swing.JFrame;


/**
 *
 * @author CFGS
 */

public class DiferenciaDispousExitOnClose {
    public static void main(String[] args) {
        JFrame ventana1=new JFrame("Ventana1");
        JFrame ventana2=new JFrame("Ventana2");
        
        ventana1.setBounds(600, 100, 500, 300);
        ventana2.setBounds(100, 100, 500, 300);
        
        ventana1.setVisible(true);
        ventana2.setVisible(true);
        
        //Cerrar esta ventana
        ventana1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Cerrar todo
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } //Fin del main

} //Fin de la clase DiferenciaDispousExitOnClose
