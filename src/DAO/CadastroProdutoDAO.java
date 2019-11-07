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
import Model.CadastroProduto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author julio
 */
public class CadastroProdutoDAO {

     public static boolean salvar(CadastroProduto p) throws ClassNotFoundException
    {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
                
        try {
            
            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciarConexao.abrirConexao();
            
                instrucaoSQL = conexao.prepareStatement("INSERT INTO produto (nomeproduto, tipo, preco, quantidade_estoque) "
                        + "VALUES(?, ? ,?, ?)"
                , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID do cliente
            
            //Adiciono os parâmetros ao meu comando SQL
            
            instrucaoSQL.setString(1, p.getNomeProduto());
            instrucaoSQL.setString(2, p.getTipo());
            instrucaoSQL.setDouble(3, p.getPreco());
            instrucaoSQL.setInt(4, p.getQuantidadeEstoque());
            
            int linhasAfetadas = instrucaoSQL.executeUpdate();
            
            if(linhasAfetadas>0)
            {
                retorno = true;
                
                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        p.setIdProduto(generatedKeys.getInt(1));
                    }
                    else {
                        throw new SQLException("Falha ao obter o ID do produto.");
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
    
    public static boolean atualizar(CadastroProduto p) {

        boolean retorno = false;
        Connection conexao = null;
        Statement instrucaoSQL = null;

        try {
            Class.forName(DRIVER);

            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            instrucaoSQL = conexao.createStatement();
            int linhasAfetadas = instrucaoSQL.executeUpdate
        ("update lojamoveis set nomeproduto = '" + p.getNomeProduto() + "', tipo = " + p.getTipo() + 
                    ", preco = " + p.getPreco() + "', quantidade_estoque = " + p.getQuantidadeEstoque()+";");
            

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
    
    public static ArrayList<CadastroProduto> consultarProduto()
    {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null; 
        
        ArrayList<CadastroProduto> listaProduto = new ArrayList<CadastroProduto>();
        
        try {
            
            conexao = GerenciarConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM produto;");

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                CadastroProduto cc = new CadastroProduto();
                
                cc.setIdProduto(rs.getInt("idproduto"));
                cc.setNomeProduto(rs.getString("nomeproduto"));
                cc.setTipo(rs.getString("tipo"));
                cc.setPreco(rs.getFloat("preco"));
                cc.setQuantidadeEstoque(rs.getInt("quantidade_estoque"));                
                
                listaProduto.add(cc);
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaProduto = null;
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
        
        return listaProduto;
    }
    
}
