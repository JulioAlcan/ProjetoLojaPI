/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.VendasDAO;
import MODEL.ElementosVendas;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class VendaController {
    
    public static boolean SalvarVendas(int vtxtQtd, double vtxtValor) {
        //Salvo na memória
        ElementosVendas us = new ElementosVendas(vtxtQtd, vtxtValor);
        return VendasDAO.InserirVendas(us);
    }

    public static boolean atualizarVendas(int vtxtQtd, double vtxtValor) {
        ElementosVendas p = new ElementosVendas(vtxtQtd, vtxtValor);
        return VendasDAO.atualizarVend(p);

    }
        public static boolean excluirVendas(int uID)
    {
        return VendasDAO.excluirVendas(uID);
    }

    public static ArrayList<String[]> getVend() {
        ArrayList<ElementosVendas> Vendas = VendasDAO.getVend();
        ArrayList<String[]> listaVendas = new ArrayList<>();

        for (int i = 0; i < Vendas.size(); i++) {
            listaVendas.add(new String[]{String.valueOf(Vendas.get(i).getTxtIdCliente()), String.valueOf(Vendas.get(i).getTxtQtd()), String.valueOf(Vendas.get(i).getTxtValor())});

        }

        return listaVendas;

    }
}
