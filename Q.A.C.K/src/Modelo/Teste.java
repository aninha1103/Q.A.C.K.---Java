package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageReader;

public class Teste {
    private int id;
    private String nome;
    private LocalDate data;
    private String descricao;
    private ImageReader imagem;
    private Usuario criadoPor;
    private Tag tag;
    private List<Comentario> comentarios;
    
    public Teste() {
    }

    public Teste(int id, String nome, LocalDate data, String descricao, ImageReader imagem, Usuario criadoPor, Tag tag) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.descricao = descricao;
        this.imagem = imagem;
        this.criadoPor = criadoPor;
        this.tag = tag;
        this.comentarios = new ArrayList<>();
    }

    public void criarComentario( Usuario usuarioAtual, String comentarioTexto ){
        Comentario c = new Comentario( usuarioAtual, LocalDate.now(), comentarioTexto);
        comentarios.add( c );
    }
    
    public void excluirComentario( Usuario usuarioAtual, Comentario comentario){
        if( !comentario.permiteAlteracao( usuarioAtual ) ){
            //erro: usuario nao tem permissao de excluir comentario selecionado
            return;
        }
        comentarios.remove( comentario );
    }
    
    public void editarCometario( Usuario usuarioAtual, Comentario comentario, String novoTexto ){
        if( !comentario.permiteAlteracao( usuarioAtual ) ){
            //erro: usuario nao tem permissao de alterar comentario selecionado
            return;
        }
        comentario.setTextoComentario( novoTexto );
        comentario.setEditado( Boolean.TRUE );
    }
    
    public int getId() {
        return id;
    }
    
    public Usuario getCriadoPor() {
        return criadoPor;
    }
    
    public LocalDate getData() {
        return data;
    }
    
    public List<Comentario> getComentarios(){
        return comentarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ImageReader getImagem() {
        return imagem;
    }

    public void setImagem(ImageReader imagem) {
        this.imagem = imagem;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
    
}
