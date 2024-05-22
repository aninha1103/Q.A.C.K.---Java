package Modelo;

import java.time.LocalDate;

public class Comentario {
    private Usuario usuario;
    private LocalDate data;
    private String textoComentario;
    private Boolean editado;

    public Comentario() {
    }

    public Comentario(Usuario usuario, LocalDate data, String textoComentario ) {
        this.usuario = usuario;
        this.data = data;
        this.textoComentario = textoComentario;
        this.editado = false;
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

    @Override
    public String toString() {
        return "Usuario: " + usuario + "\nData: " + data + "\nComentario: " + textoComentario + "\nEditado: " + editado;
    }
    
}
