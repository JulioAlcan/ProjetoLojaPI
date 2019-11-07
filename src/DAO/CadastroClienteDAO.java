/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GerenciarConexao.GerenciarConexao;
import static GerenciarConexao.GerenciarConexao.DRIVER;
import static GerenciarConexao.GerenciarConexao.LOGIN;
import static GerenciarConexao.GerenciarConexao.SENHA;
import static GerenciarConexao.GerenciarConexao.URL;
import Model.CadastroCliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class CadastroClienteDAO {

     public static boolean salvar(CadastroCliente p) throws ClassNotFoundException
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciarConexao.abrirConexao();
            
                instrucaoSQL = conexao.prepareStatement("INSERT INTO cliente (nome, cpf, estadocivil, sexo, data_nascimento,"
                        + "email, cep, logradouro, numerocasa) VALUES(?, ?, ?, ?, ?, ?, ? ,?, ?)"
                , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID do cliente
            
            //Adiciono os parâmetros ao meu comando SQL
            
            instrucaoSQL.setString(1, p.getNome());
            instrucaoSQL.setString(2, p.getCpf());
            instrucaoSQL.setString(3, p.getEstadoCivil());
            instrucaoSQL.setString(4, p.getSexo());
            instrucaoSQL.setString(5, p.getDataNascimento());
            instrucaoSQL.setString(6, p.getEmail());
            instrucaoSQL.setString(7, p.getCep());
            instrucaoSQL.setString(8, p.getLogradouro());
            instrucaoSQL.setString(9, p.getNumeroCasa());
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        p.setIdCliente(generatedKeys.getInt(1));
                    }
                    else {
                        throw new SQLException("Falha ao obter o ID do cliente.");
                    }
            }
            else{
                retorno = false;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally{
            
            //Libero os recursos da memória
            try {
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciarConexao.fecharConexao();
                
              } catch (SQLException ex) {
             }
        }
        
        return retorno;
    }
    
    public static boolean atualizar(CadastroCliente p) {

        boolean retorno = false;
        Connection conexao = null;
        Statement instrucaoSQL = null;

        try {
            Class.forName(DRIVER);

            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            instrucaoSQL = conexao.createStatement();
            int linhasAfetadas = instrucaoSQL.executeUpdate("update lojamoveis set cliente = '" + p.getNome() + "', cpf = " + p.getCpf() + 
                    ", estadocivil = " + p.getEstadoCivil() + "', sexo = " + p.getSexo()+
                    "', data_nascimento = " + p.getDataNascimento()+ 
                    "', email = " + p.getEmail()+
                    "', cep = " + p.getCep() +
                    "', logradouro = " + p.getLogradouro() +
                    "', numerocasa = " + p.getNumeroCasa() +
                    " WHERE idcliente = " + p.getIdCliente()+ ";");
            

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado.");
            retorno = false;
        } catch (SQLException ex) {
            System.out.println("Erro no comando SQL.");
            retorno = false;
        } finally {

            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
            }
        }

        return retorno;
    }
    
    public static boolean excluir(int pID)
    {
        //Simulo uma exclusão no banco de dados (DELETE FROM TabelaXYZ WHERE...)
        //Remover linha abaixo e retornar se foi feito o DELETE com sucesso ou falha
        return false;
    }
    
    public static ArrayList<CadastroCliente> consultarCliente()
    {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<CadastroCliente> listaCliente = new ArrayList<CadastroCliente>();
        
        try {
            
            conexao = GerenciarConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM cliente;");

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                CadastroCliente cc = new CadastroCliente();
                
                cc.setIdCliente(rs.getInt("idcliente"));
                cc.setNome(rs.getString("nome"));
                cc.setCpf(rs.getString("cpf"));
                cc.setEstadoCivil(rs.getString("estadocivil"));
                cc.setSexo(rs.getString("sexo"));
                cc.setDataNascimento(rs.getString("data_nascimento"));
                cc.setEmail(rs.getString("email"));
                cc.setCep(rs.getString("cep"));
                cc.setLogradouro(rs.getString("logradouro"));
                cc.setNumeroCasa(rs.getString("numerocasa"));
                
                listaCliente.add(cc);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaCliente = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciarConexao.fecharConexao();
                        
              } catch (SQLException ex) {
             }
        }
        
        return listaCliente;
    }
    
}
