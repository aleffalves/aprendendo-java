package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public abstract class Produto implements Taxavel {
    protected String nome;
    protected Double valor;

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }
}
