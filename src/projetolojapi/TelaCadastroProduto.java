package projetolojapi;

import CONTROLLER.ProdutoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julio
 */
public class TelaCadastroProduto extends javax.swing.JFrame {

    private String modoTela;

    public TelaCadastroProduto() {
        initComponents();
        this.setLocationRelativeTo(null);
        DesabilitarFormulario();
        LoadTable();
        IDprod.setVisible(false);
    }

    public void LimparFormulario() {
        txtNomeProd.setText("");
        txtPreco.setText("");
        txtTipo.setText("");
        QtdProd.setText("");

    }

    private void DesabilitarFormulario() {
        txtNomeProd.setEnabled(false);
        txtPreco.setEnabled(false);
        txtTipo.setEnabled(false);
        QtdProd.setEnabled(false);
        btnEditarTelaCadastroProduto.setEnabled(false);
        btnExcluirTelaCadastroProduto.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    private void HabilitarFormulario() {
        txtNomeProd.setEnabled(true);
        txtPreco.setEnabled(true);
        txtTipo.setEnabled(true);
        QtdProd.setEnabled(true);
        btnEditarTelaCadastroProduto.setEnabled(true);
        btnExcluirTelaCadastroProduto.setEnabled(true);
        btnNovoTelaCadastroProduto.setEnabled(true);
        cbxIdProd.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    public void LoadTable() {
        ArrayList<String[]> linhasProduto = ProdutoController.getProduto();

        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto.addColumn("ID");
        tmProduto.addColumn("Nome");
        tmProduto.addColumn("Preco");
        tmProduto.addColumn("Tipo");
        tmProduto.addColumn("Qtd");
        tbProduto.setModel(tmProduto);
        // tbProduto.removeColumn(tbProduto.getColumnModel().getColumn(0));

        for (String[] p : linhasProduto) {
            tmProduto.addRow(p);
        }
        tbProduto.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbProduto.getColumnModel().getColumn(1).setPreferredWidth(100);
        tbProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbProduto.getColumnModel().getColumn(4).setPreferredWidth(100);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtNomeProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JLabel();
        QtdProd = new javax.swing.JTextField();
        IDprod = new javax.swing.JLabel();
        btnSalvarTelaCadastroProduto = new javax.swing.JButton();
        btnNovoTelaCadastroProduto = new javax.swing.JButton();
        btnEditarTelaCadastroProduto = new javax.swing.JButton();
        btnExcluirTelaCadastroProduto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarTelaCadastroProduto = new javax.swing.JButton();
        cbxIdProd = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de produtos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome ", "Preco", "Tipo", "Qtd"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbProduto);

        jPanel2.setBackground(new java.awt.Color(11, 33, 47));

        txtNomeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Preço");

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Tipo");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nome produto");

        txtEstoque.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtEstoque.setForeground(new java.awt.Color(204, 204, 204));
        txtEstoque.setText("Qtd.");

        IDprod.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        IDprod.setForeground(new java.awt.Color(204, 204, 204));
        IDprod.setText("ID");

        btnSalvarTelaCadastroProduto.setText("Salvar");
        btnSalvarTelaCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarTelaCadastroProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IDprod)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeProd, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                            .addComponent(txtTipo))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtEstoque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(QtdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSalvarTelaCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(377, 377, 377))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(201, 201, 201))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(IDprod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEstoque)
                        .addComponent(QtdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarTelaCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        btnNovoTelaCadastroProduto.setBackground(new java.awt.Color(19, 54, 77));
        btnNovoTelaCadastroProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNovoTelaCadastroProduto.setForeground(new java.awt.Color(204, 204, 204));
        btnNovoTelaCadastroProduto.setText("Novo");
        btnNovoTelaCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoTelaCadastroProdutoActionPerformed(evt);
            }
        });

        btnEditarTelaCadastroProduto.setBackground(new java.awt.Color(19, 54, 77));
        btnEditarTelaCadastroProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditarTelaCadastroProduto.setForeground(new java.awt.Color(204, 204, 204));
        btnEditarTelaCadastroProduto.setText("Editar");
        btnEditarTelaCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTelaCadastroProdutoActionPerformed(evt);
            }
        });

        btnExcluirTelaCadastroProduto.setBackground(new java.awt.Color(19, 54, 77));
        btnExcluirTelaCadastroProduto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluirTelaCadastroProduto.setForeground(new java.awt.Color(204, 204, 204));
        btnExcluirTelaCadastroProduto.setText("Excluir");
        btnExcluirTelaCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTelaCadastroProdutoActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(19, 54, 77));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Buscar ");

        btnBuscarTelaCadastroProduto.setText("Buscar");
        btnBuscarTelaCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTelaCadastroProdutoActionPerformed(evt);
            }
        });

        cbxIdProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnBuscarTelaCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscarTelaCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnNovoTelaCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btnEditarTelaCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnExcluirTelaCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarTelaCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirTelaCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoTelaCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoTelaCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoTelaCadastroProdutoActionPerformed
        modoTela = "Criar";
        HabilitarFormulario();
        LimparFormulario();
        btnBuscarTelaCadastroProduto.setEnabled(false);
        btnEditarTelaCadastroProduto.setEnabled(false);
        btnExcluirTelaCadastroProduto.setEnabled(false);

        txtNomeProd.setText("");
        txtPreco.setText("");
        txtTipo.setText("");
        QtdProd.setText("");


    }//GEN-LAST:event_btnNovoTelaCadastroProdutoActionPerformed

    private void btnEditarTelaCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTelaCadastroProdutoActionPerformed
        if (tbProduto.getRowCount() > 0) {
            if (tbProduto.getSelectedRow() >= 0) {
                HabilitarFormulario();
                modoTela = "Editar";
                IDprod.setText(tbProduto.getModel().getValueAt(tbProduto.getSelectedRow(), 0).toString());
                txtNomeProd.setText(tbProduto.getModel().getValueAt(tbProduto.getSelectedRow(), 1).toString());
                txtPreco.setText(tbProduto.getModel().getValueAt(tbProduto.getSelectedRow(), 2).toString());
                txtTipo.setText(tbProduto.getModel().getValueAt(tbProduto.getSelectedRow(), 3).toString());
                QtdProd.setText(tbProduto.getModel().getValueAt(tbProduto.getSelectedRow(), 4).toString());
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um produto para editar!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há produto para editar!");
        }
        btnBuscarTelaCadastroProduto.setEnabled(false);
        btnEditarTelaCadastroProduto.setEnabled(false);
        btnExcluirTelaCadastroProduto.setEnabled(false);
        IDprod.setEnabled(false);
        HabilitarFormulario();
        txtNomeProd.requestFocusInWindow();
    }//GEN-LAST:event_btnEditarTelaCadastroProdutoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        DesabilitarFormulario();
        LimparFormulario();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirTelaCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTelaCadastroProdutoActionPerformed
        if (tbProduto.getRowCount() > 0) {
            int numeroLinha = tbProduto.getSelectedRow();
            int IDproduto = Integer.parseInt(tbProduto.getModel().getValueAt(numeroLinha, 0).toString());
            if (ProdutoController.excluirProduto(IDproduto)) {
                this.LoadTable();
                JOptionPane.showMessageDialog(this, "Produto excluído da base de dados");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir o produto!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há produto para excluir!");
        }
    }//GEN-LAST:event_btnExcluirTelaCadastroProdutoActionPerformed

    private void btnSalvarTelaCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarTelaCadastroProdutoActionPerformed
        if (ValidarFormulario()) {
            if (modoTela.equals("Criar")) {
                if (ProdutoController.SalvarProduto(txtNomeProd.getText(), Double.parseDouble(txtPreco.getText()), txtTipo.getText(), Integer.parseInt(QtdProd.getText()))) {
                    this.LoadTable();
                    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
                    LimparFormulario();
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao cadastrar Produto!");
                }

            } else {
                if (ProdutoController.atualizarProduto(Integer.parseInt(IDprod.getText()), txtNomeProd.getText(),
                        Double.parseDouble(txtPreco.getText()), txtTipo.getText(), Integer.parseInt(QtdProd.getText()))) {
                    this.LoadTable();
                    JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao atualizar Produto!");
                }

            }

            LimparFormulario();
            DesabilitarFormulario();
            btnExcluirTelaCadastroProduto.setEnabled(true);

        }

        btnBuscarTelaCadastroProduto.setEnabled(true);
        btnEditarTelaCadastroProduto.setEnabled(true);
        btnExcluirTelaCadastroProduto.setEnabled(true);
        txtNomeProd.setEnabled(false);
        txtPreco.setEnabled(false);
        txtTipo.setEnabled(false);
        QtdProd.setEnabled(false);

    }//GEN-LAST:event_btnSalvarTelaCadastroProdutoActionPerformed

    private void txtNomeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdActionPerformed

    private void btnBuscarTelaCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTelaCadastroProdutoActionPerformed
       String pesquisa = null; 
       
       
       if(cbxIdProd.getSelectedIndex()==0){
           
           pesquisa =JOptionPane.showInputDialog("Digite o ID  do produto");
            
           if(pesquisa.length() > 0){
            for (int i = 0; i < tbProduto.getRowCount(); i++) {
               
                if(pesquisa.equals(tbProduto.getValueAt(i, 0))){
               txtNomeProd.setText(tbProduto.getValueAt(i, 1).toString());
               txtPreco.setText(tbProduto.getValueAt(i, 2).toString());
               txtTipo.setText(tbProduto.getValueAt(i, 3).toString());
               QtdProd.setText(tbProduto.getValueAt(i, 4).toString());
            }
            }
            
        }
       }
       if(cbxIdProd.getSelectedIndex()==1)
           
           pesquisa = JOptionPane.showInputDialog("Digite o Nome do Produto");
           
       
                if(pesquisa.length() > 0){
            for (int i = 0; i < tbProduto.getRowCount(); i++) {
               
                if(pesquisa.equals(tbProduto.getValueAt(i, 1))){
               txtNomeProd.setText(tbProduto.getValueAt(i, 1).toString());
               txtPreco.setText(tbProduto.getValueAt(i, 2).toString());
               txtTipo.setText(tbProduto.getValueAt(i, 3).toString());
               QtdProd.setText(tbProduto.getValueAt(i, 4).toString());
            }
            }
            
        }
               
    }//GEN-LAST:event_btnBuscarTelaCadastroProdutoActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDprod;
    private javax.swing.JTextField QtdProd;
    private javax.swing.JButton btnBuscarTelaCadastroProduto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditarTelaCadastroProduto;
    private javax.swing.JButton btnExcluirTelaCadastroProduto;
    private javax.swing.JButton btnNovoTelaCadastroProduto;
    private javax.swing.JButton btnSalvarTelaCadastroProduto;
    private javax.swing.JComboBox<String> cbxIdProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProduto;
    private javax.swing.JLabel txtEstoque;
    private javax.swing.JTextField txtNomeProd;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

    private boolean ValidarFormulario() {

        if (this.txtNomeProd.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina o nome do produto!");
            return false;
        }

        if (this.txtPreco.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina o preço do produto!");
            return false;
        }
        if (this.txtTipo.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina o tipo do produto!");
            return false;
        }
        if (this.QtdProd.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina a quantidade de produto!");
            return false;
        }
        return true;
    }
}
