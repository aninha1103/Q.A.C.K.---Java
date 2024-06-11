package Modelo.Cargos;

import Modelo.Cargo;
import Modelo.Permissoes;

public class QA extends Cargo{

    public QA() {
        //definir permissoes do usuario via construtor
        super( 1, "QA", new Permissoes(true, true, true, true, true, true) );
    }
    
}
