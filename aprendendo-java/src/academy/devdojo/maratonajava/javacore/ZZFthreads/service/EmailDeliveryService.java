package academy.devdojo.maratonajava.javacore.ZZFthreads.service;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Members;

public class EmailDeliveryService implements Runnable {
    Members members = new Members();

    public EmailDeliveryService(Members members) {

    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Starting to deliver emails...");
        while (members.isOpen() || members.pendingEmails() > 0){
            try {
                String email = members.retrieveEmail();
                if(email == null) continue;
                System.out.println(threadName + " enviado email" + email);

                Thread.sleep(2000);

                System.out.println(threadName + " email enviado" + email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos os emails foram enviados com sucesso!");
    }
}
