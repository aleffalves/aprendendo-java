package academy.devdojo.maratonajava.javacore.Hherenca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public void imprime(){
        super.imprime();
        System.out.println("Salario: " + this.salario);
    }

    public void relatorioDePagamento(){
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
