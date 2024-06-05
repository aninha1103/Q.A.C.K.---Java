package Modelo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Anexo {
    
    private Integer id;
    private String caminhoArquivo;

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
    
    public FileInputStream getFileInputStream(){
        try( FileInputStream fis = new FileInputStream( new File( this.caminhoArquivo )) ){ 
            return new FileInputStream( new File( this.caminhoArquivo ));
        }catch( IOException e ){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public Long getTamanhoArquivo(){
        return new File( this.caminhoArquivo ).length();
    }
    
    public byte[] converterImagem(File file) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        try {
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        byte[] bytes = bos.toByteArray();

        return bytes;
    }
}
