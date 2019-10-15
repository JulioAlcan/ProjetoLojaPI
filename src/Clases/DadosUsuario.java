/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class DadosUsuario {

    public boolean validarUsuarios(String usuario, String senha) {
        if (usuario.equals("rlouzano") && senha.equals("123")) {
            return true;
        } else {
            return false;
        }

    }
}
