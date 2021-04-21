package academy.devdojo.maratonajava.javacore.Oexcecao.runtime;

public class RuntimeException02 {
    public static void main(String[] args) {
        divisao(10,0);

    }
    //@param a
    //@param b não pode ser zero
    //@return
    //@throws IllegalArgumentException caso b seja zero


    private static int divisao( int a, int b) {
        if( b == 0){
            throw new RuntimeException("Caracter Inválido, não pode ser 0");
        }
        return a/b;
    }
}
