package expendedora;

import java.util.ArrayList;

public class Expendedor {
     private int numBebidas;
    private int precioBebidas;
    
    private DepositoBebidas coca;
    private DepositoBebidas sprite;
    private DepositoBebidas fanta;
    
    private DepositoVuelto dv;
    
    public Expendedor(int num, int precio){
        
        numBebidas=num;
        precioBebidas=precio;
        
        coca = new DepositoBebidas();
        sprite = new DepositoBebidas();
        fanta = new DepositoBebidas();
        
        dv = new DepositoVuelto();
        
        for(int i=1;i<numBebidas+1;i++){
            
            CocaCola c = new CocaCola(i);
            Sprite s = new Sprite(2*i);
            Fanta f = new Fanta(3*i);
            
            coca.addBebida(c);
            sprite.addBebida(s);
            fanta.addBebida(f);
            
        }
    }
    
    public Bebida comprarBebida(Moneda m, int cual){
        
        
        if(m!=null && m.getValor()<precioBebidas){
            
            try{
                throw new PagoInsuficienteException("No tienes dinero suficiente");        
            }catch(PagoInsuficienteException e){
                System.out.println(e.getMessage());
            }
            
            dv.addMonedas(m);
            return null;
        }
        
        if(cual ==1){
          
            if(coca.getBebida()==null){
              
                try{
                    throw new NoHayBebidaException("No hay bebida");
                }catch(NoHayBebidaException e){
                    System.out.println(e.getMessage());
                }
                
                dv.addMonedas(m);
                return null;
            }
            
            else if(m==null){
                try{
                    throw new PagoIncorrectoException("No tienes una moneda valida");
                }catch(PagoIncorrectoException e){
                    System.out.println(e.getMessage());
                }
                return null;
            }
            
            else{
                for (int i=0;i<(m.getValor()-precioBebidas)/100;i++){
                    
                    Moneda100 mon = new Moneda100();
                    dv.addMonedas(mon);
                }
                
                return coca.getBebida();
            }
        }
        
        if(cual ==2){
           
            if(sprite.getBebida()==null){
                
                try{
                    throw new NoHayBebidaException("No hay bebida");
                }catch(NoHayBebidaException e){
                    System.out.println(e.getMessage());
                }
                
                dv.addMonedas(m);
                return null;
            }
            
            else if(m==null){
                try{
                    throw new PagoIncorrectoException("No tienes una moneda valida");
                }catch(PagoIncorrectoException e){
                    System.out.println(e.getMessage());
                }
                return null;
            }
            
            else{
                for (int i=0;i<(m.getValor()-precioBebidas)/100;i++){
                    
                    Moneda100 mon = new Moneda100();
                    dv.addMonedas(mon);
                }
                
                return sprite.getBebida();
            }    
        }
        
        if(cual ==3){
            
            if(fanta.getBebida()==null){
               
                try{
                    throw new NoHayBebidaException("No hay bebida");
                }catch(NoHayBebidaException e){
                    System.out.println(e.getMessage());
                }
                
                dv.addMonedas(m);
                return null;
            }
            
            else if(m==null){
                try{
                    throw new PagoIncorrectoException("No tienes una moneda valida");
                }catch(PagoIncorrectoException e){
                    System.out.println(e.getMessage());
                }
                return null;
            }
            
            else{
                for (int i=0;i<(m.getValor()-precioBebidas)/100;i++){
                    
                    Moneda100 mon = new Moneda100();
                    dv.addMonedas(mon);
                }
                
                return fanta.getBebida();
            }   
        }
        
        else{
           
            try{
                if(m == null){
                    throw new NoHayBebidaException("No hay bebida");
                }        
            }catch(NoHayBebidaException e){
                System.out.println(e.getMessage());
            }
            dv.addMonedas(m);
            return null;
        }
        
        
            
    }    
    
    public Moneda getVuelto(){
        
        return dv.getMonedas();
    }

    public int getPrecioBebidas() {
        return precioBebidas;
    }

    public DepositoVuelto getDv() {
        return dv;
    }
    
    

   
}
