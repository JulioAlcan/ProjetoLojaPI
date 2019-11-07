/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UsuarioDAO;
import Model.Usuario;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julio
 */
public class UsuarioController {

    public static boolean salvar(String pNome, String pCPF, String pCargo, String pLogin, String pSenha) {
        //Salvo na memória
        
        Usuario u = new Usuario(pNome, pCPF, pCargo, pLogin, pSenha);
        return UsuarioDAO.salvar(u);
    }
    

    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     *
     * @return lista de string
     */
    public static ArrayList<String[]> consultarUsuario() {
        ArrayList<Usuario> Usuario = UsuarioDAO.consultarUsuario();
        ArrayList<String[]> listaUsuario = new ArrayList<>();

        for (int i = 0; i < Usuario.size(); i++) {

            listaUsuario.add(new String[]{String.valueOf(Usuario.get(i).getId()), 
                Usuario.get(i).getNome(), Usuario.get(i).getCPF(),Usuario.get(i).getCargo(), 
                Usuario.get(i).getLogin(), Usuario.get(i).getSenha()});

        }
        return listaUsuario;
    }

    public boolean getValidarUsuario(String login, String senha) {
        Usuario user = new Usuario();
        user.setLogin(login);
        user.setSenha(senha);
        
        try {
            return UsuarioDAO.getValidarUsuarioDAO(user);
        } catch (ClassNotFoundException ex) {
            return false;
        }
    }

}
