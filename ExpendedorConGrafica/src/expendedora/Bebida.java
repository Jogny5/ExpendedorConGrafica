package expendedora;

import java.util.ArrayList;

abstract class Bebida {
    
    private int serie;
    public Bebida(int n){
        this.serie=n;
    }
    
    public String beber(){
        return new String("sabor: ");
    }

    public int getSerie() {
        return serie;
    }
}
