package br.com.dio.model;

public class Car {
    private final String carBrand;
    private final String carModel;

    public Car(String carBrand, String carModel) {
        this.carBrand = carBrand;
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "{" + "carBrand='" + carBrand + '\'' + ", carModel='" + carModel + '\'' + '}';
    }
}
