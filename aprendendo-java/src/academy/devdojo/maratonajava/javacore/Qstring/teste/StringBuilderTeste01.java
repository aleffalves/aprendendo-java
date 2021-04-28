package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" Dev Dojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Willian Suane");
        sb.append(" Dev Dojo").append(" Academy");
        System.out.println(sb);
    }
}
