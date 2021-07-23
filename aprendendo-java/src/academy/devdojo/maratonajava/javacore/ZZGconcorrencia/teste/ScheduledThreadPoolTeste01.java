package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.teste;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTeste01 {
    private static final ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private static void beeper(){
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(formatter) + " beep");
        };

        //ses.schedule(r,5, TimeUnit.SECONDS);
        ScheduledFuture<?> scheduledFuture = ses.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS);
        ses.schedule(() ->{
            System.out.println(LocalTime.now().format(formatter) + " Cancelando beep");
            scheduledFuture.cancel(false);
            ses.shutdown();
        },10,TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(formatter));
        beeper();
    }
}
