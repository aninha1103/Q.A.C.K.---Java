package Modelo;

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
            testesFiltrado = testesFiltrado.stream().filter( x -> x.getNome().substring(0, ( x.getNome().length() < lenght) ? x.getNome().length() : lenght ).equalsIgnoreCase(
                             this.getNome() ) )
                             .collect(Collectors.toList());
        }
        
        if( this.getUsuario() != null ){
            testesFiltrado = testesFiltrado.stream().filter( x -> x.getCriadoPor().getId() == this.getUsuario().getId()).collect(Collectors.toList());
            if( testesFiltrado.isEmpty()){
                return testesFiltrado;
            }
        }

        if( this.getTag() != null ){
            testesFiltrado = testesFiltrado.stream().filter( x -> x.getTag() == this.getTag() ).collect(Collectors.toList());
            if( testesFiltrado.isEmpty()){
                return testesFiltrado;
            }
        }
        
        if( this.getStatus() != null ){
            testesFiltrado = testesFiltrado.stream().filter( x -> x.getStatus()== this.getStatus() ).collect(Collectors.toList());
            if( testesFiltrado.isEmpty()){
                return testesFiltrado;
            }
        }
        
        if( this.getDataInicio() != null){
            testesFiltrado = testesFiltrado.stream().filter( x -> x.getData().isAfter( getDataInicio().plus( -1, ChronoUnit.DAYS ) ) ).collect(Collectors.toList());
            if( testesFiltrado.isEmpty()){
                return testesFiltrado;
            }
        }
        if( this.getDataFim()!= null){
            testesFiltrado = testesFiltrado.stream().filter( x -> x.getData().isBefore( getDataFim().plus( +1, ChronoUnit.DAYS) ) ).collect(Collectors.toList());
        }
        
        return testesFiltrado;
        
    }
}
