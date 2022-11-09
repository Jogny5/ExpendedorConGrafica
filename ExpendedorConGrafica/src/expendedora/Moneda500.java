package expendedora;

import java.awt.Color;
import java.awt.Graphics;

class Moneda500 extends Moneda{
    
    public Moneda500(){
    
    }

    @Override
    public int getValor() {
        return 500;
    }
        
    public void paint(Graphics g, int x,int y){
        
        g.setColor(Color.yellow);        
        g.fillOval(x,y,40,40);
        
    }
   
}
