package academy.devdojo.maratonajava.javacore.Oexcecao.exception.teste;

import java.io.File;
import java.io.IOException;

public class Exception02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();

    }
    private static void criarNovoArquivo()throws IOException{
        File file = new File("Arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " +isCriado);
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}
