package academy.devdojo.maratonajava.javacore.Gassociacao.teste01;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Girafales");
        Professor professor2 = new Professor("Zezinho");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Chaves School", professores);

        escola.imprime();
    }
}
