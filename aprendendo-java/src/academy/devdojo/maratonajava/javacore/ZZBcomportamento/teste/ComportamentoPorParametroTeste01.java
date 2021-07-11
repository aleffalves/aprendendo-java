package academy.devdojo.maratonajava.javacore.ZZBcomportamento.teste;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste01 {
    private static List<Car> cars = List.of(
            new Car("red", 2012),
            new Car("black", 1999),
            new Car("green", 2019));


    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars,"green"));
        System.out.println(filterCarByColor(cars,"black"));
        System.out.println( "---------");
        System.out.println(filterByYearBefore(cars,2020));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterCarByColor(List<Car> cars , String cor) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterByYearBefore(List<Car> cars , int year) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }


}
