package Repositorio;

import Modelo.Cargos.Techlead;
import Modelo.Status;
import Modelo.Tag;
import Modelo.Teste;
import Modelo.Usuario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private List<Teste> testes;
    private List<Usuario> usuarios;
    private Usuario usuarioAtual;

    public Repositorio() {
        this.testes = new ArrayList<>();
        this.usuarios = new ArrayList<>();
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
    
    public void editarTeste( Teste teste, Integer posicaoTeste ){
        if( !usuarioAtual.getCargo().getPermissoes().isExcluir() && !permiteAlteracao( usuarioAtual, teste )  ){
            //erro: usuario nao tem permissao para excluir teste indicado
            return;
        }
        testes.set( posicaoTeste, teste);
    }
    
    public void adicionarUsuario( Usuario usuario) {
        if( !usuarioAtual.getCargo().getPermissoes().isManipularUsuario() ){
            //erro usuario não tem permissao para manipular usuarios
            return;
        }
        this.usuarios.add( usuario );
    }
    
    public void removerUsuario( Usuario usuario){
        if( !usuarioAtual.getCargo().getPermissoes().isManipularUsuario() ){
            //erro usuario não tem permissao para manipular usuarios
            return;
        }
        this.usuarios.remove(usuario);
    }
    
    public void alterarUsuario( Usuario usuario, Integer posicaoUsuario ){
        if( !usuarioAtual.getCargo().getPermissoes().isManipularUsuario() ){
            //erro usuario não tem permissao para manipular usuarios
            return;
        }
        usuarios.set( posicaoUsuario, usuario );
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
