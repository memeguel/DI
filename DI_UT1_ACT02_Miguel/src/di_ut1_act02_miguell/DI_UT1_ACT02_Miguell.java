package di_ut1_act02_miguell;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.*;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createTitledBorder;
import static javax.swing.Box.createRigidArea;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author CFGS
 */

public class DI_UT1_ACT02_Miguell {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DI_UT1_ACT02_Miguell().inicializarVentana();
        });
    } //Fin del main
private void inicializarVentana(){
        JFrame ventana=new JFrame("Ejercicio");
        
        addComponentes(ventana);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
    public void addComponentes(JFrame frame){
        
        JButton bt1=new JButton("Botón 1",new ImageIcon("src\\imagenes\\middle.gif"));
        JButton bt2=new JButton("Botón 2",new ImageIcon("src\\imagenes\\geek-cght.gif"));
        JButton bt3=new JButton("Botón 1",new ImageIcon("src\\imagenes\\middle.gif"));
        JButton bt4=new JButton("Botón 2",new ImageIcon("src\\imagenes\\geek-cght.gif"));
        
        bt1.setVerticalTextPosition(SwingConstants.CENTER);
        bt1.setVerticalTextPosition(SwingConstants.BOTTOM);
        bt2.setHorizontalTextPosition(SwingConstants.CENTER);
        bt2.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        bt3.setHorizontalTextPosition(SwingConstants.CENTER);
        bt3.setVerticalTextPosition(SwingConstants.BOTTOM);
        bt4.setHorizontalTextPosition(SwingConstants.CENTER);
        bt4.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        bt3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        bt4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        
        JPanel panel=new JPanel();
        
        panel.add(crearPanel(bt1,bt2,"izquierda"));
        panel.add(crearPanel(bt3,bt4,"derecha"));

        BoxLayout box=new BoxLayout(panel, BoxLayout.LINE_AXIS);
 
        panel.setLayout(box);
        panel.setBorder(new EmptyBorder(20, 50, 20, 50));

        frame.add(panel);
    }

    private JPanel crearPanel(JButton bt1,JButton bt2,String panel) {
        JPanel container=new JPanel();
        
        container.add(bt1);
        container.add(createRigidArea(new Dimension(50, 0)));
        container.add(bt2);
        
        if (panel.equalsIgnoreCase("izquierda")) {
            container.setBorder(createCompoundBorder(createEmptyBorder(20,20,20,20),createTitledBorder("Izquierda")));
        }else if (panel.equalsIgnoreCase("derecha")){
            container.setBorder(createCompoundBorder(createEmptyBorder(20,20,20,20),createTitledBorder("Derecha")));
        }
        
        BoxLayout box=new BoxLayout(container, BoxLayout.LINE_AXIS);
        
        container.setLayout(box);
        container.setAlignmentY(Component.CENTER_ALIGNMENT);
        
        return container; 
    }
} //Fin de la clase DI_UT1_ACT02_Miguell
