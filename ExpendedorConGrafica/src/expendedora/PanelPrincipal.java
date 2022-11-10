package expendedora;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PanelPrincipal extends JPanel implements MouseListener, MouseMotionListener{
    
    private Comprador com; 
    private Expendedor exp;
    
    public PanelPrincipal(){
        this.setLayout(null);
        exp=new Expendedor(7,200);
        Moneda100 m1=new Moneda100();
        com=new Comprador(m1,2,exp);
        this.setBackground(Color.white);
        
        this.addMouseListener(this);
        Botones();
        Texto();
    }
    public void paint(Graphics g){
        super.paint(g);
        exp.paint(g);
        com.paint(g);  
    }
    
    public void Botones(){
        JButton boton1=new JButton("CocaCola");
        boton1.setBounds(305,570,100,40);
        boton1.setLocation(305,570);
        this.add(boton1);
        
        JButton boton2=new JButton("Sprite");
        boton2.setBounds(475,570,100,40);
        boton2.setLocation(475,570);
        this.add(boton2);
        
        JButton boton3=new JButton("Fanta");
        boton3.setBounds(645,570,100,40);
        this.add(boton3);
    }
    
    public void Texto(){
        JLabel texto=new JLabel("Monedas");
        texto.setBounds(85,600,100,40);
        this.add(texto);
        
        JLabel textoComprador=new JLabel("Comprador");
        textoComprador.setBounds(47,35,100,40);
        this.add(textoComprador);
        
    }
    
    public void mouseClicked(MouseEvent me) {} ;
    public void mousePressed(MouseEvent me) {
        System.out.println("press"); 
    }
    public void mouseReleased(MouseEvent me) {} ;
    public void mouseEntered(MouseEvent me) {} ; 
    public void mouseExited(MouseEvent me) {};    
    
    public void mouseDragged(MouseEvent me) {};
    public void mouseMoved(MouseEvent me) {};
    
}
    

