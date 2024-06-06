
package Telas;

public class TelaVisualizarTeste extends javax.swing.JFrame {


    public TelaVisualizarTeste() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        TelaCadastroTeste = new javax.swing.JLabel();
        PainelScrollPrincipal = new javax.swing.JScrollPane();
        PainelPrincipal = new javax.swing.JPanel();
        DescricaoTexto = new javax.swing.JLabel();
        TagsTexto = new javax.swing.JLabel();
        AnexosTexto = new javax.swing.JLabel();
        SituacaoTexto = new javax.swing.JLabel();
        CategoriaTexto = new javax.swing.JLabel();
        CampoSituacao = new javax.swing.JTextField();
        CampoCategoria = new javax.swing.JTextField();
        ScrollAreaDescricao = new javax.swing.JScrollPane();
        campoDescricao = new javax.swing.JTextArea();
        ImagemAnexada = new javax.swing.JLabel();
        BotaoEditar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        CriadoPorTexto = new javax.swing.JLabel();
        UsuarioCriadoPor = new javax.swing.JLabel();
        ComentariosTexto = new javax.swing.JLabel();
        PainelComentarios = new javax.swing.JPanel();
        NomeUsuarioComentario = new javax.swing.JLabel();
        PainelScrollComentario = new javax.swing.JScrollPane();
        ComentarioUsuario = new javax.swing.JTextArea();
        BotaoComentar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vizualizar Teste");
        setResizable(false);

        Painel.setBackground(new java.awt.Color(213, 213, 213));
        Painel.setToolTipText("Vizualizar Teste");

        TelaCadastroTeste.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        TelaCadastroTeste.setForeground(new java.awt.Color(80, 0, 102));
        TelaCadastroTeste.setText("Título Teste");

        PainelScrollPrincipal.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        PainelPrincipal.setBackground(new java.awt.Color(234, 234, 234));
        PainelPrincipal.setMinimumSize(new java.awt.Dimension(5, 5));

        DescricaoTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        DescricaoTexto.setText("Descrição:");

        TagsTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        TagsTexto.setText("Tags");

        AnexosTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        AnexosTexto.setText("Anexos:");

        SituacaoTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        SituacaoTexto.setText("Situação:");

        CategoriaTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        CategoriaTexto.setText("Categoria:");

        CampoSituacao.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        CampoSituacao.setToolTipText("");

        CampoCategoria.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N

        campoDescricao.setEditable(false);
        campoDescricao.setColumns(20);
        campoDescricao.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        campoDescricao.setRows(5);
        ScrollAreaDescricao.setViewportView(campoDescricao);

        ImagemAnexada.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        ImagemAnexada.setIcon(new javax.swing.ImageIcon( "src\\Recursos\\camera.png" ));
        ImagemAnexada.setPreferredSize(new java.awt.Dimension(256, 256));

        BotaoEditar.setBackground(new java.awt.Color(80, 0, 102));
        BotaoEditar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoEditar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEditar.setIcon(new javax.swing.ImageIcon( "src\\Recursos\\lapis.png" ));
        BotaoEditar.setPreferredSize(new java.awt.Dimension(25, 30));
        BotaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditarActionPerformed(evt);
            }
        });

        BotaoExcluir.setBackground(new java.awt.Color(80, 0, 102));
        BotaoExcluir.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        BotaoExcluir.setIcon(new javax.swing.ImageIcon( "src\\Recursos\\lixeira.png"));
        BotaoExcluir.setPreferredSize(new java.awt.Dimension(25, 30));
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        CriadoPorTexto.setFont(new java.awt.Font("SimSun", 0, 10)); // NOI18N
        CriadoPorTexto.setText("Criado por:");

        UsuarioCriadoPor.setFont(new java.awt.Font("SimSun", 0, 10)); // NOI18N
        UsuarioCriadoPor.setForeground(new java.awt.Color(80, 0, 102));
        UsuarioCriadoPor.setText("Usuário");

        ComentariosTexto.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        ComentariosTexto.setForeground(new java.awt.Color(80, 0, 102));
        ComentariosTexto.setText("Comentários");

        PainelComentarios.setBackground(new java.awt.Color(239, 239, 239));

        NomeUsuarioComentario.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        NomeUsuarioComentario.setText("NomeUsuárioComentário");

        ComentarioUsuario.setColumns(20);
        ComentarioUsuario.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        ComentarioUsuario.setRows(5);
        PainelScrollComentario.setViewportView(ComentarioUsuario);

        BotaoComentar.setBackground(new java.awt.Color(80, 0, 102));
        BotaoComentar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoComentar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoComentar.setText("Comentar");
        BotaoComentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoComentarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelComentariosLayout = new javax.swing.GroupLayout(PainelComentarios);
        PainelComentarios.setLayout(PainelComentariosLayout);
        PainelComentariosLayout.setHorizontalGroup(
            PainelComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelComentariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotaoComentar)
                    .addGroup(PainelComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NomeUsuarioComentario)
                        .addComponent(PainelScrollComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PainelComentariosLayout.setVerticalGroup(
            PainelComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelComentariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NomeUsuarioComentario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelScrollComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoComentar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(AnexosTexto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ImagemAnexada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ComentariosTexto)
                            .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelPrincipalLayout.createSequentialGroup()
                                    .addComponent(TagsTexto)
                                    .addGap(48, 48, 48)
                                    .addComponent(SituacaoTexto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CampoSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(CategoriaTexto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CampoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BotaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(104, 104, 104)
                                    .addComponent(CriadoPorTexto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(UsuarioCriadoPor))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelPrincipalLayout.createSequentialGroup()
                                    .addComponent(DescricaoTexto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ScrollAreaDescricao))))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescricaoTexto)
                    .addComponent(ScrollAreaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(BotaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoriaTexto)
                    .addComponent(SituacaoTexto)
                    .addComponent(TagsTexto)
                    .addComponent(CampoSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CriadoPorTexto)
                    .addComponent(UsuarioCriadoPor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnexosTexto)
                    .addComponent(ImagemAnexada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComentariosTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelScrollPrincipal.setViewportView(PainelPrincipal);

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelaCadastroTeste)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PainelScrollPrincipal)
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelaCadastroTeste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelScrollPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoComentarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoComentarActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void BotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarActionPerformed

    }//GEN-LAST:event_BotaoEditarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVisualizarTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVisualizarTeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnexosTexto;
    private javax.swing.JButton BotaoComentar;
    private javax.swing.JButton BotaoEditar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JTextField CampoCategoria;
    private javax.swing.JTextField CampoSituacao;
    private javax.swing.JLabel CategoriaTexto;
    private javax.swing.JTextArea ComentarioUsuario;
    private javax.swing.JLabel ComentariosTexto;
    private javax.swing.JLabel CriadoPorTexto;
    private javax.swing.JLabel DescricaoTexto;
    private javax.swing.JLabel ImagemAnexada;
    private javax.swing.JLabel NomeUsuarioComentario;
    private javax.swing.JPanel Painel;
    private javax.swing.JPanel PainelComentarios;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JScrollPane PainelScrollComentario;
    private javax.swing.JScrollPane PainelScrollPrincipal;
    private javax.swing.JScrollPane ScrollAreaDescricao;
    private javax.swing.JLabel SituacaoTexto;
    private javax.swing.JLabel TagsTexto;
    private javax.swing.JLabel TelaCadastroTeste;
    private javax.swing.JLabel UsuarioCriadoPor;
    private javax.swing.JTextArea campoDescricao;
    // End of variables declaration//GEN-END:variables
}
