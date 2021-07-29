package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}


public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Attack on tintan",19.9));
        mangas.add(new Manga(6L,"Hellsing Ultimate",32.9));
        mangas.add(new Manga(1L,"Pokemon",13.30));
        mangas.add(new Manga(2L,"Dragon Ball Z",11.2));
        mangas.add(new Manga(3L,"Naruto",23.2));

        for (Manga m : mangas){
            System.out.println(m);
        }
        mangas.sort(new MangaByIdComparator());
        System.out.println("----------");
        for (Manga m : mangas){
            System.out.println(m);
        }
    }
}
