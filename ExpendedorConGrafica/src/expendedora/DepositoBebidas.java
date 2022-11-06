package expendedora;

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
}
