
package Telas;

import JDBC.AnexoJDBC;
import JDBC.ComentarioJDBC;
import JDBC.TesteJDBC;
import Modelo.Comentario;
import Modelo.Teste;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaVisualizarTeste extends javax.swing.JFrame {

    private TelaPrincipal origem;
    private Teste testeVisualizar;
    
    public TelaVisualizarTeste( Teste testeVisualizar, TelaPrincipal origem ) {
        initComponents();
        this.origem = origem;
        this.testeVisualizar = testeVisualizar;
        atualizaCampos();
        atualizaComentarios( ComentarioJDBC.findByIdTest( testeVisualizar.getId() ) );
        this.TabelaComentario.getColumnModel().getColumn( 0 ).setResizable(false);
        this.TabelaComentario.getColumnModel().getColumn(1).setPreferredWidth(750);
        this.PainelScrollPrincipal.getVerticalScrollBar().setUnitIncrement(16);
        this.setIconImage( new ImageIcon( System.getProperty("user.dir") +"\\src\\Recursos\\Q.A.C.K.png").getImage() );
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        this.setLocationRelativeTo(null);
                
    }

    protected final void atualizaCampos(){
        //Atualizando os dados de vizualicao do teste
        Integer idAnexo = 1;
        if( this.testeVisualizar.getAnexo() != null ){
            idAnexo =  this.testeVisualizar.getAnexo().getId();
        }
        try {
            this.ImagemAnexada.setIcon( new javax.swing.ImageIcon( 
                    ImageIO.read( new File( AnexoJDBC.findById( idAnexo ).getCaminhoArquivo())).getScaledInstance
                                                       (ImagemAnexada.getWidth(), ImagemAnexada.getHeight(), Image.SCALE_SMOOTH)) 
            );
            this.ImagemAnexada.updateUI();
        } catch (IOException ex) {
            Logger.getLogger(TelaVisualizarTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.TelaCadastroTeste.setText(testeVisualizar.getNome() );
        this.campoDescricao.setText( testeVisualizar.getDescricao() );
        this.CampoSituacao.setText( testeVisualizar.getStatus().name() );
        this.CampoCategoria.setText( testeVisualizar.getTag().name() );
        this.UsuarioCriadoPor.setText( testeVisualizar.getCriadoPor().getNome() );
        this.CampoTicket.setText(testeVisualizar.getTicket());
        this.CampoTicket.setEnabled( false );
        this.campoDescricao.setEnabled( false );
        this.CampoSituacao.setEnabled( false );
        this.CampoCategoria.setEnabled( false );
    }

    public Teste getTesteVisualizar() {
        return testeVisualizar;
    }

    public void setTesteVisualizar(Teste testeVisualizar) {
        this.testeVisualizar = testeVisualizar;
    }
    
    public void atualizaComentarios( List<Comentario> comentarios){
        if( comentarios == null ){
            return;
        }
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaComentario.getModel();
        modelo.setNumRows( 0 );
        modelo.setRowCount( 0 );
        for( Comentario c : comentarios ){
            //id titulo data stauts categoria
            String usuario = c.getUsuario().getNome();
            String comentario= c.getTextoComentario();
            String editado = (c.getEditado()) ? "Sim" : "Não";
            String[] dados = { usuario, comentario, editado };
            modelo.addRow( dados );
        }
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
        BotaoComentar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaComentario = new javax.swing.JTable();
        BotaoEditarComentario = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        TagsTexto1 = new javax.swing.JLabel();
        CampoTicket = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vizualizar Teste");
        setResizable(false);

        Painel.setBackground(new java.awt.Color(213, 213, 213));
        Painel.setToolTipText("Vizualizar Teste");

        TelaCadastroTeste.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        TelaCadastroTeste.setForeground(new java.awt.Color(80, 0, 102));
        TelaCadastroTeste.setText("Título Teste");

        PainelScrollPrincipal.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        PainelPrincipal.setBackground(new java.awt.Color(234, 234, 234));
        PainelPrincipal.setMinimumSize(new java.awt.Dimension(5, 5));

        DescricaoTexto.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        DescricaoTexto.setText("Descrição:");

        TagsTexto.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        TagsTexto.setText("Tags");

        AnexosTexto.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        AnexosTexto.setText("Anexos:");

        SituacaoTexto.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        SituacaoTexto.setText("Situação:");

        CategoriaTexto.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        CategoriaTexto.setText("Categoria:");

        CampoSituacao.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        CampoSituacao.setToolTipText("");

        CampoCategoria.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N

        campoDescricao.setEditable(false);
        campoDescricao.setColumns(20);
        campoDescricao.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        campoDescricao.setRows(5);
        ScrollAreaDescricao.setViewportView(campoDescricao);

        ImagemAnexada.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        ImagemAnexada.setIcon(new javax.swing.ImageIcon( "src\\Recursos\\camera.png" ));
        ImagemAnexada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ImagemAnexada.setPreferredSize(new java.awt.Dimension(256, 256));

        BotaoEditar.setBackground(new java.awt.Color(80, 0, 102));
        BotaoEditar.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
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

        CriadoPorTexto.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        CriadoPorTexto.setText("Criado por:");

        UsuarioCriadoPor.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        UsuarioCriadoPor.setForeground(new java.awt.Color(80, 0, 102));
        UsuarioCriadoPor.setText("Usuário");

        ComentariosTexto.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        ComentariosTexto.setForeground(new java.awt.Color(80, 0, 102));
        ComentariosTexto.setText("Comentários");

        PainelComentarios.setBackground(new java.awt.Color(239, 239, 239));

        BotaoComentar.setBackground(new java.awt.Color(80, 0, 102));
        BotaoComentar.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        BotaoComentar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoComentar.setText("Comentar");
        BotaoComentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoComentarActionPerformed(evt);
            }
        });

        TabelaComentario.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        TabelaComentario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Comentário", "Editado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaComentario.setAutoscrolls(false);
        TabelaComentario.setShowVerticalLines(true);
        TabelaComentario.getTableHeader().setResizingAllowed(false);
        jScrollPane1.setViewportView(TabelaComentario);

        BotaoEditarComentario.setBackground(new java.awt.Color(80, 0, 102));
        BotaoEditarComentario.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        BotaoEditarComentario.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEditarComentario.setText("Editar");
        BotaoEditarComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditarComentarioActionPerformed(evt);
            }
        });

        BotaoCancelar.setBackground(new java.awt.Color(80, 0, 102));
        BotaoCancelar.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        BotaoCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelComentariosLayout = new javax.swing.GroupLayout(PainelComentarios);
        PainelComentarios.setLayout(PainelComentariosLayout);
        PainelComentariosLayout.setHorizontalGroup(
            PainelComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelComentariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelComentariosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoEditarComentario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoComentar)))
                .addContainerGap())
        );
        PainelComentariosLayout.setVerticalGroup(
            PainelComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelComentariosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(BotaoComentar)
                    .addComponent(BotaoEditarComentario)
                    .addComponent(BotaoCancelar))
                .addContainerGap())
        );

        TagsTexto1.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        TagsTexto1.setText("Ticket:");

        CampoTicket.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        CampoTicket.setToolTipText("");

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
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addComponent(DescricaoTexto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ScrollAreaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelPrincipalLayout.createSequentialGroup()
                                        .addComponent(TagsTexto1)
                                        .addGap(18, 18, 18)
                                        .addComponent(CampoTicket))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelPrincipalLayout.createSequentialGroup()
                                        .addComponent(TagsTexto)
                                        .addGap(48, 48, 48)
                                        .addComponent(SituacaoTexto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CategoriaTexto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CriadoPorTexto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UsuarioCriadoPor)))
                        .addGap(0, 52, Short.MAX_VALUE)))
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
                    .addComponent(CriadoPorTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuarioCriadoPor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TagsTexto1)
                    .addComponent(CampoTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagemAnexada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnexosTexto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComentariosTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TelaCadastroTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelScrollPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoComentarActionPerformed
        if( origem.getUsuario().getCargo().getPermissoes().isComentar() ){
            TelaComentar telaComentario = new TelaComentar( origem, testeVisualizar.getId(), this );
            telaComentario.setVisible( true );
        }else{
            JOptionPane.showMessageDialog( this, "Não tem permissão para essa ação","Erro", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_BotaoComentarActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        if( origem.getUsuario().getCargo().getPermissoes().isExcluir()){
            if( JOptionPane.showConfirmDialog(this, "Confirma exclusão?", "Excluir teste", JOptionPane.YES_NO_OPTION) == 0 ){
                TesteJDBC.delete( testeVisualizar );
                origem.atulizaListaTeste( TesteJDBC.findAll() );
                this.dispose();
            }
        }else{
            JOptionPane.showMessageDialog( this, "Não tem permissão para essa ação","Erro", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void BotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarActionPerformed
        if( origem.getUsuario().getCargo().getPermissoes().isAlterar() ){
            telaCadastroTeste telaCadastro = new telaCadastroTeste( origem, testeVisualizar, this );
            telaCadastro.setVisible( true );
        }else{
            JOptionPane.showMessageDialog( this, "Não tem permissão para essa ação","Erro", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_BotaoEditarActionPerformed

    private void BotaoEditarComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarComentarioActionPerformed
       if( !origem.getUsuario().getCargo().getPermissoes().isComentar()){
            JOptionPane.showMessageDialog( this, "Não tem permissão para essa ação","Erro", JOptionPane.ERROR_MESSAGE );
            return;
        }
        if( TabelaComentario.getSelectedRow() == -1){
            JOptionPane.showMessageDialog( this, "Selecione um comentário para visualizar","Erro", JOptionPane.ERROR_MESSAGE );
            return;
        }
        Comentario comentario = ComentarioJDBC.findByRowIndex( TabelaComentario.getSelectedRow(), testeVisualizar.getId());
        TelaComentar telaComentario = new TelaComentar( origem, testeVisualizar.getId(), comentario.getId() ,this,  comentario.getTextoComentario() );
        telaComentario.setVisible( true );
        
    }//GEN-LAST:event_BotaoEditarComentarioActionPerformed

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnexosTexto;
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoComentar;
    private javax.swing.JButton BotaoEditar;
    private javax.swing.JButton BotaoEditarComentario;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JTextField CampoCategoria;
    private javax.swing.JTextField CampoSituacao;
    private javax.swing.JTextField CampoTicket;
    private javax.swing.JLabel CategoriaTexto;
    private javax.swing.JLabel ComentariosTexto;
    private javax.swing.JLabel CriadoPorTexto;
    private javax.swing.JLabel DescricaoTexto;
    private javax.swing.JLabel ImagemAnexada;
    private javax.swing.JPanel Painel;
    private javax.swing.JPanel PainelComentarios;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JScrollPane PainelScrollPrincipal;
    private javax.swing.JScrollPane ScrollAreaDescricao;
    private javax.swing.JLabel SituacaoTexto;
    private javax.swing.JTable TabelaComentario;
    private javax.swing.JLabel TagsTexto;
    private javax.swing.JLabel TagsTexto1;
    private javax.swing.JLabel TelaCadastroTeste;
    private javax.swing.JLabel UsuarioCriadoPor;
    private javax.swing.JTextArea campoDescricao;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
