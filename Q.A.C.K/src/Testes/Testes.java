
package Testes;
import Modelo.Cargo;
import Modelo.Filtro;
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
            
            Permissoes p1 = new Permissoes(true, true, true, true, true, true);
            
            Cargo c1 = new Cargo(1, p1);
            
            //necessario existir um usuario logado para fazer as alteracoes, pois é verificado as permissao do usuario logado
            Usuario u2 = new Usuario(2,  "123",  "Luis", "luis", c1);
            rep.setUsuarioAtual( u2 );
            
            Usuario u1 = new Usuario(1,  "123",  "Joao", "jao", c1);
            rep.adicionarUsuario(u1);
            rep.adicionarUsuario(u2);
            
            popularTeste( rep, u1, u2  );
            Teste t = rep.getTestes().getFirst();
            t.criarComentario(u1, "teste1");
            t.criarComentario(u2, "teste2");
            
            //Para alterar e excluir comentario é necessário a função saber exatamente qual comentario deverá ser alterado/excluido,
            //a seleção do comentário excluido/alterado deve ser responsabilidade de outra função/método
            t.editarCometario( u1, t.getComentarios().get(0), "Editado");
            t.excluirComentario(u2, t.getComentarios().get(1) );

            
            
            // Exibindo filtro nos teste
            for (Teste teste : new Filtro( "teStE", Tag.ANDAMENTO, LocalDate.parse("2024-05-01"), LocalDate.parse("2024-06-01")).filtrarTeste( rep.getTestes() ) ) {
                System.out.println("ID: " + teste.getId() + ", Nome: " + teste.getNome() + ", Data: " + teste.getData() + ", Descricao: " + teste.getDescricao() + ", Criado por: " + teste.getCriadoPor().getNome() + ", Tag: " + teste.getTag());
            }
        }catch( Exception e ){
            System.out.println( e.getMessage() );
        }
        
    }
    
    public static void popularTeste( Repositorio rep, Usuario u1, Usuario u2 ){
        for (int i = 1; i < 10; i++) {
            Usuario usuario = (i % 2 == 0) ? u1 : u2;
            Tag tag = (i % 2 == 0) ? Tag.BUG : Tag.FINALIZADO;
            
            Teste teste = new Teste(
                i, 
                "Teste " + i, 
                LocalDate.now(), 
                "Descricao do teste " + i, 
                null, 
                usuario, 
                tag
            );
            
            rep.adicionarTeste(teste);
            }
        rep.adicionarTeste( new Teste(0, "teste", LocalDate.now(), "Destinado a teste", null, u1, Tag.BUG) );
        rep.adicionarTeste( new Teste(11, "teste dataInicio", LocalDate.parse("2024-05-05"), "Destinado a teste", null, u2, Tag.ANDAMENTO) );
        rep.adicionarTeste( new Teste(12, "teste data fim", LocalDate.parse("2024-11-11"), "Destinado a teste", null, u2, Tag.FAZER) );
    }
}
    
