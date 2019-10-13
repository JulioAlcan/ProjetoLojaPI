/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolojapi;

import Clases.DadosUsuario;
import static java.awt.GridBagConstraints.BOTH;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NomeUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NomeEntrar = new javax.swing.JButton();
        NomeSenha = new javax.swing.JPasswordField();
        NomeLembrarSenha = new javax.swing.JCheckBox();
        NomeCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(NomeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 280, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetolojapi/images/avatar.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 40, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetolojapi/images/cadeado icon.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 250, 55, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetolojapi/images/loginfinal.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 330, -1));

        NomeEntrar.setForeground(new java.awt.Color(92, 72, 105));
        NomeEntrar.setText("Entrar");
        NomeEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(NomeEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 300, -1));

        NomeSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(NomeSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 280, 30));

        NomeLembrarSenha.setForeground(new java.awt.Color(255, 255, 255));
        NomeLembrarSenha.setText("Me lembre");
        jPanel1.add(NomeLembrarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        NomeCadastrar.setForeground(new java.awt.Color(92, 75, 105));
        NomeCadastrar.setText("Cadastre-se");
        jPanel1.add(NomeCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetolojapi/images/linha.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 310, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetolojapi/images/Background roxo.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -150, -1, 880));

        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeSenhaActionPerformed

    private void NomeEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeEntrarActionPerformed
        DadosUsuario clsdados = new DadosUsuario();
        if (!clsdados.validarUsuarios(NomeUser.getText(), new String(NomeSenha.getPassword()))) {
            JOptionPane.showMessageDialog(rootPane, "USUÁRIO E SENHA ERRADO");
            NomeUser.setText("");
            NomeSenha.setText("");
            NomeUser.requestFocusInWindow();
            return;
        }
        TelaInicial menu = new TelaInicial();
        this.setVisible(false);
        menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
        menu.setVisible(true);
    }//GEN-LAST:event_NomeEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NomeCadastrar;
    private javax.swing.JButton NomeEntrar;
    private javax.swing.JCheckBox NomeLembrarSenha;
    private javax.swing.JPasswordField NomeSenha;
    private javax.swing.JTextField NomeUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
