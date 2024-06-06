package JDBC;

import Modelo.Teste;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteJDBC {
    public static void create( Teste t ){
        
        StringBuilder insertQuery = new StringBuilder();
        insertQuery.append("INSERT INTO Teste( id, titulo, data_teste, descricao, id_usuarios, id_tag, status, id_anexo ) VALUES(");
        insertQuery.append( "'" ).append( t.getId() ).append( "', ");
        insertQuery.append( "'" ).append( t.getNome()).append( "', ");
        insertQuery.append( "'" ).append( t.getData()).append( "', ");
        insertQuery.append( "'" ).append( t.getDescricao()).append( "', ");
        insertQuery.append( t.getCriadoPor().getId() ).append( ", ");
        insertQuery.append( TagJDBC.findIdbyName( t.getTag().name() ) ).append( "', ");
        insertQuery.append( "'" ).append( t.getStatus().toString() ).append( "', ");
        //insertQuery.append( "'" ).append( t.getImagem() ).append( "', ");
        insertQuery.append( "'" ).append( "NULL" ).append( "', ");
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
    
    public static void update( Teste t ){
        StringBuilder updateQuery = new StringBuilder();
        updateQuery.append("UPDATE Teste SET ");
        updateQuery.append( "descricao = '"     ).append( t.getDescricao() ) .append( "', ");
        updateQuery.append( "status = '"  ).append( t.getStatus() ).append( "', ");
        updateQuery.append( "id_tag = "    ).append( TagJDBC.findIdbyName( t.getTag().name() ) ).append( ", ");
        //updateQuery.append( "id_anexo = "  ).append( t.getAnexo().getId() );
        updateQuery.append( " WHERE id = " ).append( t.getId() ).append( ";" );
        
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
    
    public static void delete( Teste t ){
        StringBuilder deleteQuery = new StringBuilder();
        deleteQuery.append( "DELETE FROM Teste WHERE id = " ).append( t.getId() );
        
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
}
