package expendedora;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    
    public Ventana(){
        super();
        setTitle("Título de ventana"); 
        this.setLayout(new BorderLayout());
        this.add(new PanelPrincipal( ),BorderLayout.CENTER);
        
        this.setSize(900,700);              
        setLocationRelativeTo(null);                    
        //this.getContentPane().setBackground(Color.white); 
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);       
        this.setVisible(true); 
        
    }
    
       
}