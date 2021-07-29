package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTeste14 {
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
        Map<Category, Long> collect = ligthNovels.stream().collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LigthNovel>> collect1 = ligthNovels.stream().collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.maxBy(Comparator.comparing(LigthNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LigthNovel> collect2 = ligthNovels.stream().collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LigthNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Category, LigthNovel> collect3 = ligthNovels.stream().collect(Collectors.toMap(LigthNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LigthNovel::getPrice))));
        System.out.println(collect3);
    }
}
