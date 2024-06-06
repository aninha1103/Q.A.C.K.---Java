package Testes;

import JDBC.AnexoJDBC;
import JDBC.TagJDBC;
import JDBC.TesteJDBC;
import JDBC.UsuarioJDBC;
import Modelo.Anexo;
import Modelo.Cargos.Techlead;
import Modelo.Status;
import Modelo.Tag;
import Modelo.Teste;
import Modelo.Usuario;
import java.time.LocalDate;

    public class ScriptBanco
    {
      public static void main(String[] args){
//        Anexo anexo = new Anexo(1, "");
//        AnexoJDBC.create(anexo);
//        TagJDBC.create(Tag.BUG);
        Anexo a = AnexoJDBC.findById(1);
//        Teste t = new Teste(1,"Teste",LocalDate.now(),"edicao teste", a,UsuarioJDBC.findById(2),Tag.BUG,Status.ANDAMENTO);;
//        TesteJDBC.create(t);
      }
    }