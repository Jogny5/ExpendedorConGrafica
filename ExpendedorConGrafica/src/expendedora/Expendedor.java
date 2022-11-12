package expendedora;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Expendedor {
     private int numBebidas;
    private int precioBebidas;
    
    private DepositoBebidas coca;
    private DepositoBebidas sprite;
    private DepositoBebidas fanta;
    
    private DepositoVuelto dv;
    private DepositoDinero ddinero;
    
    private DepositoVenta dVenta;
    
    public Expendedor(int num, int precio){
        
        numBebidas=num;
        precioBebidas=precio;
        
        coca = new DepositoBebidas();
        sprite = new DepositoBebidas();
        fanta = new DepositoBebidas();
        
        dv = new DepositoVuelto();
        ddinero = new DepositoDinero();
        
        dVenta= new DepositoVenta();        
        
        for(int i=1;i<numBebidas+1;i++){
            
            CocaCola c = new CocaCola(i);
            Sprite s = new Sprite(2*i);
            Fanta f = new Fanta(3*i);
            
            coca.addBebida(c);
            sprite.addBebida(s);
            fanta.addBebida(f);
            
        }
    }
    
    public void paint(Graphics g){ //se agrega para pintar rectángulo rojo
       g.setColor(Color.gray);      //se unta el pincel g en color rojo
       g.fillRect(300,40,450,600);    //se le dice al pincel pinte rectángulo
       
        coca.paint(g,335,120);
        sprite.paint(g,485,120);
        fanta.paint(g,635,120);
       
        int i=0;
        while(i<coca.getSize()){
            coca.revisarBebida(i).paint(g,365,450-i*(350/numBebidas));
            i++;
        }
        
        i=0;    
        while(i<sprite.getSize()){   
            sprite.revisarBebida(i).paint(g,515,450-i*(350/numBebidas));
            i++;
        }
            
        i=0;
        while(i<fanta.getSize()){
        fanta.revisarBebida(i).paint(g,665,450-i*(350/numBebidas));
            i++;
        }
        
        dVenta.paint(g);
        dv.paint(g);
        
    }
    
    public void RellenarDBebida(int x){
        
        if(x==1){
            
          while(coca.getSize()<numBebidas){
              
              CocaCola c = new CocaCola(coca.getSize());
              coca.addBebida(c);
          }  
        }
        
        if(x==2){
            
          while(sprite.getSize()<numBebidas){
              
              Sprite s = new Sprite(sprite.getSize());
              sprite.addBebida(s);
          }  
        }
        
        if(x==3){
            
          while(fanta.getSize()<numBebidas){
              
              Fanta f = new Fanta(fanta.getSize());
              fanta.addBebida(f);
          }  
        }
    }
    
    public void comprarBebida(Moneda m, int cual){
        
        
        if(m!=null && m.getValor()<precioBebidas){
            
            try{
                throw new PagoInsuficienteException("No tienes dinero suficiente");        
            }catch(PagoInsuficienteException e){
                System.out.println(e.getMessage());
            }
            
            dv.addMonedas(m);
        }
        
        else if(cual ==1){
          
            if(coca.revisarBebida(0)==null){
              
                try{
                    throw new NoHayBebidaException("No hay bebida");
                }catch(NoHayBebidaException e){
                    System.out.println(e.getMessage());
                }
                
                dv.addMonedas(m);                
            }
            
            else if(m==null){
                try{
                    throw new PagoIncorrectoException("No tienes una moneda valida");
                }catch(PagoIncorrectoException e){
                    System.out.println(e.getMessage());
                }
            }
            
            else{
                for (int i=0;i<(m.getValor()-precioBebidas)/100;i++){
                    
                    Moneda100 mon = new Moneda100();
                    dv.addMonedas(mon);
                }
                
                ddinero.addMonedas(m);
                
                dVenta.compra(coca.getBebida());
            }
        }
        
        else if(cual ==2){
           
            if(sprite.revisarBebida(0)==null){
                
                try{
                    throw new NoHayBebidaException("No hay bebida");
                }catch(NoHayBebidaException e){
                    System.out.println(e.getMessage());
                }
                
                dv.addMonedas(m);
            }
            
            else if(m==null){
                try{
                    throw new PagoIncorrectoException("No tienes una moneda valida");
                }catch(PagoIncorrectoException e){
                    System.out.println(e.getMessage());
                }
            }
            
            else{
                for (int i=0;i<(m.getValor()-precioBebidas)/100;i++){
                    
                    Moneda100 mon = new Moneda100();
                    dv.addMonedas(mon);
                }
                
                ddinero.addMonedas(m);
                
                dVenta.compra(sprite.getBebida());
                
            }    
        }
        
        else if(cual ==3){
            
            if(fanta.revisarBebida(0)==null){
               
                try{
                    throw new NoHayBebidaException("No hay bebida");
                }catch(NoHayBebidaException e){
                    System.out.println(e.getMessage());
                }
                
                dv.addMonedas(m);               
            }
            
            else if(m==null){
                try{
                    throw new PagoIncorrectoException("No tienes una moneda valida");
                }catch(PagoIncorrectoException e){
                    System.out.println(e.getMessage());
                }
            }
            
            else{
                for (int i=0;i<(m.getValor()-precioBebidas)/100;i++){
                    
                    Moneda100 mon = new Moneda100();
                    dv.addMonedas(mon);
                }
                
                ddinero.addMonedas(m);
                
                dVenta.compra(fanta.getBebida());
               
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
    
    public DepositoVenta getDVenta() {
        return dVenta;
    }

   
    
   
}
