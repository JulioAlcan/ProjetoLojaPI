/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CadastroProdutoDAO;
import Model.CadastroProduto;
import java.util.ArrayList;

/**
 *
 * @author julio
 */
public class CadastroProdutoController {

    public static boolean salvar(String pNomeProduto, String pTipo, double pPreco, int pQuantidadeProduto) throws ClassNotFoundException {
        //Salvo na memória

        CadastroProduto c = new CadastroProduto(pNomeProduto, pTipo, pPreco, pQuantidadeProduto);
        return CadastroProdutoDAO.salvar(c);
    }

    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     *
     * @return lista de string
     */
    public static ArrayList<String[]> consultarProduto() {
        ArrayList<CadastroProduto> cadastroProduto = CadastroProdutoDAO.consultarProduto();
        ArrayList<String[]> listaProduto = new ArrayList<>();

        for (int i = 0; i < cadastroProduto.size(); i++) {

            listaProduto.add(new String[]{String.valueOf(cadastroProduto.get(i).getIdProduto()), 
                (cadastroProduto.get(i).getNomeProduto()),
                cadastroProduto.get(i).getTipo(),
                String.valueOf(cadastroProduto.get(i).getPreco()),
                String.valueOf(cadastroProduto.get(i).getQuantidadeEstoque())});

        }
        return listaProduto;
    }
}
