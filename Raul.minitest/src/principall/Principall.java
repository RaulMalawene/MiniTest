  
package principall;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Principall {


    public static void main(String[] args) {
          Produtos p1 = new Produtos( "Arroz" , 100 , 25 );
        Produtos p2 = new Produtos("Feijão", 20.0,200);
        Cliente c1 = new Cliente("João");
         
                ItemPedido ip1 = new ItemPedido(p1, 2);
        ItemPedido ip2 = new ItemPedido(p2, 3);

        Pedido pedido1 = new Pedido("cartão");
        
        pedido1.adicionalItem(ip1);
        pedido1.adicionalItem(ip2);
      JOptionPane.showMessageDialog(null, c1.toString());
      JOptionPane.showMessageDialog(null, p1.toString()); 
      JOptionPane.showMessageDialog(null, p2.toString());
     JOptionPane.showMessageDialog(null, "Calculo do Preco total");
    JOptionPane.showMessageDialog(null, pedido1.Calcular());
   JOptionPane.showMessageDialog(null, pedido1.toString());
   



             
             
             
             
             
           
         
                            
                    
                
            
       
        
       
    }
    
}
