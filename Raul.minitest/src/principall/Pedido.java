/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principall;

import java.util.ArrayList;
import java.util.List;


public class Pedido {
  private List <ItemPedido> itens= new ArrayList<>();
  private String formPagamento;
   
  public Pedido(String formPagamento){
      this.formPagamento=formPagamento;
  }
  public void adicionalItem(ItemPedido item){
      itens.add(item);
      
  }
  public double Calcular(){
      double total=0;
        for (ItemPedido item : itens) {
           total += item.getProduto().getPreco()*item.getQuant();
            
        }
            return total;
  }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public String getFormPagamento() {
        return formPagamento;
    }

    public void setFormPagamento(String formPagamento) {
        this.formPagamento = formPagamento;
    }
       public String toString(){
           return "forma de pagamento: " +this.formPagamento;
                   }
    
}
