/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principall;


public class Produtos {
    private String nome;
    private double preco;
    private int quant;
    
    public Produtos(String nome, double preco, int quant){
        this.nome=nome;
        this.preco=preco;
        this.quant=quant;
        
    }

    Produtos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
     public String toString(){
         return "Nome do Produto \tPreco\t Quantidade\n"+
              this.nome+ "\t" +this.preco+ "\t" +this.quant;
     }
     
    
}
