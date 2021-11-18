package d05_BorderLayout;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author CFGS
 */
public class BorderLayoutDemo {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            inicializarVentana();
        });

    } //Fin del main

    public static void inicializarVentana() {
        JFrame ventana = new JFrame("Border Layout");

        anadirComponentes(ventana);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }

    private static void anadirComponentes(JFrame ventana) {
        JButton bt1 = new JButton("Botón 1 (PAGE_START/NORTH)");
        JButton bt2 = new JButton("Botón 2 (CENTER)");
        JButton bt3 = new JButton("Botón 3 (LINE_START/WEST)");
        JButton bt4 = new JButton("Nombre muyyyyyy largo Botón 4 (PAGE_END/SOUTH)");
        JButton bt5 = new JButton("Botón 5 (LINE_END/EAST)");
        
        bt2.setPreferredSize(new Dimension(400, 100));
        

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(bt1,BorderLayout.NORTH);
        panel.add(bt2,BorderLayout.CENTER);
        panel.add(bt3,BorderLayout.WEST);
        panel.add(bt4,BorderLayout.SOUTH);
        panel.add(bt5,BorderLayout.EAST);
        

        ventana.add(panel);
    }
} //Fin de la clase BorderLayoutDemo
