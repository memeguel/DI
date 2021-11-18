package d07_ActionButtons;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author CFGS
 */
public class Principal_v4 {

    JRadioButton rbRojo;
    JRadioButton rbVerde;
    JRadioButton rbAzul;
    JLabel etiResultado;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal_v4().inicializarVentana();
            }
        });
    } // fin del main

    private void inicializarVentana() {
        JFrame ventana = new JFrame("Eventos demos 1");
        anadirComponentes(ventana);

        ventana.setSize(500, 400);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void anadirComponentes(JFrame ventana) {

        // Creamos el panel colores
        JPanel panelColores = new JPanel();
        BoxLayout boxColores = new BoxLayout(panelColores, BoxLayout.PAGE_AXIS);
        panelColores.setLayout(boxColores);

        // Borde vacio y borde con titulo
        Border bordeVacio = BorderFactory.createEmptyBorder(15, 6, 34, 40);
        Border borderConTitulo = BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Colores"), bordeVacio);
        panelColores.setBorder(borderConTitulo);

        // RadioButtons con expresion lambda
        rbRojo = new JRadioButton("Rojo");
        rbVerde = new JRadioButton("Verde");
        rbAzul = new JRadioButton("Azul");

        rbRojo.addActionListener((ActionEvent e) -> {
            fondoColor(e);
        });
        rbVerde.addActionListener((ActionEvent e) -> {
            fondoColor(e);
        });
        rbAzul.addActionListener((ActionEvent e) -> {
            fondoColor(e);
        });

        // Crear un button group para solo marcar una opcion
        ButtonGroup grupoColores = new ButtonGroup();
        grupoColores.add(rbRojo);
        grupoColores.add(rbVerde);
        grupoColores.add(rbAzul);

        // Opcion predeterminada
        rbRojo.setSelected(true);

        panelColores.add(rbRojo);
        panelColores.add(rbVerde);
        panelColores.add(rbAzul);

        // Creamos el boton
        JButton btnAceptar = new JButton("Aceptar");

        // Damos funcionalidad al boton
        //Opción 1
//        ManejadorClicBoton manejadorBoton = new ManejadorClicBoton();
//        btnAceptar.addActionListener(manejadorBoton);
        //Opción 2 clase anónima
        /*
        btnAceptar.addActionListener((ActionEvent e) -> {
            String mensaje = "Color elegido: ";
            if (rbRojo.isSelected()) {
                mensaje += "Rojo";
                etiResultado.setBackground(Color.red);
                etiResultado.setOpaque(true);
            } else if (rbVerde.isSelected()) {
                mensaje += "Verde";
                etiResultado.setBackground(Color.GREEN);
                etiResultado.setOpaque(true);
            } else if (rbAzul.isSelected()) {
                mensaje += "Azul";
                etiResultado.setBackground(Color.blue);
                etiResultado.setOpaque(true);
            }
            etiResultado.setText(mensaje);
        });
*/
        // JLabel con borde
        etiResultado = new JLabel();
        etiResultado.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        etiResultado.setPreferredSize(new Dimension(200, 30));
        etiResultado.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        // Panel principal que almacenara todo lo demas
        JPanel panelPrincipal = new JPanel();
        BoxLayout boxPrincipal = new BoxLayout(panelPrincipal, BoxLayout.PAGE_AXIS);
        panelPrincipal.setLayout(boxPrincipal);

        Border bordeVacioPrincipal = BorderFactory.createEmptyBorder(30, 30, 30, 30);
        panelPrincipal.setBorder(bordeVacioPrincipal);

        panelPrincipal.add(panelColores);
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 20)));
        panelPrincipal.add(btnAceptar);
        panelPrincipal.add(Box.createRigidArea(new Dimension(0, 20)));
        panelPrincipal.add(etiResultado);

        // AÃ±adimos panel principal a la ventana
        ventana.add(panelPrincipal);
    }

    private void fondoColor(ActionEvent e) {
        String mensaje = "Color elegido: ";
        if (e.getSource().equals(rbRojo)) {
            mensaje += "Rojo";
            etiResultado.setBackground(Color.red);
            etiResultado.setOpaque(true);
        } else if (e.getSource().equals(rbVerde)) {
            mensaje += "Verde";
            etiResultado.setBackground(Color.GREEN);
            etiResultado.setOpaque(true);
        } else if (e.getSource().equals(rbAzul)) {
            mensaje += "Azul";
            etiResultado.setBackground(Color.blue);
            etiResultado.setOpaque(true);
        }
        etiResultado.setText(mensaje);
    }
    /*
    public class ManejadorClicBoton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String mensaje = "Color elegido: ";
            if (rbRojo.isSelected()) {
                mensaje += "Rojo";
            }else if(rbVerde.isSelected()){
                mensaje += "Verde";
            }else if(rbAzul.isSelected()){
                mensaje += "Azul";
            }
            etiResultado.setText(mensaje);
        }

} // fin de la clase
     */
} //Fin de la clase Principal
