package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTeste01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        Integer[] array = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        Integer[] numArrays = new  Integer[5];
        numArrays[0] = 1;
        numArrays[1] = 2;
        numArrays[2] = 3;
        numArrays[3] = 4;
        numArrays[4] = 5;

        List<Integer> list = Arrays.asList(numArrays);
        System.out.println(Arrays.toString(numArrays));
        System.out.println(list);

    }
}
