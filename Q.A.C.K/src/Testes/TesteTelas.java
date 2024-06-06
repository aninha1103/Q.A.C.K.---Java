package Testes;

import Modelo.Cargos.Dev;
import Modelo.Usuario;
import Telas.telaCadastroTeste;
import Telas.telaCadastroUsuario;
import Telas.TelaListagemUsuarios;
import Telas.TelaPrincipal;

public class TesteTelas {
    public static void main(String[] args) {
        Usuario u = new Usuario("teste exlcusao", "1", "2", new Dev() );
        TelaPrincipal t = new TelaPrincipal( u );
        t.setVisible(true);
    }
}
