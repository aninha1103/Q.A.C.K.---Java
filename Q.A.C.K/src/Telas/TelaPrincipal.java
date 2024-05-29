package Telas;

import Modelo.Teste;
import Repositorio.Repositorio;
import java.util.List;
import javax.swing.DefaultListModel;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal( Repositorio rep ) {
        initComponents();
        //renomear campoNomeCargo baseado nos dados do usuário
        //this.campoNomeCargo.setText(rep.getUsuarioAtual().getNome() + ", " + rep.getNomeCargo() );
        //atulizaListaUsuario( rep.getTestes() );
    }
    
    public final void atulizaListaUsuario( List<Teste> testes ){
        DefaultListModel modelo = new DefaultListModel();
        modelo.clear();
        modelo.addAll( testes );
        //this.listaTestes.setModel( modelo );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        TelaPrincipal = new javax.swing.JPanel();
        BotaoUsuarios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PainelTeste = new javax.swing.JPanel();
        Scroll = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        idTeste = new javax.swing.JLabel();
        tituloTeste = new javax.swing.JLabel();
        dataTeste = new javax.swing.JLabel();
        IconComentario = new javax.swing.JLabel();
        quantidadeComentarios = new javax.swing.JLabel();
        botaoVizualizarTeste = new javax.swing.JButton();
        BotaoAdicionar = new javax.swing.JButton();
        BotaoFiltrar = new javax.swing.JButton();
        campoNomeCargo = new javax.swing.JLabel();
        DataTexto = new javax.swing.JLabel();
        TituloTexto = new javax.swing.JLabel();
        CodigoTexto = new javax.swing.JLabel();
        DataTexto1 = new javax.swing.JLabel();
        DataTexto2 = new javax.swing.JLabel();
        DataTexto3 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Testes");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        TelaPrincipal.setBackground(new java.awt.Color(213, 213, 213));

        BotaoUsuarios.setBackground(new java.awt.Color(80, 0, 102));
        BotaoUsuarios.setIcon(new javax.swing.ImageIcon( "src\\Recursos\\icone.png" ));
        BotaoUsuarios.setMaximumSize(new java.awt.Dimension(26, 26));
        BotaoUsuarios.setMinimumSize(new java.awt.Dimension(26, 26));
        BotaoUsuarios.setPreferredSize(new java.awt.Dimension(26, 26));
        BotaoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoUsuariosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(80, 0, 102));
        jLabel1.setText("Registros de Testes");

        PainelTeste.setBackground(new java.awt.Color(234, 234, 234));
        PainelTeste.setFocusCycleRoot(true);

        idTeste.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        idTeste.setText("0001");

        tituloTeste.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        tituloTeste.setText("Título do Teste");

        dataTeste.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        dataTeste.setText("01/01/2001");

        IconComentario.setBackground(new java.awt.Color(255, 255, 255));
        IconComentario.setIcon(new javax.swing.ImageIcon( "src\\Recursos\\comentario.png" ));

        quantidadeComentarios.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        quantidadeComentarios.setText("1");

        botaoVizualizarTeste.setBackground(new java.awt.Color(80, 0, 102));
        botaoVizualizarTeste.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        botaoVizualizarTeste.setIcon(new javax.swing.ImageIcon( "src\\Recursos\\lupa.png" ));
        botaoVizualizarTeste.setMaximumSize(new java.awt.Dimension(22, 22));
        botaoVizualizarTeste.setMinimumSize(new java.awt.Dimension(22, 22));
        botaoVizualizarTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVizualizarTesteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idTeste)
                .addGap(18, 18, 18)
                .addComponent(tituloTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dataTeste)
                .addGap(102, 102, 102)
                .addComponent(quantidadeComentarios)
                .addGap(64, 64, 64)
                .addComponent(IconComentario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoVizualizarTeste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoVizualizarTeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(idTeste, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
            .addComponent(tituloTeste, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(quantidadeComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dataTeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(IconComentario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PainelTesteLayout = new javax.swing.GroupLayout(PainelTeste);
        PainelTeste.setLayout(PainelTesteLayout);
        PainelTesteLayout.setHorizontalGroup(
            PainelTesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelTesteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelTesteLayout.setVerticalGroup(
            PainelTesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
            .addGroup(PainelTesteLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BotaoAdicionar.setBackground(new java.awt.Color(80, 0, 102));
        BotaoAdicionar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoAdicionar.setText("Adicionar");
        BotaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarActionPerformed(evt);
            }
        });

        BotaoFiltrar.setBackground(new java.awt.Color(80, 0, 102));
        BotaoFiltrar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoFiltrar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoFiltrar.setText("Filtrar");

        campoNomeCargo.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        campoNomeCargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        campoNomeCargo.setText("Nome Usuario + Cargo");

        DataTexto.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        DataTexto.setForeground(new java.awt.Color(80, 0, 102));
        DataTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DataTexto.setText("Data");

        TituloTexto.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        TituloTexto.setForeground(new java.awt.Color(80, 0, 102));
        TituloTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloTexto.setText("Título");

        CodigoTexto.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        CodigoTexto.setForeground(new java.awt.Color(80, 0, 102));
        CodigoTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CodigoTexto.setText("Cód.");

        DataTexto1.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        DataTexto1.setForeground(new java.awt.Color(80, 0, 102));
        DataTexto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DataTexto1.setText("Comentarios");

        DataTexto2.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        DataTexto2.setForeground(new java.awt.Color(80, 0, 102));
        DataTexto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DataTexto2.setText("Data");

        DataTexto3.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        DataTexto3.setForeground(new java.awt.Color(80, 0, 102));
        DataTexto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DataTexto3.setText("Data");

        javax.swing.GroupLayout TelaPrincipalLayout = new javax.swing.GroupLayout(TelaPrincipal);
        TelaPrincipal.setLayout(TelaPrincipalLayout);
        TelaPrincipalLayout.setHorizontalGroup(
            TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelTeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TelaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoNomeCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaPrincipalLayout.createSequentialGroup()
                        .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaPrincipalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BotaoFiltrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoAdicionar))
                            .addGroup(TelaPrincipalLayout.createSequentialGroup()
                                .addComponent(CodigoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TituloTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185)
                                .addComponent(DataTexto)
                                .addGap(79, 79, 79)
                                .addComponent(DataTexto1)
                                .addGap(68, 68, 68)
                                .addComponent(DataTexto2)
                                .addGap(27, 27, 27)
                                .addComponent(DataTexto3)
                                .addGap(0, 170, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        TelaPrincipalLayout.setVerticalGroup(
            TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaPrincipalLayout.createSequentialGroup()
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoNomeCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoTexto)
                    .addComponent(TituloTexto)
                    .addComponent(DataTexto)
                    .addComponent(DataTexto1)
                    .addComponent(DataTexto2)
                    .addComponent(DataTexto3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelTeste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAdicionar)
                    .addComponent(BotaoFiltrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarActionPerformed
        
    }//GEN-LAST:event_BotaoAdicionarActionPerformed

    private void BotaoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoUsuariosActionPerformed
        
    }//GEN-LAST:event_BotaoUsuariosActionPerformed

    private void botaoVizualizarTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVizualizarTesteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVizualizarTesteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicionar;
    private javax.swing.JButton BotaoFiltrar;
    private javax.swing.JButton BotaoUsuarios;
    private javax.swing.JLabel CodigoTexto;
    private javax.swing.JLabel DataTexto;
    private javax.swing.JLabel DataTexto1;
    private javax.swing.JLabel DataTexto2;
    private javax.swing.JLabel DataTexto3;
    private javax.swing.JLabel IconComentario;
    private javax.swing.JPanel PainelTeste;
    private javax.swing.JScrollBar Scroll;
    private javax.swing.JPanel TelaPrincipal;
    private javax.swing.JLabel TituloTexto;
    private javax.swing.JButton botaoVizualizarTeste;
    private javax.swing.JLabel campoNomeCargo;
    private javax.swing.JLabel dataTeste;
    private javax.swing.JLabel idTeste;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel quantidadeComentarios;
    private javax.swing.JLabel tituloTeste;
    // End of variables declaration//GEN-END:variables
}

