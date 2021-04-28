package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.*;
import java.util.Map;

public class ZoneTeste01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId zoneAfrica = ZoneId.of("Africa/Addis_Ababa");
        System.out.println(zoneAfrica);

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(zoneAfrica);
        System.out.println(zonedDateTime);

        Instant now2 = Instant.now();
        ZonedDateTime zonedDateTime1 = now2.atZone(zoneAfrica);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset offset = ZoneOffset.of("-03:00");
        OffsetDateTime offsetDateTime = now.atOffset(offset);
        System.out.println(offsetDateTime);

    }

}
