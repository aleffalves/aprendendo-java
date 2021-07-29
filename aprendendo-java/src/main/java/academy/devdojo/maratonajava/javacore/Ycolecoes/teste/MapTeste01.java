package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.HashMap;
import java.util.Map;

public class MapTeste01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("teklado","teclado");
        map.put("mouze", "mouse");
        map.put("vs", "você");
        map.put("vs", "você2");
        map.putIfAbsent("vs", "você3");

        System.out.println(map);
    }
}
