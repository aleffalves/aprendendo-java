package academy.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste02 {
    public static void main(String[] args) {
        //  \d = Todos os dígitos
        // \D = Tudo que não for dígito
        // \s = Todos os epaços em branco no java: \t \n \f \r
        // \S = Todos que não estiverem em branco
        // \w = a-z A-Z, digítos, _
        // \W = Tudo que não for \w
        // []
        //String regex = "[a-zA-B]";
        String regex = "0[xX][0-9a-fA-F]";
      //  String texto = "abaaba";
        String texto2 = "21 0x 0X 0xFFABC 0x 0x109 0x2";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }

}
