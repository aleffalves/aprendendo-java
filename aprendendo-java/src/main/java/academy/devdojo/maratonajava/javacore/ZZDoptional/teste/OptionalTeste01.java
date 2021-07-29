package academy.devdojo.maratonajava.javacore.ZZDoptional.teste;

import java.util.List;
import java.util.Optional;

public class OptionalTeste01 {
    public static void main(String[] args) {
        Optional<String> name = findName("Alves");
        System.out.println(name);
        name.ifPresent(s -> System.out.println(s.toUpperCase()));



    }
    private static Optional<String> findName(String name){
        List<String> list = List.of("Alves", "Rabelo");
        int i = list.indexOf(name);
        if (i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
