package DAO;

import MODEL.ElementosProdutos;
import java.util.ArrayList;

public class ProdutoDAO {

        public static boolean InserirProduto(ElementosProdutos prod){
            return SimulaDB.getInstance().InserirProduto(prod);
        }
        
        public static ArrayList<ElementosProdutos> getProd() {
            return SimulaDB.getInstance().getProduto();
        }

        public static boolean salvar(ElementosProdutos p) {

            return SimulaDB.getInstance().SalvarProduto(p);
        }

        public static boolean atualizarProd(ElementosProdutos p) {
            return SimulaDB.getInstance().AtualizarProduto(p);
        }

        public static boolean excluirProduto(int pID) {
            return SimulaDB.getInstance().ExcluirProduto(pID);
        }
    }
