package layouts.boxLayouts;

import javax.swing.*;


/**
 * 1. Sin espacio <*>
 * 2.Añadimos un EmptyBorder y RigidArea 
 * 3.Glue
 * 4.Box.Filler
 * 5.Alineación horizontal
 * 6.Alineacion vertical
 * 
 */

public class BoxLayout_parte1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BoxLayout_parte1().inicializarVentana();
        });
    } //Fin del main
    private void inicializarVentana(){
        JFrame ventana=new JFrame("BoxLayout demo parte 1");
        
        addComponentes(ventana);
        
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
    public void addComponentes(JFrame frame){
        JButton bt1=new JButton("Botón 1");
        JButton bt2=new JButton("Botón 2");
        JButton bt3=new JButton("Botón 3");
        
        JPanel panel=new JPanel();
        
        //Añadimos los botones al panel
        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);
        
        //Creamos un BoxLayout horizontal
        BoxLayout box=new BoxLayout(panel, BoxLayout.LINE_AXIS);
        
        //Creamos un BoxLayout vertical
        //BoxLayout box=new BoxLayout(panel, BoxLayout.PAGE_AXIS);
        
        //Asignamos al panel el Layout creado
        panel.setLayout(box);
        
        //Añadimos el panel al frame
        frame.add(panel);
        
    }
} //Fin de la clase BoxLayout_parte1
