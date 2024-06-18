package Telas;

import JDBC.TesteJDBC;
import Servicos.Relatorio;
import Modelo.Teste;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaRelatorio extends javax.swing.JFrame {

    private TelaPrincipal telaOrigem;
    
    public TelaRelatorio( TelaPrincipal origem ) {
        initComponents();
        this.telaOrigem = origem;
        desativaCheckBoxs();
        deselecionaCheckBoxs();
        relatorioPorData();
        this.setIconImage( new ImageIcon( System.getProperty("user.dir") +"\\src\\Recursos\\Q.A.C.K.png").getImage() );
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        this.setLocationRelativeTo(null);
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
        NomeArquivoLabel = new javax.swing.JLabel();
        ArquivoNome = new javax.swing.JTextField();

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
        CampoTipoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTipoRelatorioActionPerformed(evt);
            }
        });

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

        NomeArquivoLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        NomeArquivoLabel.setText("Nome arquivo:");

        javax.swing.GroupLayout PainelRelatorioLayout = new javax.swing.GroupLayout(PainelRelatorio);
        PainelRelatorio.setLayout(PainelRelatorioLayout);
        PainelRelatorioLayout.setHorizontalGroup(
            PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRelatorioLayout.createSequentialGroup()
                .addGroup(PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeTesteCheckBox)
                    .addComponent(UsuarioCheckBox)
                    .addComponent(TagsCheckBox)
                    .addComponent(StatusCheckBox)
                    .addComponent(DataCheckBox))
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addGroup(PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelRelatorioLayout.createSequentialGroup()
                            .addComponent(NomeArquivoLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ArquivoNome))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelRelatorioLayout.createSequentialGroup()
                            .addComponent(RelatorioTexto)
                            .addGap(44, 44, 44)
                            .addComponent(CampoTipoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        PainelRelatorioLayout.setVerticalGroup(
            PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelRelatorioLayout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(PainelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeArquivoLabel)
                    .addComponent(ArquivoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(BotaoFiltrar)))
        );

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RelatoriosTexto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addComponent(PainelRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RelatoriosTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        List<Map> dadosRelatorio = pegaDados();
        
        if( this.ArquivoNome.getText().isBlank() ){
            JOptionPane.showMessageDialog( this, "Nome do arquivo inválido","Erro", JOptionPane.ERROR_MESSAGE );
            return;
        }
        
        if( dadosRelatorio.isEmpty() ){
            JOptionPane.showMessageDialog( this, "Nenhuma dado encontrado","Erro", JOptionPane.ERROR_MESSAGE );
            return;
        }
        Map camposSelecionados = getCamposSelecionados();
        if( camposSelecionados.isEmpty()){
            JOptionPane.showMessageDialog( this, "Selecione ao menos um campo para gerar relatório","Erro", JOptionPane.ERROR_MESSAGE );
            return;
        }
        if( Relatorio.gerarRelatorioCsv(  dadosRelatorio ,  camposSelecionados, this.ArquivoNome.getText() ) ){
            JOptionPane.showMessageDialog( this, "Arquivo gerado no caminho:\n" + System.getProperty("user.dir") + "\\Relatorios","Sucesso", JOptionPane.INFORMATION_MESSAGE );
            this.dispose();
        }else{
            JOptionPane.showMessageDialog( this, "Erro inesperado","Erro", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_BotaoGerarRelatorioActionPerformed

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
        deselecionaCheckBoxs();
    }//GEN-LAST:event_BotaoLimparActionPerformed

    private void BotaoFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFiltrarActionPerformed
        TelaFiltrar tela = new TelaFiltrar( telaOrigem );
        tela.setVisible( true );
    }//GEN-LAST:event_BotaoFiltrarActionPerformed

    private void CampoTipoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTipoRelatorioActionPerformed
        desativaCheckBoxs();
        deselecionaCheckBoxs();
        switch( this.CampoTipoRelatorio.getSelectedIndex() ){
            case 0 -> relatorioPorData();
            case 1 -> relatorioPorStatus();
            case 2 -> relatorioPorTag();
            case 3 -> relatorioPorUsuario();
        }
    }//GEN-LAST:event_CampoTipoRelatorioActionPerformed

    private void desativaCheckBoxs(){
        this.NomeTesteCheckBox.setEnabled( false );
        this.UsuarioCheckBox.setEnabled( false );
        this.TagsCheckBox.setEnabled( false );
        this.StatusCheckBox.setEnabled( false );
        this.DataCheckBox.setEnabled( false );
    }
    
    private void deselecionaCheckBoxs(){
        this.NomeTesteCheckBox.setSelected(false );
        this.UsuarioCheckBox.setSelected( false );
        this.TagsCheckBox.setSelected( false );
        this.StatusCheckBox.setSelected( false );
        this.DataCheckBox.setSelected( false );
    }
    
    private void relatorioPorData(){
        this.NomeTesteCheckBox.setEnabled( true );
        this.UsuarioCheckBox.setEnabled( true );
        this.DataCheckBox.setEnabled( true );
        this.NomeTesteCheckBox.setSelected( true );
        this.UsuarioCheckBox.setSelected( true );
        this.DataCheckBox.setSelected( true );
        
    }
    
    private void relatorioPorStatus(){
        this.NomeTesteCheckBox.setEnabled( true );
        this.UsuarioCheckBox.setEnabled( true );
        this.StatusCheckBox.setEnabled( true );
        this.NomeTesteCheckBox.setSelected( true );
        this.UsuarioCheckBox.setSelected( true );
        this.StatusCheckBox.setSelected( true );
    }
    
    private void relatorioPorTag(){
        this.NomeTesteCheckBox.setEnabled( true );
        this.DataCheckBox.setEnabled( true );
        this.TagsCheckBox.setEnabled( true );
        this.NomeTesteCheckBox.setSelected(true );
        this.DataCheckBox.setSelected(true );
        this.TagsCheckBox.setSelected(true );
    }
    
    private void relatorioPorUsuario(){
        this.NomeTesteCheckBox.setEnabled( true );
        this.UsuarioCheckBox.setEnabled( true );
        this.DataCheckBox.setEnabled( true );
        this.StatusCheckBox.setEnabled( true );
        this.TagsCheckBox.setEnabled( true );
        this.NomeTesteCheckBox.setSelected(true );
        this.UsuarioCheckBox.setSelected(true );
        this.DataCheckBox.setSelected(true );
        this.StatusCheckBox.setSelected(true );
        this.TagsCheckBox.setSelected(true );
    }
    
    private List<Map> pegaDados(){
        List<Map> dados = new ArrayList<>();
        for( int i = 0; i < telaOrigem.getListaTestes().getModel().getRowCount(); i++){
            Map<String,String> dado = new TreeMap<>();
            Teste testeLinha = TesteJDBC.findByRowIndex( i );
            dado.put("Nome", testeLinha.getCriadoPor().getNome() );
            dado.put("titulo",  testeLinha.getNome() );
            dado.put("data_teste", testeLinha.getData().format( DateTimeFormatter.ofPattern("dd/MM/yyyy")) );
            dado.put("status", testeLinha.getStatus().toString()) ;
            dado.put("tag", testeLinha.getTag().toString() );
            dados.add( dado );
        }
        return dados;
    }
    
    private Map getCamposSelecionados(){
        Map<String,String> camposSelecionados = new TreeMap<>();
        
        if( this.UsuarioCheckBox.isSelected() ){
            camposSelecionados.put("Nome", "");
        }
        if( this.NomeTesteCheckBox.isSelected() ){
            camposSelecionados.put("titulo", "");
        }
        if( this.DataCheckBox.isSelected() ){
            camposSelecionados.put("data_teste", "");
        }
        if( this.StatusCheckBox.isSelected() ){
            camposSelecionados.put("status", "");
        }
        if( this.TagsCheckBox.isSelected() ){
            camposSelecionados.put("tag", "");
        }
        return camposSelecionados;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ArquivoNome;
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoFiltrar;
    private javax.swing.JButton BotaoGerarRelatorio;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JComboBox<String> CampoTipoRelatorio;
    private javax.swing.JRadioButton DataCheckBox;
    private javax.swing.JLabel NomeArquivoLabel;
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
