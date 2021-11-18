package d06_GridBagLayout;

import javax.swing.*;
import java.awt.*;

/**
 * FILL (por defecto NONE)
 * txtA1 debe ocupar todo el espacio tanto horizontal como vertical
 * txtF1 debe ocupar todo el espacio horizontal
 * 
 * ANCHOR(por defecto es center)
 * bt1 y bt2 posicion NORTH
 * 
 * @author CFGS
 */

public class Ventana3 extends JFrame{
    
    public Ventana3(){
        super("Demo6 GridBagLayout");
        this.setLayout(new GridBagLayout());
        anadirComponentes();

    }//Fin constructor vacio

    private void anadirComponentes() {
        //Fila 0----------------------
        JTextArea txtA1=new JTextArea("Área texto");
        colocarComponentesGridBag(0,0,2,2,0.0,1.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,txtA1,this);
       txtA1.setLineWrap(true);
        JButton bt1=new JButton("Botón 1");
        colocarComponentesGridBag(2,0,1,1,0.0,1.0,GridBagConstraints.NONE,GridBagConstraints.NORTH,bt1,this);
        
        //Fila 1----------------------
        JButton bt2=new JButton("Botón 2");
        colocarComponentesGridBag(2,1,1,1,0.0,1.0,GridBagConstraints.NONE,GridBagConstraints.NORTH,bt2,this);
        
        //Fila 2----------------------
        JButton bt3=new JButton("Botón 3");
        colocarComponentesGridBag(0,2,1,1,bt3,this);
        JTextField txtF1=new JTextField("Campo texto");
        colocarComponentesGridBag(1,2,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,txtF1,this);
        JButton bt4=new JButton("Botón 4");
        colocarComponentesGridBag(2,2,1,1,bt4,this);
    }

    private void colocarComponentesGridBag(int columna, int fila, int anchoCol, int altoFila, JComponent elemento, Ventana3 ventana) {
        GridBagConstraints constraints=new GridBagConstraints();
        constraints.gridx=columna;
        constraints.gridy=fila;
        constraints.gridwidth=anchoCol;
        constraints.gridheight=altoFila;
        
        ventana.add(elemento, constraints);
    }

    
    private void colocarComponentesGridBag(int columna, int fila, int anchoCol, int altoFila, double pesoX, double pesoY,int relleno,int anclaje, JComponent elemento, Ventana3 ventana) {
        GridBagConstraints constraints=new GridBagConstraints();
        constraints.gridx=columna;
        constraints.gridy=fila;
        constraints.gridwidth=anchoCol;
        constraints.gridheight=altoFila;
        constraints.weightx=pesoX;
        constraints.weighty=pesoY;
        constraints.fill=relleno;
        constraints.anchor=anclaje;
        
        ventana.add(elemento, constraints);
    }
    
}//Fin class
