package expendedora;

import java.awt.Color;
import java.awt.Graphics;

class Fanta extends Bebida{
    public Fanta(int c){
        super(c);
    }
     @Override
    public String beber(){
        return super.beber()+new String("fanta");
    }
    
    public void paint(Graphics g, int x,int y){
        
        g.setColor(Color.orange);
        g.fillRect(x, y, 10,20);
        
    }
}
