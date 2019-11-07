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
public class CadastroCliente {

    private static int qtdClientesCriados;

    private int idCliente;
    private String Nome;
    private String Cpf;
    private String EstadoCivil;
    private String Sexo;
    private String DataNascimento;
    private String Email;
    private String Cep;
    private String NumeroCasa;
    private String Logradouro;

    public String getCPF() {
        return Cpf;
    }

    public String getCPFSomenteNumeros() {
        return Cpf.replace(".", "").replace("-", "");
    }

    public void setCPF(String pCPF) {
        this.Cpf = pCPF;
    }

    public CadastroCliente() {
        //TODO:Ao conectar-se ao banco, remover incremento pelo código
        qtdClientesCriados++;
        this.idCliente = qtdClientesCriados;
    }

    public CadastroCliente(String Nome, String Cpf, String EstadoCivil, String Sexo, String DataNascimento, String Email,
            String Cep, String NumeroCasa, String Logradouro) {
        qtdClientesCriados++;
        this.idCliente = qtdClientesCriados;
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.EstadoCivil = EstadoCivil;
        this.Sexo = Sexo;
        this.DataNascimento = DataNascimento;
        this.Email = Email;
        this.Cep = Cep;
        this.Logradouro = Logradouro;    
        this.NumeroCasa = NumeroCasa;
        
    }

    public CadastroCliente(int idCliente, String pNome, String pCpf, String pEstadoCivil, String pSexo, String pDataNascimento,
            String pEmail, String pCep, String pNumeroCasa, String pLogradouro) {
        qtdClientesCriados++;
        this.idCliente = qtdClientesCriados;
        this.Nome = pNome;
        this.Cpf = pCpf;
        this.EstadoCivil = pEstadoCivil;
        this.Sexo = pSexo;
        this.DataNascimento = pDataNascimento;
        this.Email = pEmail;
        this.Cep = pCep;
        this.Logradouro = pLogradouro;
        this.NumeroCasa = pNumeroCasa;
    }

    public static int getQtdClientesCriados() {
        return qtdClientesCriados;
    }

    public static void setQtdClientesCriados(int qtdClientesCriados) {
        CadastroCliente.qtdClientesCriados = qtdClientesCriados;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int pidCliente) {
        this.idCliente = pidCliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String pNome) {
        this.Nome = pNome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String pCpf) {
        this.Cpf = pCpf;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String pEstadoCivil) {
        this.EstadoCivil = pEstadoCivil;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String pSexo) {
        this.Sexo = pSexo;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String pDataNascimento) {
        this.DataNascimento = pDataNascimento;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String pEmail) {
        this.Email = pEmail;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String pCep) {
        this.Cep = pCep;
    }

    public String getNumeroCasa() {
        return NumeroCasa;
    }

    public void setNumeroCasa(String pNumeroCasa) {
        this.NumeroCasa = pNumeroCasa;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String pLogradouro) {
        this.Logradouro = pLogradouro;
    }
}
