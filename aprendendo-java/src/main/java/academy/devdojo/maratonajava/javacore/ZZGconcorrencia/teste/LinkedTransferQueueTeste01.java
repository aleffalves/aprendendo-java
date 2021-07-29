package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.teste;

import java.util.concurrent.*;

public class LinkedTransferQueueTeste01 {
    public static void main(String[] args) {
//        ConcurrentLinkedDeque, SynchronousQueue, LinkedBlockingDeque
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("alves"));
        System.out.println(tq.offer("alves"));
        System.out.println(tq.remainingCapacity());
    }
}

