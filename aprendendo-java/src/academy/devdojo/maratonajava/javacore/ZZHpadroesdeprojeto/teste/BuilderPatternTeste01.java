package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.teste;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTeste01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Aleff")
                .lastName("Alves")
                .userName("aleffalves")
                .email("aleff.alves@gmail.com")
                .build();
        System.out.println(build);
    }
}
