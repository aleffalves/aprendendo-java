package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AirCraftSingletonEnum {
    private static AirCraftSingletonEnum INSTANCE;
    private String name;

    private AirCraftSingletonEnum(String name) {
        this.name = name;
    }

    private final Set<String> availableSeats = new HashSet<>();

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AirCraftSingletonEnum getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new AirCraftSingletonEnum("787-905");
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
