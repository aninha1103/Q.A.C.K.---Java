package JDBC;

import Modelo.Anexo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnexoJDBC {
    
    public static void create( Anexo a ){
        
//        try {
//            byte[] imagemByte = a.converterImagem( new File( a.getCaminhoArquivo() ));
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(AnexoJDBC.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        StringBuilder insertQuery = new StringBuilder();
        insertQuery.append("INSERT INTO Anexos( caminho ) VALUES(");
        insertQuery.append( "'" ).append( a.getCaminhoArquivo() ).append( "'); ");

    try (Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
            Statement statement = conn.createStatement())  {
            
            statement.executeUpdate(insertQuery.toString());
            statement.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage() );
            Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Anexo findByPath( String caminho ){
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM Anexos where caminho LIKE ");
        query.append( "'" ).append( caminho ).append( "'; ");

        Anexo a = null;
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
                Statement statement = conn.createStatement())  {

            ResultSet rs = statement.executeQuery(query.toString());
            while( rs.next()){
                if( rs.getInt("id") != 0){
                    a = new Anexo();
                    a.setId(rs.getInt("id"));
                    a.setCaminhoArquivo(rs.getString("caminho") );
                }
                
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage() );
            Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
    public static Anexo findById( Integer id ){
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM Anexos where id =");
        query.append( id ).append( "; ");

        Anexo a = new Anexo();
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
                Statement statement = conn.createStatement())  {

            ResultSet rs = statement.executeQuery(query.toString());
            while( rs.next()){
                a.setId(rs.getInt("id"));
                a.setCaminhoArquivo(rs.getString("caminho") );
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage() );
            Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
                
}

