package expendedora;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DepositoDinero {
    
    private final ArrayList<Moneda> aa;
        
    public DepositoDinero(){
        
        aa=new ArrayList();
    }
    
    public void addMonedas(Moneda m){
        
        this.aa.add(m);   
    }
    

}
