package expendedora;

class CocaCola extends Bebida{
    public CocaCola(int c){
        super(c);
    }
     @Override
    public String beber(){
        return super.beber()+new String("cocacola");
    }
}
