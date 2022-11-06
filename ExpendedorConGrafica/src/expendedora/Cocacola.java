package expendedora;

import java.awt.Color;
import java.awt.Graphics;

class CocaCola extends Bebida{
    public CocaCola(int c){
        super(c);
    }
     @Override
    public String beber(){
        return super.beber()+new String("cocacola");
    }
    
    public void paint(Graphics g, int x,int y){
        
        g.setColor(Color.red);
        g.fillRect(x, y, 10,20);
        
    }
}
