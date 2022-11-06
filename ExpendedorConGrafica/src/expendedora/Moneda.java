package expendedora;

abstract class Moneda {
    
    public Moneda(){
        
    }
    
    public String getSerie (){
        
        return super.toString();
    }
    public abstract int getValor();
    
    
    
}
