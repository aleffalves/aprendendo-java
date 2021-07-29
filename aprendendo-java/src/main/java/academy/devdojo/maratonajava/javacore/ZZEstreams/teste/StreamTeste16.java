package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LigthNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTeste16 {
    private static List<LigthNovel> ligthNovels = new ArrayList<>(List.of(
            new LigthNovel("Capitao America", 12.99, Category.DRAMA),
            new LigthNovel("Homen de Ferro", 4, Category.DRAMA),
            new LigthNovel("Homen Aranha", 3.99, Category.ROMANCE),
            new LigthNovel("He Man", 2.99,Category.FANTASY),
            new LigthNovel("Pica Pau", 6.99,Category.FANTASY),
            new LigthNovel("Lanterna Verde", 8.99,Category.FANTASY),
            new LigthNovel("Mulher Maravilha", 1.99,Category.ROMANCE)
    ));

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }
    private static void sumFor (long num){
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1 ; i <= num; i++){
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " "+ (end - init) + "ms");
    }

    private static void sumStreamIterate (long num){
        System.out.println("Sum Stream");

        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " "+ (end - init) + "ms");
    }

    private static void sumParallelStreamIterate (long num){
        System.out.println("Sum parallelStream");

        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " "+ (end - init) + "ms");
    }

    private static void sumLongStreamIterate (long num){
        System.out.println("Sum LongStream");

        long init = System.currentTimeMillis();
        long result = LongStream.range(0,num).reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " "+ (end - init) + "ms");
    }

    private static void sumParallelLongStreamIterate (long num){
        System.out.println("Sum ParallelLongStream");

        long init = System.currentTimeMillis();
        long result = LongStream.range(0,num).parallel().reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " "+ (end - init) + "ms");
    }
}
