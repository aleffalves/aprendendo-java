package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero01+numero02);
        System.out.println("Valor "+numero02+numero01);
        System.out.println(numero02+numero01+" Valor "+numero02+numero01);
        int resultado = numero01 * numero02;
        System.out.println(resultado);

        //% resto
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);

        // && (AND), || (or) !

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 200;
        bonus *= 2;
        bonus /=2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador+= 1;
        contador ++;
        contador--;
        ++contador;
        --contador;

        System.out.println(contador);

    }
}
