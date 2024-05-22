
package Modelo;


public class Cargo {
    
    /*Atributos*/
    private int id;
    /*Fim Atributos*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cargo(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cargo{" + "id=" + id + '}';
    }
    
    
}
