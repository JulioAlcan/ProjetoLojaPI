package DAO;

import MODEL.ElementosUsuarios;
import java.util.ArrayList;

public class SimulaDB {

    private static SimulaDB mockdb;
    private ArrayList<ElementosUsuarios> listaUsuarios;

    private SimulaDB() {

        listaUsuarios = new ArrayList<ElementosUsuarios>();

    }

    public static synchronized SimulaDB getInstance() {
        if (mockdb == null) {
            mockdb = new SimulaDB();
        }

        return mockdb;
    }

    public boolean InserirUsuario(ElementosUsuarios listUser) {
        listaUsuarios.add(listUser);

        return true;
    }

    public ArrayList<ElementosUsuarios> getUser() {
        return this.listaUsuarios;
    }

    public boolean SalvarUse(ElementosUsuarios c) {
        listaUsuarios.add(c);

        return true;
    }

    public boolean AtualizarUser(ElementosUsuarios p) {
        for (ElementosUsuarios item : listaUsuarios) {
            if (item.getID() == p.getID()) {
                item.setTxtNome(p.getTxtNome());
                item.setTxtCPF(p.getTxtCPF());
            }
        }

        return true;
    }

}
