package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTeste01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L,"Attack on tintan",19.9,0));
        mangas.add(new Manga(6L,"Hellsing Ultimate",32.9,5));
        mangas.add(new Manga(1L,"Pokemon",13.30,0));
        mangas.add(new Manga(2L,"Dragon Ball Z",11.2,2));
        mangas.add(new Manga(3L,"Naruto",23.2,0));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
