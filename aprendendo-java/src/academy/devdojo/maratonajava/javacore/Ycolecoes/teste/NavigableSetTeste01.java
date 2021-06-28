package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


class MarcaAdicionaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaAdicionaComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getPreco().compareTo(o2.getPreco());
    }
}

public class NavigableSetTeste01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new MarcaAdicionaComparator());
        Smartphone smartphone = new Smartphone("A832AS", "LG");
        set.add(smartphone);
        System.out.println(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaAdicionaComparator());
        mangas.add(new Manga(5L,"Attack on tintan",19.9,0));
        mangas.add(new Manga(6L,"Hellsing Ultimate",32.9,5));
        mangas.add(new Manga(1L,"Pokemon",13.30,0));
        mangas.add(new Manga(2L,"Dragon Ball Z",11.2,2));
        mangas.add(new Manga(3L,"Naruto",23.2,0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        //lower <
        //floor <=
        //heigher >
        //ceiling >=


    }
}
