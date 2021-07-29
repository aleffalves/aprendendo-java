package academy.devdojo.maratonajava.javacore.ZZBcomportamento.teste;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste02 {
    private static List<Car> cars = List.of(
            new Car("red", 2012),
            new Car("black", 1999),
            new Car("green", 2019));


    public static void main(String[] args) {
        filterCar(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green") ;
            }
        });

    }

    private static List<Car> filterCar(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

}
