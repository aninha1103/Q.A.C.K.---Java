package JDBC;

import Modelo.Tag;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TagJDBC {
    public static void create( Tag t ){
        
        StringBuilder insertQuery = new StringBuilder();
        insertQuery.append("INSERT INTO Tag( nome ) VALUES(");
        insertQuery.append( "'" ).append( t.name() ).append( "'); ");
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
    
    public static void update( Tag antiga, Tag nova ) {
        
        StringBuilder updateQuery = new StringBuilder();
        updateQuery.append( "UPDATE Tag SET ");
        updateQuery.append( "nome = '"     ).append( nova.name() ).append("'") ;
        updateQuery.append( " WHERE id = " ).append( findIdbyName( antiga.name() ) ).append( ";" );
        
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
    
    public static void delete( Tag t ){
        StringBuilder deleteQuery = new StringBuilder();
        deleteQuery.append( "DELETE FROM Tag WHERE id = " ).append( findIdbyName( t.name() ) );
        
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
    
    public static Integer findIdbyName( String name ){
        StringBuilder query = new StringBuilder();
        query.append( "SELECT * FROM Tag WHERE nome = '");
        query.append( name ).append("'");
        
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
          Statement statement = connection.createStatement();)
        {
            ResultSet rs = statement.executeQuery(query.toString());
            Integer idTag = null;
            while( rs.next() ){
                idTag = rs.getInt("id");
            }
            
            statement.close();
            return idTag;
        } catch (SQLException ex) {
            System.out.println( ex.getMessage() );
            Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static Tag findById( Integer id){
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM Tag where id =");
        query.append( id ).append( "; ");
        Tag tag = null;
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
                Statement statement = conn.createStatement())  {

                ResultSet rs = statement.executeQuery(query.toString());
                while( rs.next()){
                    tag = Tag.valueOf( rs.getString("nome") );
                }
                statement.close();
            } catch (SQLException ex) {
                System.out.println( ex.getMessage() );
                Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        return tag;  
    }
    
    public static List<Tag> findAll(){
        StringBuilder query = new StringBuilder();
        query.append( "SELECT * FROM Tag;");
        
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
          Statement statement = connection.createStatement();)
        {
            ResultSet rs = statement.executeQuery(query.toString());
            List<Tag> tags = new ArrayList();
            while( rs.next() ){
                tags.add( Tag.valueOf( rs.getString("nome") ));
            }
            
            statement.close();
            if( !tags.isEmpty() ){
                return tags;
            }
        } catch (SQLException ex) {
            System.out.println( ex.getMessage() );
            Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
