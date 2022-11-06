package expendedora;
import java.awt.Color;
import java.awt.Graphics;

class Moneda100 extends Moneda{
    
    public Moneda100(){
    
    }

    @Override
    public int getValor() {
        return 100;
    }
    
    public void paint(Graphics g, int x,int y){
        
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 10,10);
        
    }
}
