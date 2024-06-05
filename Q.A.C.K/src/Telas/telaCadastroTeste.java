package Telas;

import Modelo.Anexo;
import Modelo.Status;
import Modelo.Tag;
import Modelo.Teste;
import Modelo.Usuario;
import Repositorio.Repositorio;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class telaCadastroTeste extends javax.swing.JFrame {

    private Repositorio rep;
    private TelaPrincipal origem;
    private Integer idTeste;
    private Anexo imagemTeste;
    private LocalDate data;
    
    public telaCadastroTeste( Repositorio rep, TelaPrincipal origem ) {
        initComponents();
        operacoesPadrao( rep, origem );  
        this.TelaCadastroTeste.setText("Cadastro de Teste");
    }
    
    public telaCadastroTeste( Repositorio rep, TelaPrincipal origem, Teste testeEditar ) {
        initComponents();
        operacoesPadrao( rep, origem );   
        this.TelaCadastroTeste.setText("Edição de Teste");
        this.idTeste = testeEditar.getId();
        this.campoTitulo.setText(testeEditar.getNome());
        this.campoDescricao.setText(testeEditar.getDescricao());
        this.campoSituacao.setSelectedIndex( getStatusIndice( testeEditar ) );
        this.campoTag.setSelectedIndex( getTagIndice( testeEditar ) );
        imagemTeste = testeEditar.getImagem();
        data = testeEditar.getData();
    }

    public final void operacoesPadrao( Repositorio rep, TelaPrincipal origem ){
        this.rep = rep;
        this.origem = origem;
        campoNomeArquivo.setText(" ");
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        this.setLocationRelativeTo(null);   
    }
    
    private Integer getStatusIndice( Teste t ){
        Integer indice = 0;
        switch( t.getStatus()){
            case Status.FINALIZADO -> indice = 1;
        }
        return indice;
    }
    
    private Integer getTagIndice( Teste t ){
        Integer indice = 0;
        switch( t.getTag()){
            case Tag.MELHORIA -> indice = 1;
            case Tag.BUG -> indice = 2; 
        }
        return indice;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TelaCadastroTeste = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TituloTexto = new javax.swing.JLabel();
        DescricaoTexto = new javax.swing.JLabel();
        AnexosTexto = new javax.swing.JLabel();
        TagsTexto = new javax.swing.JLabel();
        SituacaoTexto = new javax.swing.JLabel();
        CategoriaTexto = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        ScrollAreaDescricao = new javax.swing.JScrollPane();
        campoDescricao = new javax.swing.JTextArea();
        campoSituacao = new javax.swing.JComboBox<>();
        campoTag = new javax.swing.JComboBox<>();
        botaoSelecionarAnexo = new javax.swing.JButton();
        campoNomeArquivo = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Teste");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(213, 213, 213));

        TelaCadastroTeste.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        TelaCadastroTeste.setForeground(new java.awt.Color(80, 0, 102));
        TelaCadastroTeste.setText("Cadastro de Teste");

        jPanel2.setBackground(new java.awt.Color(234, 234, 234));
        jPanel2.setMinimumSize(new java.awt.Dimension(5, 5));

        TituloTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        TituloTexto.setText("Título:");

        DescricaoTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        DescricaoTexto.setText("Descrição:");

        AnexosTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        AnexosTexto.setText("Anexos:");

        TagsTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        TagsTexto.setText("Tags:");

        SituacaoTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        SituacaoTexto.setText("Situação");

        CategoriaTexto.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        CategoriaTexto.setText("Categoria");

        campoTitulo.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N

        campoDescricao.setColumns(20);
        campoDescricao.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        campoDescricao.setRows(5);
        ScrollAreaDescricao.setViewportView(campoDescricao);

        campoSituacao.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        campoSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andamento", "Finalizado" }));

        campoTag.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        campoTag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Retrabalho", "Melhoria", "Bug" }));

        botaoSelecionarAnexo.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        botaoSelecionarAnexo.setIcon(new javax.swing.ImageIcon( "src\\Recursos\\anexo.png" ));
        botaoSelecionarAnexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSelecionarAnexoActionPerformed(evt);
            }
        });

        campoNomeArquivo.setEditable(false);
        campoNomeArquivo.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N

        botaoSalvar.setBackground(new java.awt.Color(80, 0, 102));
        botaoSalvar.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoSalvar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DescricaoTexto)
                            .addComponent(TituloTexto)
                            .addComponent(AnexosTexto)
                            .addComponent(TagsTexto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(botaoSelecionarAnexo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoNomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SituacaoTexto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(CategoriaTexto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTag, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ScrollAreaDescricao))))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TituloTexto)
                    .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescricaoTexto)
                    .addComponent(ScrollAreaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TagsTexto)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SituacaoTexto)
                            .addComponent(campoSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoriaTexto))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(campoNomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSelecionarAnexo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnexosTexto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoSalvar)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelaCadastroTeste)
                .addContainerGap(362, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelaCadastroTeste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSelecionarAnexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelecionarAnexoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Selecionar imagem");
        chooser.setFileFilter(new FileNameExtensionFilter("Arquivos de imagens(*.PNG,*.JPEG,*.JPG)","png","jpeg","jpg") );
        int resultado = chooser.showOpenDialog(this);
        if( resultado == JFileChooser.APPROVE_OPTION ){
            File f = chooser.getSelectedFile();
            String fileName = f.getAbsolutePath();
            campoNomeArquivo.setText(fileName);
        }    
    }//GEN-LAST:event_botaoSelecionarAnexoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        String nome = this.campoTitulo.getText();
        String descricao = this.campoDescricao.getText();
        String caminhoImagem = ( this.campoNomeArquivo.getText().trim().equals(" ") ) ? this.campoNomeArquivo.getText() : System.getProperty("user.dir") + "\\src\\Recursos\\camera.png";
        Usuario criandoTeste = rep.getUsuarioAtual();
        Tag tag = Tag.valueOf( this.campoTag.getSelectedItem().toString().toUpperCase() );
        Status status = Status.valueOf( this.campoSituacao.getSelectedItem().toString().toUpperCase() );
        Anexo anexo = new Anexo( caminhoImagem );
        
        if( this.idTeste == null){

            //Image foto = ImageIO.read( new File( caminhoImagem )).getScaledInstance( 200, 200, Image.SCALE_SMOOTH);

            //TesteJDBC.insert( t ) ;
            rep.adicionarTeste( new Teste( nome, LocalDate.now(), descricao, anexo, criandoTeste, tag, status) );

            //Houve um erro ao salvar teste

        }else{
            Integer posicaoTeste = 0;
            for( int i = 0; i < rep.getUsuarios().size(); i++ ){
                if( rep.getTestes().get( i ).getId() == this.idTeste ){
                    posicaoTeste = i;
                    break;
                }
            }
            //Teste.JDBC.update( t );
            rep.editarTeste( new Teste( this.idTeste, nome, data, descricao, this.imagemTeste, criandoTeste, tag, status), posicaoTeste );
        }
        
        origem.atulizaListaTeste( rep.getTestes() );
        this.dispose();
             
    }//GEN-LAST:event_botaoSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnexosTexto;
    private javax.swing.JLabel CategoriaTexto;
    private javax.swing.JLabel DescricaoTexto;
    private javax.swing.JScrollPane ScrollAreaDescricao;
    private javax.swing.JLabel SituacaoTexto;
    private javax.swing.JLabel TagsTexto;
    private javax.swing.JLabel TelaCadastroTeste;
    private javax.swing.JLabel TituloTexto;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoSelecionarAnexo;
    private javax.swing.JTextArea campoDescricao;
    private javax.swing.JTextField campoNomeArquivo;
    private javax.swing.JComboBox<String> campoSituacao;
    private javax.swing.JComboBox<String> campoTag;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
