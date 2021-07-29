package academy.devdojo.maratonajava.javacore.Uregex.teste;

public class ScannerTeste01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa, 300, oi";
        String[] nomes = texto.split(",");
        for (String nome: nomes) {
            System.out.println(nome.trim());
        }

    }
}
