package layouts.boxLayouts;

import java.awt.Dimension;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


/**
 * 1. Sin espacio
 * 2. Añadimos un EmptyBorder y RigidArea 
 * 3. Glue 
 * 4. Box.Filler <*>
 *      min: w10 h20 / preferred: w20 h30 / max: w50 h100
 * 5. Alineación horizontal
 * 6. Alineacion vertical
 * 
 */

public class BoxLayout_parte4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BoxLayout_parte4().inicializarVentana();
        });
    } //Fin del main
    private void inicializarVentana(){
        JFrame ventana=new JFrame("BoxLayout demo parte 4");
        
        addComponentes(ventana);
        
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
    public void addComponentes(JFrame frame){
        JButton bt1=new JButton("Botón 1");
        JButton bt2=new JButton("Botón 2");
        JButton bt3=new JButton("Botón 3");
        
        JPanel panel=new JPanel();
        
        Dimension minSize=new Dimension(10, 5);
        Dimension preferredSize=new Dimension(20, 50);
        Dimension maxSize=new Dimension(50, Short.MAX_VALUE);
        
        //Añadimos los botones al panel con RigidArea entre ellos
        panel.add(bt1);
        panel.add(new Box.Filler(minSize, preferredSize, maxSize));
        
        //panel.add(Box.createVerticalGlue());
        panel.add(bt2);
        //panel.add(Box.createVerticalGlue());
        panel.add(bt3);
        
        //Creamos un BoxLayout horizontal
        BoxLayout box=new BoxLayout(panel, BoxLayout.PAGE_AXIS);
        
        //Creamos el EmptyBorder
        panel.setBorder(new EmptyBorder(20, 50, 20, 50));
        
        //Asignamos al panel el Layout creado
        panel.setLayout(box);
        
        //Añadimos el panel al frame
        frame.add(panel);
        
    }
} //Fin de la clase BoxLayout_parte1
