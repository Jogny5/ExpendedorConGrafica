package expendedora;

public class DepositoVenta {
    
    private Bebida venta;
    
    public DepositoVenta(){
        
    }
    
    public void compra(Bebida b){
        
        if(venta==null){
            
            venta=b;
        }
    }
    
    public Bebida getBebida(){
        
        Bebida x = venta;
        
        venta=null;
        
        return x;
        
    }
    
}
