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
        Moneda500 m1=new Moneda500();
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
        
        JButton BotonMoneda100=new JButton("100");
        BotonMoneda100.setBounds(25,660,55,30);
        this.add(BotonMoneda100);
        BotonMoneda100.addActionListener(Moneda100accion);
        
        JButton BotonMoneda500=new JButton("500");
        BotonMoneda500.setBounds(85,660,55,30);
        this.add(BotonMoneda500);
        BotonMoneda500.addActionListener(Moneda500accion);
        
        JButton BotonMoneda1000=new JButton("1000");
        BotonMoneda1000.setBounds(145,660,65,30);
        this.add(BotonMoneda1000);
        BotonMoneda1000.addActionListener(Moneda1000accion);
        
        JButton BotonMoneda1500=new JButton("1500");
        BotonMoneda1500.setBounds(215,660,65,30);
        this.add(BotonMoneda1500);
        BotonMoneda1500.addActionListener(Moneda1500accion);
    }
    
    public void Texto(){
        JLabel texto=new JLabel("Monedas");
        texto.setBounds(85,550,100,40);
        this.add(texto);
        
        JLabel textoComprador=new JLabel("Comprador");
        textoComprador.setBounds(47,35,100,40);
        this.add(textoComprador);
        
    }
    
    ActionListener Moneda100accion=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            m=new Moneda100();
            com=new Comprador(m,1,exp);
            
        }
    };
    
    ActionListener Moneda500accion=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            m=new Moneda500();
            com=new Comprador(m,1,exp);
            
        }
    };
    
    ActionListener Moneda1000accion=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            m=new Moneda1000();
            com=new Comprador(m,1,exp);
            
        }
    };
    
    ActionListener Moneda1500accion=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            m=new Moneda1500();
            com=new Comprador(m,1,exp);
            
        }
    };
    
    ActionListener boton1accion=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            exp.comprarBebida(m, 1);
            
            repaint();
            
            m=null;
        }
    };
    
    ActionListener boton2accion=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            exp.comprarBebida(m, 2);
            
            repaint();
            
            m=null;
        }
    };
    
    ActionListener boton3accion=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            exp.comprarBebida(m, 3);
            
            repaint();
            
            m=null;
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
        
        if(x>335 && x<405 && y>120 && y<480){
            
            exp.RellenarDBebida(1);
        }
        
        if(x>485 && x<555 && y>120 && y<480){
            
            exp.RellenarDBebida(2);
        }
        
        if(x>635 && x<705 && y>120 && y<480){
            
            exp.RellenarDBebida(3);
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
    

