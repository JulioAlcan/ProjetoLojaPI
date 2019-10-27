/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author rafae
 */
public class ElementosProdutos {

    private static int QtdProduto;
    private int ID;
    private String txtNomeProd;
    private double txtPreco;
    private String txtTipo;
    private int QtdProd;

    public ElementosProdutos() {
        QtdProduto++;
        this.ID = ID;

    }

    public ElementosProdutos(String Nome, double txtPreco, String txtTipo, int QtdProd) {
        QtdProduto++;
        this.ID = QtdProduto;
        this.txtNomeProd = txtNomeProd;
        this.txtPreco = txtPreco;
        this.txtTipo = txtTipo;
        this.QtdProd = QtdProd;
    }
        public ElementosProdutos(int ID, String txtNomeProd, double txtPreco, String txtTipo, int QtdProd) {
        this.ID = ID;
        this.txtNomeProd = txtNomeProd;
        this.txtPreco = txtPreco;
        this.txtTipo = txtTipo;
        this.QtdProd = QtdProd;
    }

    public static int getQtdProduto() {
        return QtdProduto;
    }

    public static void setQtdProduto(int QtdProduto) {
        ElementosProdutos.QtdProduto = QtdProduto;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTxtNomeProd() {
        return txtNomeProd;
    }

    public void setTxtNomeProd(String txtNomeProd) {
        this.txtNomeProd = txtNomeProd;
    }

    public double getTxtPreco() {
        return txtPreco;
    }

    public void setTxtPreco(double txtPreco) {
        this.txtPreco = txtPreco;
    }

    public String getTxtTipo() {
        return txtTipo;
    }

    public void setTxtTipo(String txtTipo) {
        this.txtTipo = txtTipo;
    }

    public int getQtdProd() {
        return QtdProd;
    }

    public void setQtdProd(int QtdProd) {
        this.QtdProd = QtdProd;
    }
        
    

}
