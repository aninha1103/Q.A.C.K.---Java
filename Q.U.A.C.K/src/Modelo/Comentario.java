package Modelo;

import java.time.LocalDate;

public class Comentario {
    private int id;
    private Usuario usuario;
    private LocalDate data;
    private String textoComentario;
    private Boolean editado;

    //variavel auxiliar para substituir autoincrement do banco de dados
    private static int idComentario = 0;
    //fim auxiliar
    
    public Comentario() {
    }

    public Comentario( Usuario usuario, LocalDate data, String textoComentario ) {
        this.id = idComentario++;
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
    
    @Override
    public String toString() {
        return "Usuario: " + usuario.getNome() + "\nData: " + data + "\nComentario: " + textoComentario + "\nEditado: " + editado;
    }
    
}
