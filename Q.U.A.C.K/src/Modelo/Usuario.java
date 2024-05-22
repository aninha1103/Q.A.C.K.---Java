
package Modelo;

public class Usuario {
    /*Atributos*/
    private int id;
    private String senha;
    private String Nome;
    private String Login;
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

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", senha=" + senha + ", Nome=" + Nome + ", Login=" + Login + '}';
    }

    public Usuario(int id, String senha, String Nome, String Login) {
        this.id = id;
        this.senha = senha;
        this.Nome = Nome;
        this.Login = Login;
    }

}
