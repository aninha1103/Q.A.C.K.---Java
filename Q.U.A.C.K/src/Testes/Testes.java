
package Testes;
import Modelo.Cargo;
import Modelo.Permissoes;
import Modelo.Usuario;

public class Testes {
    public static void main(String[] args) {
        
        Cargo c1 = new Cargo(1);
        
        Permissoes p1 = new Permissoes(true, false, false, true, false);
        
        Usuario u1 = new Usuario(1,  "123",  "Joao", "jao", c1, p1);
        
        System.out.println(u1);
    }
}
