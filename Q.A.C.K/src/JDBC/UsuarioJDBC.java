package JDBC;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UsuarioJDBC {

    public UsuarioJDBC() {
    }
    
    public static void create( Usuario u ){
        
        StringBuilder insertQuery = new StringBuilder();
        insertQuery.append("INSERT INTO Usuario( nome, usuario, senha, id_cargo) VALUES(");
        insertQuery.append( "'" ).append( u.getNome()  ).append( "', ");
        insertQuery.append( "'" ).append( u.getLogin() ).append( "', ");
        insertQuery.append( "'" ).append( u.getSenha() ).append( "', ");
        insertQuery.append( u.getCargo().getId() ).append( "); ");
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
          Statement statement = connection.createStatement();)
        {
            statement.executeUpdate(insertQuery.toString());
            statement.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage() );
            Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void update( Usuario u ) {
        StringBuilder updateQuery = new StringBuilder();
        updateQuery.append("UPDATE Usuario SET ");
        updateQuery.append( "nome = '"     ).append( u.getNome() ) .append( "', ");
        updateQuery.append( "usuario = '"  ).append( u.getLogin() ).append( "', ");
        updateQuery.append( "senha = '"    ).append( u.getSenha() ).append( "', ");
        updateQuery.append( "id_cargo = "  ).append( u.getCargo().getId() );
        updateQuery.append( " WHERE id = " ).append( u.getId() ).append( ";" );
        
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
          Statement statement = connection.createStatement();)
        {
            statement.executeUpdate(updateQuery.toString());
            statement.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage() );
            Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void delete( Usuario u ){
        StringBuilder deleteQuery = new StringBuilder();
        deleteQuery.append( "DELETE FROM Usuario WHERE id = " ).append( u.getId() );
        
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
          Statement statement = connection.createStatement();)
        {
            statement.executeUpdate(deleteQuery.toString());
            statement.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage() );
            Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List<Usuario> findAll(){
        StringBuilder selectQuery = new StringBuilder();
        selectQuery.append( "SELECT * FROM Usuario" );
        
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
          Statement statement = connection.createStatement();)
        {
            ResultSet rs = statement.executeQuery(selectQuery.toString());
            List<Usuario> usuarios = new ArrayList();
            while(rs.next()){
                usuarios.add( new Usuario( rs.getInt("id"),
                                           rs.getString("nome"),
                                           rs.getString("usuario"),
                                           rs.getString("senha"),
                                           Usuario.cargoPorId( rs.getInt("id_cargo") ) ) );
            }
            
            statement.close();
            if( !usuarios.isEmpty() ){
                return usuarios;
            }
        } catch (SQLException ex) {
            System.out.println( ex.getMessage() );
            Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        //erro: nao ha usuarios cadastrados
        return null;
    }
}
/*
    public class ScriptBanco
    {
      public static void main(String[] args)
      {
        // NOTE: Connection and Statement are AutoCloseable.
        //       Don't forget to close them both in order to avoid leaks.
        try
        (
          // create a database connection
          Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
          Statement statement = connection.createStatement();
        )
        {
          statement.setQueryTimeout(30);  // set timeout to 30 sec.

          statement.executeUpdate("drop table if exists person");
          statement.executeUpdate("create table person (id integer, name string)");
          statement.executeUpdate("insert into person values(1, 'leo')");
          statement.executeUpdate("insert into person values(2, 'yui')");
          ResultSet rs = statement.executeQuery("select * from cargo");
          while(rs.next())
          {
            // read the result set
            System.out.println("name = " + rs.getString("name"));
            System.out.println("id = " + rs.getInt("id"));
          }
        }
        catch(SQLException e)
        {
          // if the error message is "out of memory",
          // it probably means no database file is found
          e.printStackTrace(System.err);
        }
      }
    }
*/