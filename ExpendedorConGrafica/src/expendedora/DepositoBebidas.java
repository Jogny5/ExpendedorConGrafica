package expendedora;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DepositoBebidas {
    
    
    private final ArrayList<Bebida> aa;
        
    public DepositoBebidas(){
        
        aa=new ArrayList();
    }
    
    public void addBebida(Bebida b){
        
        this.aa.add(b);   
    }
    
    
    public Bebida getBebida(){
        
        if(aa.size()>0){
            
            return aa.remove(0);
        }
        
        else{
            return null;
        }
        
    }
    
    public Bebida revisarBebida(int i){
        
            return aa.get(i);
        
    }
    
    public int getSize(){
        
        return aa.size();
    }
    
    public void paint(Graphics g,int x ,int y){
        
        g.setColor(Color.darkGray);
        g.fillRect(x,y,70,360);
        
        
    }
}
