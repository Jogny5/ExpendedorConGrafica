package expendedora;

class Fanta extends Bebida{
    public Fanta(int c){
        super(c);
    }
     @Override
    public String beber(){
        return super.beber()+new String("fanta");
    }
}
