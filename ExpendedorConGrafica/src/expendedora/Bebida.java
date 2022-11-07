package expendedora;

import java.util.ArrayList;
import java.awt.Graphics;

abstract class Bebida {
    
    private int serie;
    public Bebida(int n){
        this.serie=n;
    }
    
    public String beber(){
        return new String("sabor: ");
    }

    public int getSerie() {
        return serie;
    }
    
    public void paint(Graphics g,int x,int y){
        
        g.fillRect(x,y,40,60);
    }
}