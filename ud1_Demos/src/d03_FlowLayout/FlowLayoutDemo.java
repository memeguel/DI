package d03_FlowLayout;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


/**
 *
 * @author CFGS
 */

public class FlowLayoutDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        new FlowLayoutDemo().iniciarFlowLayout();
        });
    } //Fin del main
    public void iniciarFlowLayout(){
        JButton boton1=new JButton("Botón 1");
        JButton boton2=new JButton("Botón 2");
        //JButton boton3=new JButton("Botón 3 más largo");
        JButton boton3=new JButton("<html>Botón 3 <br> más largo</html>");
        JButton boton4=new JButton("Botón 4");
        JButton boton5=new JButton("Botón 5");
        
        boton3.setPreferredSize(new Dimension(100, 35));
        
        
        
        JFrame ventana=new JFrame("Demo FlowLayout");
        ventana.add(boton1);
        ventana.add(boton2);
        ventana.add(boton3);
        ventana.add(boton4);
        ventana.add(boton5);
        
        //ventana.setSize(500, 300);
        ventana.setSize(300, 300);
        //ventana.setSize(100, 300);
        
        FlowLayout f=new FlowLayout();
        f.setAlignOnBaseline(true);
        ventana.setLayout(f);
        
        ventana.setVisible(true);
    }
} //Fin de la clase FlowLayoutDemo
