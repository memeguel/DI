package d07_ActionButtons;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;


/**
 *
 * @author CFGS
 */

public class BotonesEventos {
    JLabel etiFrase;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BotonesEventos().inicializarVentana();
        });
    } //Fin del main

    private void inicializarVentana() {
        JFrame ventana=new JFrame("Título");
        anadirComponentes(ventana);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    private void anadirComponentes(JFrame ventana) {
        etiFrase=new JLabel("<html>La lluvia en Sevilla es una<br>maravilla</html>");
        JButton btn1=new JButton("Botón");
        
        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
        etiFrase.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JPanel pnl1=new JPanel();
        BoxLayout boxL=new BoxLayout(pnl1, BoxLayout.PAGE_AXIS);
        pnl1.setLayout(boxL);
        
        pnl1.add(btn1);
        pnl1.add(Box.createRigidArea(new Dimension(0, 20)));
        pnl1.add(etiFrase);
        
        pnl1.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        
        btn1.addActionListener((ActionEvent e) -> {
            int r=(int)(Math.random()*255);
            int g=(int)(Math.random()*255);
            int b=(int)(Math.random()*255);
            
            etiFrase.setForeground(new Color(r, g, b));
            etiFrase.setOpaque(true);
        });
        
        ventana.add(pnl1);
    }

    
} //Fin de la clase BotonesEventos
