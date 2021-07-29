package academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTeste03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Xiriu", "Rick", "Zeus"));
        list.sort(String::compareTo);
        System.out.println(list);
    }
}
