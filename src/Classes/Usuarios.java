package Classes;

public class Usuarios {

    public boolean validarUsuarios(String usuario, String senha) {
        if (usuario.equals("rlouzano") && senha.equals("123")) {
            return true;
        } else {
            return false;
        }

    }
}
