package academy.devdojo.maratonajava.javacore.Gassociacao.teste01;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Qual seu Gênero? M ou F: ");
        char genero = entrada.next().charAt(0);
        System.out.println("--------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Genêro: " + genero);

    }
}
