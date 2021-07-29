package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste01 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        if (calendario.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primerio dia da semana");
        }
        System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendario.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendario.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendario.add(Calendar.DAY_OF_MONTH, 2);
        calendario.add(Calendar.HOUR, 2);
        Date date = calendario.getTime();
        System.out.println(date);
    }
}
