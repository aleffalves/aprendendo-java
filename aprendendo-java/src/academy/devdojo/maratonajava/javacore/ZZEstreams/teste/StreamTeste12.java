package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTeste12 {
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
        Map<Category, List<LigthNovel>> categoryListMap = new HashMap<>();

        List<LigthNovel> fantasy = new ArrayList<>();
        List<LigthNovel> romance = new ArrayList<>();
        List<LigthNovel> drama = new ArrayList<>();

        for (LigthNovel ligthNovel : ligthNovels) {
            switch (ligthNovel.getCategory()){
                case DRAMA:drama.add(ligthNovel); break;
                case FANTASY:fantasy.add(ligthNovel); break;
                case ROMANCE:romance.add(ligthNovel); break;
            }
        }
        categoryListMap.put(Category.DRAMA, drama);
        categoryListMap.put(Category.FANTASY, fantasy);
        categoryListMap.put(Category.ROMANCE, romance);

        System.out.println(categoryListMap);

        Map<Category, List<LigthNovel>> collect = ligthNovels.stream().collect(Collectors.groupingBy(LigthNovel::getCategory));
        System.out.println(collect);
    }
}
