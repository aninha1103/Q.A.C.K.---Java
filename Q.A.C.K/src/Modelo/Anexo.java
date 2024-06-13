package Modelo;

public class Anexo {
    
    private Integer id;
    private String caminhoArquivo;

    public Anexo() {
    }
    
    public Anexo(Integer id, String caminhoArquivo) {
        this.id = id;
        this.caminhoArquivo = caminhoArquivo;
    }

    public Anexo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }
}
