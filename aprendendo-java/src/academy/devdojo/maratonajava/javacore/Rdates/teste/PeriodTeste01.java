package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTeste01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusMonths(1).plusDays(45);
        Period periodo = Period.between(now,nowAfterTwoYears);
        Period periodo2 = Period.ofDays(84);
        Period periodo3 = Period.ofMonths(14);
        Period periodo4 = Period.ofYears(22);
        Period periodo5 = Period.ofWeeks(128);

        System.out.println(periodo);
        System.out.println(periodo2);
        System.out.println(periodo3);
        System.out.println(periodo4);
        System.out.println(periodo5);
        System.out.println(Period.between(now, now.plusDays(periodo5.getDays())).getMonths());
        System.out.println(now.until(now.plusDays(periodo5.getDays()), ChronoUnit.MONTHS));

    }
}
