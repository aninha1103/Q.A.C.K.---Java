package Modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Filtro {
    private String nome;
    private Tag tag;
    private Status situacao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Usuario usuario;

    public Filtro(String nome, Tag tag, Status situacao, LocalDate dataInicio, LocalDate dataFim, Usuario usuario) {
        this.nome = nome;
        this.tag = tag;
        this.situacao = situacao;
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

    public Status getSituacao() {
        return situacao;
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
    
    public List<Teste> filtrarTeste( List<Teste> teste ){
        List<Teste> testesFiltrado = teste;
        
        if( this.getNome() != null ){
            int lenght = getNome().length();
            testesFiltrado = teste.stream().filter( x -> x.getNome().substring(0, ( x.getNome().length() < lenght) ? x.getNome().length() : lenght ).equalsIgnoreCase(
                             this.getNome() ) )
                             .collect(Collectors.toList());
        }
        
        if( this.getUsuario() != null ){
            testesFiltrado = testesFiltrado.stream().filter( x -> x.getCriadoPor() == this.getUsuario() ).collect(Collectors.toList());
        }
        
        if( this.getTag() != null ){
            testesFiltrado = testesFiltrado.stream().filter( x -> x.getTag() == this.getTag() ).collect(Collectors.toList());
        }
        
        if( this.getSituacao() != null ){
            testesFiltrado = testesFiltrado.stream().filter( x -> x.getSituacao()== this.getSituacao() ).collect(Collectors.toList());
        }
        
        if( this.getDataInicio() != null){
            testesFiltrado = testesFiltrado.stream().filter( x -> x.getData().isAfter( getDataInicio() ) ).collect(Collectors.toList());
        }
        if( this.getDataFim()!= null){
            testesFiltrado = testesFiltrado.stream().filter( x -> x.getData().isBefore( getDataFim() ) ).collect(Collectors.toList());
        }
        
        return testesFiltrado;
        
    }
}
