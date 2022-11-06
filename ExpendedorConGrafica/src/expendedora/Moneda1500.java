package expendedora;

import java.awt.Color;
import java.awt.Graphics;

class Moneda1500 extends Moneda{
    
    public Moneda1500(){
    
    }

    @Override
    public int getValor() {
        return 1500;
    }
    
    public void paint(Graphics g, int x,int y){
        
        g.setColor(Color.black);
        g.fillOval(x, y, 10,10);
        
    }
    
}
