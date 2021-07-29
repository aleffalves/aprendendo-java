package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//1. Order LightNovel by title
//2. Retrieve the first 3 ligth novels with price less than 4
public class StreamTeste01 {
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
        ligthNovels.sort(Comparator.comparing(LigthNovel::getTitle));
        List<String> titles = new ArrayList<>();

        for (LigthNovel ligthNovel : ligthNovels) {
            if (ligthNovel.getPrice() <=4){
                titles.add(ligthNovel.getTitle());
            }
            if (titles.size() >= 3){
                break;
            }
        }

        System.out.println(ligthNovels);
        System.out.println(titles);
    }
}
