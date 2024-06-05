package Testes;

import JDBC.UsuarioJDBC;
import Modelo.Cargos.Techlead;
import Modelo.Usuario;

    public class ScriptBanco
    {
      public static void main(String[] args)
      {
        UsuarioJDBC.findAll();
      }
    }