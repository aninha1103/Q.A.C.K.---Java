
package Modelo;

import Modelo.Cargos.Dev;
import Modelo.Cargos.QA;
import Modelo.Cargos.Techlead;

public class Usuario {
    /*Atributos*/
    private Integer id;
    private String nome;
    private String login;
    private String senha;
    private Cargo cargo;
    /*Fim Atributos*/
    
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "-- Usuario criado -- \nid: " + id + "\nsenha: " + senha+ "\nnome: " + nome+ "\nlogin: " + login+ "\nCargo: " + cargo.getId() + "\n-- FIM --";
    }

    public Usuario( String nome, String login, String senha, Cargo cargo) {
        this.id = null;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
    }

    public Usuario(int id, String nome, String login, String senha, Cargo cargo) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
    }
    
    public Usuario login(String login, String senha){
        if( !(this.login.equals( login ) && this.senha.equals( senha ) ) ){
            //erro login ou senha invalida
            return null;
        }
        return this;
    }
    
    public static Cargo cargoPorId( Integer idCargo ){
        Cargo cargo = null;
        switch (idCargo){
            case 1 -> cargo = new QA();
            case 2 -> cargo = new Techlead();
            case 3 -> cargo = new Dev();
        }
        return cargo;
    }
    
    public String getNomeCargo(){
        String nomeCargo = "";
        switch( this.getCargo().getId() ){
            case 1 -> nomeCargo = "TechLead";
            case 2 -> nomeCargo = "QA";
            case 3 -> nomeCargo = "Dev";
        }
        return nomeCargo;
    }

}
