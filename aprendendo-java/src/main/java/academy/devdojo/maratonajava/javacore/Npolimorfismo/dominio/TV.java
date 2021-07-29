package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class TV extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.13;
    public TV(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da TV");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
