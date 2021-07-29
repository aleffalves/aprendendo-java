package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.teste;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AirCraft;

public class AircraftTeste01 {
    public static void main(String[] args) {

    }

    private static void bookSeat(String seat){
        AirCraft airCraft = new AirCraft("787-900");
        System.out.println(airCraft.bookSeat(seat));
    }
}
