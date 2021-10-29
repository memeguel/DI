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
 * 5. Alineación horizontal 
 * 6. Alineacion vertical <*>
 * 
 */

public class BoxLayout_parte6 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BoxLayout_parte6().inicializarVentana();
        });
    } //Fin del main
    private void inicializarVentana(){
        JFrame ventana=new JFrame("BoxLayout demo parte 5");
        
        addComponentes(ventana);
        ventana.setSize(650, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
    public void addComponentes(JFrame frame){
        
        JButton bt1=new JButton("Botón 1",new ImageIcon("src\\imagenes\\middle.gif"));
        JButton bt2=new JButton("Botón 2",new ImageIcon("src\\imagenes\\geek-cght.gif"));
        JButton bt3=new JButton("Botón 1",new ImageIcon("src\\imagenes\\middle.gif"));
        JButton bt4=new JButton("Botón 2",new ImageIcon("src\\imagenes\\geek-cght.gif"));
        
        
        
        JPanel panel=new JPanel();
        JPanel container1=new JPanel();
        JPanel container2=new JPanel();
        
        panel.setPreferredSize(new Dimension(650, 600));
        container1.setPreferredSize(new Dimension(400, 400));
        container2.setPreferredSize(new Dimension(200, 400));
        
        
        //Añadimos los botones al panel con RigidArea entre ellos
        
        container1.add(bt1);
        container1.add(bt2);
        //container1.add(Box.createHorizontalBox());
        bt3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        bt4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        
        container2.add(bt3);
        container2.add(bt4);
        
        panel.add(container1);
        panel.add(container2);
        //Creamos un BoxLayout horizontal
        BoxLayout box=new BoxLayout(panel, BoxLayout.LINE_AXIS);
        BoxLayout box2=new BoxLayout(container1, BoxLayout.LINE_AXIS);
        BoxLayout box3=new BoxLayout(container2, BoxLayout.LINE_AXIS);
        
        //Creamos el EmptyBorder

        
        container1.setBorder(BorderFactory.createTitledBorder(new EmptyBorder(20, 50, 20, 50)),"Por defecto"));
        container2.setBorder(BorderFactory.createTitledBorder("Bottom alignment"));
        //Asignamos al panel el Layout creado
        panel.setLayout(box);
        panel.setBorder(new EmptyBorder(20, 50, 20, 50));
        
        container1.setLayout(box2);
        container1.setAlignmentY(Component.CENTER_ALIGNMENT);
        
        container2.setLayout(box3);
        container2.setAlignmentY(Component.CENTER_ALIGNMENT);
        
        
        //Añadimos el panel al frame
        frame.add(panel);
        
        
    }
} //Fin de la clase BoxLayout_parte1
