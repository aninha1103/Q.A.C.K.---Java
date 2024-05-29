package Repositorio;

import Modelo.Cargo;
import Modelo.Cargos.Techlead;
import Modelo.Status;
import Modelo.Tag;
import Modelo.Teste;
import Modelo.Usuario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageReader;

public class Repositorio {
    private List<Teste> testes;
    private List<Usuario> usuarios;
    private Usuario usuarioAtual;

    public Repositorio() {
        this.testes = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.usuarios.add(( new Usuario( 0, "ADMIN", "adm", "adm", new Techlead() ) ) );
        this.testes.add( new Teste(0, "teste", LocalDate.now(), "Destinado a teste", null, usuarios.getFirst(), Tag.BUG, Status.ANDAMENTO) );
    }
    
    //manipulacao teste
    public void adicionarTeste( Teste teste ){
        if( !usuarioAtual.getCargo().getPermissoes().isCriar() ){
            //erro: usuario nao tem permissao para criar teste
            return;
        }
        this.testes.add( teste );
    }
    
    public void excluirTeste( Teste teste ){
        if( !usuarioAtual.getCargo().getPermissoes().isExcluir() && !permiteAlteracao( usuarioAtual, teste )  ){
            //erro: usuario nao tem permissao para excluir teste indicado
            return;
        }
        this.testes.remove( teste );
    }
    
    public void editarTeste( Teste teste, String nome, String descricao, ImageReader image, Tag tag ){
        if( !usuarioAtual.getCargo().getPermissoes().isExcluir() && !permiteAlteracao( usuarioAtual, teste )  ){
            //erro: usuario nao tem permissao para excluir teste indicado
            return;
        }
        teste.setNome(nome);
        teste.setDescricao(descricao);
        teste.setImagem(image);
        teste.setTag(tag);
    }
    
    public final void adicionarUsuario( Usuario usuario) {
        if( !usuarioAtual.getCargo().getPermissoes().isManipularUsuario() ){
            //erro usuario não tem permissao para manipular usuarios
            return;
        }
        this.usuarios.add(usuario);
    }
    
    public void removerUsuario( Usuario usuario){
        if( !usuarioAtual.getCargo().getPermissoes().isManipularUsuario() ){
            //erro usuario não tem permissao para manipular usuarios
            return;
        }
        this.usuarios.remove(usuario);
    }
    
    public void alterarUsuario( Usuario usuario, String nome, String login, String senha, Cargo cargo ){
        if( !usuarioAtual.getCargo().getPermissoes().isManipularUsuario() ){
            //erro usuario não tem permissao para manipular usuarios
            return;
        }
        usuario.setNome( nome );
        usuario.setLogin( login );
        usuario.setSenha( senha );
        usuario.setCargo( cargo );
    }
     
    private Boolean permiteAlteracao( Usuario usuarioAtual, Teste teste ){
        return usuarioAtual == teste.getCriadoPor();
    }
    
    public List<Teste> getTestes() {
        return testes;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public Usuario getUsuarioAtual() {
        return usuarioAtual;
    }

    public void setUsuarioAtual(Usuario usuarioAtual) {
        this.usuarioAtual = usuarioAtual;
    }
    
    public String getNomeCargo(){
        String nomeCargo = "";
        switch(usuarioAtual.getCargo().getId()){
            case 1 -> nomeCargo = "TechLead";
            case 2 -> nomeCargo = "QA";
            case 3 -> nomeCargo = "Dev";
        }
        return nomeCargo;
    }
    
}
