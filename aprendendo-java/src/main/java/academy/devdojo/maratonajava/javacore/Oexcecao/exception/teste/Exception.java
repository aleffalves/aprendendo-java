package academy.devdojo.maratonajava.javacore.Oexcecao.exception.teste;

import java.io.File;
import java.io.IOException;

public class Exception {
    public static void main(String[] args) {
        criarNovoArquivo();

    }
    private static void criarNovoArquivo(){
        File file = new File("Arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " +isCriado);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
