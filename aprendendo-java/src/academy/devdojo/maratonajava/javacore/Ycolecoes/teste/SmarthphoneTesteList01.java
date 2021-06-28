package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmarthphoneTesteList01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC2","iPhone");
        Smartphone s2 = new Smartphone("A245AD","Pixel");
        Smartphone s3 = new Smartphone("V848A3","Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone s : smartphones){
            System.out.println(s);
        }
        Smartphone s4 = new Smartphone("4HJDH3", "Motorolla");
        smartphones.add(s4);
    }
}
