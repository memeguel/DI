package parte3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author CFGS
 */
public class Ejercicio {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio().inicializarVentana();
        });
    }

    private void inicializarVentana() {
        JFrame ventana = new JFrame("Actividad 1.3. Ejercicio3");
        anadirComponentes(ventana);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 290);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    private void anadirComponentes(JFrame ventana) {

        //Panel Norte
        JPanel pnlN = new JPanel();
        JButton btn1N = new JButton("Sup.1");
        JButton btn2N = new JButton("Sup.2");
        JButton btn3N = new JButton("Sup.3");
        JButton btn4N = new JButton("Sup.4");

        pnlN.setBackground(Color.cyan);
        pnlN.setOpaque(true);
        pnlN.add(btn1N);
        pnlN.add(btn2N);
        pnlN.add(btn3N);
        pnlN.add(btn4N);

        //Panel Sur
        JPanel pnlS = new JPanel();
        JButton btnS = new JButton("Listo");
        JTextField txtEscribirS = new JTextField();
        JLabel lblS = new JLabel("Pon texto");

        lblS.setBorder(new EmptyBorder(0, 5, 0, 5));
        pnlS.setLayout(new BoxLayout(pnlS, BoxLayout.LINE_AXIS));
        pnlS.setBorder(new EmptyBorder(10, 10, 10, 10));
        pnlS.setBackground(Color.yellow);
        pnlS.setOpaque(true);
        
        pnlS.add(lblS);
        pnlS.add(txtEscribirS);
        pnlS.add(btnS);

        //Panel Este
        JPanel pnlE = new JPanel();
        JButton btn1E = new JButton("A");
        JButton num2 = new JButton("B");
        JButton num3 = new JButton("C");
        JButton num4 = new JButton("D");

        pnlE.setLayout(new BoxLayout(pnlE, BoxLayout.PAGE_AXIS));
        pnlE.setBackground(Color.green);
        pnlE.setOpaque(true);
        
        pnlE.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlE.add(btn1E);
        pnlE.add(Box.createRigidArea(new Dimension(0, 15)));
        pnlE.add(num2);
        pnlE.add(Box.createRigidArea(new Dimension(0, 15)));
        pnlE.add(num3);
        pnlE.add(Box.createRigidArea(new Dimension(0, 15)));
        pnlE.add(num4);

        //Panel Oeste
        JPanel pnlO = new JPanel();
        JButton btn1O = new JButton("1");
        JButton btn2O = new JButton("2");
        JButton btn3O = new JButton("3");

        pnlO.setLayout(new BoxLayout(pnlO, BoxLayout.PAGE_AXIS));
        pnlO.setBackground(Color.red);
        pnlO.setOpaque(true);
        
        pnlO.add(Box.createRigidArea(new Dimension(0, 20)));
        pnlO.add(btn1O);
        pnlO.add(Box.createRigidArea(new Dimension(0, 25)));
        pnlO.add(btn2O);
        pnlO.add(Box.createRigidArea(new Dimension(0, 25)));
        pnlO.add(btn3O);

        //TextArea Centro
        JTextArea txtLeerC = new JTextArea();

        //Añadimos componentes a la ventana
        ventana.setLayout(new BorderLayout());
        ventana.add(pnlN, BorderLayout.NORTH);
        ventana.add(pnlS, BorderLayout.SOUTH);
        ventana.add(pnlE, BorderLayout.EAST);
        ventana.add(pnlO, BorderLayout.WEST);
        ventana.add(txtLeerC, BorderLayout.CENTER);

        //Acciones
        btnS.addActionListener((e) -> {
            if (txtEscribirS.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debes introducir datos en el campo de texto de la izquierda");
            } else {
                txtLeerC.setText(txtEscribirS.getText());
            }
        });
    }
} //Fin de la clase Ejercicio