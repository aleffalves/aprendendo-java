package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(20-10);
    }

    public void multiplicaDoisNumeros(int num01, float num02) {
        System.out.println(num01 * num02);
    }

    public double divideDoisNumeros(double num01, double num02) {
        if (num02 == 0) {
            return 0;
        }
        return num01/num02;
    }

    public void alteraDoisNumeros(int num01, int num02){
        num01 = 83;
        num02 = 62;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num01 " + num01);
        System.out.println("Num02 " + num02);
    }

}
