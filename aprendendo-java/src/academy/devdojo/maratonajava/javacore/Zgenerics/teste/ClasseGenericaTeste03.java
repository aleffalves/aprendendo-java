package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(
                List.of(new Carro("BMW"),
                        new Carro("Audi")));
        List<Barco> barcosDisponiveis = new ArrayList<>(
                List.of(new Barco("Lancha"),
                        new Barco("Iate")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
                System.out.println("ALUGADO POR UM MÊS!");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("--------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("ALUGADO POR 1 MÊS!");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
