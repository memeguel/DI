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
public class Principal {

    JRadioButton rbRojo;
    JRadioButton rbVerde;
    JRadioButton rbAzul;
    JLabel etiResultado;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().inicializarVentana();
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

        // RadioButtons
        rbRojo = new JRadioButton("Rojo");
        rbVerde = new JRadioButton("Verde");
        rbAzul = new JRadioButton("Azul");

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
        ManejadorClicBoton manejadorBoton = new ManejadorClicBoton();
        btnAceptar.addActionListener(manejadorBoton);

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
    
} //Fin de la clase Principal
