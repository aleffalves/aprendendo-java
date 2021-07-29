package academy.devdojo.maratonajava.javacore.ZZClambdas.service;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }
    public static int compareByEpisodes(Anime e1, Anime e2){
        return Integer.compare(e1.getEspisodes(), e2.getEspisodes());
    }
    public int compareByEpisodesNonStatic(Anime e1, Anime e2){
        return Integer.compare(e1.getEspisodes(), e2.getEspisodes());
    }
}
