package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(
            List.of(new Barco("Lancha"),
                    new Barco("Iate")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barco disponivel:");
        System.out.println(barcosDisponiveis);
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("Carros dispóniveis para alugar:");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo barco "+barco);
        barcosDisponiveis.add(barco);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
