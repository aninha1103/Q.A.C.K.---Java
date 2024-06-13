package Modelo;

public class Cargo {

    private int id;
    private String nome;
    private Permissoes permissoes;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Permissoes getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(Permissoes permissoes) {
        this.permissoes = permissoes;
    }

    @Override
    public String toString() {
        return "id: " + id + "\nPermissoes: " + permissoes;
    }

    public Cargo(int id, String nome, Permissoes permissoes) {
        this.id = id;
        this.nome = nome;
        this.permissoes = permissoes;
    }
}
