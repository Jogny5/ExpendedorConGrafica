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
       g.setColor(Color.red);      
       g.fillOval(10, 20, 10, 10);
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
