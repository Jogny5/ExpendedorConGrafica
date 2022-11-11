package expendedora;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PanelPrincipal extends JPanel implements MouseListener{
    
    private Comprador com; 
    private Expendedor exp;
    private Moneda m;
    
    private int numCoca;
    private int numSprite;
    private int numFanta;
    
    
    public PanelPrincipal(){
        this.setLayout(null);
        exp=new Expendedor(15,200);
        Moneda100 m1=new Moneda100();
        com=new Comprador(m1,2,exp);
        this.setBackground(Color.white);
        
        m=new Moneda1500();
        
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
        boton1.setBounds(305,500,100,40);
        
        this.add(boton1);
        boton1.addActionListener(boton1accion);
        
        JButton boton2=new JButton("Sprite");
        boton2.setBounds(475,500,100,40);
        this.add(boton2);
        boton2.addActionListener(boton2accion);
        
        JButton boton3=new JButton("Fanta");
        boton3.setBounds(645,500,100,40);
        
        this.add(boton3);
        boton3.addActionListener(boton3accion);
    }
    
    public void Texto(){
        JLabel texto=new JLabel("Monedas");
        texto.setBounds(85,600,100,40);
        this.add(texto);
        
        JLabel textoComprador=new JLabel("Comprador");
        textoComprador.setBounds(47,35,100,40);
        this.add(textoComprador);
        
    }
    
    ActionListener boton1accion=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            exp.comprarBebida(m, 1);
            
            repaint();
        }
    };
    
    ActionListener boton2accion=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            exp.comprarBebida(m, 2);
            
            repaint();
        }
    };
    
    ActionListener boton3accion=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            exp.comprarBebida(m, 3);
            
            repaint();
        }
    };
    
    @Override
    public void mouseClicked(MouseEvent me){};
    
    @Override
    public void mousePressed(MouseEvent me) {
        
        int x=me.getX();
        int y=me.getY();
        
        if(x>335&& x<395 && y>550 && y<610){
            
            exp.getVuelto();
        }
        
        if(x>640 && x<670 && y>550 && y<590){
            
            exp.getDVenta().getBebida();
        }
        
        repaint();
    }
    @Override
    public void mouseReleased(MouseEvent me) {} ;
    @Override
    public void mouseEntered(MouseEvent me) {} ; 
    @Override
    public void mouseExited(MouseEvent me) {};    
    

    
}
    

