
package Modelo;

public class Usuario {
    /*Atributos*/
    private int id;
    private String nome;
    private String login;
    private String senha;
    private Cargo cargo;
    /*Fim Atributos*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return "-- Usuario criado -- \nid: " + id + "\nsenha: " + senha+ "\nnome: " + nome+ "\nlogin: " + login+ "\n-- Cargo--\n" + cargo+ "\n-- FIM --";
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

}
