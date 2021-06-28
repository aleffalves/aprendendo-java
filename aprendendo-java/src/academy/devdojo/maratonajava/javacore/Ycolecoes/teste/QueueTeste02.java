package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaAdicionaComparator().reversed());
        mangas.add(new Manga(5L,"Attack on tintan",19.9,0));
        mangas.add(new Manga(6L,"Hellsing Ultimate",32.9,5));
        mangas.add(new Manga(1L,"Pokemon",13.30,0));
        mangas.add(new Manga(2L,"Dragon Ball Z",11.2,2));
        mangas.add(new Manga(3L,"Naruto",23.2,0));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
