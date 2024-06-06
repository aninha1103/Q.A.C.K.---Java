package Telas;

import JDBC.TesteJDBC;
import Modelo.Teste;
import Modelo.Usuario;
import Repositorio.Repositorio;
import java.awt.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends javax.swing.JFrame {

    private Usuario usuario;
    
    public TelaPrincipal( Usuario usuarioAtual ) {
        initComponents();
        this.usuario = usuarioAtual;
        this.campoNomeCargo.setText( usuarioAtual.getNome() + ", " + usuarioAtual.getNomeCargo() );
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        this.setLocationRelativeTo(null);        
        atulizaListaTeste();
    }
    
    public final void atulizaListaTeste(){
        DefaultTableModel modelo = (DefaultTableModel) ListaTestes.getModel();
        modelo.setNumRows( 0 );
        modelo.setRowCount( 0 );
        List<Teste> testes = TesteJDBC.findAll();
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
        BotaoAdicionarTeste = new javax.swing.JButton();
        BotaoFiltrarTeste = new javax.swing.JButton();
        campoNomeCargo = new javax.swing.JLabel();
        BotaoVizualizarTeste = new javax.swing.JButton();
        PainelListaTestes = new javax.swing.JScrollPane();
        ListaTestes = new javax.swing.JTable();

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

        campoNomeCargo.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        campoNomeCargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        campoNomeCargo.setText("Nome Usuario + Cargo");

        BotaoVizualizarTeste.setBackground(new java.awt.Color(80, 0, 102));
        BotaoVizualizarTeste.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoVizualizarTeste.setForeground(new java.awt.Color(255, 255, 255));
        BotaoVizualizarTeste.setText("Vizualizar");
        BotaoVizualizarTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVizualizarTesteActionPerformed(evt);
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

        javax.swing.GroupLayout TelaPrincipalLayout = new javax.swing.GroupLayout(TelaPrincipal);
        TelaPrincipal.setLayout(TelaPrincipalLayout);
        TelaPrincipalLayout.setHorizontalGroup(
            TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotaoFiltrarTeste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoVizualizarTeste)
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
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelListaTestes, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAdicionarTeste)
                    .addComponent(BotaoFiltrarTeste)
                    .addComponent(BotaoVizualizarTeste))
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
        telaCadastroTeste t = new telaCadastroTeste( this );
        t.setVisible( true );
    }//GEN-LAST:event_BotaoAdicionarTesteActionPerformed

    private void BotaoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoUsuariosActionPerformed
        TelaListagemUsuarios t = new TelaListagemUsuarios();
        t.setVisible( true );
    }//GEN-LAST:event_BotaoUsuariosActionPerformed

    private void BotaoFiltrarTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFiltrarTesteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoFiltrarTesteActionPerformed

    private void BotaoVizualizarTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVizualizarTesteActionPerformed
        if( ListaTestes.getSelectedRow() != -1){
            //telaCadastroTeste t = new telaCadastroTeste( this, this.rep.getTestes().get( ListaTestes.getSelectedRow() ) );
            //t.setVisible( true );
        }else{
            //erro: selecione um usuario para visualizar
        }
    }//GEN-LAST:event_BotaoVizualizarTesteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicionarTeste;
    private javax.swing.JButton BotaoFiltrarTeste;
    private javax.swing.JButton BotaoUsuarios;
    private javax.swing.JButton BotaoVizualizarTeste;
    private javax.swing.JTable ListaTestes;
    private javax.swing.JScrollPane PainelListaTestes;
    private javax.swing.JPanel TelaPrincipal;
    private javax.swing.JLabel campoNomeCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}

