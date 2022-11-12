package expendedora;

import java.awt.Color;
import java.awt.Graphics;

class Moneda1000 extends Moneda{
    
    public Moneda1000(){
    
    }

    @Override
    public int getValor() {
        return 1000;
    }
    
    public void paint(Graphics g, int x,int y){
        
        g.setColor(Color.blue);        
        g.fillOval(x,y,40,40);
        
    }
}
