package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste05 {
    public static void main(String[] args) {
        List<String> words = List.of("Bacu","Zion","Felix");
        List<String> letters = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(letters);
    }
}
