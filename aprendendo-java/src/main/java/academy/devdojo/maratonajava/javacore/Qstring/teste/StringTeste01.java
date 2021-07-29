package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "Aleff Alves"; //String constant pool
        String nome2 = "Aleff Alves";
        nome = nome.concat(" Porto"); // nome += " Porto"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Aleff Alves");// 1 variavel de referencia, 2 objeto do tipo string, 3 uma string no pool de String
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
