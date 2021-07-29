package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50
    public static void main(String[] args) {
        int valorInicio = 11;
        for (int i = valorInicio; i <= 1000000; i++) {
            if (i > valorInicio+25){
                break;
            }
            System.out.println(i);
        }
    }
}
