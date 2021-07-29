package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTeste01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYers = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
        Duration duration = Duration.between(now,nowAfterTwoYers);
        Duration duration2 = Duration.between(timeNow,timeMinus7Hours);
        Duration duration3 = Duration.between(Instant.now(),Instant.now().plusSeconds(100));
        System.out.println(duration);
        System.out.println(duration2);
        System.out.println(duration3);

    }
}
