package JDBC;

import Modelo.Cargo;
import Modelo.Cargos.Dev;
import Modelo.Cargos.QA;
import Modelo.Cargos.Techlead;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CargoJDBC {
    public static void create( Cargo c ){
        StringBuilder insertQuery = new StringBuilder();
        insertQuery.append("INSERT INTO Cargo( nome ) VALUES(");
        insertQuery.append( "'" ).append( c.getNome() ).append( "'); ");
        //foto

    try (Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
            Statement statement = conn.createStatement())  {
            
            statement.executeUpdate(insertQuery.toString());
            statement.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage() );
            Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void update( Cargo c ){
        StringBuilder updateQuery = new StringBuilder();
        updateQuery.append( "UPDATE Cargo SET ");
        updateQuery.append( "nome = '"     ).append( c.getNome() ).append("'") ;
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
    
    public static void delete( Cargo c ){
        StringBuilder deleteQuery = new StringBuilder();
        deleteQuery.append( "DELETE FROM Tag WHERE id = " ).append( c.getId() );
        
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
    
    public static Cargo findById( Integer id ){
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM Cargo where id =");
        query.append( id ).append( "; ");
        //foto
        Cargo cargo = null;
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
                Statement statement = conn.createStatement())  {

            ResultSet rs = statement.executeQuery(query.toString());

            while( rs.next()){
                switch( rs.getInt("id") ){
                    case 1 -> cargo = new QA();
                    case 2 -> cargo = new Techlead();
                    case 3 -> cargo = new Dev();
                }
            }

            statement.close();
        } catch (SQLException ex) {
            System.out.println( ex.getMessage() );
            Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cargo;
    }
}
