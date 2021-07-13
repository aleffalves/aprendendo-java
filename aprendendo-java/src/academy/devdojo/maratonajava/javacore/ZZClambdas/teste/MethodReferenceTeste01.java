package academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTeste01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Naruto", 560),
                new Anime("One Piece", 900),
                new Anime("Cavaleiros Do Zoodiaco", 353),
                new Anime("Dragon Ball GT", 150)));

        //Collections.sort(animeList,(a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        //Collections.sort(animeList,AnimeComparators::compareByTitle);
        Collections.sort(animeList,AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
