
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
    
   public Usuario( String nome, String login, String senha, Cargo cargo) {
        this.id = null;
        construtorPadrao( nome, login, senha, cargo );
    }

    public Usuario(int id, String nome, String login, String senha, Cargo cargo) {
        this.id = id;
        construtorPadrao( nome, login, senha, cargo );
    }
    
    private void construtorPadrao( String nome, String login, String senha, Cargo cargo ){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
    }
    
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

    public static Cargo cargoPorId( Integer idCargo ){
        Cargo cargo = null;
        switch ( idCargo ){
            case 1 -> cargo = new QA();
            case 2 -> cargo = new Techlead();
            case 3 -> cargo = new Dev();
        }
        return cargo;
    }
}
