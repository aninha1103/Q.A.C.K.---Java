package Testes;

import Modelo.Cargos.Dev;
import Modelo.Usuario;
import Telas.telaCadastroTeste;
import Telas.telaCadastroUsuario;
import Telas.TelaListagemUsuarios;
import Telas.TelaLogin;
import Telas.TelaPrincipal;

public class TesteTelas {
    public static void main(String[] args) {
        Usuario u = new Usuario(2, "teste exlcusao", "1", "2", new Dev() );
        TelaLogin t = new TelaLogin();
        t.setVisible(true);
    }
}
