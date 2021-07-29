package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L,"Attack on tintan",19.9,0));
        mangas.add(new Manga(6L,"Hellsing Ultimate",32.9,5));
        mangas.add(new Manga(1L,"Pokemon",13.30,0));
        mangas.add(new Manga(2L,"Dragon Ball Z",11.2,2));
        mangas.add(new Manga(3L,"Naruto",23.2,0));

        Iterator<Manga> iterator = mangas.iterator();
        while (iterator.hasNext()){
            Manga manga = iterator.next();
            if (manga.getQuantidade() == 0){
                iterator.remove();
            }
        }
        System.out.println(mangas);
    }
}
