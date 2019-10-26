/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.ClienteDAO;
import DAO.UsuarioDAO;
import MODEL.ElementosCliente;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class ClienteController {

    public static boolean SalvarCliente(String ucliNome, String ucliCPF, String cliRG, String listSexo, String cliNascimento, String ucliEmail, String listEstadoCivil, String cliCep, String cliNumeroResidencia, String cliComplementoResidencia, String cliEndercoRua, String cliBairro, String listUF, String cliCidade, String cliCelular, String cliTelResidencial) {
        //Salvo na memória
        ElementosCliente cl = new ElementosCliente(ucliNome, ucliCPF, cliRG, listSexo, cliNascimento, ucliEmail, listEstadoCivil, cliCep, cliNumeroResidencia, cliComplementoResidencia, cliEndercoRua, cliBairro, listUF, cliCidade, cliCelular, cliTelResidencial);
        return ClienteDAO.InserirCliente(cl);
    }

    public static boolean atualizarCliente(int idCliente, String ucliNome, String ucliCPF, String cliRG, String listSexo, 
            String cliNascimento, String ucliEmail, String listEstadoCivil, String cliCep, String cliNumeroResidencia, 
            String cliComplementoResidencia, String cliEndercoRua, String cliBairro, String listUF, String cliCidade, 
            String cliCelular, String cliTelResidencial) {
        
        ElementosCliente c = new ElementosCliente(idCliente, ucliNome, ucliCPF, cliRG, listSexo, cliNascimento, ucliEmail, listEstadoCivil, cliCep, cliNumeroResidencia, cliComplementoResidencia, cliEndercoRua, cliBairro, listUF, cliCidade, cliCelular, cliTelResidencial);
        return ClienteDAO.atualizarCli(c);

    }

    public static boolean excluirCliente(int cID) {
        return ClienteDAO.excluirCliente(cID);
    }

    public static ArrayList<String[]> getCliente() {
        ArrayList<ElementosCliente> Cliente = ClienteDAO.getCli();
        ArrayList<String[]> listaCliente = new ArrayList<>();

        for (int i = 0; i < Cliente.size(); i++) {
            listaCliente.add(new String[]{String.valueOf(Cliente.get(i).getIdCliente()), String.valueOf(Cliente.get(i).getCliNome()),
                String.valueOf(Cliente.get(i).getCliCPF()), String.valueOf(Cliente.get(i).getCliRG()), String.valueOf(Cliente.get(i).getListSexo()),
                String.valueOf(Cliente.get(i).getCliNascimento()), String.valueOf(Cliente.get(i).getCliEmail()),
                String.valueOf(Cliente.get(i).getListEstadoCivil()), String.valueOf(Cliente.get(i).getCliCep()),
                String.valueOf(Cliente.get(i).getCliNumeroResidencia()), String.valueOf(Cliente.get(i).getCliComplementoResidencia()),
                String.valueOf(Cliente.get(i).getCliEndercoRua()), String.valueOf(Cliente.get(i).getCliBairro()),
                String.valueOf(Cliente.get(i).getListUF()), String.valueOf(Cliente.get(i).getCliCidade()), String.valueOf(Cliente.get(i).getCliCelular()),
                String.valueOf(Cliente.get(i).getCliCelular()), String.valueOf(Cliente.get(i).getCliTelResidencial())});

        }

        return listaCliente;

    }
}
