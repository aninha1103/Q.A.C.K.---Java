package Modelo.Cargos;

import Modelo.Cargo;
import Modelo.Permissoes;

public class Techlead extends Cargo {

    public Techlead() {
        //definir permissoes do usuario via construtor
        super( 2, "TechLead", new Permissoes(true, true, true, true, true, true) );
    }
    
    
}
