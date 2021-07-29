package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.teste;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AirCraft;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AirCraftSingletonEager;

public class AircraftSingletonEagerTeste01 {
    public static void main(String[] args) {
        AircraftSingletonEagerTeste01.bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AirCraftSingletonEager.getINSTANCE());
        AirCraftSingletonEager airCraftSingletonEager = AirCraftSingletonEager.getINSTANCE();
        System.out.println(airCraftSingletonEager.bookSeat(seat));
    }
}
