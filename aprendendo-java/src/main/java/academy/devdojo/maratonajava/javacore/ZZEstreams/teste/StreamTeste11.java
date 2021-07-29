package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste11 {
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
        System.out.println(ligthNovels.stream().count());
        System.out.println(ligthNovels.stream().collect(Collectors.counting()));

        DoubleSummaryStatistics collect = ligthNovels.stream().collect(Collectors.summarizingDouble(LigthNovel::getPrice));
        System.out.println(collect);

        String titles = ligthNovels.stream().map(LigthNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);
    }

}
