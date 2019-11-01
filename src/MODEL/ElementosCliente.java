/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author rafae
 */
public class ElementosCliente {

    private static int QtdCliente;
    private int idCliente;
    private String cliNome;
    private String cliCPF;
    private String cliRG;
    private String listSexo;
    private String cliNascimento;
    private String cliEmail;
    private String listEstadoCivil;
    private String cliCep;
    private String cliNumeroResidencia;
    private String cliComplementoResidencia;
    private String cliEndercoRua;
    private String cliBairro;
    private String listUF;
    private String cliCidade;
    private String cliCelular;
    private String cliTelResidencial;

    public ElementosCliente() {
        QtdCliente++;
        this.idCliente = QtdCliente;

    }
    public ElementosCliente( String cliNome, String cliCPF, String cliRG, String listSexo, String cliNascimento, String cliEmail, String listEstadoCivil, String cliCep, String cliNumeroResidencia, String cliComplementoResidencia, String cliEndercoRua, String cliBairro, String listUF, String cliCidade, String cliCelular, String cliTelResidencial) {
        QtdCliente++;
        this.idCliente = QtdCliente;
        this.cliNome = cliNome;
        this.cliCPF = cliCPF;
        this.cliRG = cliRG;
        this.listSexo = listSexo;
        this.cliNascimento = cliNascimento;
        this.cliEmail = cliEmail;
        this.listEstadoCivil = listEstadoCivil;
        this.cliCep = cliCep;
        this.cliNumeroResidencia = cliNumeroResidencia;
        this.cliComplementoResidencia = cliComplementoResidencia;
        this.cliEndercoRua = cliEndercoRua;
        this.cliBairro = cliBairro;
        this.listUF = listUF;
        this.cliCidade = cliCidade;
        this.cliCelular = cliCelular;
        this.cliTelResidencial = cliTelResidencial;
    }
    
    public ElementosCliente(int idCliente, String cliNome, String cliCPF, String cliRG, String listSexo, String cliNascimento, String cliEmail, String listEstadoCivil, String cliCep, String cliNumeroResidencia, String cliComplementoResidencia, String cliEndercoRua, String cliBairro, String listUF, String cliCidade, String cliCelular, String cliTelResidencial) {
        this.idCliente = idCliente;
        this.cliNome = cliNome;
        this.cliCPF = cliCPF;
        this.cliRG = cliRG;
        this.listSexo = listSexo;
        this.cliNascimento = cliNascimento;
        this.cliEmail = cliEmail;
        this.listEstadoCivil = listEstadoCivil;
        this.cliCep = cliCep;
        this.cliNumeroResidencia = cliNumeroResidencia;
        this.cliComplementoResidencia = cliComplementoResidencia;
        this.cliEndercoRua = cliEndercoRua;
        this.cliBairro = cliBairro;
        this.listUF = listUF;
        this.cliCidade = cliCidade;
        this.cliCelular = cliCelular;
        this.cliTelResidencial = cliTelResidencial;
    }

    public static int getQtdCliente() {
        return QtdCliente;
    }

    public static void setQtdCliente(int QtdCliente) {
        ElementosCliente.QtdCliente = QtdCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    public String getCliCPF() {
        return cliCPF;
    }

    public void setCliCPF(String cliCPF) {
        this.cliCPF = cliCPF;
    }

    public String getCliRG() {
        return cliRG;
    }

    public void setCliRG(String cliRG) {
        this.cliRG = cliRG;
    }

    public String getListSexo() {
        return listSexo;
    }

    public void setListSexo(String listSexo) {
        this.listSexo = listSexo;
    }

    public String getCliNascimento() {
        return cliNascimento;
    }

    public void setCliNascimento(String cliNascimento) {
        this.cliNascimento = cliNascimento;
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        this.cliEmail = cliEmail;
    }

    public String getListEstadoCivil() {
        return listEstadoCivil;
    }

    public void setListEstadoCivil(String listEstadoCivil) {
        this.listEstadoCivil = listEstadoCivil;
    }

    public String getCliCep() {
        return cliCep;
    }

    public void setCliCep(String cliCep) {
        this.cliCep = cliCep;
    }

    public String getCliNumeroResidencia() {
        return cliNumeroResidencia;
    }

    public void setCliNumeroResidencia(String cliNumeroResidencia) {
        this.cliNumeroResidencia = cliNumeroResidencia;
    }

    public String getCliComplementoResidencia() {
        return cliComplementoResidencia;
    }

    public void setCliComplementoResidencia(String cliComplementoResidencia) {
        this.cliComplementoResidencia = cliComplementoResidencia;
    }

    public String getCliEndercoRua() {
        return cliEndercoRua;
    }

    public void setCliEndercoRua(String cliEndercoRua) {
        this.cliEndercoRua = cliEndercoRua;
    }

    public String getCliBairro() {
        return cliBairro;
    }

    public void setCliBairro(String cliBairro) {
        this.cliBairro = cliBairro;
    }

    public String getListUF() {
        return listUF;
    }

    public void setListUF(String listUF) {
        this.listUF = listUF;
    }

    public String getCliCidade() {
        return cliCidade;
    }

    public void setCliCidade(String cliCidade) {
        this.cliCidade = cliCidade;
    }

    public String getCliCelular() {
        return cliCelular;
    }

    public void setCliCelular(String cliCelular) {
        this.cliCelular = cliCelular;
    }

    public String getCliTelResidencial() {
        return cliTelResidencial;
    }

    public void setCliTelResidencial(String cliTelResidencial) {
        this.cliTelResidencial = cliTelResidencial;
    }
    
    
}
