package Telas;

import JDBC.UsuarioJDBC;
import Modelo.Usuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        this.setIconImage( new ImageIcon( System.getProperty("user.dir") +"\\src\\Recursos\\Q.A.C.K.png").getImage() );
        this.setDefaultCloseOperation( EXIT_ON_CLOSE );
        this.setLocationRelativeTo(null); 
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

        campoSenha.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        campoSenha.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        campoUsuario.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N

        IconLogin.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        IconLogin.setForeground(new java.awt.Color(255, 228, 23));
        IconLogin.setIcon(new javax.swing.ImageIcon( "src\\Recursos\\iconamarelo.png" ));

        IconSenha.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        IconSenha.setForeground(new java.awt.Color(255, 228, 23));
        IconSenha.setIcon(new javax.swing.ImageIcon( "src\\Recursos\\chave.png" ));

        ProgramName.setBackground(new java.awt.Color(255, 255, 255));
        ProgramName.setFont(new java.awt.Font("Segoe UI Variable", 1, 40)); // NOI18N
        ProgramName.setForeground(new java.awt.Color(255, 228, 23));
        ProgramName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProgramName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logoNomepng.png"))); // NOI18N

        Versao.setFont(new java.awt.Font("Segoe UI Variable", 0, 10)); // NOI18N
        Versao.setForeground(new java.awt.Color(255, 228, 23));
        Versao.setText("Versão: 00.00.01");

        botaoEntrar.setBackground(new java.awt.Color(204, 204, 204));
        botaoEntrar.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
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
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Versao)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(IconLogin)
                                    .addComponent(IconSenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botaoEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoUsuario)
                                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ProgramName))
                        .addGap(136, 136, 136))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ProgramName)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IconLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IconSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(Versao)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        String login = this.campoUsuario.getText();
        String senhaStr = String.copyValueOf(this.campoSenha.getPassword());

        for( Usuario u : UsuarioJDBC.findAll() ){
            if( u.login(login, senhaStr ) != null){
                JOptionPane.showMessageDialog(this, "Bem vindo, " + u.getNome() , "Login", JOptionPane.INFORMATION_MESSAGE );
                this.dispose();
                TelaPrincipal t = new TelaPrincipal( u );
                t.setVisible(true);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Login ou senha inválida!" , "Erro", JOptionPane.ERROR_MESSAGE );
        this.campoUsuario.setText("");
        this.campoSenha.setText("");

    }//GEN-LAST:event_botaoEntrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconLogin;
    private javax.swing.JLabel IconSenha;
    private javax.swing.JLabel ProgramName;
    private javax.swing.JLabel Versao;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
