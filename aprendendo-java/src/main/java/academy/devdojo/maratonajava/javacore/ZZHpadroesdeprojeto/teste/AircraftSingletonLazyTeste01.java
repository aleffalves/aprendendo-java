package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.teste;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AirCraftSingletonEnum;

public class AircraftSingletonLazyTeste01 {
    public static void main(String[] args) {
        AircraftSingletonLazyTeste01.bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AirCraftSingletonEnum.getINSTANCE());
        AirCraftSingletonEnum airCraftSingletonEnum = AirCraftSingletonEnum.getINSTANCE();
        System.out.println(airCraftSingletonEnum.bookSeat(seat));
    }
}
