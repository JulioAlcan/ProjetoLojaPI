/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolojapi;

import CONTROLLER.ClienteController;
import CONTROLLER.UsuarioController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julio
 */
public class TelaCadastroCliente extends javax.swing.JFrame {

    private String modoTela;

    /**
     * Creates new form TelaCadastroCliente
     */
    public TelaCadastroCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        DesabilitarFormulario();
        LoadTable();
        idCliente.setVisible(false);
    }

    public void HabilitarFormulario() {
        btnSalvarCadastroCliente.setEnabled(true);
        cliNome.setEnabled(true);
        cliCPF.setEnabled(true);
        cliRG.setEnabled(true);
        listSexo.setEnabled(true);
        cliNascimento.setEnabled(true);
        cliEmail.setEnabled(true);
        listEstadoCivil.setEnabled(true);
        cliCep.setEnabled(true);
        cliNumeroResidencia.setEnabled(true);
        cliComplementoResidencia.setEnabled(true);
        cliEndercoRua.setEnabled(true);
        cliBairro.setEnabled(true);
        listUF.setEnabled(true);
        cliCidade.setEnabled(true);
        cliCelular.setEnabled(true);
        cliTelResidencial.setEnabled(true);
    }

    public void DesabilitarFormulario() {
        btnSalvarCadastroCliente.setEnabled(false);
        cliNome.setEnabled(false);
        cliCPF.setEnabled(false);
        cliRG.setEnabled(false);
        listSexo.setEnabled(false);
        cliNascimento.setEnabled(false);
        cliEmail.setEnabled(false);
        listEstadoCivil.setEnabled(false);
        cliCep.setEnabled(false);
        cliNumeroResidencia.setEnabled(false);
        cliComplementoResidencia.setEnabled(false);
        cliEndercoRua.setEnabled(false);
        cliBairro.setEnabled(false);
        listUF.setEnabled(false);
        cliCidade.setEnabled(false);
        cliCelular.setEnabled(false);
        cliTelResidencial.setEnabled(false);
    }

    public void LimparFormulario() {
        cliNome.setText("");
        cliCPF.setText("");
        cliRG.setText("");
        listSexo.setSelectedIndex(0);
        cliNascimento.setText("");
        cliEmail.setText("");
        listEstadoCivil.setSelectedIndex(0);
        cliCep.setText("");
        cliNumeroResidencia.setText("");
        cliComplementoResidencia.setText("");
        cliEndercoRua.setText("");
        cliBairro.setText("");
        listUF.setSelectedIndex(0);
        cliCidade.setText("");
        cliCelular.setText("");
        cliTelResidencial.setText("");

    }

    public void LoadTable() {
        ArrayList<String[]> linhasCliente = ClienteController.getCliente();

        DefaultTableModel tmCliente = new DefaultTableModel();
        tmCliente.addColumn("ID");
        tmCliente.addColumn("Nome");
        tmCliente.addColumn("CPF");
        tmCliente.addColumn("RG");
        tmCliente.addColumn("Sexo");
        tmCliente.addColumn("Nascimento");
        tmCliente.addColumn("Email");
        tmCliente.addColumn("EstadoCivil");
        tmCliente.addColumn("Cep");
        tmCliente.addColumn("NumeroResidencia");
        tmCliente.addColumn("Complemento");
        tmCliente.addColumn("EndercoRua");
        tmCliente.addColumn("Bairro");
        tmCliente.addColumn("UF");
        tmCliente.addColumn("Cidade");
        tmCliente.addColumn("Celular");
        tmCliente.addColumn("TelResidencial");
        tblCliente.setModel(tmCliente);
        tblCliente.removeColumn(tblCliente.getColumnModel().getColumn(0));
        for (String[] c : linhasCliente) {
            tmCliente.addRow(c);
        }
        tblCliente.getColumnModel().getColumn(0).setPreferredWidth(300);
        tblCliente.getColumnModel().getColumn(1).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(5).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(6).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(7).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(8).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(9).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(10).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(11).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(12).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(13).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(14).setPreferredWidth(100);
        tblCliente.getColumnModel().getColumn(15).setPreferredWidth(100);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cliCPF = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        cliRG = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        listSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cliNascimento = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        cliEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        listEstadoCivil = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cliCep = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        cliNumeroResidencia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cliComplementoResidencia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cliEndercoRua = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cliBairro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        listUF = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cliCidade = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cliCelular = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        cliTelResidencial = new javax.swing.JFormattedTextField();
        btnSalvarCadastroCliente = new javax.swing.JButton();
        btnCancelarInclusaoCDcliente = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        cliNome = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnBuscarCadastroCliente = new javax.swing.JButton();
        cbxTipoBusca = new javax.swing.JComboBox<>();
        txtBuscarCliente = new javax.swing.JTextField();
        idCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnNovoCadastroCliente = new javax.swing.JButton();
        btnEditarCadastroCliente = new javax.swing.JButton();
        btnExcluirCadastroCliente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de clientes");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(11, 33, 47));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("CPF:");

        try {
            cliCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cliCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliCPFActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("RG");

        try {
            cliRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cliRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliRGActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Sexo");

        listSexo.setForeground(new java.awt.Color(51, 51, 51));
        listSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Dt. Nasc");

        try {
            cliNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("E-mail");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Estado Civil");

        listEstadoCivil.setForeground(new java.awt.Color(51, 51, 51));
        listEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casado(a)", "Solteiro(a)", "Viúvo(a)", "Divorciado" }));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("CEP");

        try {
            cliCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Nº");

        cliNumeroResidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliNumeroResidenciaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Complemento");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Logradouro");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Bairro");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("UF");

        listUF.setForeground(new java.awt.Color(51, 51, 51));
        listUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Cidade");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Celular");

        try {
            cliCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Tel. Fixo");

        try {
            cliTelResidencial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnSalvarCadastroCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvarCadastroCliente.setForeground(new java.awt.Color(11, 33, 47));
        btnSalvarCadastroCliente.setText("Salvar");
        btnSalvarCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroClienteActionPerformed(evt);
            }
        });

        btnCancelarInclusaoCDcliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancelarInclusaoCDcliente.setForeground(new java.awt.Color(11, 33, 47));
        btnCancelarInclusaoCDcliente.setText("Cancelar");
        btnCancelarInclusaoCDcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarInclusaoCDclienteActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Nome");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btnSalvarCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarInclusaoCDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(14, 14, 14)
                                .addComponent(cliCPF)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cliRG, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cliNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cliNome, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cliEndercoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13)
                                        .addGap(9, 9, 9)
                                        .addComponent(cliBairro))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(listEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cliCep, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cliNumeroResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cliComplementoResidencia))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cliCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cliCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cliTelResidencial)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cliEmail)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cliCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cliRG, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(listSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cliNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(listEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cliCep, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cliNumeroResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cliComplementoResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cliEndercoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cliBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(listUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(cliCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(cliCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(cliTelResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarInclusaoCDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(19, 54, 77));

        btnBuscarCadastroCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarCadastroCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBuscarCadastroCliente.setForeground(new java.awt.Color(51, 51, 51));
        btnBuscarCadastroCliente.setText("Buscar");
        btnBuscarCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCadastroClienteActionPerformed(evt);
            }
        });

        cbxTipoBusca.setBackground(new java.awt.Color(204, 204, 204));
        cbxTipoBusca.setForeground(new java.awt.Color(51, 51, 51));
        cbxTipoBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Cliente", "CPF" }));
        cbxTipoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoBuscaActionPerformed(evt);
            }
        });

        idCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        idCliente.setForeground(new java.awt.Color(204, 204, 204));
        idCliente.setText("ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cbxTipoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(idCliente)
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscarCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(idCliente))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxTipoBusca)
                        .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Telefone", "ID cliente"
            }
        ));
        jScrollPane1.setViewportView(tblCliente);

        btnNovoCadastroCliente.setBackground(new java.awt.Color(19, 54, 77));
        btnNovoCadastroCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNovoCadastroCliente.setForeground(new java.awt.Color(204, 204, 204));
        btnNovoCadastroCliente.setText("Novo");
        btnNovoCadastroCliente.setBorderPainted(false);
        btnNovoCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCadastroClienteActionPerformed(evt);
            }
        });

        btnEditarCadastroCliente.setBackground(new java.awt.Color(19, 54, 77));
        btnEditarCadastroCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditarCadastroCliente.setForeground(new java.awt.Color(204, 204, 204));
        btnEditarCadastroCliente.setText("Editar");
        btnEditarCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCadastroClienteActionPerformed(evt);
            }
        });

        btnExcluirCadastroCliente.setBackground(new java.awt.Color(19, 54, 77));
        btnExcluirCadastroCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirCadastroCliente.setForeground(new java.awt.Color(204, 204, 204));
        btnExcluirCadastroCliente.setText("Excluir");
        btnExcluirCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCadastroClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnNovoCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnEditarCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addComponent(btnExcluirCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addGap(36, 36, 36))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Cadastro Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cliCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliCPFActionPerformed

    private void cliRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliRGActionPerformed

    private void cliNumeroResidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliNumeroResidenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliNumeroResidenciaActionPerformed

    private void btnNovoCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCadastroClienteActionPerformed
        // cadastrando o botao "novo" para cadastro do cliente
        modoTela = "Criar";
        HabilitarFormulario();
        LimparFormulario();
        btnBuscarCadastroCliente.setEnabled(false);
        btnEditarCadastroCliente.setEnabled(false);
        btnExcluirCadastroCliente.setEnabled(false);

        //Liberado os campos para o cadastro
        cliCPF.setText("");
        cliRG.setText("");
        listSexo.setSelectedIndex(0);
        cliNascimento.setText("");
        cliEmail.setText("");
        listEstadoCivil.setSelectedIndex(0);
        cliCep.setText("");
        cliNumeroResidencia.setText("");
        cliComplementoResidencia.setText("");
        cliEndercoRua.setText("");
        cliBairro.setText("");
        listUF.setSelectedIndex(0);
        cliCidade.setText("");
        cliCelular.setText("");
        cliTelResidencial.setText("");


    }//GEN-LAST:event_btnNovoCadastroClienteActionPerformed


    private void btnSalvarCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroClienteActionPerformed
        // Codigo do botao Salvar, cadastro cliente

        if (ValidarFormulario()) {
            if (modoTela.equals("Criar")) {
                //Passo ao controller a entrada do usuário e peço para salvar no banco de dados
                if (ClienteController.SalvarCliente(cliNome.getText(),
                        cliCPF.getText(), cliRG.getText(), (String) listSexo.getSelectedItem(), cliNascimento.getText(),
                        cliEmail.getText(), (String) listEstadoCivil.getSelectedItem(), cliCep.getText(), cliNumeroResidencia.getText(), cliComplementoResidencia.getText(),
                        cliEndercoRua.getText(), cliBairro.getText(), (String) listUF.getSelectedItem(), cliCidade.getText(),
                        cliCelular.getText(), cliTelResidencial.getText())) {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable();

                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                    LimparFormulario();
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao cadastrar cliente!");
                }

            } else {

                //Passo ao controller a entrada do usuário e peço para atualizar o banco de dados
                if (ClienteController.atualizarCliente(Integer.parseInt(idCliente.getText()), cliNome.getText(),
                        cliCPF.getText(), cliRG.getText(), (String) listSexo.getSelectedItem(), cliNascimento.getText(),
                        cliEmail.getText(), (String) listEstadoCivil.getSelectedItem(), cliCep.getText(), cliNumeroResidencia.getText(), cliComplementoResidencia.getText(),
                        cliEndercoRua.getText(), cliBairro.getText(), (String) listUF.getSelectedItem(), cliCidade.getText(),
                        cliCelular.getText(), cliTelResidencial.getText())) {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable();
                    JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao atualizar cliente!");
                }

            }

            LimparFormulario();
            DesabilitarFormulario();
            btnExcluirCadastroCliente.setEnabled(true);

        }

        btnBuscarCadastroCliente.setEnabled(true);
        btnEditarCadastroCliente.setEnabled(true);
        btnExcluirCadastroCliente.setEnabled(true);
        cliCPF.setEnabled(false);
        cliRG.setEnabled(false);
        listSexo.setEnabled(false);
        cliNascimento.setEnabled(false);
        cliEmail.setEnabled(false);
        listEstadoCivil.setEnabled(false);
        cliCep.setEnabled(false);
        cliNumeroResidencia.setEnabled(false);
        cliComplementoResidencia.setEnabled(false);
        cliEndercoRua.setEnabled(false);
        cliBairro.setEnabled(false);
        listUF.setEnabled(false);
        cliCidade.setEnabled(false);
        cliCelular.setEnabled(false);
        cliTelResidencial.setEnabled(false);

    }//GEN-LAST:event_btnSalvarCadastroClienteActionPerformed

    private void btnCancelarInclusaoCDclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarInclusaoCDclienteActionPerformed
        DesabilitarFormulario();
        LimparFormulario();
    }//GEN-LAST:event_btnCancelarInclusaoCDclienteActionPerformed

    private void btnEditarCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCadastroClienteActionPerformed
        if (tblCliente.getRowCount() > 0) {
            //Verifico se o usuário selecionou alguma linha (Primeira linha = 0)
            if (tblCliente.getSelectedRow() >= 0) {
                HabilitarFormulario();

                //Variável acessória para identifcar se o formulário está em modo de edição ou alteração
                modoTela = "Editar";

                //Atribuo os valores que estão na linha selecionada para a tabela
                idCliente.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 0).toString());
                cliNome.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 1).toString());
                cliCPF.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());
                cliRG.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());
                listSexo.setSelectedItem(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());
                cliNascimento.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());
                cliEmail.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());
                listEstadoCivil.setSelectedItem(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());
                cliCep.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());
                cliNumeroResidencia.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());
                cliComplementoResidencia.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());
                cliEndercoRua.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());
                cliBairro.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());
                listUF.setSelectedItem(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());
                cliCidade.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());
                cliCelular.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());
                cliTelResidencial.setText(tblCliente.getModel().getValueAt(tblCliente.getSelectedRow(), 2).toString());

            } else {
                JOptionPane.showMessageDialog(this, "Selecione um cliente para editar!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há clientes para editar!");
        }
        btnBuscarCadastroCliente.setEnabled(false);
        btnEditarCadastroCliente.setEnabled(false);
        btnExcluirCadastroCliente.setEnabled(false);
        idCliente.setEnabled(false);
        HabilitarFormulario();
        cliNome.requestFocusInWindow();
    }//GEN-LAST:event_btnEditarCadastroClienteActionPerformed

    private void btnExcluirCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadastroClienteActionPerformed
        if (tblCliente.getRowCount() > 0) {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tblCliente.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int IDcliente = Integer.parseInt(tblCliente.getModel().getValueAt(numeroLinha, 0).toString());

            //Realizo a exclusão do cliente pelo ID
            if (ClienteController.excluirCliente(IDcliente)) {
                this.LoadTable();
                JOptionPane.showMessageDialog(this, "Cliente excluído da base de dados");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir o cliente!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há clientes para excluir!");
        }
    }//GEN-LAST:event_btnExcluirCadastroClienteActionPerformed

    private void cbxTipoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoBuscaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaVendas venda = new TelaVendas();

        venda.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnBuscarCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCadastroClienteActionPerformed
      /*  String pesquisa = null; 
       
       
       if(cbxTipoBusca.getSelectedIndex()==0){
           
           pesquisa =JOptionPane.showInputDialog("Digite o ID  do Cliente");
            
           if(pesquisa.length() > 0){
            for (int i = 0; i < tblCliente.getRowCount(); i++) {
               
                if(pesquisa.equals(tblCliente.getValueAt(i, 0))){
               txtNomeProd.setText(tblCliente.getValueAt(i, 1).toString());
               txtPreco.setText(tblCliente.getValueAt(i, 2).toString());
               txtTipo.setText(tblCliente.getValueAt(i, 3).toString());
               QtdProd.setText(tblCliente.getValueAt(i, 4).toString());
            }
            }
            
        }
       }
       if(cbxTipoBusca.getSelectedIndex()==1)
           
           pesquisa = JOptionPane.showInputDialog("Digite o Nome do Cliente");
           
       
                if(pesquisa.length() > 0){
            for (int i = 0; i < tblCliente.getRowCount(); i++) {
               
                if(pesquisa.equals(tblCliente.getValueAt(i, 1))){
               txtNomeProd.setText(tblCliente.getValueAt(i, 1).toString());
               txtPreco.setText(tblCliente.getValueAt(i, 2).toString());
               txtTipo.setText(tblCliente.getValueAt(i, 3).toString());
               QtdProd.setText(tblCliente.getValueAt(i, 4).toString());
            }
            }
            
        }*/
              
    }//GEN-LAST:event_btnBuscarCadastroClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCadastroCliente;
    private javax.swing.JButton btnCancelarInclusaoCDcliente;
    private javax.swing.JButton btnEditarCadastroCliente;
    private javax.swing.JButton btnExcluirCadastroCliente;
    private javax.swing.JButton btnNovoCadastroCliente;
    private javax.swing.JButton btnSalvarCadastroCliente;
    private javax.swing.JComboBox<String> cbxTipoBusca;
    private javax.swing.JTextField cliBairro;
    private javax.swing.JFormattedTextField cliCPF;
    private javax.swing.JFormattedTextField cliCelular;
    private javax.swing.JFormattedTextField cliCep;
    private javax.swing.JTextField cliCidade;
    private javax.swing.JTextField cliComplementoResidencia;
    private javax.swing.JTextField cliEmail;
    private javax.swing.JTextField cliEndercoRua;
    private javax.swing.JFormattedTextField cliNascimento;
    private javax.swing.JTextField cliNome;
    private javax.swing.JTextField cliNumeroResidencia;
    private javax.swing.JFormattedTextField cliRG;
    private javax.swing.JFormattedTextField cliTelResidencial;
    private javax.swing.JLabel idCliente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listEstadoCivil;
    private javax.swing.JComboBox<String> listSexo;
    private javax.swing.JComboBox<String> listUF;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtBuscarCliente;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarFormulario() {

        if (this.cliNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um nome para o cliente!");
            return false;
        }

        if (this.cliCPF.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }
        if (this.cliEmail.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }
        if (this.cliRG.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }

        /*   if (this.listSexo.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }*/
        if (this.cliNascimento.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }

        if (this.cliEmail.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }
        /* if (this.listEstadoCivil.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }*/
        if (this.cliCep.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }
        if (this.cliNumeroResidencia.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }
        if (this.cliComplementoResidencia.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }
        if (this.cliEndercoRua.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }
        if (this.cliBairro.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }
        /*if (this.listUF.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }*/
        if (this.cliCidade.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }
        if (this.cliCelular.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }
        if (this.cliTelResidencial.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }

        return true;
    }
}
