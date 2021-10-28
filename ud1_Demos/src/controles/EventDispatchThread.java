package controles;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


/**
 *
 * @author CFGS
 */

public class EventDispatchThread {
    public static void main(String[] args) throws Exception{
        // Mostramos Look and Feels disponibles
        UIManager.LookAndFeelInfo[] looks=UIManager.getInstalledLookAndFeels();
        
        for (int i = 0; i < looks.length; i++) {
            System.out.println(looks[i]);
        }
        
//        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//        UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        
        SwingUtilities.invokeLater(() -> {
            new EventDispatchThread().inicializarInterfaz();
        });
    } //Fin del main
    public void inicializarInterfaz(){
        JTabbedPane tabs=new JTabbedPane();
        tabs.add("Uno", new JTextField("mensaje 1", 16));
        tabs.add("Dos", new JTextField("mensaje 2", 16));
        
        JComboBox<String> combo=new JComboBox<>(new String[] {"one","two","three"});
        
        JButton boton=new JButton("Boton");
        
        JSlider slider=new JSlider();
        
        JFrame ventana=new JFrame(UIManager.getLookAndFeel().getName());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout(FlowLayout.CENTER, 16, 16));
        ventana.add(tabs);
        ventana.add(combo);
        ventana.add(boton);
        ventana.add(slider);
        ventana.setSize(240, 300);
        ventana.setVisible(true);
        
    }
} //Fin de la clase EventDispatchThread
