package CONTROLLER;

import DAO.ProdutoDAO;
import MODEL.ElementosProdutos;
import java.util.ArrayList;

public class ProdutoController {

    public static boolean SalvarProduto(String PtxtNomeProd, double PtxtPreco, String PtxtTipo, int PQtdProd) {
        ElementosProdutos pd = new ElementosProdutos(PtxtNomeProd, PtxtPreco, PtxtTipo, PQtdProd);
        return ProdutoDAO.InserirProduto(pd);
    }

    
    
    public static boolean atualizarProduto(int ID, String PtxtNomeProd, double PtxtPreco, String PtxtTipo, int PQtdProd) {
        ElementosProdutos pd = new ElementosProdutos(ID, PtxtNomeProd, PtxtPreco, PtxtTipo, PQtdProd);
        return ProdutoDAO.atualizarProd(pd);
    }
    
    

    public static boolean excluirProduto(int pID) {
        return ProdutoDAO.excluirProduto(pID);
    }

    public static ArrayList<String[]> getProduto() {
        ArrayList<ElementosProdutos> Produto = ProdutoDAO.getProd();
        ArrayList<String[]> listaProduto = new ArrayList<>();

        for (int i = 0; i < Produto.size(); i++) {
            listaProduto.add(new String[]{String.valueOf(Produto.get(i).getID()), String.valueOf(Produto.get(i).getTxtNomeProd()),
                String.valueOf(Produto.get(i).getTxtPreco()),
                String.valueOf(Produto.get(i).getTxtTipo()),  String.valueOf(Produto.get(i).getQtdProd())});

        }

        return listaProduto;

    }

}
