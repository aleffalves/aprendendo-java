package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("D");
        fila.add("C");
        fila.add("A");

        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }

    }
}
