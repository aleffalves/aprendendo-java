package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num01 = 1;
        int num02 = 2;
        calculadora.alteraDoisNumeros(num01,num02);
        System.out.println("Dentro do CalculadoraTeste04");
        System.out.println("Num01 " +num01);
        System.out.println("Num02 " +num02);

    }
}
