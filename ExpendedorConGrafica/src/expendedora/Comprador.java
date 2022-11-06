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
       g.fillOval(10, 20, 20, 20);
       g.setColor(Color.RED);
       g.fillRect(10,40,20,30);
       g.setColor(Color.BLUE);
       g.fillRect(10,60,20,20);
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
