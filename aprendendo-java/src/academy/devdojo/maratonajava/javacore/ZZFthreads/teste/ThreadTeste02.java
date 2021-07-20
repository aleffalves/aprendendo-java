package academy.devdojo.maratonajava.javacore.ZZFthreads.teste;

class ThreadExample2 extends Thread {
    private char c;

    public ThreadExample2(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunnable2 implements Runnable {
    private String c;

    public ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            Thread.yield();
        }
    }
}

public class ThreadTeste02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable2("KAME"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("Haa"));
        t1.start();
        t1.join();
        t2.start();
    }
}

