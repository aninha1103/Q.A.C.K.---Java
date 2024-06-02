
package Telas;

import Modelo.Usuario;
import Repositorio.Repositorio;
import java.util.List;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TelaListagemUsuarios extends javax.swing.JFrame {

    private final Repositorio rep;
    
    public TelaListagemUsuarios( Repositorio rep) {
        initComponents();
        this.rep = rep;
        atualizaListaUsuario( rep.getUsuarios() );
    }
    
    public final void atualizaListaUsuario( List<Usuario> usuarios ){
        DefaultTableModel modelo = (DefaultTableModel) TabelaUsuarios.getModel();
        modelo.setNumRows( 0 );
        modelo.setRowCount( 0 );
        for( Usuario u : usuarios ){
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
        BotaoVizualizarUsuario = new javax.swing.JButton();
        BotaoCadastrarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Usuários");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(213, 213, 213));

        ListaDeUsuariosTexto.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        ListaDeUsuariosTexto.setForeground(new java.awt.Color(80, 0, 102));
        ListaDeUsuariosTexto.setText("Lista de Usuários");

        PainelScrollTabela.setBackground(new java.awt.Color(234, 234, 234));

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

        BotaoVizualizarUsuario.setBackground(new java.awt.Color(80, 0, 102));
        BotaoVizualizarUsuario.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoVizualizarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotaoVizualizarUsuario.setText("Vizualizar");
        BotaoVizualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVizualizarUsuarioActionPerformed(evt);
            }
        });

        BotaoCadastrarUsuario.setBackground(new java.awt.Color(80, 0, 102));
        BotaoCadastrarUsuario.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoCadastrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCadastrarUsuario.setText("Cadastrar");
        BotaoCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListaDeUsuariosTexto)
                .addContainerGap(318, Short.MAX_VALUE))
            .addComponent(PainelScrollTabela)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoCadastrarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoVizualizarUsuario)
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
                    .addComponent(BotaoVizualizarUsuario)
                    .addComponent(BotaoCadastrarUsuario))
                .addContainerGap(14, Short.MAX_VALUE))
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
        telaCadastroUsuario t = new telaCadastroUsuario( rep, this );
        t.setVisible( true );
    }//GEN-LAST:event_BotaoCadastrarUsuarioActionPerformed

    private void BotaoVizualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVizualizarUsuarioActionPerformed
        if( TabelaUsuarios.getSelectedRow() != -1){
            this.rep.getUsuarios().get(TabelaUsuarios.getSelectedRow() );
            telaCadastroUsuario t = new telaCadastroUsuario( rep, this, this.rep.getUsuarios().get(TabelaUsuarios.getSelectedRow() ) );
            t.setVisible( true );
        }else{
            //erro: selecione um usuario para visualizar
        }
    }//GEN-LAST:event_BotaoVizualizarUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrarUsuario;
    private javax.swing.JButton BotaoVizualizarUsuario;
    private javax.swing.JLabel ListaDeUsuariosTexto;
    private javax.swing.JScrollPane PainelScrollTabela;
    private javax.swing.JTable TabelaUsuarios;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
