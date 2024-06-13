package Modelo;

import java.time.LocalDate;

public class Teste implements Comparable<Teste>{
    private Integer id;
    private String nome;
    private LocalDate data;
    private String descricao;
    private Anexo imagem;
    private Usuario criadoPor;
    private Tag tag;
    private Status status;
    
    public Teste() {
    }

    public Teste( String nome, LocalDate data, String descricao, Anexo imagem, Usuario criadoPor, Tag tag, Status status ) {
        this.id = null;
        construtorPadrao( nome, data, descricao, imagem, criadoPor, tag, status);
    }
    
    public Teste( Integer id, String nome, LocalDate data, String descricao, Anexo imagem, Usuario criadoPor, Tag tag, Status status ) {
        this.id = id;
        construtorPadrao( nome, data, descricao, imagem, criadoPor, tag, status);
    }    

    private void construtorPadrao( String nome, LocalDate data, String descricao, Anexo imagem, Usuario criadoPor, Tag tag, Status status ){
        this.nome = nome;
        this.data = data;
        this.descricao = descricao;
        this.imagem = imagem;
        this.criadoPor = criadoPor;
        this.tag = tag;
        this.status = status;
    }
    
    public Integer getId() {
        return id;
    }
    
    public Usuario getCriadoPor() {
        return criadoPor;
    }
    
    public LocalDate getData() {
        return data;
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

    public Anexo getAnexo() {
        return imagem;
    }

    public void setAnexo(Anexo imagem) {
        this.imagem = imagem;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return id + "  " + nome + "           " + data ;
    }

    @Override
    public int compareTo(Teste other) {
        return id.compareTo( other.getId() );
    }
}
