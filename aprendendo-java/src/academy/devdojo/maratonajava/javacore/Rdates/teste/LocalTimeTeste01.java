package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(22, 32, 15);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(timeNow.getHour());
        System.out.println(timeNow.getMinute());
        System.out.println(timeNow.getSecond());
        System.out.println(timeNow.getNano());
        System.out.println(timeNow.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
    }
}
