
package Testes;
import Modelo.Cargo;
import Modelo.Comentario;
import Modelo.Permissoes;
import Modelo.Tag;
import Modelo.Teste;
import Modelo.Usuario;
import java.time.LocalDate;

public class Testes {
    public static void main(String[] args) {
        
        try{
            
            Permissoes p1 = new Permissoes(true, false, false, true, false);
            
            Cargo c1 = new Cargo(1, p1);

            Usuario u1 = new Usuario(1,  "123",  "Joao", "jao", c1);
            Usuario u2 = new Usuario(2,  "123",  "Luis", "luis", c1);
            
            Teste t = new Teste(0, "teste", LocalDate.now(), "Destinado a teste", null, u1, Tag.BUG);
            
            t.criarComentario(u1, "teste1");
            t.criarComentario(u2, "teste2");
            
            //Para alterar e excluir comentario é necessário a função saber exatamente qual comentario deverá ser alterado/excluido,
            //a seleção do comentário excluido/alterado deve ser responsabilidade de outra função/método
            t.editarCometario( u1, t.getComentarios().get(0), "Editado");
            t.excluirComentario(u2, t.getComentarios().get(1) );
            
            for( Comentario c : t.getComentarios() ){
                System.out.println(c);
            }
            
        }catch( Exception e ){
            System.out.println( e.getMessage() );
        }
        
    }
}
