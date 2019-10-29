package DAO;

import MODEL.ElementosCliente;
import java.util.ArrayList;


public class ClienteDAO {
    public static boolean InserirCliente(ElementosCliente cli) {
        return SimulaDB.getInstance().InserirCliente(cli);
    }

    public static ArrayList<ElementosCliente> getCli() {
        return SimulaDB.getInstance().getCliente();
    }

    public static boolean salvar(ElementosCliente c) {

        return SimulaDB.getInstance().SalvarCliente(c);
    }

    public static boolean atualizarCli(ElementosCliente c) {

        return SimulaDB.getInstance().AtualizarCliente(c);
    }

    public static boolean excluirCliente(int cID) {
        return SimulaDB.getInstance().ExcluirCliente(cID);
    }
}
