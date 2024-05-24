/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Cargos;

import Modelo.Cargo;
import Modelo.Permissoes;

/**
 *
 * @author Ingadev
 */
public class Dev extends Cargo {

    public Dev( Permissoes permissoes) {
        //definir permissoes do usuario via construtor
        super( 1, new Permissoes(true, true, true, true, true, true) );
    }
    
    
}
