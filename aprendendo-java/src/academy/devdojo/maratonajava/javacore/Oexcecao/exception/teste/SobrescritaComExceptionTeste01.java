package academy.devdojo.maratonajava.javacore.Oexcecao.exception.teste;

import academy.devdojo.maratonajava.javacore.Oexcecao.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexcecao.exception.dominio.Pessoa;

public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();

    }
}
