package CONTROLLER;

import DAO.UsuarioDAO;
import MODEL.ElementosUsuarios;
import java.util.ArrayList;

public class UsuarioController {

    public static boolean SalvarUsuario(String ptxtNome, String ptxtCPF, String ptxtEmail, String ptxtUser, String ptxtSenha, String ptxtSenhaAdmin) {
        //Salvo na memória
        ElementosUsuarios us = new ElementosUsuarios(ptxtNome, ptxtCPF, ptxtEmail, ptxtUser, ptxtSenha, ptxtSenhaAdmin);
        return UsuarioDAO.InserirUsuario(us);
    }

    public static boolean atualizar(int pId, String ptxtNome, String ptxtCPF, String ptxtEmail, String ptxtUser, String ptxtSenha, String ptxtSenhaAdmin) {
        ElementosUsuarios p = new ElementosUsuarios(pId, ptxtNome, ptxtCPF, ptxtEmail, ptxtUser, ptxtSenha, ptxtSenhaAdmin);
        return UsuarioDAO.atualizarUser(p);

    }
        public static boolean excluirUser(int uID)
    {
        return UsuarioDAO.excluirUser(uID);
    }

    public static ArrayList<String[]> getUser() {
        ArrayList<ElementosUsuarios> Usuarios = UsuarioDAO.getUsuario();
        ArrayList<String[]> listaUsuarios = new ArrayList<>();

        for (int i = 0; i < Usuarios.size(); i++) {
            listaUsuarios.add(new String[]{String.valueOf(Usuarios.get(i).getID()), String.valueOf(Usuarios.get(i).getTxtNome()), String.valueOf(Usuarios.get(i).getTxtCPF()), String.valueOf(Usuarios.get(i).getTxtUser()),String.valueOf(Usuarios.get(i).getTxtEmail()) ,String.valueOf(Usuarios.get(i).getTxtSenhaAdmin()), String.valueOf(Usuarios.get(i).getTxtSenha())});

        }

        return listaUsuarios;

    }
}
