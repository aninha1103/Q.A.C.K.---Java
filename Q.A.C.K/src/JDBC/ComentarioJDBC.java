package JDBC;

import Modelo.Comentario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ComentarioJDBC {
    public static void create( Comentario c ){
                
        StringBuilder insertQuery = new StringBuilder();
        insertQuery.append("INSERT INTO Comentario( textComent, data_comentario, id_teste, id_usuario, is_edited) VALUES(");
        insertQuery.append( "'" ).append( c.getTextoComentario()  ).append( "', ");
        insertQuery.append( "'" ).append( c.getData() ).append( "', ");
        insertQuery.append( c.getId_Teste() ).append( ", ");
        insertQuery.append( c.getUsuario().getId() ).append( " ");
        insertQuery.append( "FALSE" ).append( "); ");
        
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
    
    public static void update( Comentario c){
        StringBuilder updateQuery = new StringBuilder();
        updateQuery.append("UPDATE Comentario SET ");
        updateQuery.append( "textComent = '"     ).append( c.getTextoComentario() ) .append( "', ");
        updateQuery.append( " WHERE id = " ).append( c.getId() ).append( ";" );
        
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
    
    public static void delete( Comentario c){
        StringBuilder deleteQuery = new StringBuilder();
            deleteQuery.append( "DELETE FROM Comentario WHERE id = " ).append( c.getId() );

            try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
              Statement statement = connection.createStatement() ) 
            {
                statement.executeUpdate(deleteQuery.toString());
                statement.close();
            } catch (SQLException ex) {
                System.out.println( ex.getMessage() );
                Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
