package parte1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author CFGS
 */
public class Ejercicio {

    JButton btn1;
    JButton btn2;
    JButton btn3;
    FlowLayout fl;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio().inicializarVentana();
        });
    } //Fin del main

    private void inicializarVentana() {
        JFrame ventana = new JFrame("Actividad 1.3 Ejercicio 1");
        anadirComponentes(ventana);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(350, 150);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    private void anadirComponentes(JFrame ventana) {
        fl = new FlowLayout(FlowLayout.CENTER);
        btn1 = new JButton("Left");
        btn2 = new JButton("Center");
        btn3 = new JButton("Right");

        btn1.addActionListener((ActionEvent e) -> {
            colocarBotones(e, ventana);
            
        });
        btn2.addActionListener((ActionEvent e) -> {
            colocarBotones(e, ventana);
            
        });
        btn3.addActionListener((ActionEvent e) -> {
            colocarBotones(e, ventana);
            
        });

        ventana.add(btn1);
        ventana.add(btn2);
        ventana.add(btn3);

        ventana.setLayout(fl);
    }

    private void colocarBotones(ActionEvent e, JFrame ventana) {
        if (e.getSource().equals(btn1)) {
            fl.setAlignment(FlowLayout.LEFT);
        } else if (e.getSource().equals(btn2)) {
            fl.setAlignment(FlowLayout.CENTER);
        } else if (e.getSource().equals(btn3)) {
            fl.setAlignment(FlowLayout.RIGHT);
        }
        ventana.setLayout(fl);
        ventana.setVisible(true);
    }

} //Fin de la clase Ejercicio
