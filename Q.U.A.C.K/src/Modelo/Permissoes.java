
package Modelo;

public class Permissoes {
    
    /*Atributos*/
    private boolean criar;
    private boolean alterar;
    private boolean excluir;
    private boolean exportaRelatorio;
    private boolean comentar;
    /*Fim Atributos*/

    public boolean isCriar() {
        return criar;
    }

    public void setCriar(boolean criar) {
        this.criar = criar;
    }

    public boolean isAlterar() {
        return alterar;
    }

    public void setAlterar(boolean alterar) {
        this.alterar = alterar;
    }

    public boolean isExcluir() {
        return excluir;
    }

    public void setExcluir(boolean excluir) {
        this.excluir = excluir;
    }

    public boolean isExportaRelatorio() {
        return exportaRelatorio;
    }

    public void setExportaRelatorio(boolean exportaRelatorio) {
        this.exportaRelatorio = exportaRelatorio;
    }

    public boolean isComentar() {
        return comentar;
    }

    public void setComentar(boolean comentar) {
        this.comentar = comentar;
    }

    public Permissoes(boolean criar, boolean alterar, boolean excluir, boolean exportaRelatorio, boolean comentar) {
        this.criar = criar;
        this.alterar = alterar;
        this.excluir = excluir;
        this.exportaRelatorio = exportaRelatorio;
        this.comentar = comentar;
    }

    @Override
    public String toString() {
        return "Permissoes{" + "criar=" + criar + ", alterar=" + alterar + ", excluir=" + excluir + ", exportaRelatorio=" + exportaRelatorio + ", comentar=" + comentar + '}';
    }
    
    
}
