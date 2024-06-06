/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Cargos;

import Modelo.Cargo;
import Modelo.Permissoes;

/**
 *
 * @author LS.NOT 105
 */
public class QA extends Cargo{

    public QA() {
        //definir permissoes do usuario via construtor
        super( 1, "QA", new Permissoes(true, true, true, true, true, true) );
    }
    
}
