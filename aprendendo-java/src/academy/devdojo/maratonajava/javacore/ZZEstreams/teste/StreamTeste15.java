package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTeste15 {
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
        Map<Category, DoubleSummaryStatistics> collect = ligthNovels.stream().collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.summarizingDouble(LigthNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = ligthNovels.stream().collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.mapping(StreamTeste15::promotion, Collectors.toSet())));
        System.out.println(collect1);

        Map<Category, Set<Promotion>> collect2 = ligthNovels.stream().collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.mapping(StreamTeste15::promotion, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }
    private static Promotion promotion(LigthNovel ln){
        return ln.getPrice() <6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
