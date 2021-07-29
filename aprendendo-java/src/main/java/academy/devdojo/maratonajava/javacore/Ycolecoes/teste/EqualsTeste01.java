package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC2","iPhone");
        Smartphone s2 = new Smartphone("1ABC2","iPhone");
        System.out.println(s1.equals(s2));
    }
}
