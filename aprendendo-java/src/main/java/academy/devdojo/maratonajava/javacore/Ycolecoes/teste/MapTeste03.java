package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class MapTeste03 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Aleff");
        Consumidor consumidor2 = new Consumidor("Luana");

        Manga manga = new Manga(5L, "Attack on tintan", 19.9);
        Manga manga1 = new Manga(6L, "Hellsing Ultimate", 32.9);
        Manga manga2 = new Manga(1L, "Pokemon", 13.30);
        Manga manga3 = new Manga(2L, "Dragon Ball Z", 11.2);
        Manga manga4 = new Manga(3L, "Naruto", 23.2);

        List<Manga> mangaCosumidorList = List.of(manga1,manga2,manga);
        List<Manga> mangaCosumidorList2 = List.of(manga3,manga4);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new LinkedHashMap<>();
        consumidorMangaMap.put(consumidor,mangaCosumidorList);
        consumidorMangaMap.put(consumidor2,mangaCosumidorList2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome()+" adquiriu: ");
            for (Manga m : entry.getValue()){
                System.out.println(m.getNome());
            }
        }
    }
}
