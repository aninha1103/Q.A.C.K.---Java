
package Telas;

public class TelaRelatorios extends javax.swing.JFrame {

    public TelaRelatorios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        RelatoriosTexto = new javax.swing.JLabel();
        PainelRelatorio = new javax.swing.JPanel();
        BotaoCancelar = new javax.swing.JButton();
        BotaoGerarRelatorio = new javax.swing.JButton();
        BotaoLimpar = new javax.swing.JButton();
        RelatorioTexto = new javax.swing.JLabel();
        CampoTipoRelatorio = new javax.swing.JComboBox<>();
        NomeTesteCheckBox = new javax.swing.JRadioButton();
        UsuarioCheckBox = new javax.swing.JRadioButton();
        TagsCheckBox = new javax.swing.JRadioButton();
        StatusCheckBox = new javax.swing.JRadioButton();
        DataCheckBox = new javax.swing.JRadioButton();
        BotaoFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relatórios");
        setResizable(false);

        PainelPrincipal.setBackground(new java.awt.Color(213, 213, 213));
        PainelPrincipal.setToolTipText("");

        RelatoriosTexto.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        RelatoriosTexto.setForeground(new java.awt.Color(80, 0, 102));
        RelatoriosTexto.setText("Relatórios");

        PainelRelatorio.setBackground(new java.awt.Color(234, 234, 234));

        BotaoCancelar.setBackground(new java.awt.Color(80, 0, 102));
        BotaoCancelar.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        BotaoCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        BotaoGerarRelatorio.setBackground(new java.awt.Color(80, 0, 102));
        BotaoGerarRelatorio.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        BotaoGerarRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        BotaoGerarRelatorio.setText("Gerar Relatório");
        BotaoGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGerarRelatorioActionPerformed(evt);
            }
        });

        BotaoLimpar.setBackground(new java.awt.Color(80, 0, 102));
        BotaoLimpar.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        BotaoLimpar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoLimpar.setText("Limpar");
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });

        RelatorioTexto.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        RelatorioTexto.setText("Relatório");

        CampoTipoRelatorio.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        CampoTipoRelatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por Data", "Por Status", "Por Tags", "Por Usuário" }));

        NomeTesteCheckBox.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        NomeTesteCheckBox.setText("Nome Teste");

        UsuarioCheckBox.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        UsuarioCheckBox.setText("Usuário");

        TagsCheckBox.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        TagsCheckBox.setText("Tags");

        StatusCheckBox.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        StatusCheckBox.setText("Status");

        DataCheckBox.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        DataCheckBox.setText("Data");

        BotaoFiltrar.setBackground(new java.awt.Color(80, 0, 102));
        BotaoFiltrar.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        BotaoFiltrar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoFiltrar.setText("Filtrar");
        BotaoFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelRelatorioLayout = new javax.swing.GroupLayout(PainelRelatorio);
        PainelRelatorio.setLayout(PainelRelatorioLayout);
        PainelRelatorioLayout.setHorizontalGroup(
            PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelRelatorioLayout.createSequentialGroup()
                        .addComponent(BotaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoFiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoGerarRelatorio))
                    .addGroup(PainelRelatorioLayout.createSequentialGroup()
                        .addComponent(RelatorioTexto)
                        .addGap(26, 26, 26)
                        .addComponent(CampoTipoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelRelatorioLayout.createSequentialGroup()
                .addGroup(PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeTesteCheckBox)
                    .addComponent(UsuarioCheckBox)
                    .addComponent(TagsCheckBox)
                    .addComponent(StatusCheckBox)
                    .addComponent(DataCheckBox))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PainelRelatorioLayout.setVerticalGroup(
            PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RelatorioTexto)
                    .addComponent(CampoTipoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeTesteCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsuarioCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TagsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatusCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DataCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoGerarRelatorio)
                    .addComponent(BotaoCancelar)
                    .addComponent(BotaoLimpar)
                    .addComponent(BotaoFiltrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RelatoriosTexto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PainelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RelatoriosTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    private void BotaoGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGerarRelatorioActionPerformed

    }//GEN-LAST:event_BotaoGerarRelatorioActionPerformed

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed

    }//GEN-LAST:event_BotaoLimparActionPerformed

    private void BotaoFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFiltrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoFiltrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoFiltrar;
    private javax.swing.JButton BotaoGerarRelatorio;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JComboBox<String> CampoTipoRelatorio;
    private javax.swing.JRadioButton DataCheckBox;
    private javax.swing.JRadioButton NomeTesteCheckBox;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JPanel PainelRelatorio;
    private javax.swing.JLabel RelatorioTexto;
    private javax.swing.JLabel RelatoriosTexto;
    private javax.swing.JRadioButton StatusCheckBox;
    private javax.swing.JRadioButton TagsCheckBox;
    private javax.swing.JRadioButton UsuarioCheckBox;
    // End of variables declaration//GEN-END:variables
}
