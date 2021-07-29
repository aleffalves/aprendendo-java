package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.LinkedHashMap;
import java.util.Map;


public class MapTeste02 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Aleff");
        Consumidor consumidor2 = new Consumidor("Luana");

        Manga manga = new Manga(5L, "Attack on tintan", 19.9);
        Manga manga1 = new Manga(6L, "Hellsing Ultimate", 32.9);
        Manga manga2 = new Manga(1L, "Pokemon", 13.30);
        Manga manga3 = new Manga(2L, "Dragon Ball Z", 11.2);
        Manga manga4 = new Manga(3L, "Naruto", 23.2);

        Map<Consumidor,Manga> consumidorMangaMap = new LinkedHashMap<>();
        consumidorMangaMap.put(consumidor,manga4);
        consumidorMangaMap.put(consumidor2,manga2);

        for (Map.Entry<Consumidor,Manga> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome()+" adquiriu: "+entry.getValue().getNome());
        }
    }
}
