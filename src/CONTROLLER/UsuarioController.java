package CONTROLLER;

import DAO.UsuarioDAO;
import MODEL.ElementosUsuarios;
import java.util.ArrayList;

public class UsuarioController {

    /**
     * Método Estático Salvar Salvo os dados do cliente na memória ou no banco
     * de dados
     *
     * @param Id
     * @param pNome
     * @param pCPF
     *
     * @return
     */
    public static boolean SalvarUsuario(String ptxtNome, String ptxtCPF, String ptxtEmail, String ptxtUser, String ptxtSenha, String ptxtSenhaAdmin) {
        //Salvo na memória
        ElementosUsuarios us = new ElementosUsuarios(ptxtNome, ptxtCPF, ptxtEmail, ptxtUser, ptxtSenha, ptxtSenhaAdmin);
        return UsuarioDAO.InserirUsuario(us);
    }

    public static boolean atualizar(int pId, String ptxtNome, String ptxtCPF, String ptxtEmail, String ptxtUser, String ptxtSenha, String ptxtSenhaAdmin) {
        ElementosUsuarios p = new ElementosUsuarios(pId, ptxtNome, ptxtCPF, ptxtEmail, ptxtUser, ptxtSenha, ptxtSenhaAdmin);
        return UsuarioDAO.atualizarUser(p);

    }

    public static ArrayList<String[]> getUser() {
        ArrayList<ElementosUsuarios> clientes = UsuarioDAO.getUsuario();
        ArrayList<String[]> listaClientes = new ArrayList<>();

        for (int i = 0; i < clientes.size(); i++) {
            listaClientes.add(new String[]{String.valueOf(clientes.get(i).getID()), clientes.get(i).getTxtNome(), String.valueOf(clientes.get(i).getTxtCPF())});

        }

        return listaClientes;

    }
}
