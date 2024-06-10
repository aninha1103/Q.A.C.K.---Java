package Telas;

import JDBC.UsuarioJDBC;
import Modelo.Cargo;
import Modelo.Usuario;
import javax.swing.JOptionPane;

public class telaCadastroUsuario extends javax.swing.JFrame {

    private TelaListagemUsuarios telaOrigem;
    private Integer idUsuario;
    
    public telaCadastroUsuario( TelaListagemUsuarios tela ) {
        initComponents();
        operacoesPadrao( tela );
        this.botaoExcluirCadastro.setEnabled( false );
    }
    
    public telaCadastroUsuario( TelaListagemUsuarios tela, Usuario usuarioEditar ) {
        initComponents();
        operacoesPadrao( tela );
        this.botaoExcluirCadastro.setEnabled( true );
        this.idUsuario = usuarioEditar.getId();
        this.cadastroNome.setText( usuarioEditar.getNome() );
        this.cadastroCargo.setSelectedIndex( usuarioEditar.getCargo().getId() - 1 );
        this.cadastroUsuario.setText( usuarioEditar.getLogin() );
        this.cadastroSenha.setText( usuarioEditar.getSenha() );
    }
    
    private void operacoesPadrao( TelaListagemUsuarios tela ){
        this.telaOrigem = tela;
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TelaCadastroUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NomeTexto = new javax.swing.JLabel();
        CargoTexto = new javax.swing.JLabel();
        UsuarioTexto = new javax.swing.JLabel();
        SenhaTexto = new javax.swing.JLabel();
        cadastroNome = new javax.swing.JTextField();
        cadastroCargo = new javax.swing.JComboBox<>();
        cadastroUsuario = new javax.swing.JTextField();
        cadastroSenha = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        botalSalvarCadastro = new javax.swing.JButton();
        botaoExcluirCadastro = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(213, 213, 213));

        TelaCadastroUsuario.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        TelaCadastroUsuario.setForeground(new java.awt.Color(80, 0, 102));
        TelaCadastroUsuario.setText("Cadastro de Usuário");

        jPanel2.setBackground(new java.awt.Color(234, 234, 234));

        NomeTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        NomeTexto.setText("Nome:");

        CargoTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        CargoTexto.setText("Cargo:");

        UsuarioTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        UsuarioTexto.setText("Usuário:");

        SenhaTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        SenhaTexto.setText("Senha:");

        cadastroNome.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N

        cadastroCargo.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        cadastroCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Q.A.", "Tech Lead", "Desenvolvedor" }));

        cadastroUsuario.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(234, 234, 234));

        botalSalvarCadastro.setBackground(new java.awt.Color(80, 0, 102));
        botalSalvarCadastro.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        botalSalvarCadastro.setForeground(new java.awt.Color(255, 255, 255));
        botalSalvarCadastro.setText("Salvar");
        botalSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botalSalvarCadastroActionPerformed(evt);
            }
        });

        botaoExcluirCadastro.setBackground(new java.awt.Color(80, 0, 102));
        botaoExcluirCadastro.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        botaoExcluirCadastro.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluirCadastro.setText("Excluir");
        botaoExcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirCadastroActionPerformed(evt);
            }
        });

        BotaoCancelar.setBackground(new java.awt.Color(80, 0, 102));
        BotaoCancelar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botalSalvarCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoExcluirCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoCancelar)
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botalSalvarCadastro)
                    .addComponent(botaoExcluirCadastro)
                    .addComponent(BotaoCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsuarioTexto)
                    .addComponent(NomeTexto)
                    .addComponent(CargoTexto)
                    .addComponent(SenhaTexto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cadastroCargo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastroUsuario, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(cadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(NomeTexto)
                    .addComponent(cadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CargoTexto)
                    .addComponent(cadastroCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(UsuarioTexto)
                    .addComponent(cadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenhaTexto)
                    .addComponent(cadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelaCadastroUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TelaCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(96, 96, 96))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoExcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirCadastroActionPerformed
        //mensagem: Confirma exclusão?
        if( JOptionPane.showConfirmDialog(this, "Confirma exclusão?", "Excluir usuário", JOptionPane.YES_NO_OPTION) == 0 ){
            UsuarioJDBC.delete( UsuarioJDBC.findById( idUsuario ) );
            telaOrigem.atualizaListaUsuario();
            this.dispose();
        }
    }//GEN-LAST:event_botaoExcluirCadastroActionPerformed

    private void botalSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botalSalvarCadastroActionPerformed
        String nome     = this.cadastroNome.getText();
        String login    = this.cadastroUsuario.getText();
        String senhaStr = String.copyValueOf( this.cadastroSenha.getPassword() );
        Cargo cargo     = Usuario.cargoPorId( cadastroCargo.getSelectedIndex() + 1);

        if( this.idUsuario != null ){
            UsuarioJDBC.update( new Usuario( this.idUsuario, nome, login, senhaStr, cargo) );
        }else{
            UsuarioJDBC.create( new Usuario( nome, login, senhaStr, cargo) );
        }
        telaOrigem.atualizaListaUsuario();
        this.dispose();
    }//GEN-LAST:event_botalSalvarCadastroActionPerformed

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JLabel CargoTexto;
    private javax.swing.JLabel NomeTexto;
    private javax.swing.JLabel SenhaTexto;
    private javax.swing.JLabel TelaCadastroUsuario;
    private javax.swing.JLabel UsuarioTexto;
    private javax.swing.JButton botalSalvarCadastro;
    private javax.swing.JButton botaoExcluirCadastro;
    private javax.swing.JComboBox<String> cadastroCargo;
    private javax.swing.JTextField cadastroNome;
    private javax.swing.JPasswordField cadastroSenha;
    private javax.swing.JTextField cadastroUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
