package br.com.dio;

import br.com.dio.model.Car;

public class FirstProgram {
    public static void main(String[] args) {
        Car myCar = new Car("Volkswagen", "Golf");
        System.out.println("Brand: " + myCar.getCarBrand());
        System.out.println("Model: " + myCar.getCarModel());
    }
}
