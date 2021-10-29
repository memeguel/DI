package layouts.boxLayouts;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


/**
 * 1. Sin espacio
 * 2. Añadimos un EmptyBorder y RigidArea 
 * 3. Glue 
 * 4. Box.Filler 
 * 5. Alineación horizontal <*>
 * 6. Alineacion vertical
 * 
 */

public class BoxLayout_parte5 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BoxLayout_parte5().inicializarVentana();
        });
    } //Fin del main
    private void inicializarVentana(){
        JFrame ventana=new JFrame("BoxLayout demo parte 5");
        
        addComponentes(ventana);
        
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
    public void addComponentes(JFrame frame){
        JButton bt1=new JButton("Botón 1");
        JButton bt2=new JButton("Botón 2------");
        JButton bt3=new JButton("Botón 3");
        JButton bt4=new JButton("Botón 4------");
        JButton bt5=new JButton("Botón 5");
        JButton bt6=new JButton("Botón 6------");
        
        bt3.setAlignmentX(Component.CENTER_ALIGNMENT);
        bt4.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        bt5.setAlignmentX(Component.RIGHT_ALIGNMENT);
        bt6.setAlignmentX(Component.RIGHT_ALIGNMENT);
        
        JPanel panel=new JPanel();
        JPanel container1=new JPanel();
        JPanel container2=new JPanel();
        JPanel container3=new JPanel();
        
        
        //Añadimos los botones al panel con RigidArea entre ellos
        
        container1.add(bt1);
        container1.add(bt2);
        //container1.add(Box.createHorizontalBox());
        
        container2.add(bt3);
        container2.add(bt4);
        
        container3.add(bt5);
        container3.add(bt6);
        
        panel.add(container1);
        panel.add(container2);
        panel.add(container3);
        //Creamos un BoxLayout horizontal
        BoxLayout box=new BoxLayout(panel, BoxLayout.LINE_AXIS);
        BoxLayout box2=new BoxLayout(container1, BoxLayout.PAGE_AXIS);
        BoxLayout box3=new BoxLayout(container2, BoxLayout.PAGE_AXIS);
        BoxLayout box4=new BoxLayout(container3, BoxLayout.PAGE_AXIS);
        
        //Creamos el EmptyBorder
        panel.setBorder(new EmptyBorder(20, 50, 20, 50));
        
        container1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "LEFT"));
        container2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "CENTER"));
        container3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "RIGHT"));
        //Asignamos al panel el Layout creado
        panel.setLayout(box);
        
        container1.setLayout(box2);
        container2.setLayout(box3);
        container3.setLayout(box4);
        
        //Añadimos el panel al frame
        frame.add(panel);
        
    }
} //Fin de la clase BoxLayout_parte1
