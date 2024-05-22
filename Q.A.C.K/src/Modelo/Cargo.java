
package Modelo;


public class Cargo {
    
    /*Atributos*/
    private int id;
    private Permissoes permissoes;
    
    /*Fim Atributos*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Cargo(int id, Permissoes permissoes) {
        this.id = id;
        this.permissoes = permissoes;
    }

}
