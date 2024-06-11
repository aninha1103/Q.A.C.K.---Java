package Modelo.Cargos;

import Modelo.Cargo;
import Modelo.Permissoes;

public class Dev extends Cargo {

    public Dev() {
        //definir permissoes do usuario via construtor
        super( 3, "Dev", new Permissoes(true, true, true, true, true, true) );
    }
    
    
}
