package expendedora;

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
}
