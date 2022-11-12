package expendedora;

import java.awt.Color;
import java.awt.Graphics;

public class DepositoVenta {
    
    private Bebida venta;
    
    public DepositoVenta(){
        
    }
    
    public void compra(Bebida b){
        
        venta=b;
    }
    
    public Bebida getBebida(){
        
        Bebida x = venta;
        
        venta=null;
        
        return x;
        
    }
    
    public void paint(Graphics g){
        
        g.setColor(Color.black);
        g.fillRect(640,550,30,40);
        if(venta!=null){
            venta.paint(g, 650, 560);
        }
        
        
    }
    
}
