package expendedora;

import java.awt.Color;
import java.awt.Graphics;


class Sprite extends Bebida {
    public Sprite(int n){
        super(n);
        
    }
    
    @Override
    public String beber(){
        return super.beber()+new String("sprite");
    }
    
    public void paint(Graphics g, int x,int y){
        
        g.setColor(Color.green);
        g.fillRect(x, y, 10,20);
        
    }
}
