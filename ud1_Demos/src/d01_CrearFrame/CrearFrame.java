package d01_CrearFrame;

import java.awt.Color;
import javax.swing.JFrame;


/**
 *
 * @author CFGS
 */

public class CrearFrame {
    public static void main(String[] args) {
        //1. Crear la ventana
        JFrame ventana=new JFrame("Crear Frame");
        
        //2. Establecere tamaño ventana
        ventana.setSize(500, 300);
        
        //3. Hacemos visible la ventana
        ventana.setVisible(true);
        
        //4. especificamos comportamiento boton cerrar
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    } //Fin del main

} //Fin de la clase CrearFrame
