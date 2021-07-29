package academy.devdojo.maratonajava.javacore.Wnio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTeste01 {
    public static void main(String[] args) {
        Path diretorio = Paths.get("home/aleff");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = diretorio.resolve(arquivo);
        System.out.println(resolve);
    }
}
