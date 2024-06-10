package Telas;

import JDBC.TagJDBC;
import JDBC.TesteJDBC;
import JDBC.UsuarioJDBC;
import Modelo.Filtro;
import Modelo.Status;
import Modelo.Tag;
import Modelo.Usuario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class TelaFiltrar<E> extends javax.swing.JFrame {
    
    private TelaPrincipal origemTela;
    
    public TelaFiltrar( TelaPrincipal origem ) {
        initComponents();
        this.origemTela = origem;
        preencheComboBoxUsuario();
        preencheComboBoxTag();
        selecionaFiltroAtivo();
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        this.setLocationRelativeTo(null);
    }

    private void preencheComboBoxUsuario(){
        for( Usuario u : UsuarioJDBC.findAll() ){
            this.CampoFiltrarUsuario.addItem( u.getId() + " - " + u.getNome());
        }
    }
    
    private void preencheComboBoxTag(){
        for( Tag t : TagJDBC.findAll() ){
            this.CampoFiltrarTag.addItem( t.name() );
        }
    }
    
    private void selecionaFiltroAtivo(){
        Filtro f = origemTela.getFiltroAtivo();
        if( f != null ){
            
            String dataInicio = null;
            String dataFim = null;
            
            if( f.getDataInicio() != null ){
                dataInicio = f.getDataInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            }
            if( f.getDataFim() != null ){
                dataFim = f.getDataFim().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            }
            this.CampoFiltrarUsuario.setSelectedIndex( procuraIndexUsuario() );
            this.CampoFiltrarTag.setSelectedIndex( procuraIndexTag() );
            this.CampoFiltrarStatus.setSelectedIndex( procuraIndexStatus() );
            this.CampoFiltrarDataInicio.setText( dataInicio );
            this.CampoFiltrarDataFim.setText( dataFim );
        }
    }
    
    private Integer procuraIndexUsuario(){
        if( origemTela.getFiltroAtivo().getUsuario() == null ){
            return 0;
        }
        for( Integer i = 1; i < this.CampoFiltrarUsuario.getItemCount(); i++){
            String itemComboBox = this.CampoFiltrarUsuario.getItemAt( i );
            if( Integer.parseInt( itemComboBox.split(" -")[0] ) == origemTela.getFiltroAtivo().getUsuario().getId() ){
                return i;
            }
        }
        return 0;
    }
    
    private Integer procuraIndexTag(){
        if( origemTela.getFiltroAtivo().getTag() == null ){
            return 0;
        }
        for( Integer i = 1; i < this.CampoFiltrarTag.getItemCount(); i++){
            String itemComboBox = this.CampoFiltrarTag.getItemAt( i );
            if( itemComboBox.equals( origemTela.getFiltroAtivo().getTag().name() ) ){
                return i;
            }
        }
        return 0;
    }
    
    private Integer procuraIndexStatus(){
        if( origemTela.getFiltroAtivo().getStatus()== null ){
            return 0;
        }
        for( Integer i = 1; i < this.CampoFiltrarStatus.getItemCount(); i++){
            String itemComboBox = this.CampoFiltrarStatus.getItemAt( i );
            if( itemComboBox.toUpperCase().equals( origemTela.getFiltroAtivo().getStatus().name() ) ){
                return i;
            }
        }
        return 0;
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
        CampoFiltrarTag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum" }));

        StatusTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        StatusTexto.setText("Status");

        CampoFiltrarStatus.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        CampoFiltrarStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Andamento", "Finalizado" }));
        CampoFiltrarStatus.setToolTipText("");

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
                        .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FiltrarPorTexto)
                            .addGroup(PainelFiltragemLayout.createSequentialGroup()
                                .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DataInicioTexto)
                                    .addComponent(DataFimTexto)
                                    .addComponent(StatusTexto))
                                .addGap(12, 12, 12)
                                .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CampoFiltrarDataInicio)
                                    .addComponent(CampoFiltrarDataFim)
                                    .addComponent(CampoFiltrarStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(PainelFiltragemLayout.createSequentialGroup()
                                .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsuarioTexto)
                                    .addComponent(TagTexto))
                                .addGap(40, 40, 40)
                                .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoFiltrarTag, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CampoFiltrarUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataInicioTexto)
                    .addComponent(CampoFiltrarDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelFiltragemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
        Usuario usuario;
        Tag tag;
        Status status;
        LocalDate dataInicio = null;
        LocalDate dataFim = null;
        
        switch( this.CampoFiltrarUsuario.getSelectedIndex() ){
            case 0 -> usuario = null;
            default -> usuario = UsuarioJDBC.findById(Integer.valueOf( this.CampoFiltrarUsuario.getSelectedItem().toString().split(" -")[0] ) );
        }
        
        switch( this.CampoFiltrarTag.getSelectedIndex() ){
            case 0 -> tag = null;
            default -> tag = Tag.valueOf( this.CampoFiltrarTag.getSelectedItem().toString() );
        }
        
        switch( this.CampoFiltrarStatus.getSelectedIndex() ){
            case 1 -> status = Status.ANDAMENTO;
            case 2 -> status = Status.FINALIZADO;
            default -> status = null;
        }
        if( !this.CampoFiltrarDataInicio.getText().isBlank() ){
            dataInicio = LocalDate.parse( this.CampoFiltrarDataInicio.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy") );
        }
        if( !this.CampoFiltrarDataFim.getText().isBlank() ){
            dataFim = LocalDate.parse( this.CampoFiltrarDataFim.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }
        
        if( tag == null && status == null && dataInicio == null && dataFim == null && usuario == null){
            JOptionPane.showMessageDialog( this, "Selecione ao menos um campo para filtrar","Erro", JOptionPane.ERROR_MESSAGE );
        }else{
            origemTela.setFiltroAtivo( new Filtro( null, tag, status, dataInicio, dataFim, usuario) );
            origemTela.setFiltroAtivoLabel("Filtro: Ativo");
            origemTela.atulizaListaTeste( origemTela.getFiltroAtivo().filtrarTestes( TesteJDBC.findAll() ) );
            this.dispose();
        }
        
        
    }//GEN-LAST:event_BotaoFiltrarActionPerformed

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
        origemTela.setFiltroAtivo( null );
        origemTela.atulizaListaTeste( TesteJDBC.findAll() );
        origemTela.setFiltroAtivoLabel("Filtro: Inativo");
        this.dispose();
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
