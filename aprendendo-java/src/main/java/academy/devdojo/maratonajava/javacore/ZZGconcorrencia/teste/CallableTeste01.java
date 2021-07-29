package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.teste;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        Math.random();
        int num = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < num; i++) {
            System.out.printf("%s Executando callable %n",
                    Thread.currentThread().getName());
        }
        return String.format("%s Finalizada a tarefa %d",
                Thread.currentThread().getName(),num);
    }
}

public class CallableTeste01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> submit = executorService.submit(randomNumberCallable);
        String s = submit.get();
        System.out.printf("Finalizando o Programa %s",s);
        executorService.shutdown();
    }
}
