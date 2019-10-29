/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.ElementosVendas;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class VendasDAO {
    public static boolean InserirVendas(ElementosVendas vd) {
        return SimulaDB.getInstance().InserirVendas(vd);
    }

    public static ArrayList<ElementosVendas> getVend() {
        return SimulaDB.getInstance().getVendas();
    }

    public static boolean salvar(ElementosVendas v) {

        return SimulaDB.getInstance().SalvarVendas(v);
    }

    public static boolean atualizarVend(ElementosVendas v) {

        return SimulaDB.getInstance().AtualizarVendas(v);
    }

    public static boolean excluirVendas(int vID) {
        return SimulaDB.getInstance().ExcluirVendas(vID);
    }
}