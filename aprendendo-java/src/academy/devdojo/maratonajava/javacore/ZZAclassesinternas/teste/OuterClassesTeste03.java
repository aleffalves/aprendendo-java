package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;

public class OuterClassesTeste03 {
    private String name = "Kakaroto";
    static class  Nested {
        void print(){
            System.out.println(new OuterClassesTeste03().name);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
