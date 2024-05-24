package Modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Filtro {
    private String nome;
    private Tag tag;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Filtro(String nome, Tag tag, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.tag = tag;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getNome() {
        return nome;
    }

    public Tag getTag() {
        return tag;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }
    
    public List<Teste> filtrarTeste( List<Teste> teste ){
        List<Teste> testesFiltrado = teste;
        
        if( this.getNome() != null ){
            int lenght = getNome().length();
            testesFiltrado = teste.stream().filter( x -> x.getNome().substring(0, (x.getNome().length() < lenght) ? x.getNome().length() : lenght ).equalsIgnoreCase(
                             this.getNome().substring(0, lenght ) ) )
                             .collect(Collectors.toList());
        }
        if( this.getTag() != null ){
            testesFiltrado = testesFiltrado.stream().filter( x -> x.getTag() == this.getTag() ).collect(Collectors.toList());
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
