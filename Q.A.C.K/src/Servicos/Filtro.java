package Servicos;

import Modelo.Status;
import Modelo.Tag;
import Modelo.Teste;
import Modelo.Usuario;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

public class Filtro {
    private String nome;
    private Tag tag;
    private Status status;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Usuario usuario;

    public Filtro(String nome, Tag tag, Status status, LocalDate dataInicio, LocalDate dataFim, Usuario usuario) {
        this.nome = nome;
        this.tag = tag;
        this.status = status;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.usuario = usuario;
    }
    
    public String getNome() {
        return nome;
    }

    public Tag getTag() {
        return tag;
    }

    public Status getStatus() {
        return status;
    }
    
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public List<Teste> filtrarTestes( List<Teste> testes ){
        List<Teste> testesFiltrado = testes;
        if( this.getNome() != null ){
            int lenght = this.getNome().length();
            testesFiltrado.removeIf( t -> !t.getNome().substring( 0, ( t.getNome().length() < lenght) ? t.getNome().length() : lenght ).equalsIgnoreCase(this.getNome() ) );
            if( testesFiltrado.isEmpty()){
                return testesFiltrado;
            }
        }
        
        if( this.getUsuario() != null ){
            testesFiltrado.removeIf( t -> t.getCriadoPor().getId() != this.getUsuario().getId() );
            if( testesFiltrado.isEmpty()){
                return testesFiltrado;
            }
        }

        if( this.getTag() != null ){
            testesFiltrado.removeIf( t -> t.getTag() != this.getTag() );
            if( testesFiltrado.isEmpty()){
                return testesFiltrado;
            }
        }
        
        if( this.getStatus() != null ){
            testesFiltrado.removeIf( t -> t.getStatus() != this.getStatus() );
            if( testesFiltrado.isEmpty()){
                return testesFiltrado;
            }
        }
        
        if( this.getDataInicio() != null){
            testesFiltrado.removeIf( t -> !t.getData().isAfter( this.getDataInicio().plus( -1, ChronoUnit.DAYS ) ) );
            if( testesFiltrado.isEmpty()){
                return testesFiltrado;
            }
        }
        if( this.getDataFim()!= null){
            testesFiltrado.removeIf( t -> !t.getData().isBefore( this.getDataFim().plus( +1, ChronoUnit.DAYS) ) );
        }
        
        return testesFiltrado;
        
    }
}
