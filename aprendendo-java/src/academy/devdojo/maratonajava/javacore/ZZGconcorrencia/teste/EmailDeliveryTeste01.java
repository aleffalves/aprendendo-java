package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.teste;


import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio.dominio.Members;
import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.servirce.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTeste01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jiraya = new Thread(new EmailDeliveryService(members),"Jiraya");
        Thread kakashi = new Thread(new EmailDeliveryService(members),"Kakashi");

        jiraya.start();
        kakashi.start();

        while (true){
            String email = JOptionPane.showInputDialog("login");
            if (email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMembersEmail(email);
        }
    }
}
