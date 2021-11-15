package parte2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author CFGS
 */
public class Ejercicio {

    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio().inicializarVentana();
        });
    } //Fin del main

    private void inicializarVentana() {
        JFrame ventana = new JFrame("Actividad 1.3 Ejercicio 1");
        anadirComponentes(ventana);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    private void anadirComponentes(JFrame ventana) {
        JTextArea txta1 = new JTextArea("Al pinchar en el botón copiar, se obtendrá el texto seleccionado "
                + "en el área de texto de la izquierda "
                + "y se copiará en el área de texto de la derecha.");
        
        JTextArea txta2 = new JTextArea();
        txta1.setPreferredSize(new Dimension(200, 100));
        txta2.setPreferredSize(new Dimension(200, 100));
        txta1.setLineWrap(true);
        txta2.setLineWrap(true);

        JButton btn1 = new JButton("Copy >>>");

        btn1.addActionListener((ActionEvent e) -> {
//            String frase="";
//            if (txta1.getCaret().getMark()>txta1.getCaret().getDot()) {
//                frase=txta1.getText().substring(txta1.getCaret().getDot(), txta1.getCaret().getMark());
//            }else{
//                frase=txta1.getText().substring(txta1.getCaret().getMark(), txta1.getCaret().getDot());
//            }
            
            txta2.setText(txta1.getSelectedText());

        });
        
        FlowLayout fl=new FlowLayout();
        
        ventana.add(txta1);
        ventana.add(btn1);
        ventana.add(txta2);
        ventana.setLayout(fl);

    }

} //Fin de la clase Ejercicio
