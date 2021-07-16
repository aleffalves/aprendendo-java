package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTeste04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesingners = List.of("A", "B", "C");
        List<String> developers = List.of("D", "E", "F");
        List<String> students = List.of("G", "H", "I");

        devdojo.add(graphicDesingners);
        devdojo.add(developers);
        devdojo.add(students);

        devdojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
