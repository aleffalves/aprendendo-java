package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args){
        // idade < 15 categoria infantil
        // idade >= && idade <18 categoria juvenil
        // idade >= 18 catergoria adulto
        int idade = 12;
        if(idade < 15){
            System.out.println("Categoria Infantil");
        }else if(idade >=15 && idade < 18){
            System.out.println("Categoria Juvenil");
        }else {
            System.out.println("Categoria Adulto");
        }

    }
}
