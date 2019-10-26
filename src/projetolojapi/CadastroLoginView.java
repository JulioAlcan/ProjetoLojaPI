package projetolojapi;

import CONTROLLER.UsuarioController;
import DAO.UsuarioDAO;
import MODEL.ElementosUsuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroLoginView extends javax.swing.JFrame {

    private String modoTela;

    public CadastroLoginView() {
        initComponents();
        this.setLocationRelativeTo(null);
        DesabilitarFormulario();
        LoadTable();

        //Oculto O ID
        ID.setVisible(false);
    }

    public void HabilitarFormulario() {
        txtNome.setEditable(true);
        txtCPF.setEditable(true);
        txtEmail.setEditable(true);
        txtUser.setEditable(true);
        txtSenha.setEditable(true);
        txtSenhaAdmin.setEditable(true);
        btnSalvar.setEnabled(true);
    }

    public void DesabilitarFormulario() {
        txtNome.setEditable(false);
        txtCPF.setEditable(false);
        txtEmail.setEditable(false);
        txtUser.setEditable(false);
        txtSenha.setEditable(false);
        txtSenhaAdmin.setEditable(false);

        btnNovo.setEnabled(true);
        //btnSalvar.setEnabled(true);
    }

    public void LimparFormulario() {
        txtNome.setText("");
        txtCPF.setText("");
        txtEmail.setText("");
        txtUser.setText("");
        txtSenhaAdmin.setText("");
        txtSenha.setText("");

    }

    public static boolean salvarUser(String ptxtNome, String ptxtCPF, String ptxtUser, String ptxtEmail, String ptxtSenha, String ptxtSenhaAdmin) {
        //Salvo na memória
        ElementosUsuarios p = new ElementosUsuarios(ptxtNome, ptxtCPF, ptxtUser, ptxtEmail, ptxtSenha, ptxtSenhaAdmin);
        return UsuarioDAO.salvar(p);
    }

    public void LoadTable() {
        ArrayList<String[]> linhasUsuario = UsuarioController.getUser();

        DefaultTableModel tmUsuario = new DefaultTableModel();
        tmUsuario.addColumn("ID");
        tmUsuario.addColumn("Nome");
        tmUsuario.addColumn("CPF");
        tmUsuario.addColumn("Usuario");
        tmUsuario.addColumn("Email");
        tmUsuario.addColumn("Senha");
        tmUsuario.addColumn("SenhaAdm");
        tabelaUsuario.setModel(tmUsuario);

        // Ligar a função excluir para acionar o comando abaixo
        tabelaUsuario.removeColumn(tabelaUsuario.getColumnModel().getColumn(0));

        //Opção 2 - Descomentar linhas abaixo caso queira reutilizar o modelo padrão
        //Resgato o modelo da tabela
        //DefaultTableModel tmClientes = (DefaultTableModel) this.tblClientes.getModel();
        ////Limpo a tabela, excluindo todas as linhas
        //tmClientes.setRowCount(0);
        //Para cada cliente resgatado do banco de dados, atualizo a tabela
        for (String[] c : linhasUsuario) {
            tmUsuario.addRow(c);
        }

        //Defino o tamanho para cada coluna
        //tabelaUsuario.getColumnModel().getColumn(0).setPreferredWidth(50); 
        tabelaUsuario.getColumnModel().getColumn(0).setPreferredWidth(300);
        tabelaUsuario.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabelaUsuario.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabelaUsuario.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabelaUsuario.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabelaUsuario.getColumnModel().getColumn(5).setPreferredWidth(100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        lblSenhaAdmin = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtSenhaAdmin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nome:");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("CPF:");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Usuário:");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("E-mail:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(19, 54, 77));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 236, 236));
        jLabel7.setText("Cadastro usuário ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(14, 14, 14))
        );

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Senha:");

        lblSenhaAdmin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSenhaAdmin.setForeground(new java.awt.Color(51, 51, 51));
        lblSenhaAdmin.setText("Senha Adm:");

        btnSalvar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(51, 51, 51));
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("ID:");

        btnNovo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(51, 51, 51));
        btnNovo.setText("Novo");
        btnNovo.setEnabled(false);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(51, 51, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Usuario", "Senha", "Senha Adm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaUsuario);

        btnExcluir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(51, 51, 51));
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPF))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSenha)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblSenhaAdmin)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSenhaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenhaAdmin)
                    .addComponent(txtSenhaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        DesabilitarFormulario();
        LimparFormulario();
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:.
        modoTela = "Criar";
        HabilitarFormulario();
        LimparFormulario();
        txtNome.setEnabled(true);
        txtEmail.setEnabled(true);
        txtCPF.setEnabled(true);
        txtUser.setEnabled(true);
        txtSenha.setEnabled(true);
        txtSenhaAdmin.setEnabled(true);
        btnExcluir.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);


    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (ValidarFormulario()) {
            if (modoTela.equals("Criar")) {
                //Passo ao controller a entrada do usuário e peço para salvar no banco de dados
                if (UsuarioController.SalvarUsuario(txtNome.getText(), txtCPF.getText(), txtEmail.getText(), txtUser.getText(), txtSenha.getText(), txtSenhaAdmin.getText())) {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable();

                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                    LimparFormulario();
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao cadastrar cliente!");
                }

            } else {

                //Passo ao controller a entrada do usuário e peço para atualizar o banco de dados
                if (UsuarioController.atualizar(Integer.parseInt(ID.getText()), txtNome.getText(), txtCPF.getText(), txtEmail.getText(), txtUser.getText(), txtSenha.getText(), txtSenhaAdmin.getText())) {
                    //Recarrego a tabela com os dados resgatados do banco de dados
                    this.LoadTable();
                    JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao atualizar cliente!");
                }

            }

            LimparFormulario();
            DesabilitarFormulario();
            btnExcluir.setEnabled(true);

        }
        /*
        ID.setText(tabelaUsuario.getModel().getValueAt(tabelaUsuario.getSelectedRow(), 0).toString());
        txtNome.setText(tabelaUsuario.getModel().getValueAt(tabelaUsuario.getSelectedRow(), 1).toString());
        txtCPF.setText(tabelaUsuario.getModel().getValueAt(tabelaUsuario.getSelectedRow(), 2).toString());
        txtUser.setText(tabelaUsuario.getModel().getValueAt(tabelaUsuario.getSelectedRow(), 3).toString());
        txtSenha.setText(tabelaUsuario.getModel().getValueAt(tabelaUsuario.getSelectedRow(), 4).toString());
        txtSenhaAdmin.setText(tabelaUsuario.getModel().getValueAt(tabelaUsuario.getSelectedRow(), 5).toString());*/

 /*  if (txtSenhaAdmin.getText().equals("321")) {
            JOptionPane.showMessageDialog(this, "Usuário cadastrado!");
        }
        if (!txtSenhaAdmin.getText().equals("321")) {
            JOptionPane.showMessageDialog(this, "Senha admin incorreta!");
        }*/
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        this.txtCPF.getText();
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        this.txtUser.getText();
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        this.txtNome.getText();
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        if (tabelaUsuario.getRowCount() > 0) {
            //Resgato o número da linha pelo JTable
            int numeroLinha = tabelaUsuario.getSelectedRow();

            //Resgato o ID (oculto) do cliente pelo JTableModel
            int IDusuario = Integer.parseInt(tabelaUsuario.getModel().getValueAt(numeroLinha, 0).toString());

            //Realizo a exclusão do cliente pelo ID
            if (UsuarioController.excluirUser(IDusuario)) {
                this.LoadTable();
                JOptionPane.showMessageDialog(this, "Cliente excluído da base de dados");
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir o cliente!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há clientes para excluir!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblSenhaAdmin;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtSenhaAdmin;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
    private boolean ValidarFormulario() {

        if (this.txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um nome para o cliente!");
            return false;
        }

        if (this.txtCPF.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }
        if (this.txtEmail.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }
        if (this.txtUser.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }

        if (this.txtSenha.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }
        if (this.txtSenhaAdmin.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Defina um CPF para cliente!");
            return false;
        }
        return true;
    }
}
