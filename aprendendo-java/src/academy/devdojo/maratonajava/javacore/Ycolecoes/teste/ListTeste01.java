package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Aleff");
        nomes.add("Luana");

        for (String s : nomes) {
            System.out.println(s);
        }
        List<Integer> numeros = new ArrayList<>();

        numeros.add(12);
        numeros.add(21);

        for (Integer i : numeros){
            System.out.println(i);
        }
    }
}
