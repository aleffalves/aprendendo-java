package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.teste01;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1= new Carro("BMW", 280);
        Carro c2= new Carro("Mercedes", 310);
        Carro c3= new Carro("Audi", 290);
        c1.setVelocidadeLimite(180);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
