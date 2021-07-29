package academy.devdojo.maratonajava.javacore.Hherenca.Teste;

import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("21");
        endereco.setCep("32432-123");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Xiriu");
        pessoa.setCpf("136.364.463-21");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Osaka");
        funcionario.setCpf("127.845.456-87");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2670);
        System.out.println("---------");

        funcionario.imprime();
    }
}
