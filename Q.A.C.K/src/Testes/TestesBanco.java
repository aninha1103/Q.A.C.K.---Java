package Testes;

import Repositorio.Repositorio;
import java.util.Scanner;

public class TestesBanco {
    
    Repositorio rep = new Repositorio();
    
    public static void main(String[] args) {
        
        Scanner Entrada = new Scanner(System.in);
        int valor = 0;
        
        do{
            try {        
                System.out.println("|-- Menu--");
                System.out.println("| 1. Criar usuario");
                System.out.println("| 2. Criar teste");
                System.out.println("| 3. Definir usuario atual");
                System.out.println("| 4. Comentar");
                System.out.println("| 5. Sair");
                System.out.println("|---------");

                valor = Entrada.nextInt();

                switch(valor){
                    case 1 -> {
                        System.out.println("teste1");
                        }
                    case 2 -> {
                        System.out.println("teste2");
                        }
                    case 3 -> {
                        System.out.println("teste3");
                        }                       
                    default -> {
                        System.out.println("saindo...");
                        }
                }
            }catch( Exception e ){
                System.out.println( e.getMessage() );
            }         
        }while (valor != 5);        
    }
}