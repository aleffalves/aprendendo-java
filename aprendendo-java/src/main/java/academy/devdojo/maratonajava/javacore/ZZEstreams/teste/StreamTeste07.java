package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.List;

public class StreamTeste07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 4, 5, 7, 8);

        integers.stream().reduce(Integer::sum)
                .ifPresent(System.out::println);
        integers.stream().reduce((x,y) -> x * y)
                .ifPresent(System.out::println);
    }
}
