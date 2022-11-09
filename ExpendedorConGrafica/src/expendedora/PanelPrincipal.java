package expendedora;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class PanelPrincipal extends JPanel implements MouseListener, MouseMotionListener{
    
    private Comprador com; 
    private Expendedor exp; 
    
    public PanelPrincipal(){
        exp=new Expendedor(4,200);
        Moneda1500 m1=new Moneda1500();
        com=new Comprador(m1,2,exp);
        this.setBackground(Color.white);
        
        this.addMouseListener(this);
    }
    public void paint(Graphics g){
        super.paint(g);
        exp.paint(g);
        com.paint(g);  
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
    

