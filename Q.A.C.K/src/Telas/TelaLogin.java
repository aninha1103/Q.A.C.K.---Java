package Telas;

import JDBC.UsuarioJDBC;
import Modelo.Usuario;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoSenha = new javax.swing.JPasswordField();
        campoUsuario = new javax.swing.JTextField();
        IconLogin = new javax.swing.JLabel();
        IconSenha = new javax.swing.JLabel();
        ProgramName = new javax.swing.JLabel();
        Versao = new javax.swing.JLabel();
        botaoEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Q.A.C.K.");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(80, 0, 102));

        campoSenha.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        campoUsuario.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N

        IconLogin.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        IconLogin.setForeground(new java.awt.Color(255, 228, 23));
        IconLogin.setIcon(new javax.swing.ImageIcon( "src\\Recursos\\iconamarelo.png" ));

        IconSenha.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        IconSenha.setForeground(new java.awt.Color(255, 228, 23));
        IconSenha.setIcon(new javax.swing.ImageIcon( "src\\Recursos\\chave.png" ));

        ProgramName.setBackground(new java.awt.Color(255, 255, 255));
        ProgramName.setFont(new java.awt.Font("SimSun", 1, 40)); // NOI18N
        ProgramName.setForeground(new java.awt.Color(255, 228, 23));
        ProgramName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProgramName.setText(" Q.A.C.K.");

        Versao.setFont(new java.awt.Font("Serif", 0, 10)); // NOI18N
        Versao.setForeground(new java.awt.Color(255, 228, 23));
        Versao.setText("Versão: 00.00.01");

        botaoEntrar.setBackground(new java.awt.Color(204, 204, 204));
        botaoEntrar.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        botaoEntrar.setText("Entrar");
        botaoEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Versao)
                .addContainerGap())
            .addComponent(ProgramName, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IconLogin)
                    .addComponent(IconSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoUsuario)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(ProgramName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IconLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IconSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(Versao)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        String login = this.campoUsuario.getText();
        String senhaStr = String.copyValueOf(this.campoSenha.getPassword());

        for( Usuario u : UsuarioJDBC.findAll() ){
            if( u.login(login, senhaStr ) != null){
                this.dispose();
                TelaPrincipal t = new TelaPrincipal( u.login(login, senhaStr ) );
                t.setVisible(true);
                return;
            }
        }
        //erro login ou senha invalido
        
    }//GEN-LAST:event_botaoEntrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconLogin;
    private javax.swing.JLabel IconSenha;
    private javax.swing.JLabel ProgramName;
    private javax.swing.JLabel Versao;
    public javax.swing.JButton botaoEntrar;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
