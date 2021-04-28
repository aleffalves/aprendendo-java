package academy.devdojo.maratonajava.javacore.Sformatacao.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTeste01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.ISO_DATE);
        String s2 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("2021-04-27",DateTimeFormatter.ISO_DATE);
        LocalDate parse2 = LocalDate.parse("20210427",DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2021-04-27",DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2021-04-27T21:38:33.9094088", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBrasil = LocalDate.now().format(formatterBr);
        System.out.println(formatBrasil);
        LocalDate parseBr = LocalDate.parse("27/04/2021",formatterBr);
        System.out.println(parseBr);

        DateTimeFormatter formatterCND = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.CANADA);
        String formatCND = LocalDate.now().format(formatterCND);
        System.out.println(formatCND);
        LocalDate parserCND = LocalDate.parse("27.April.2021", formatterCND);
        System.out.println(parserCND);

    }
}
