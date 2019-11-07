/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import GerenciarConexao.GerenciarConexao;
import Model.Usuario;
import java.sql.Connection;
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
public class UsuarioDAO {

    public static boolean salvar(Usuario u) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {

            //Tenta estabeler a conexão com o SGBD e cria comando a ser executado conexão
            //Obs: A classe GerenciadorConexao já carrega o Driver e define os parâmetros de conexão
            conexao = GerenciarConexao.abrirConexao();

            instrucaoSQL = conexao.prepareStatement("INSERT INTO usuario (nome, cpf, cargo, login, senha) VALUES(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID do cliente

            //Adiciono os parâmetros ao meu comando SQL
            instrucaoSQL.setString(1, u.getNome());
            instrucaoSQL.setString(2, u.getCPF());
            instrucaoSQL.setString(3, u.getCargo());
            instrucaoSQL.setString(4, u.getLogin());
            instrucaoSQL.setString(5, u.getSenha());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;

                ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                    u.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Falha ao obter o ID do cliente.");
                }
            } else {
                retorno = false;
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {

            //Libero os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciarConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return retorno;
    }

    public static ArrayList<Usuario> consultarUsuario() {
        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

        try {

            conexao = GerenciarConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM usuario;");

            rs = instrucaoSQL.executeQuery();

            while (rs.next()) {
                Usuario c = new Usuario();
                c.setId(rs.getInt("idusuario"));
                c.setNome(rs.getString("nome"));
                c.setCPF(rs.getString("CPF"));
                c.setCPF(rs.getString("cargo"));
                c.setCPF(rs.getString("login"));
                c.setCPF(rs.getString("senha"));
                listaUsuario.add(c);
            }

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            listaUsuario = null;
        } finally {
            //Libero os recursos da memória
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciarConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }

        return listaUsuario;
    }

    public static boolean getValidarUsuarioDAO(Usuario user) throws ClassNotFoundException {

        ResultSet rs = null;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        
        boolean retorno = false;

        try {
            conexao = GerenciarConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("select nome, cpf, cargo, login, senha from usuario where login = '"
                    + user.getLogin() + "' and senha = '" + user.getSenha() + "'");

            rs = instrucaoSQL.executeQuery();
            
            while(rs.next()){
                Usuario usuarioConsultado = new Usuario();
                usuarioConsultado.setNome(rs.getString("nome"));
                retorno = true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            retorno = false;
        } finally {
            //Libero os recursos da memória
            try {
                if (rs != null) {
                    rs.close();
                }
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }

                GerenciarConexao.fecharConexao();

            } catch (SQLException ex) {
            }
        }
        return retorno;
    }
}
