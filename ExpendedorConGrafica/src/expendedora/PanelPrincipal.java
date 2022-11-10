package expendedora;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;

public class PanelPrincipal extends JPanel implements MouseListener, MouseMotionListener{
    
    private Comprador com; 
    private Expendedor exp;
    
    public PanelPrincipal(){
        exp=new Expendedor(7,200);
        Moneda100 m1=new Moneda100();
        com=new Comprador(m1,2,exp);
        this.setBackground(Color.white);
        
        this.addMouseListener(this);
        Botones();
    }
    public void paint(Graphics g){
        super.paint(g);
        exp.paint(g);
        com.paint(g);  
    }
    
    public void Botones(){
        JButton boton1=new JButton("CocaCola");
        boton1.setBounds(330,570,50,30);
        this.add(boton1);
        
        JButton boton2=new JButton("Sprite");
        boton2.setBounds(500,570,50,30);
        boton2.setLocation(10,300);
        this.add(boton2);
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
    

