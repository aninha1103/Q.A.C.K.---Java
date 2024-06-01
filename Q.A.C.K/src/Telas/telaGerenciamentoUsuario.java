/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author pdro0
 */
public class telaGerenciamentoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form telaGerenciamentoUsuario
     */
    public telaGerenciamentoUsuario() {
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
        CampoNomeCargoUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        UsuarioTexto = new javax.swing.JLabel();
        NomeTexto = new javax.swing.JLabel();
        CampoNomeUsuario = new javax.swing.JTextField();
        CargoTexto = new javax.swing.JLabel();
        CampoSenhaUsuario = new javax.swing.JPasswordField();
        SenhaTexto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BotaoSalvarCadastro = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        CampoCargoUsuario = new javax.swing.JTextField();
        CampoUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Usuário");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(213, 213, 213));

        CampoNomeCargoUsuario.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        CampoNomeCargoUsuario.setForeground(new java.awt.Color(80, 0, 102));
        CampoNomeCargoUsuario.setText("Nome Usuário + Cargo");

        jPanel2.setBackground(new java.awt.Color(234, 234, 234));

        UsuarioTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        UsuarioTexto.setText("Usuário:");

        NomeTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        NomeTexto.setText("Nome:");

        CampoNomeUsuario.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        CampoNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeUsuarioActionPerformed(evt);
            }
        });

        CargoTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        CargoTexto.setText("Cargo:");

        CampoSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaUsuarioActionPerformed(evt);
            }
        });

        SenhaTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        SenhaTexto.setText("Senha:");

        jPanel3.setBackground(new java.awt.Color(234, 234, 234));

        BotaoSalvarCadastro.setBackground(new java.awt.Color(80, 0, 102));
        BotaoSalvarCadastro.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoSalvarCadastro.setForeground(new java.awt.Color(255, 255, 255));
        BotaoSalvarCadastro.setText("Salvar");

        BotaoExcluir.setBackground(new java.awt.Color(80, 0, 102));
        BotaoExcluir.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(BotaoSalvarCadastro)
                .addGap(18, 18, 18)
                .addComponent(BotaoExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSalvarCadastro)
                    .addComponent(BotaoExcluir))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        CampoCargoUsuario.setEditable(false);
        CampoCargoUsuario.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        CampoCargoUsuario.setText("Cargo");

        CampoUsuario.setEditable(false);
        CampoUsuario.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        CampoUsuario.setText("Usuário");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SenhaTexto)
                        .addGap(20, 20, 20)
                        .addComponent(CampoSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuarioTexto)
                            .addComponent(NomeTexto)
                            .addComponent(CargoTexto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CampoUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(CampoCargoUsuario, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(NomeTexto)
                    .addComponent(CampoNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(CargoTexto)
                    .addComponent(CampoCargoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(UsuarioTexto)
                    .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SenhaTexto)
                    .addComponent(CampoSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CampoNomeCargoUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CampoNomeCargoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeUsuarioActionPerformed

    private void CampoSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSenhaUsuarioActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(telaGerenciamentoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaGerenciamentoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaGerenciamentoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaGerenciamentoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaGerenciamentoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoSalvarCadastro;
    private javax.swing.JTextField CampoCargoUsuario;
    private javax.swing.JLabel CampoNomeCargoUsuario;
    private javax.swing.JTextField CampoNomeUsuario;
    private javax.swing.JPasswordField CampoSenhaUsuario;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JLabel CargoTexto;
    private javax.swing.JLabel NomeTexto;
    private javax.swing.JLabel SenhaTexto;
    private javax.swing.JLabel UsuarioTexto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
