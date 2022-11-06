package expendedora;

import java.util.ArrayList;

class Sprite extends Bebida {
    public Sprite(int n){
        super(n);
        
    }
    
    @Override
    public String beber(){
        return super.beber()+new String("sprite");
    }
}
