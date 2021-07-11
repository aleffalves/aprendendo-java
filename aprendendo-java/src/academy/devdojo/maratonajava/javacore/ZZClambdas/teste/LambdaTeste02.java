package academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTeste02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Naruto", "Sasuke", "Hinata");
        List<Integer> integers1 = map(strings, (String s) -> s.length());
        List<Integer> integers = List.of(32, 23, 44, 53, 81);
        System.out.println(integers1);

    }
    private static <T, R> List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (T e : list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
