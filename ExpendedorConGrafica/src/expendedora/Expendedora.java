package expendedora;

import java.util.ArrayList;

public class Expendedora {

    
    public static void main(String[] args) {
        Expendedor exp1 = new Expendedor(100,300);
        Expendedor exp2 = new Expendedor(1,800);
        Expendedor exp3 = new Expendedor(5,600);
        Expendedor exp4 = new Expendedor(10,900);
        Expendedor exp5 = new Expendedor(50,700);
       
        Moneda1000 m1k = new Moneda1000();
        Moneda100 m2k = new Moneda100();
        Moneda500 m3k = new Moneda500();
        Moneda1500 m4k = new Moneda1500();
        Moneda1500 m5k = null;
        
        System.out.println(m1k.getSerie());
        
//prueba general        
                
        Comprador com1 = new Comprador(m1k,2,exp1);
           
        exp1.comprarBebida(m1k,2);
        System.out.println(com1.cuantoVuelto());
        
        System.out.println(exp1.getVuelto());
        System.out.println(exp1.getVuelto());
        System.out.println(exp1.getVuelto());
        System.out.println(exp1.getVuelto());
        System.out.println(exp1.getVuelto());
        System.out.println(exp1.getVuelto());
        System.out.println(exp1.getVuelto());
        System.out.println(exp1.getVuelto());
        
        System.out.println(com1.queBebiste());
        
        
        
        
        
        
        
        Comprador com = new Comprador(m3k,1,exp1);
           
        exp1.comprarBebida(m3k,1);
        System.out.println(com.cuantoVuelto());
        
        System.out.println(exp1.getVuelto());
        System.out.println(exp1.getVuelto());
        System.out.println(exp1.getVuelto());
        
        System.out.println(com.queBebiste());
        
        
        
//prueba excepciones
        
        //no hay bebida
        Comprador com2 = new Comprador(m4k,1,exp2);
        exp2.comprarBebida(m4k,1);
        exp2.comprarBebida(m4k,1);
        
        //pago incorrecto
        
        Comprador com3 = new Comprador(m5k,3,exp3);
        exp3.comprarBebida(m5k,3);
        
        //pago insuficiente
        
        Comprador com4 = new Comprador(m2k,1,exp4);
        exp4.comprarBebida(m2k,1);
        
    }
    
}
