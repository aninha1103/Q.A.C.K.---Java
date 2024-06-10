package Testes;

import JDBC.ComentarioJDBC;
import JDBC.UsuarioJDBC;
import Modelo.Comentario;
import java.time.LocalDate;

    public class ScriptBanco{
      public static void main(String[] args){
          ComentarioJDBC.delete(new Comentario( 1, 5, UsuarioJDBC.findById( 2), LocalDate.now(), "edicao" ) );
      }
    }