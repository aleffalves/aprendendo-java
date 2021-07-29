package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.teste;

public class OuterClassesTeste01 {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTeste01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTeste01 outerClassesTeste01 = new OuterClassesTeste01();
        Inner inner = outerClassesTeste01.new Inner();
        inner.printOuterClassAttribute();

    }
}
