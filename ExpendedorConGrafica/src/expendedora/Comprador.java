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
       g.fillOval(10, 20, 50, 50);
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
       
       m1.paint(g,45,650);
       m2.paint(g,85,650);
       m3.paint(g,125,650);
       m4.paint(g,165,650);
       
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
