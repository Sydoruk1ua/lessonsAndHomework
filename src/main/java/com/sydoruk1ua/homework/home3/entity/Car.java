package com.sydoruk1ua.homework.home3.entity;

public class Car {
    private final Long carId;
    private final String brand;
    private final String model;
    private final Integer manufactureYear;
    private final String color;
    private final Integer price;
    private final String registrationNumber;

    public Car(Long carId, String brand, String model, Integer manufactureYear,
               String color, Integer price, String registrationNumber) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }

    public Long getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getManufactureYear() {
        return manufactureYear;
    }

    public String getColor() {
        return color;
    }

    public Integer getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
