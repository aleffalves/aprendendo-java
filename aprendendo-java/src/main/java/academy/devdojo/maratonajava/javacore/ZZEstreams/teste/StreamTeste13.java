package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTeste13 {
    private static List<LigthNovel> ligthNovels = new ArrayList<>(List.of(
            new LigthNovel("Capitao America", 12.99, Category.DRAMA),
            new LigthNovel("Homen de Ferro", 4, Category.DRAMA),
            new LigthNovel("Homen Aranha", 3.99, Category.ROMANCE),
            new LigthNovel("He Man", 2.99,Category.FANTASY),
            new LigthNovel("Pica Pau", 6.99,Category.FANTASY),
            new LigthNovel("Lanterna Verde", 8.99,Category.FANTASY),
            new LigthNovel("Mulher Maravilha", 1.99,Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Promotion, List<LigthNovel>> collect = ligthNovels.stream()
                .collect(Collectors.groupingBy(
                        ln -> ln.getPrice() < 6
                        ? Promotion.UNDER_PROMOTION
                        : Promotion.NORMAL_PRICE));
        System.out.println(collect);

        Map<Category, Map<Promotion, List<LigthNovel>>> collect1 = ligthNovels
                .stream()
                .collect(Collectors.groupingBy
                        (LigthNovel::getCategory,
                                Collectors.groupingBy(
                                        ln -> ln.getPrice() < 6
                                                ? Promotion.UNDER_PROMOTION
                                                : Promotion.NORMAL_PRICE)));
        System.out.println(collect1);
    }
}
