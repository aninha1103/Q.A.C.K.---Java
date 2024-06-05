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
        insertQuery.append( "'" ).append( t.getCriadoPor().getId() ).append( "', ");
        insertQuery.append( "'" ).append( TagJDBC.findIdbyName( t.getTag().name() ) ).append( "', ");
        insertQuery.append( "'" ).append( t.getStatus().toString() ).append( "', ");
        //insertQuery.append( "'" ).append( t.getImagem() ).append( "', ");
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
}
