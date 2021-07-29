package academy.devdojo.maratonajava.javacore.Wnio.teste;


import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste01 {
    public static void main(String[] args) {
        Path path01 = Paths.get("C:\\workspace\\dev\\aprendendo-java\\file.txt");
        System.out.println(path01.getFileName());

    }

}

