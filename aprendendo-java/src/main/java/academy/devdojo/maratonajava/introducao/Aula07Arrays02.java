package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args){
        // byte, short, int, long, float, e double = 0
        // chart '\ u0000 ' ' '
        // boolean = false
        // String = null

        String [] nomes = new String[3];
        nomes[0] = "Jake";
        nomes[1] = "Fabricio";
        nomes[2] = "Luana";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
