package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTeste01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Attack on tintan");
        mangas.add("Bersek");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas);

        for (String s : mangas){
            System.out.println(s);
        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(21.21);
        dinheiros.add(98.10);
        dinheiros.add(53.18);
        dinheiros.add(7.21);
        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);


    }
}
