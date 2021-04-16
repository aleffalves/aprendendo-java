package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.TV;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("DEVi9",13250.0);
        Tomate tomate = new Tomate("Tomate Siciliano", 10.0);
        TV televisao = new TV("Samsung 56\" ", 4500.0);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
