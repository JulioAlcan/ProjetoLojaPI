/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author julio
 */
public class CadastroProduto {

    private static int qtdProdutoCriados;

    private int idProduto;
    private String NomeProduto;
    private String Tipo;
    private double Preco;
    private int QuantidadeEstoque;

    public CadastroProduto(String NomeProduto, String Tipo, double Preco, int QuantidadeEstoque){
        qtdProdutoCriados ++;
        this.idProduto = qtdProdutoCriados;
        this.NomeProduto = NomeProduto;
        this.Tipo = Tipo;
        this.Preco = Preco;
        this.QuantidadeEstoque = QuantidadeEstoque;
    }
    
     public CadastroProduto(int pidProduto, String pNomeProduto, String pTipo, double pPreco, int pQuantidadeEstoque) {
        qtdProdutoCriados ++;
        this.idProduto = qtdProdutoCriados;
        this.NomeProduto = pNomeProduto;
        this.Tipo = pTipo;
        this.Preco = pPreco;
        this.QuantidadeEstoque = pQuantidadeEstoque;
    }
    
    
    public static int getQtdProdutoCriados() {
        return qtdProdutoCriados;
    }

    public static void setQtdProdutoCriados(int qtdProdutoCriados) {
        CadastroProduto.qtdProdutoCriados = qtdProdutoCriados;
    }

    public CadastroProduto() {
        ++qtdProdutoCriados;
        this.idProduto = qtdProdutoCriados;
    }

   
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int pidProduto) {
        this.idProduto = pidProduto;
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String pNomeProduto) {
        this.NomeProduto = pNomeProduto;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String pTipo) {
        this.Tipo = pTipo;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double pPreco) {
        this.Preco = pPreco;
    }

    public int getQuantidadeEstoque() {
        return QuantidadeEstoque;
    }

    public void setQuantidadeEstoque(int pQuantidadeEstoque) {
        this.QuantidadeEstoque = pQuantidadeEstoque;
    }

    
}
