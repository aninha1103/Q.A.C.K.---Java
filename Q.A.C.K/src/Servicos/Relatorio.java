package Servicos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Relatorio {
    
    public Relatorio() {
    }

    public static boolean gerarRelatorioCsv( List<Map> dadosRelatorio, Map camposSelecionados, String nomeArquivo ){
        new File( ".\\Relatorios").mkdir();
        
        String nomeArquivoString = ".\\Relatorios\\" + nomeArquivo + ".csv";
        try( BufferedWriter bw = new BufferedWriter( new FileWriter(  nomeArquivoString ) )){
            Boolean first = true;
            for(  Map m : dadosRelatorio ){
                if( first ){
                    String colunasRelatorio = Arrays.toString( camposSelecionados.keySet().toArray());
                    bw.write( colunasRelatorio.substring( 1, colunasRelatorio.length() - 1));
                    bw.newLine();
                    first = false;
                }
                
                String linha = "";
                for( Object key : m.keySet() ){
                    if( camposSelecionados.containsKey( key ) ){
                        linha += m.get(key).toString() + ",";
                    }
                }
                linha = linha.substring(0, linha.length() - 1);
                bw.write( linha );
                bw.newLine();
            }
            return true;
        } catch (IOException e ){
            System.out.println( "error: " + Arrays.toString(e.getStackTrace()));
        }
        return false;
    }
}
