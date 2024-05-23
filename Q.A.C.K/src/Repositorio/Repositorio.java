package Repositorio;

import Modelo.Teste;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    List<Teste> teste;
    List<Usuario> usuarios;

    public Repositorio() {
        this.teste = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public List<Teste> getTeste() {
        return teste;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    //adicionar, alterar, excluir usuario e testes
    //filtrar teste
    
    
}
