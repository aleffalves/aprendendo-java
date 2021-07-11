package academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTeste01 {
    public static void main(String[] args) {
        List<String> s = List.of("Aleff", "Luana", "Tereza", "Pedro");
        forEach(s, (System.out::println));
    }
    private static <T> void forEach (List<T> list, Consumer<T> consumer){
        for(T e : list){
            consumer.accept(e);
        }
    }
}
