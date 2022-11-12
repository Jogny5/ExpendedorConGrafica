package expendedora;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Comprador {
    private Moneda m;
    private int cualBebida;    
    private Expendedor exp;
    
    public Comprador(Moneda mon,int beb,Expendedor e){
        
        m=mon;
        cualBebida=beb;
        exp=e;
    }
    
    public void paint(Graphics g){ 
       g.setColor(new Color(252, 208, 180));      
       g.fillOval(30, 70, 100, 100);
       /*
       g.setColor(Color.RED);
       g.fillRect(10,40,20,30);
       g.setColor(Color.BLUE);
       g.fillRect(10,60,20,20);
       */
       Moneda100 m1=new Moneda100();
       Moneda500 m2=new Moneda500();
       Moneda1000 m3=new Moneda1000();
       Moneda1500 m4=new Moneda1500();
       
       m1.paint(g,35,600);
       m2.paint(g,95,600);
       m3.paint(g,155,600);
       m4.paint(g,215,600);
       
    }
    
    
    public int cuantoVuelto(){
        
        int a=0;
        for(int i=0;i<exp.getDv().tamano();i++){
            a=a+exp.getDv().Recorrer(i).getValor();
        }
        
        return a;
        
    }
    
    public String queBebiste(){
        if(this.cualBebida==1){
            return new String ("cocacola");
        }else if(this.cualBebida==2){
            return new String ("sprite");
        }else if(this.cualBebida==3){
            return new String ("fanta");
        }else{
            return null;
        }
        
    }
    
}
