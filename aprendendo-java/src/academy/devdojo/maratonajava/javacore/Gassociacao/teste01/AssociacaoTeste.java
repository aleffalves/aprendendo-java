package academy.devdojo.maratonajava.javacore.Gassociacao.teste01;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das Pedras");
        Aluno aluno = new Aluno("Lupan", 22);
        Aluno aluno2 = new Aluno("Vinicius", 24);
        Professor professor = new Professor("Aloprado", "Gastronomia");
        Aluno[] alunosParaSeminario = {aluno,aluno2};
        Seminario seminario = new Seminario("Aprendendo a cozinhar", alunosParaSeminario, local);
        professor.setSeminarios(seminario);
        professor.imprime();
    }
}
