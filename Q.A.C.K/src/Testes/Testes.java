
package Testes;
import Modelo.Cargo;
import Modelo.Permissoes;
import Modelo.Tag;
import Modelo.Teste;
import Modelo.Usuario;
import Repositorio.Repositorio;
import java.time.LocalDate;

public class Testes {
    public static void main(String[] args) {
        
        try{
            Repositorio rep = new Repositorio();
            
            Permissoes p1 = new Permissoes(true, true, true, true, true, false);
            
            Cargo c1 = new Cargo(1, p1);
            
            //necessario existir um usuario logado para fazer as alteracoes, pois é verificado as permissao do usuario logado
            Usuario u2 = new Usuario(2,  "123",  "Luis", "luis", c1);
            rep.setUsuarioAtual( u2 );
            
            Usuario u1 = new Usuario(1,  "123",  "Joao", "jao", c1);
            rep.adicionarUsuario(u1);
            rep.adicionarUsuario(u2);
            
            rep.adicionarTeste( new Teste(0, "teste", LocalDate.now(), "Destinado a teste", null, u1, Tag.BUG) );
            Teste t = rep.getTeste().getFirst();
            t.criarComentario(u1, "teste1");
            t.criarComentario(u2, "teste2");
            
            //Para alterar e excluir comentario é necessário a função saber exatamente qual comentario deverá ser alterado/excluido,
            //a seleção do comentário excluido/alterado deve ser responsabilidade de outra função/método
            t.editarCometario( u1, t.getComentarios().get(0), "Editado");
            t.excluirComentario(u2, t.getComentarios().get(1) );

           
        }catch( Exception e ){
            System.out.println( e.getMessage() );
        }
        
    }
}
    
