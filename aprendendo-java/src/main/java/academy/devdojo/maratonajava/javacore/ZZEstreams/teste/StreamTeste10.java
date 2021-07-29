package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTeste10 {
    public static void main(String[] args) {
        Stream.iterate(0, i -> i + 2)
                .limit(10)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[0] + i[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));

        Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[0] + i[1]})
                .limit(20)
                .map(a -> a[0])
                .forEach(i -> System.out.print(i + " "));
        System.out.println();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1,60))
                .distinct()
                .limit(6)
                .forEach(i -> System.out.print(i + " "));
    }
}
