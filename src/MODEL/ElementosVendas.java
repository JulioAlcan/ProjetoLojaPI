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
public class ElementosVendas {

    private static int QtdVendas;
    private int txtIdCliente;
    private int txtQtd;
    private double txtValor;

    public ElementosVendas() {
        QtdVendas++;
        this.txtIdCliente = txtIdCliente;

    }

    public ElementosVendas(int txtQtd, double txtValor) {
        QtdVendas++;
        this.txtIdCliente = QtdVendas;
        this.txtQtd = txtQtd;
        this.txtValor = txtValor;
    }

    public ElementosVendas(int txtIdCliente, int txtQtd, double txtValor) {
        this.txtIdCliente = QtdVendas;
        this.txtQtd = txtQtd;
        this.txtValor = txtValor;
    }

    public static int getQtdVendas() {
        return QtdVendas;
    }

    public static void setQtdVendas(int QtdVendas) {
        ElementosVendas.QtdVendas = QtdVendas;
    }

    public int getTxtIdCliente() {
        return txtIdCliente;
    }

    public void setTxtIdCliente(int txtIdCliente) {
        this.txtIdCliente = txtIdCliente;
    }

    public int getTxtQtd() {
        return txtQtd;
    }

    public void setTxtQtd(int txtQtd) {
        this.txtQtd = txtQtd;
    }

    public double getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(double txtValor) {
        this.txtValor = txtValor;
    }

}
