package Testes;

import Modelo.Cargos.Dev;
import Modelo.Usuario;
import Repositorio.Repositorio;
import Telas.telaCadastroUsuario;

public class TesteTelas {
    public static void main(String[] args) {
        Repositorio rep = new Repositorio();
        Usuario u = new Usuario("teste exlcusao", "1", "2", new Dev() );
        rep.setUsuarioAtual( rep.getUsuarios().getFirst() );
        rep.adicionarUsuario( u );
        telaCadastroUsuario t = new telaCadastroUsuario( rep, u );
        t.setVisible(true);
    }
}
