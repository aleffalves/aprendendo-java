package academy.devdojo.maratonajava.javacore.Gassociacao.teste01;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Maradona");
        Jogador jogador2 = new Jogador("Messi");
        Time time = new Time("Argentina");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("----- Jogador-----");
        jogador.imprime();
        System.out.println("----- Jogador2-----");
        jogador2.imprime();
        System.out.println("----Time-----");
        time.imprime();
    }
}
