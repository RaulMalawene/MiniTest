/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principall;

public class ItemPedido {
    private Produtos produto;
    
    private int quant;
    
    public ItemPedido(Produtos produtos, int quant){
        this.quant=quant;
        this.produto=produtos;
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

  
    
    
       

    
}
