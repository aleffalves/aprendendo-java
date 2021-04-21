package academy.devdojo.maratonajava.javacore.Oexcecao.error;

public class StackOverFlow {
    public static void main(String[] args) {
        recursividade();

    }

    public static void recursividade(){
        recursividade();
    }
}
