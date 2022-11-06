package expendedora;

import java.awt.Color;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel{
    private Comprador com; 
    private Expendedor exp; 
    
    public PanelPrincipal(){
        exp=new Expendedor(3,200);
        Moneda1500 m1=new Moneda1500();
        com=new Comprador(m1,2,exp);
        this.setBackground(Color.white);
    }
}
