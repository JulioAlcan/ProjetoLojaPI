/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Controller.UsuarioController;
import Model.Usuario;
import javax.swing.JOptionPane;
import projetolojapi.TelaInicial;

/**
 *
 * @author julio
 */
public class DadosUsuario {
    
   Usuario u = new Usuario();
   TelaInicial tv = new TelaInicial();
   
   public boolean validarUsuarios(String login, String senha){
    Usuario cd = new Usuario();
    if(login.equals("Julio") && senha.equals("456")){
        tv.setVisible(true);
        tv.setLocationRelativeTo(null);
        return true;
    }else{
       return false;
}
   
}
}
