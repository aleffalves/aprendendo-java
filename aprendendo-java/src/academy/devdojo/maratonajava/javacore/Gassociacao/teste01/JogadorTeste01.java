package academy.devdojo.maratonajava.javacore.Gassociacao.teste01;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Péle");
        Jogador jogador2= new Jogador("Ronaldo");
        Jogador jogador3= new Jogador("Neymar");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
