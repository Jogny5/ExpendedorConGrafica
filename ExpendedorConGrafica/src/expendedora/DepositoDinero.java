package expendedora;

import java.util.ArrayList;

public class DepositoDinero {
    
    private final ArrayList<Moneda> aa;
    private int tamano;
        
    public DepositoDinero(){
        
        aa=new ArrayList();
    }
    
    public void addMonedas(Moneda m){
        
        this.aa.add(m);   
    }
}
