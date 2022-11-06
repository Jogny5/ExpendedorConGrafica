package expendedora;

class PagoInsuficienteException extends Exception{
    
    public PagoInsuficienteException(String mensaje){
        
        super(mensaje);
    }
}
