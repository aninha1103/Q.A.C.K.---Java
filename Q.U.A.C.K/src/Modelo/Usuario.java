
package Modelo;

public class Usuario {
    /*Atributos*/
    private int id;
    private String senha;
    private String Nome;
    private String Login;
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
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "-- Usuario criado -- \nid: " + id + "\nsenha: " + senha+ "\nNome: " + Nome+ "\nLogin: " + Login+ "\ncargo: " + cargo+ "\n-- FIM --";
    }

    public Usuario(int id, String senha, String Nome, String Login, Cargo cargo) {
        this.id = id;
        this.senha = senha;
        this.Nome = Nome;
        this.Login = Login;
        this.cargo = cargo;
    }

}
