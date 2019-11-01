package DAO;

import MODEL.ElementosUsuarios;
import java.util.ArrayList;

public class UsuarioDAO {

    public static boolean InserirUsuario(ElementosUsuarios user) {
        return SimulaDB.getInstance().InserirUsuario(user);
    }

    public static ArrayList<ElementosUsuarios> getUsuario() {
        return SimulaDB.getInstance().getUser();
    }

    public static boolean salvar(ElementosUsuarios p) {

        return SimulaDB.getInstance().SalvarUse(p);
    }

    public static boolean atualizarUser(ElementosUsuarios p) {

        return SimulaDB.getInstance().AtualizarUser(p);
    }

    public static boolean excluirUser(int uID) {
        return SimulaDB.getInstance().ExcluirUsuario(uID);
    }
}
