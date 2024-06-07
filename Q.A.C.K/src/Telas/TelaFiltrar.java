package Telas;

public class TelaFiltrar extends javax.swing.JFrame {
    
    public TelaFiltrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        TelaFiltragem = new javax.swing.JLabel();
        PainelFiltragem = new javax.swing.JPanel();
        BotaoCancelar = new javax.swing.JButton();
        BotaoFiltrar = new javax.swing.JButton();
        FiltrarPorTexto = new javax.swing.JLabel();
        BotaoLimpar = new javax.swing.JButton();
        CampoFiltrarUsuario = new javax.swing.JComboBox<>();
        UsuarioTexto = new javax.swing.JLabel();
        TagTexto = new javax.swing.JLabel();
        CampoFiltrarTag = new javax.swing.JComboBox<>();
        StatusTexto = new javax.swing.JLabel();
        CampoFiltrarStatus = new javax.swing.JComboBox<>();
        DataInicioTexto = new javax.swing.JLabel();
        DataFimTexto = new javax.swing.JLabel();
        CampoFiltrarDataInicio = new javax.swing.JFormattedTextField();
        CampoFiltrarDataFim = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Filtrar");

        PainelPrincipal.setBackground(new java.awt.Color(213, 213, 213));
        PainelPrincipal.setToolTipText("");

        TelaFiltragem.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        TelaFiltragem.setForeground(new java.awt.Color(80, 0, 102));
        TelaFiltragem.setText("Filtragem");

        PainelFiltragem.setBackground(new java.awt.Color(234, 234, 234));

        BotaoCancelar.setBackground(new java.awt.Color(80, 0, 102));
        BotaoCancelar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        BotaoFiltrar.setBackground(new java.awt.Color(80, 0, 102));
        BotaoFiltrar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoFiltrar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoFiltrar.setText("Filtrar");
        BotaoFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFiltrarActionPerformed(evt);
            }
        });

        FiltrarPorTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        FiltrarPorTexto.setText("Filtrar por:");

        BotaoLimpar.setBackground(new java.awt.Color(80, 0, 102));
        BotaoLimpar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BotaoLimpar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoLimpar.setText("Limpar");
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });

        CampoFiltrarUsuario.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        CampoFiltrarUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum" }));

        UsuarioTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        UsuarioTexto.setText("Usuário");

        TagTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        TagTexto.setText("Tag");

        CampoFiltrarTag.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        CampoFiltrarTag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Bug", "Retrabalho", "Melhoria" }));

        StatusTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        StatusTexto.setText("Status");

        CampoFiltrarStatus.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        CampoFiltrarStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Finalizado", "Andamento" }));

        DataInicioTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        DataInicioTexto.setText("Data Início");

        DataFimTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        DataFimTexto.setText("Data Fim");

        CampoFiltrarDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        CampoFiltrarDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        javax.swing.GroupLayout PainelFiltragemLayout = new javax.swing.GroupLayout(PainelFiltragem);
        PainelFiltragem.setLayout(PainelFiltragemLayout);
        PainelFiltragemLayout.setHorizontalGroup(
            PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFiltragemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelFiltragemLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoFiltrar))
                    .addGroup(PainelFiltragemLayout.createSequentialGroup()
                        .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FiltrarPorTexto)
                            .addGroup(PainelFiltragemLayout.createSequentialGroup()
                                .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DataInicioTexto)
                                    .addComponent(DataFimTexto)
                                    .addComponent(StatusTexto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CampoFiltrarStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CampoFiltrarDataInicio)
                                    .addComponent(CampoFiltrarDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelFiltragemLayout.createSequentialGroup()
                                    .addComponent(UsuarioTexto)
                                    .addGap(34, 34, 34)
                                    .addComponent(CampoFiltrarUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelFiltragemLayout.createSequentialGroup()
                                    .addComponent(TagTexto)
                                    .addGap(62, 62, 62)
                                    .addComponent(CampoFiltrarTag, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelFiltragemLayout.setVerticalGroup(
            PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFiltragemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FiltrarPorTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuarioTexto)
                    .addComponent(CampoFiltrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TagTexto)
                    .addComponent(CampoFiltrarTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatusTexto)
                    .addComponent(CampoFiltrarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DataInicioTexto)
                    .addComponent(CampoFiltrarDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DataFimTexto)
                    .addComponent(CampoFiltrarDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoFiltrar)
                    .addComponent(BotaoCancelar)
                    .addComponent(BotaoLimpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelaFiltragem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PainelFiltragem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelaFiltragem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelFiltragem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void BotaoFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFiltrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoFiltrarActionPerformed

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoFiltrar;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JFormattedTextField CampoFiltrarDataFim;
    private javax.swing.JFormattedTextField CampoFiltrarDataInicio;
    private javax.swing.JComboBox<String> CampoFiltrarStatus;
    private javax.swing.JComboBox<String> CampoFiltrarTag;
    private javax.swing.JComboBox<String> CampoFiltrarUsuario;
    private javax.swing.JLabel DataFimTexto;
    private javax.swing.JLabel DataInicioTexto;
    private javax.swing.JLabel FiltrarPorTexto;
    private javax.swing.JPanel PainelFiltragem;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JLabel StatusTexto;
    private javax.swing.JLabel TagTexto;
    private javax.swing.JLabel TelaFiltragem;
    private javax.swing.JLabel UsuarioTexto;
    // End of variables declaration//GEN-END:variables
}
