/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CadastroClienteDAO;
import DAO.UsuarioDAO;
import Model.CadastroCliente;
import java.util.ArrayList;

/**
 *
 * @author julio
 */
public class CadastroClienteController {

    public static boolean salvar(String pNome, String pCpf, String pEstadoCivil, String pSexo, String pDataNascimento, String pEmail,
            String pCep, String pLogradouro, String pNumeroCasa) throws ClassNotFoundException {
        //Salvo na memória

        CadastroCliente c = new CadastroCliente(pNome, pCpf, pEstadoCivil, pSexo, pDataNascimento, pEmail, pCep, pLogradouro, pNumeroCasa);
        return CadastroClienteDAO.salvar(c);
    }

    /**
     * Transformo uma lista de objetos Cliente em uma lista de Strings
     *
     * @return lista de string
     */
    public static ArrayList<String[]> consultarCliente() {
        ArrayList<CadastroCliente> cadastroClientes = CadastroClienteDAO.consultarCliente();
        ArrayList<String[]> listaCliente = new ArrayList<>();

        for (int i = 0; i < cadastroClientes.size(); i++) {

            listaCliente.add(new String[]{String.valueOf(cadastroClientes.get(i).getIdCliente()), (cadastroClientes.get(i).getNome()),
                cadastroClientes.get(i).getCpf(), cadastroClientes.get(i).getEstadoCivil(), cadastroClientes.get(i).getSexo(),
                cadastroClientes.get(i).getDataNascimento(),cadastroClientes.get(i).getEmail(), 
                cadastroClientes.get(i).getCep(), cadastroClientes.get(i).getLogradouro(),
                cadastroClientes.get(i).getNumeroCasa()});

        }
        return listaCliente;
    }
}
