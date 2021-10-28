package controles;


/**
 *
 * @author CFGS
 */
import java.awt.FlowLayout;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
*Opciones:
* 1. Indicar una ruta
* 2. Indicar una URL
* 3. utilizar getClass().getResource()
* 4. ClassLoader().getSystemResources()
@author CFGS
*/
public class DemoJButton_Images {

    public static void main(String[] args){
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DemoJButton_Images().inicializarVentana();
            }
        });
        
    } //Fin del main

    public void inicializarVentana(){
        
        try {
            //1
            //Icon icono = new ImageIcon("C:\\Users\\CFGS\\Documents\\NetBeansProjects\\DI\\UD1_DEMOS\\src\\imagenes\\cut16.gif");
            Icon icono = new ImageIcon("src\\imagenes\\cut16.gif");
            
            JButton botonCortar = new JButton("Cut", icono);
            Icon icono3 = new ImageIcon("src\\imagenes\\copy24.gif");
            JButton botonCopy = new JButton("Copy", icono3);
            //2 URL
            Icon icono2 = null;
            icono2 = new ImageIcon(new URL("https://icons.iconarchive.com/icons/icons8/windows-8/16/Programming-External-Link-icon.png"));
            JButton botonLink = new JButton("Link", icono2);
            
            //3 Ruta
//            URL ruta=getClass().getResource("Paste16.gif");
//            JButton botonPaste=new JButton("Paste", new ImageIcon(ruta));

            URL ruta=getClass().getResource("../imagenes/Paste16.gif");
            JButton botonPaste=new JButton("Paste", new ImageIcon(ruta));
            //4 ClassLoader
            URL ruta2=ClassLoader.getSystemResource("imagenes/Paste16.gif");
            JButton botonPegar=new JButton("Pegar", new ImageIcon(ruta2));
            
            JFrame frame = new JFrame("JButton con imagen");
            
            frame.setLayout(new FlowLayout());
            
            frame.add(botonCopy);
            frame.add(botonCortar);
            frame.add(botonLink);
            frame.add(botonPaste);
            frame.add(botonPegar);
            
            botonCortar.setPreferredSize(botonCopy.getPreferredSize());
            botonLink.setPreferredSize(botonCopy.getPreferredSize());
            botonPaste.setPreferredSize(botonCopy.getPreferredSize());
            
            frame.setSize(500, 125);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
        } catch (MalformedURLException ex) {
            Logger.getLogger(DemoJButton_Images.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
} //Fin de la clase DemoJButtonConImagen
