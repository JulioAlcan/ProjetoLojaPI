/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author julio
 */
public class Usuario {

        private static int qtdUsuariosCriados;

        private int id;
        private String nome;
        private String cpf;
        private String cargo;
        private String login;
        private String senha;
  

        public String getCPF() {
            return cpf;
        }

        public String getCPFSomenteNumeros() {
            return cpf.replace(".", "").replace("-", "");
        }

        public void setCPF(String pCPF) {
            this.cpf = pCPF;
        }

        public Usuario() {
            //TODO:Ao conectar-se ao banco, remover incremento pelo código
            qtdUsuariosCriados++;
            this.id = qtdUsuariosCriados;
        }

        public Usuario(String nome, String cpf, String cargo, String login, String senha) {
            qtdUsuariosCriados++;
            this.id = qtdUsuariosCriados;
            this.nome = nome;
            this.cpf = cpf;
            this.cargo = cargo;
            this.login = login;
            this.senha = senha;
        }

        public Usuario(int pidusuario, String pNome, String pCPF, String pCargo, String pLogin, String pSenha) {
            this.id = pidusuario;
            this.nome = pNome;
            this.cpf = pCPF;
            this.cargo = pCargo;
            this.login = pLogin;
            this.senha = pSenha;
        }

        public int getId() {
            return id;
        }

        public void setId(int pidusuario) {
            this.id = pidusuario;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String pNome) {
            this.nome = pNome;
        }
        
        public String getCargo() {
            return cargo;
        }

        public void setCargo(String pCargo) {
            this.cargo = pCargo;
        }
        
        public String getLogin() {
            return login;
        }

        public void setLogin(String pLogin) {
            this.login = pLogin;
        }
        public String getSenha() {
            return senha;
        }

        public void setSenha(String pSenha) {
            this.senha = pSenha;
        }
    }
