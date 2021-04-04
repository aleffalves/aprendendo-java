package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioExercicio01 {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Aleksibi";
        funcionario.idade = 26;
        funcionario.salarios = new double[]{1350, 2235.86, 1545};

        funcionario.imprime();
        funcionario.imorimeMediaSalario();
    }
}
