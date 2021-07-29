package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste02 {
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
        List<String> titles = ligthNovels.stream()
                .sorted(Comparator.comparing(LigthNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LigthNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
