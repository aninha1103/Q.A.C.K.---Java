
package Testes;
import Modelo.Cargo;
import Modelo.Filtro;
import Modelo.Permissoes;
import Modelo.Status;
import Modelo.Tag;
import Modelo.Teste;
import Modelo.Usuario;
import Repositorio.Repositorio;
import java.time.LocalDate;
import java.util.Arrays;

public class Testes {
    public static void main(String[] args) {
        
        try{
            Repositorio rep = new Repositorio();
            
            Permissoes p1 = new Permissoes(true, true, true, true, true, true);
            
            Cargo c1 = new Cargo(1, p1);
            
            //necessario existir um usuario logado para fazer as alteracoes, pois é verificado as permissao do usuario logado
            Usuario u2 = new Usuario(2,  "Luis", "luis","123", c1);
            rep.setUsuarioAtual( u2 );
            
            Usuario u1 = new Usuario(1, "Joao", "jao", "123", c1);
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
            
            //Dados do filtro para teste
            String nome = "tE";
            Tag tag = Tag.BUG;
            Status status = Status.ANDAMENTO;
            LocalDate dataInicio = LocalDate.parse("2023-05-01");
            LocalDate dataFim = LocalDate.parse("2024-06-01");
            Usuario usuario =  rep.getUsuarios().get(1);
            // Exibindo filtro nos teste
            for (Teste teste : new Filtro( nome, tag, status, dataInicio, dataFim , usuario ).filtrarTeste( rep.getTestes() ) ) {
                System.out.println("ID: " + teste.getId() + ", Nome: " + teste.getNome() + ", Data: " + teste.getData() + ", Descricao: " + teste.getDescricao() + ", Criado por: " + teste.getCriadoPor().getNome() + ", Tag: " + teste.getTag());
            }
        }catch( Exception e ){
            System.out.println( e.getMessage() );
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        
    }
    
    public static void popularTeste( Repositorio rep, Usuario u1, Usuario u2 ){
        for (int i = 1; i < 10; i++) {
            Usuario usuario = (i % 2 == 0) ? u1 : u2;
            Tag tag = (i % 2 == 0) ? Tag.BUG : Tag.MELHORIA;
            
            Teste teste = new Teste(
                i, 
                "Teste " + i, 
                LocalDate.now(), 
                "Descricao do teste " + i, 
                null, 
                usuario, 
                tag,
                Status.ANDAMENTO
            );
            
            rep.adicionarTeste(teste);
            }
        rep.adicionarTeste( new Teste(0, "teste", LocalDate.now(), "Destinado a teste", null, u1, Tag.BUG, Status.ANDAMENTO) );
        rep.adicionarTeste( new Teste(11, "teste dataInicio", LocalDate.parse("2024-05-05"), "Destinado a teste", null, u2, Tag.RETRABALHO, Status.FINALIZADO) );
        rep.adicionarTeste( new Teste(12, "teste data fim", LocalDate.parse("2024-11-11"), "Destinado a teste", null, u2, Tag.MELHORIA, Status.ANDAMENTO) );
    }
}
    
