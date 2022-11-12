package expendedora;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DepositoVuelto {
    
    private final ArrayList<Moneda> aa;
    private int tamano;
        
    public DepositoVuelto(){
        
        aa=new ArrayList();
    }
    
    public void addMonedas(Moneda m){
        
        this.aa.add(m);   
    }
    
    
    public Moneda getMonedas(){
        
        if(aa.size()>0){
            
            return aa.remove(0);
        }
        
        else{
            return null;
        }
        
    }
    public Moneda Recorrer(int i){
        return aa.get(i);
    }
    public int tamano(){
        return aa.size();
    }
    
    public void paint(Graphics g){
        
        g.setColor(Color.black);
        g.fillRect(335,550,60,60);
        
        int i=0;
        
        while(aa.size()>0 && i<aa.size()){
            
            aa.get(i).paint(g,345,560);
            i++;
        }
        
    }
}
