
package Telas;

import JDBC.UsuarioJDBC;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TelaListagemUsuarios extends javax.swing.JFrame {

    private List<Usuario> usuarios = new ArrayList();
    
    public TelaListagemUsuarios() {
        initComponents();
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        this.setLocationRelativeTo(null);
        this.usuarios = UsuarioJDBC.findAll();
        atualizaListaUsuario();
    }
    
    public final void atualizaListaUsuario(){
        DefaultTableModel modelo = (DefaultTableModel) TabelaUsuarios.getModel();
        modelo.setNumRows( 0 );
        modelo.setRowCount( 0 );
        this.usuarios = UsuarioJDBC.findAll();
        for( Usuario u : this.usuarios ){
            String[] dados = { String.valueOf( u.getId()) ,u.getNome(), u.getLogin() };
            modelo.addRow( dados );
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ListaDeUsuariosTexto = new javax.swing.JLabel();
        PainelScrollTabela = new javax.swing.JScrollPane();
        TabelaUsuarios = new javax.swing.JTable();
        BotaoVisualizarUsuario = new javax.swing.JButton();
        BotaoCadastrarUsuario = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Usuários");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(213, 213, 213));

        ListaDeUsuariosTexto.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        ListaDeUsuariosTexto.setForeground(new java.awt.Color(80, 0, 102));
        ListaDeUsuariosTexto.setText("Lista de Usuários");

        PainelScrollTabela.setBackground(new java.awt.Color(234, 234, 234));
        PainelScrollTabela.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N

        TabelaUsuarios.setBackground(new java.awt.Color(234, 234, 234));
        TabelaUsuarios.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        TabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Usuário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        TabelaUsuarios.setDefaultRenderer(Object.class, centerRenderer);
        PainelScrollTabela.setViewportView(TabelaUsuarios);

        BotaoVisualizarUsuario.setBackground(new java.awt.Color(80, 0, 102));
        BotaoVisualizarUsuario.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        BotaoVisualizarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotaoVisualizarUsuario.setText("Visualizar");
        BotaoVisualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVisualizarUsuarioActionPerformed(evt);
            }
        });

        BotaoCadastrarUsuario.setBackground(new java.awt.Color(80, 0, 102));
        BotaoCadastrarUsuario.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        BotaoCadastrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCadastrarUsuario.setText("Cadastrar");
        BotaoCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarUsuarioActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListaDeUsuariosTexto)
                .addContainerGap(338, Short.MAX_VALUE))
            .addComponent(PainelScrollTabela)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoCadastrarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoVisualizarUsuario)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListaDeUsuariosTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelScrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoVisualizarUsuario)
                    .addComponent(BotaoCadastrarUsuario)
                    .addComponent(BotaoCancelar))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarUsuarioActionPerformed
        telaCadastroUsuario t = new telaCadastroUsuario( this );
        t.setVisible( true );
    }//GEN-LAST:event_BotaoCadastrarUsuarioActionPerformed

    private void BotaoVisualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVisualizarUsuarioActionPerformed
        if( TabelaUsuarios.getSelectedRow() != -1){
            Usuario usuarioEdicao = usuarios.get(TabelaUsuarios.getSelectedRow() );
            telaCadastroUsuario t = new telaCadastroUsuario( this, usuarioEdicao );
            t.setVisible( true );
        }else{
            JOptionPane.showMessageDialog( this, "Selecione um usuario para visualizar","Erro", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_BotaoVisualizarUsuarioActionPerformed

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrarUsuario;
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoVisualizarUsuario;
    private javax.swing.JLabel ListaDeUsuariosTexto;
    private javax.swing.JScrollPane PainelScrollTabela;
    private javax.swing.JTable TabelaUsuarios;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
