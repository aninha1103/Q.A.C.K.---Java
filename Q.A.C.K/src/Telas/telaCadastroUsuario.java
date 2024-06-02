package Telas;

import Modelo.Cargo;
import Modelo.Cargos.Dev;
import Modelo.Cargos.QA;
import Modelo.Cargos.Techlead;
import Modelo.Usuario;
import Repositorio.Repositorio;

public class telaCadastroUsuario extends javax.swing.JFrame {

    private Repositorio rep;
    private final TelaListagemUsuarios telaOrigem;
    private Integer idUsuario;
    
    public telaCadastroUsuario( Repositorio rep, TelaListagemUsuarios tela ) {
        initComponents();
        this.telaOrigem = tela;
        this.rep = rep;
    }
    
    public telaCadastroUsuario( Repositorio rep, TelaListagemUsuarios tela, Usuario usuarioEditar ) {
        initComponents();
        this.telaOrigem = tela;
        this.rep = rep;
        this.idUsuario = usuarioEditar.getId();
        this.cadastroNome.setText( usuarioEditar.getNome() );
        this.cadastroCargo.setSelectedIndex( usuarioEditar.getCargo().getId() - 1 );
        this.cadastroUsuario.setText( usuarioEditar.getLogin() );
        this.cadastroSenha.setText( usuarioEditar.getSenha() );
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(botalSalvarCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoExcluirCadastro)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botalSalvarCadastro)
                    .addComponent(botaoExcluirCadastro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                        .addComponent(cadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuarioTexto)
                            .addComponent(NomeTexto)
                            .addComponent(CargoTexto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cadastroCargo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cadastroUsuario, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(26, Short.MAX_VALUE))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SenhaTexto)
                    .addComponent(cadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelaCadastroUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TelaCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Usuario remover = null;
        for( Usuario u : rep.getUsuarios() ){
            if( u.getId() == idUsuario){
                remover = u;
                break;
            }
        }
        if( remover != null ){
            rep.removerUsuario( remover );
            telaOrigem.atualizaListaUsuario( rep.getUsuarios() );
            this.dispose();
            //UsuarioJDBC.remove( remover );
        }else{
            //erro: usuario nao encontrado
        }
    }//GEN-LAST:event_botaoExcluirCadastroActionPerformed

    private void botalSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botalSalvarCadastroActionPerformed
        String nome = this.cadastroNome.getText();
        String login = this.cadastroUsuario.getText();
        String senhaStr = String.copyValueOf( this.cadastroSenha.getPassword() );
        Cargo cargo = null;
        switch( cadastroCargo.getSelectedIndex()){
            case 0 -> cargo = new QA();
            case 1 -> cargo = new Techlead();
            case 2 -> cargo = new Dev();
        }
        if( this.idUsuario != null ){
            //editar
            Integer posicaoUsuario = 0;
            for( int i = 0; i < rep.getUsuarios().size(); i++ ){
                if( rep.getUsuarios().get( i ).getId() == this.idUsuario ){
                    posicaoUsuario = i;
                    break;
                }
            }
            rep.alterarUsuario( new Usuario( this.idUsuario, nome, login, senhaStr, cargo), posicaoUsuario );
            //UsuarioJDBC.update( u );
        }else{
            
            rep.adicionarUsuario( new Usuario( nome, login, senhaStr, cargo) );
            //UsuarioJDBC.insert( u );
        }
        telaOrigem.atualizaListaUsuario( rep.getUsuarios() );
        this.dispose();
    }//GEN-LAST:event_botalSalvarCadastroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
