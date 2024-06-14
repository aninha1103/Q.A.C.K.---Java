package Telas;

import JDBC.ComentarioJDBC;
import Modelo.Comentario;
import java.time.LocalDate;
import javax.swing.ImageIcon;

public class TelaComentar extends javax.swing.JFrame {

    private TelaPrincipal origem;
    private TelaVisualizarTeste telaVisualizar;
    private Integer idTeste;
    private Integer idComentario;
    
    public TelaComentar( TelaPrincipal origemTela, Integer idTeste, TelaVisualizarTeste telaVisualizar ) {
        initComponents();
        operacoesPadrao( origemTela, idTeste, telaVisualizar );
    }
    
    public TelaComentar( TelaPrincipal origemTela, Integer idTeste, Integer idComentario, TelaVisualizarTeste telaVisualizar, String comentario ) {
        initComponents();
        operacoesPadrao( origemTela, idTeste, telaVisualizar );
        this.idComentario = idComentario;
        this.Comentario.setText(comentario);
    }
    
    private void operacoesPadrao( TelaPrincipal origemTela, Integer idTeste, TelaVisualizarTeste telaVisualizar ){
        this.origem = origemTela;
        this.telaVisualizar = telaVisualizar;
        this.idTeste = idTeste;
        this.setIconImage( new ImageIcon( System.getProperty("user.dir") +"\\src\\Recursos\\Q.A.C.K.png").getImage() );
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        this.setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        TelaCadastroTeste = new javax.swing.JLabel();
        PainelComentario = new javax.swing.JPanel();
        ScrollComentario = new javax.swing.JScrollPane();
        Comentario = new javax.swing.JTextArea();
        BotaoCancelar = new javax.swing.JButton();
        BotaoSalvarComentario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comentário");

        PainelPrincipal.setBackground(new java.awt.Color(213, 213, 213));

        TelaCadastroTeste.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        TelaCadastroTeste.setForeground(new java.awt.Color(80, 0, 102));
        TelaCadastroTeste.setText("Comentário");

        PainelComentario.setBackground(new java.awt.Color(234, 234, 234));

        Comentario.setColumns(20);
        Comentario.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        Comentario.setRows(5);
        ScrollComentario.setViewportView(Comentario);

        BotaoCancelar.setBackground(new java.awt.Color(80, 0, 102));
        BotaoCancelar.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        BotaoCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        BotaoSalvarComentario.setBackground(new java.awt.Color(80, 0, 102));
        BotaoSalvarComentario.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        BotaoSalvarComentario.setForeground(new java.awt.Color(255, 255, 255));
        BotaoSalvarComentario.setText("Salvar");
        BotaoSalvarComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarComentarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelComentarioLayout = new javax.swing.GroupLayout(PainelComentario);
        PainelComentario.setLayout(PainelComentarioLayout);
        PainelComentarioLayout.setHorizontalGroup(
            PainelComentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelComentarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelComentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollComentario)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelComentarioLayout.createSequentialGroup()
                        .addGap(0, 268, Short.MAX_VALUE)
                        .addComponent(BotaoCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoSalvarComentario)))
                .addContainerGap())
        );
        PainelComentarioLayout.setVerticalGroup(
            PainelComentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelComentarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollComentario, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelComentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSalvarComentario)
                    .addComponent(BotaoCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelaCadastroTeste)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PainelComentario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelaCadastroTeste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelComentario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void BotaoSalvarComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarComentarioActionPerformed
        if( idComentario == null){
            ComentarioJDBC.create( new Comentario( idTeste, origem.getUsuario(),LocalDate.now(), this.Comentario.getText() ) );
        }else{
            ComentarioJDBC.update( new Comentario( idComentario, idTeste, origem.getUsuario(),LocalDate.now(), this.Comentario.getText() ) );
        }
        telaVisualizar.atualizaComentarios( ComentarioJDBC.findByIdTest( idTeste ) );
        this.dispose();
    }//GEN-LAST:event_BotaoSalvarComentarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoSalvarComentario;
    private javax.swing.JTextArea Comentario;
    private javax.swing.JPanel PainelComentario;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JScrollPane ScrollComentario;
    private javax.swing.JLabel TelaCadastroTeste;
    // End of variables declaration//GEN-END:variables
}
