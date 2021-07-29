package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTeste09 {
    public static void main(String[] args) {
        IntStream.range(1,30)//imprime até o penultimo da lista
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        IntStream.rangeClosed(1,30)//imprime até o ultimo da lista
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("Eleve","o","Cosmo","no seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        int num[] = {1,5,4,9,3};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))){
            lines.filter(l -> l.contains("Java"))
                    .forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
