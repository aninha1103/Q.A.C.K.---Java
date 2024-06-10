package Telas;

import JDBC.TesteJDBC;
import Modelo.Filtro;
import Modelo.Teste;
import Modelo.Usuario;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends javax.swing.JFrame {

    private Usuario usuario;
    private Filtro filtroAtivo;
    
    public TelaPrincipal( Usuario usuarioAtual ) {
        initComponents();
        this.usuario = usuarioAtual;
        this.campoNomeCargo.setText( usuarioAtual.getNome() + ", " + usuarioAtual.getNomeCargo() );
        this.FiltroAtivoLabel.setText("Filtro: Inativo");
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        this.setLocationRelativeTo(null);        
        this.ListaTestes.setEnabled( false );
        atulizaListaTeste( TesteJDBC.findAll() );
    }
    
    protected final void atulizaListaTeste( List<Teste> testes){
        
        DefaultTableModel modelo = (DefaultTableModel) ListaTestes.getModel();
        modelo.setNumRows( 0 );
        modelo.setRowCount( 0 );
        for( Teste t : testes ){
            //id titulo data stauts categoria
            String data = t.getData().format( DateTimeFormatter.ofPattern("dd/MM/yyyy") );
            String status= t.getStatus().toString();
            String tag = t.getTag().toString();
            String[] dados = { String.valueOf( t.getId()), t.getNome(),data, status, tag };
            modelo.addRow( dados );
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public JTable getListaTestes() {
        return ListaTestes;
    }

    public Filtro getFiltroAtivo() {
        return filtroAtivo;
    }
    
    public void setFiltroAtivoLabel( String messagem ){
        this.FiltroAtivoLabel.setText(messagem);
    }

    public void setFiltroAtivo(Filtro filtroAtivo) {
        this.filtroAtivo = filtroAtivo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaPrincipal = new javax.swing.JPanel();
        BotaoUsuarios = new javax.swing.JButton();
        TituloTela = new javax.swing.JLabel();
        BotaoAdicionarTeste = new javax.swing.JButton();
        BotaoFiltrarTeste = new javax.swing.JButton();
        campoNomeCargo = new javax.swing.JLabel();
        BotaoVisualizarTeste = new javax.swing.JButton();
        PainelListaTestes = new javax.swing.JScrollPane();
        ListaTestes = new javax.swing.JTable();
        FiltroAtivoLabel = new javax.swing.JLabel();

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

        TituloTela.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        TituloTela.setForeground(new java.awt.Color(80, 0, 102));
        TituloTela.setText("Registros de Testes");

        BotaoAdicionarTeste.setBackground(new java.awt.Color(80, 0, 102));
        BotaoAdicionarTeste.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoAdicionarTeste.setForeground(new java.awt.Color(255, 255, 255));
        BotaoAdicionarTeste.setText("Adicionar");
        BotaoAdicionarTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarTesteActionPerformed(evt);
            }
        });

        BotaoFiltrarTeste.setBackground(new java.awt.Color(80, 0, 102));
        BotaoFiltrarTeste.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoFiltrarTeste.setForeground(new java.awt.Color(255, 255, 255));
        BotaoFiltrarTeste.setText("Filtrar");
        BotaoFiltrarTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFiltrarTesteActionPerformed(evt);
            }
        });

        campoNomeCargo.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        campoNomeCargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        campoNomeCargo.setText("Nome Usuario + Cargo");

        BotaoVisualizarTeste.setBackground(new java.awt.Color(80, 0, 102));
        BotaoVisualizarTeste.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoVisualizarTeste.setForeground(new java.awt.Color(255, 255, 255));
        BotaoVisualizarTeste.setText("Visualizar");
        BotaoVisualizarTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVisualizarTesteActionPerformed(evt);
            }
        });

        PainelListaTestes.setBackground(new java.awt.Color(234, 234, 234));

        ListaTestes.setBackground(new java.awt.Color(234, 234, 234));
        ListaTestes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Data", "Status", "Categoria"
            }
        ));
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        ListaTestes.setDefaultRenderer(Object.class, centerRenderer);
        PainelListaTestes.setViewportView(ListaTestes);

        FiltroAtivoLabel.setText("Filtro: ");

        javax.swing.GroupLayout TelaPrincipalLayout = new javax.swing.GroupLayout(TelaPrincipal);
        TelaPrincipal.setLayout(TelaPrincipalLayout);
        TelaPrincipalLayout.setHorizontalGroup(
            TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaPrincipalLayout.createSequentialGroup()
                        .addComponent(TituloTela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoNomeCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelaPrincipalLayout.createSequentialGroup()
                        .addComponent(FiltroAtivoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoFiltrarTeste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoVisualizarTeste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoAdicionarTeste)
                        .addContainerGap())))
            .addComponent(PainelListaTestes, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );
        TelaPrincipalLayout.setVerticalGroup(
            TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaPrincipalLayout.createSequentialGroup()
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoNomeCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TituloTela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelListaTestes, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAdicionarTeste)
                    .addComponent(BotaoFiltrarTeste)
                    .addComponent(BotaoVisualizarTeste)
                    .addComponent(FiltroAtivoLabel))
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

    private void BotaoAdicionarTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarTesteActionPerformed
        if( this.usuario.getCargo().getPermissoes().isCriar() ){
            telaCadastroTeste t = new telaCadastroTeste( this );
            t.setVisible( true );
        }else{
            JOptionPane.showMessageDialog( this, "Não tem permissão para essa ação","Erro", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_BotaoAdicionarTesteActionPerformed

    private void BotaoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoUsuariosActionPerformed
        if( this.usuario.getCargo().getPermissoes().isManipularUsuario() ){
            TelaListagemUsuarios t = new TelaListagemUsuarios();
            t.setVisible( true );
        }else{
            JOptionPane.showMessageDialog( this, "Não tem permissão para essa ação","Erro", JOptionPane.ERROR_MESSAGE );
        }
        
    }//GEN-LAST:event_BotaoUsuariosActionPerformed

    private void BotaoFiltrarTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFiltrarTesteActionPerformed
        TelaFiltrar tela = new TelaFiltrar( this );
        tela.setVisible( Boolean.TRUE );
    }//GEN-LAST:event_BotaoFiltrarTesteActionPerformed

    private void BotaoVisualizarTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVisualizarTesteActionPerformed
        if( ListaTestes.getSelectedRow() != -1){
            TelaVisualizarTeste t = new TelaVisualizarTeste( TesteJDBC.findByRowIndex( ListaTestes.getSelectedRow() ), this );
            t.setVisible( true );
        }else{
            JOptionPane.showMessageDialog( this, "Selecione um teste para visualizar","Erro", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_BotaoVisualizarTesteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicionarTeste;
    private javax.swing.JButton BotaoFiltrarTeste;
    private javax.swing.JButton BotaoUsuarios;
    private javax.swing.JButton BotaoVisualizarTeste;
    private javax.swing.JLabel FiltroAtivoLabel;
    private javax.swing.JTable ListaTestes;
    private javax.swing.JScrollPane PainelListaTestes;
    private javax.swing.JPanel TelaPrincipal;
    private javax.swing.JLabel TituloTela;
    private javax.swing.JLabel campoNomeCargo;
    // End of variables declaration//GEN-END:variables
}

