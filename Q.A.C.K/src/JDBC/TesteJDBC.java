package JDBC;

import Modelo.Anexo;
import Modelo.Status;
import Modelo.Tag;
import Modelo.Teste;
import Modelo.Usuario;
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

public class TesteJDBC {
    public static void create( Teste t ){
        StringBuilder insertQuery = new StringBuilder();
        insertQuery.append("INSERT INTO Teste( titulo, data_teste, descricao, id_usuario, id_tag, status, id_anexo ) VALUES(");
        insertQuery.append( "'" ).append( t.getNome()     ).append( "', ");
        insertQuery.append( "'" ).append( t.getData()     ).append( "', ");
        insertQuery.append( "'" ).append( t.getDescricao()).append( "', ");
        insertQuery.append( t.getCriadoPor().getId()      ).append( ", ");
        insertQuery.append( TagJDBC.findIdbyName( t.getTag().name() ) ).append( ", ");
        insertQuery.append( "'" ).append( t.getStatus().toString().toLowerCase().charAt(0) ).append( "', ");
        insertQuery.append( t.getAnexo().getId() ).append( ");");
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
        updateQuery.append( "descricao = '" ).append( t.getDescricao() ) .append( "', ");
        updateQuery.append( "status = '"    ).append( t.getStatus().toString().toLowerCase().charAt(0) ).append( "', ");
        updateQuery.append( "id_tag = "     ).append( TagJDBC.findIdbyName( t.getTag().name() ) );
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
    
    public static List<Teste> findAll(){
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM Teste");
        //foto
        List<Teste> teste = new ArrayList();
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
                Statement statement = conn.createStatement())  {

                ResultSet rs = statement.executeQuery(query.toString());
                
                while( rs.next() ){
                    Integer id       = rs.getInt("id");
                    String titulo    = rs.getString("titulo");
                    LocalDate data   = LocalDate.parse( rs.getString("data_teste") );
                    String descricao = rs.getString("descricao");
                    Anexo anexo      = AnexoJDBC.findById( rs.getInt("id_anexo") );
                    Usuario usuario  = UsuarioJDBC.findById(rs.getInt("id_usuario"));
                    Tag tag          = TagJDBC.findById( rs.getInt("id_tag"));
                    Status status    = ("a".equals(rs.getString("status") ) ) ? Status.ANDAMENTO : Status.FINALIZADO;
                    Teste t = new Teste(id, titulo, LocalDate.now(), descricao, anexo, usuario, tag, status);
                    teste.add(t);
                }
                    
                statement.close();
            } catch (SQLException ex) {
                System.out.println( ex.getMessage() );
                Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        return teste;    
    }
    
    public static Teste findByRowIndex( Integer index ){
        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM Teste LIMIT 1 OFFSET ");
        query.append( index ).append( "; ");
        
        Teste t = null;
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
                Statement statement = conn.createStatement())  {

                ResultSet rs = statement.executeQuery(query.toString());

                while( rs.next()){
                    Integer id       = rs.getInt("id");
                    String titulo    = rs.getString("titulo");
                    LocalDate data   = LocalDate.parse( rs.getString("data_teste") );
                    String descricao = rs.getString("descricao");
                    Anexo anexo      = AnexoJDBC.findById( rs.getInt("id_anexo") );
                    Usuario usuario  = UsuarioJDBC.findById(rs.getInt("id_usuario"));
                    Tag tag          = TagJDBC.findById( rs.getInt("id_tag"));
                    Status status    = ("a".equals(rs.getString("status") ) ) ? Status.ANDAMENTO : Status.FINALIZADO;
                    t = new Teste(id, titulo, LocalDate.now(), descricao, anexo, usuario, tag, status);
                }

                statement.close();
            } catch (SQLException ex) {
                System.out.println( ex.getMessage() );
                Logger.getLogger(UsuarioJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        return t;    
    }
}
