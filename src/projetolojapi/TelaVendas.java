/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolojapi;

import CONTROLLER.ClienteController;
import CONTROLLER.ProdutoController;
import CONTROLLER.VendaController;
import DAO.ClienteDAO;
import MODEL.ElementosCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julio
 */
public class TelaVendas extends javax.swing.JFrame {

    private String modoTela;

    public TelaVendas() {
        initComponents();
        DesabilitarFormulario();
    }

    public void DesabilitarFormulario() {
       // txtIdCliente.setEnabled(false);
        btnDeb.setEnabled(false);
        btnCred.setEnabled(false);
        btnDin.setEnabled(false);
      //  txtIdProd.setEnabled(false);
        txtValor.setEnabled(false);
        txtQtd.setEnabled(false);
        txtValorTotal.setEnabled(false);
        btnSomar.setEnabled(false);
        //btnInserir.setEnabled(false);
        btnEstoque.setEnabled(false);
    }

    public void HabilitarFormulario() {
       // txtIdCliente.setEnabled(true);
        btnDeb.setEnabled(true);
        btnCred.setEnabled(true);
        btnDin.setEnabled(true);
      //  txtIdProd.setEnabled(true);
        txtValor.setEnabled(true);
        txtQtd.setEnabled(true);
        txtValorTotal.setEnabled(true);
        btnSomar.setEnabled(true);
        //btnInserir.setEnabled(true);
        btnEstoque.setEnabled(true);
    }

    public void LimparFormulario() {
        /*cliNome.setText("");
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
        cliTelResidencial.setText("");*/

    }

    public void LoadTable() {
        ArrayList<String[]> linhasproduto = ProdutoController.getProduto();

        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto .addColumn("ID");
        tmProduto .addColumn("Quantidade");
        tmProduto .addColumn("Valor");
        tbProd.setModel(tmProduto );
        tbProd.removeColumn(tbProd.getColumnModel().getColumn(0));
        for (String[] c : linhasproduto) {
            tmProduto .addRow(c);
        }
        tbProd.getColumnModel().getColumn(0).setPreferredWidth(300);
        tbProd.getColumnModel().getColumn(1).setPreferredWidth(100);
        tbProd.getColumnModel().getColumn(2).setPreferredWidth(100);

    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupPgt = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        btnDeb = new javax.swing.JRadioButton();
        btnCred = new javax.swing.JRadioButton();
        btnDin = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEstoque = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jComboBoxProduto = new javax.swing.JComboBox<>();
        btnBuscarProduto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNovoTelaVendas = new javax.swing.JButton();
        btnEditarTelaVendas = new javax.swing.JButton();
        btnExcluirTelaVendas = new javax.swing.JButton();
        btnFinalizarVenda = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        btnSomar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProd = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbVendas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de vendas");
        setName("TelaVendas"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Produto:");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Valor:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Qtd:");

        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });
        txtQtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQtdKeyPressed(evt);
            }
        });

        btnDeb.setBackground(new java.awt.Color(204, 204, 204));
        btnGroupPgt.add(btnDeb);
        btnDeb.setForeground(new java.awt.Color(51, 51, 51));
        btnDeb.setText("Débito");

        btnCred.setBackground(new java.awt.Color(204, 204, 204));
        btnGroupPgt.add(btnCred);
        btnCred.setForeground(new java.awt.Color(51, 51, 51));
        btnCred.setText("Crédito");

        btnDin.setBackground(new java.awt.Color(204, 204, 204));
        btnGroupPgt.add(btnDin);
        btnDin.setForeground(new java.awt.Color(51, 51, 51));
        btnDin.setText("Dinheiro");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Forma de pagamento:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Cliente:");

        btnEstoque.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEstoque.setForeground(new java.awt.Color(51, 51, 51));
        btnEstoque.setText("Estoque");
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.setToolTipText("Localizar cliente");
        btnBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCliente.setPreferredSize(new java.awt.Dimension(21, 21));
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", " " }));

        jComboBoxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome" }));

        btnBuscarProduto.setText("Buscar");
        btnBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarProduto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEstoque)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(btnCred, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDin, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeb, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQtd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnDeb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCred)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDin))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(11, 33, 47));

        btnNovoTelaVendas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNovoTelaVendas.setForeground(new java.awt.Color(51, 51, 51));
        btnNovoTelaVendas.setText("Novo");
        btnNovoTelaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoTelaVendasActionPerformed(evt);
            }
        });

        btnEditarTelaVendas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditarTelaVendas.setForeground(new java.awt.Color(51, 51, 51));
        btnEditarTelaVendas.setText("Editar");
        btnEditarTelaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTelaVendasActionPerformed(evt);
            }
        });

        btnExcluirTelaVendas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirTelaVendas.setForeground(new java.awt.Color(51, 51, 51));
        btnExcluirTelaVendas.setText("Excluir");
        btnExcluirTelaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTelaVendasActionPerformed(evt);
            }
        });

        btnFinalizarVenda.setBackground(new java.awt.Color(23, 23, 23));
        btnFinalizarVenda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFinalizarVenda.setForeground(new java.awt.Color(204, 204, 204));
        btnFinalizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetolojapi/images/icone carrinho.png"))); // NOI18N
        btnFinalizarVenda.setText("Finalizar");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Valor total: ");

        btnSomar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSomar.setForeground(new java.awt.Color(51, 51, 51));
        btnSomar.setText("Somar");

        tbProd.setForeground(new java.awt.Color(155, 155, 155));
        tbProd.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "ID produto", "Nome Produto", "Qtd", "Preco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbProdKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbProd);

        tbVendas.setForeground(new java.awt.Color(155, 155, 155));
        tbVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Cliente", "Nome"
            }
        ));
        jScrollPane3.setViewportView(tbVendas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnExcluirTelaVendas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarTelaVendas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovoTelaVendas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnNovoTelaVendas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarTelaVendas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirTelaVendas)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(302, 302, 302)))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        Estoque es = new Estoque();
        es.setVisible(true);
        es.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        ArrayList<String[]> linhasCliente = ClienteController.getCliente();

        DefaultTableModel tmCliente = new DefaultTableModel();

        tmCliente.addColumn("ID");
        tmCliente.addColumn("Nome");

        tbVendas.setModel(tmCliente);
        //   tblCliente.removeColumn(tblCliente.getColumnModel().getColumn(0));
        for (String[] p : linhasCliente) {
            tmCliente.addRow(p);
        }
        tbVendas.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbVendas.getColumnModel().getColumn(0).setPreferredWidth(100);
        
        String pesquisa = null; 
       
       
       if(jComboBoxProduto.getSelectedIndex()==0){
           
           pesquisa =JOptionPane.showInputDialog("Digite o ID  do Cliente");
            
           if(pesquisa.length() > 0){
            for (int i = 0; i < tbProd.getRowCount(); i++) {
               
                if(pesquisa.equals(tbProd.getValueAt(i, 0))){
                    
                    
                    txtQtd.setText(tbProd.getValueAt(i, 2).toString());
                    txtValor.setText(tbProd.getValueAt(i, 3).toString());
              /* txtNomeProd.setText(tbProd.getValueAt(i, 1).toString());
               txtPreco.setText(tbProd.getValueAt(i, 2).toString());
               txtTipo.setText(tbProd.getValueAt(i, 3).toString());
               QtdProd.setText(tbProd.getValueAt(i, 4).toString());*/
            }
            }
            
        }
       }
       if(jComboBoxProduto.getSelectedIndex()==1)
           
           pesquisa = JOptionPane.showInputDialog("Digite o Nome do Cliente");
                if(pesquisa.length() > 0){
            for (int i = 0; i < tbProd.getRowCount(); i++) {
               
                if(pesquisa.equals(tbProd.getValueAt(i, 1))){
                    
                      txtQtd.setText(tbProd.getValueAt(i, 2).toString());
                    txtValor.setText(tbProd.getValueAt(i, 3).toString());
              
            }
            }
            
        }


    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnExcluirTelaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTelaVendasActionPerformed
        if (tbProd.getRowCount() > 0) {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tbProd.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int IDvenda = Integer.parseInt(tbProd.getModel().getValueAt(numeroLinha, 0).toString());

            //Realizo a exclusão do cliente pelo ID
            if (VendaController.excluirVendas(IDvenda)) {
                this.LoadTable();
                JOptionPane.showMessageDialog(this, "Venda excluído da base de dados");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir o venda!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há vendas para excluir!");
        }
    }//GEN-LAST:event_btnExcluirTelaVendasActionPerformed

    private void btnEditarTelaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTelaVendasActionPerformed
        if (tbProd.getRowCount() > 0) {
            //Verifico se o usuário selecionou alguma linha (Primeira linha = 0)
            if (tbProd.getSelectedRow() >= 0) {
                HabilitarFormulario();

                //Variável acessória para identifcar se o formulário está em modo de edição ou alteração
                modoTela = "Editar";

                //Atribuo os valores que estão na linha selecionada para a tabela
                txtQtd.setText(tbProd.getModel().getValueAt(tbProd.getSelectedRow(), 0).toString());
                txtValor.setText(tbProd.getModel().getValueAt(tbProd.getSelectedRow(), 1).toString());

            } else {
                JOptionPane.showMessageDialog(this, "Selecione um cliente para editar!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há clientes para editar!");
        }
        btnEditarTelaVendas.setEnabled(false);
        btnExcluirTelaVendas.setEnabled(false);
        HabilitarFormulario();
        // cliNome.requestFocusInWindow();
    }//GEN-LAST:event_btnEditarTelaVendasActionPerformed

    private void btnNovoTelaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoTelaVendasActionPerformed
        modoTela = "Criar";
        HabilitarFormulario();
        LimparFormulario();
        btnEditarTelaVendas.setEnabled(false);
        btnExcluirTelaVendas.setEnabled(false);

      //  txtIdCliente.setText("");
        txtQtd.setText("");
        txtValor.setText("");

    }//GEN-LAST:event_btnNovoTelaVendasActionPerformed

    private void txtQtdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtdKeyPressed
        tbVendas.getColumnName(0);
       
    }//GEN-LAST:event_txtQtdKeyPressed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        
        
        
        
        
        
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyPressed
        
        
    }//GEN-LAST:event_txtValorKeyPressed

    private void tbProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbProdKeyPressed
       
        
    }//GEN-LAST:event_tbProdKeyPressed

    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
       
    }//GEN-LAST:event_txtQtdActionPerformed

    private void btnBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoActionPerformed
        ArrayList<String[]> linhasProduto = ProdutoController.getProduto();

        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto.addColumn("ID");
        tmProduto.addColumn("Nome");
        tmProduto.addColumn("Qtd");
        tmProduto.addColumn("Preco");

        tbProd.setModel(tmProduto);
        // tbProd.removeColumn(tbProd.getColumnModel().getColumn(0));

        for (String[] p : linhasProduto) {
            tmProduto.addRow(p);
        }
        tbProd.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbProd.getColumnModel().getColumn(1).setPreferredWidth(100);
        tbProd.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbProd.getColumnModel().getColumn(3).setPreferredWidth(100);
        
        String pesquisa = null; 
       
       
       if(jComboBoxProduto.getSelectedIndex()==0){
           
           pesquisa =JOptionPane.showInputDialog("Digite o ID  do produto");
            
           if(pesquisa.length() > 0){
            for (int i = 0; i < tbProd.getRowCount(); i++) {
               
                if(pesquisa.equals(tbProd.getValueAt(i, 0))){
                    
                    
                    txtQtd.setText(tbProd.getValueAt(i, 2).toString());
                    txtValor.setText(tbProd.getValueAt(i, 3).toString());
              /* txtNomeProd.setText(tbProd.getValueAt(i, 1).toString());
               txtPreco.setText(tbProd.getValueAt(i, 2).toString());
               txtTipo.setText(tbProd.getValueAt(i, 3).toString());
               QtdProd.setText(tbProd.getValueAt(i, 4).toString());*/
            }
            }
            
        }
       }
       if(jComboBoxProduto.getSelectedIndex()==1)
           
           pesquisa = JOptionPane.showInputDialog("Digite o Nome do Produto");
           
       
                if(pesquisa.length() > 0){
            for (int i = 0; i < tbProd.getRowCount(); i++) {
               
                if(pesquisa.equals(tbProd.getValueAt(i, 1))){
                    
                      txtQtd.setText(tbProd.getValueAt(i, 2).toString());
                    txtValor.setText(tbProd.getValueAt(i, 3).toString());
              
            }
            }
            
        }
    }//GEN-LAST:event_btnBuscarProdutoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JRadioButton btnCred;
    private javax.swing.JRadioButton btnDeb;
    private javax.swing.JRadioButton btnDin;
    private javax.swing.JButton btnEditarTelaVendas;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnExcluirTelaVendas;
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.ButtonGroup btnGroupPgt;
    private javax.swing.JButton btnNovoTelaVendas;
    private javax.swing.JButton btnSomar;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbProd;
    private javax.swing.JTable tbVendas;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarFormulario() {

        if (this.txtQtd.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina a quantidade para venda!");
            return false;
        }
        if (this.txtValor.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina o valor para venda!");
            return false;
        }

        return true;
    }
}
