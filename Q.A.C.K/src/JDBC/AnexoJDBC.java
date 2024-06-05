package JDBC;

import Modelo.Anexo;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnexoJDBC {
    
    public static void create( Anexo a ){
        
        try {
            byte[] imagemByte = a.converterImagem( new File( a.getCaminhoArquivo() ));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AnexoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        StringBuilder insertQuery = new StringBuilder();
        insertQuery.append("INSERT INTO Anexos( caminho, arquivo ) VALUES(");
        insertQuery.append( "'" ).append( a.getCaminhoArquivo() ).append( "', ");
        insertQuery.append( "FILE_READ(").append( a.getCaminhoArquivo() ).append( ")); ");
        //foto
        System.out.println( insertQuery );

    try (Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
            Statement statement = conn.createStatement())  {
            
            statement.executeUpdate(insertQuery.toString());
            statement.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage() );
            Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
