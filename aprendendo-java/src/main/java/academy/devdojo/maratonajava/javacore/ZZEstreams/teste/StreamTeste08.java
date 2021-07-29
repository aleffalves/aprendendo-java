package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTeste08 {
    private static List<LigthNovel> ligthNovels = new ArrayList<>(List.of(
            new LigthNovel("Capitao America", 12.99),
            new LigthNovel("Homen de Ferro", 4),
            new LigthNovel("Homen Aranha", 3.99),
            new LigthNovel("He Man", 2.99),
            new LigthNovel("Pica Pau", 6.99),
            new LigthNovel("Lanterna Verde", 8.99),
            new LigthNovel("Mulher Maravilha", 1.99)
    ));

    public static void main(String[] args) {
        ligthNovels.stream()
                .map(LigthNovel::getPrice)
                .filter(p -> p > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = ligthNovels.stream()
                .mapToDouble(LigthNovel::getPrice)
                .filter(p -> p > 3)
                .sum();
        System.out.println(sum);
    }
}
