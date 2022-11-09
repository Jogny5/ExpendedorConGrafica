package expendedora;
import java.awt.Color;
import java.awt.Graphics;

abstract class Moneda {
    
    public Moneda(){
        
    }
    
    public String getSerie (){
        
        return super.toString();
    }
    public abstract int getValor();
    
    public void paint(Graphics g, int x,int y){
        
    }
    
}
