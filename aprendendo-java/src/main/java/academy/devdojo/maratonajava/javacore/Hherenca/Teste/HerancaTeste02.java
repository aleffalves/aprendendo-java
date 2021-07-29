package academy.devdojo.maratonajava.javacore.Hherenca.Teste;

import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Funcionario;

public class HerancaTeste02 {
    // 0 - Bloco de inicializaçâo estatico da super classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaco em memória pro objeto da classe pai
    // 3 - Cada atributo da classe é criado e inicializado com valores padroes ou o que for passado da classe pai
    // 4 - Bloco de inicializacao da super classe é executado na ordem em que aparece
    // 5 - Construtor da superclasse é executado
    // 6 - Alocado espaco em memória pro objeto da sub classe
    // 3 - Cada atributo da classe é criado e inicializado com valores padroes ou o que for passado da subclasse
    // 4 - Bloco de inicializacao da subclasse é executado na ordem em que aparece
    // 5 - Construtor da subclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
    }
}
