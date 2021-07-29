package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.List;

public class MetodoGenericoTeste01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa Marota"));
        criarArrayComUmObjeto(new Carro("BMW"));
    }

    private static <T> void criarArrayComUmObjeto(T t){
        List<T> list = List.of(t);
        System.out.println(list);
    }
}
