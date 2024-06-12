package JDBC;

import Modelo.Comentario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ComentarioJDBC {
    public static void create( Comentario c ){
                
        StringBuilder insertQuery = new StringBuilder();
        insertQuery.append("INSERT INTO Comentario( textComent, data_comentario, id_teste, id_usuario, is_edited) VALUES(");
        insertQuery.append( "'" ).append( c.getTextoComentario()  ).append( "', ");
        insertQuery.append( "'" ).append( c.getData() ).append( "', ");
        insertQuery.append( c.getId_Teste() ).append( ", ");
        insertQuery.append( c.getUsuario().getId() ).append( ", ");
        insertQuery.append( 0 ).append( "); ");
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
        updateQuery.append( "is_edited = "     ).append( 1 );
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
   public static List<Comentario> findByITestd( Integer idTeste){
        StringBuilder query = new StringBuilder();
        query.append( "SELECT * FROM Comentario WHERE id_teste = ").append( idTeste ).append( ";");
        
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
          Statement statement = connection.createStatement();)
        {
            ResultSet rs = statement.executeQuery(query.toString());
            List<Comentario> comentarios = new ArrayList();
            while( rs.next() ){
                comentarios.add( new Comentario( rs.getInt("id"),
                                                                    rs.getInt("id_teste"),
                                                                    UsuarioJDBC.findById(rs.getInt("id_usuario")),
                                                                    LocalDate.parse(rs.getString("data_comentario")),
                                                                    rs.getString("textComent")));
            }
            
            statement.close();
            if( !comentarios.isEmpty() ){
                return comentarios;
            }
        } catch (SQLException ex) {
            System.out.println( ex.getMessage() );
            Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
   }
}
