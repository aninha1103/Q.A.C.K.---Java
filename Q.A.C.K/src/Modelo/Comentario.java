package Modelo;

import java.time.LocalDate;

public class Comentario {
    private Integer id;
    private int id_Teste;
    private Usuario usuario;
    private LocalDate data;
    private String textoComentario;
    private Boolean editado;
    
    public Comentario() {
    }

    public Comentario( int id_Teste, Usuario usuario, LocalDate data, String textoComentario ) {
        this.id = null;
        this.id_Teste = id_Teste;
        this.usuario = usuario;
        this.data = data;
        this.textoComentario = textoComentario;
        this.editado = false;
    }
    
    public Comentario( int id, int id_Teste, Usuario usuario, LocalDate data, String textoComentario ) {
        this.id = id;
        this.id_Teste = id_Teste;
        this.usuario = usuario;
        this.data = data;
        this.textoComentario = textoComentario;
        this.editado = false;
    }

    public int getId() {
        return id;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getData() {
        return data;
    }

    public String getTextoComentario() {
        return textoComentario;
    }

    public void setTextoComentario(String textoComentario) {
        this.textoComentario = textoComentario;
    }

    public Boolean getEditado() {
        return editado;
    }

    public void setEditado(Boolean editado) {
        this.editado = editado;
    }

    public boolean permiteAlteracao( Usuario usuarioAtual ){
        return usuarioAtual == usuario;
    }

    public int getId_Teste() {
        return id_Teste;
    }

    public void setId_Teste(int id_Teste) {
        this.id_Teste = id_Teste;
    }
    
    @Override
    public String toString() {
        return "Usuario: " + usuario.getNome() + "\nData: " + data + "\nComentario: " + textoComentario + "\nEditado: " + editado;
    }
    
}
