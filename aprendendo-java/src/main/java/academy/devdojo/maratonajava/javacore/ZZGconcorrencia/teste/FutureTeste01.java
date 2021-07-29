package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.teste;

import java.util.concurrent.*;

public class FutureTeste01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollar = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(2);
            return 5.35D;
        });
        System.out.println(doSomething());
        Double dollarResponse = dollar.get(3,TimeUnit.SECONDS);
        System.out.println("Cotação Dollar: " + dollarResponse);
        executorService.shutdown();
    }
    private static long doSomething(){
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 100_000; i++) {
            sum += i;
        }
        return sum;
    }
}
