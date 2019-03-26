package com.sydoruk1ua.homework.home3.repository;

import com.sydoruk1ua.homework.home3.entity.Car;

import java.time.LocalDate;
import java.util.Arrays;

public class CarRepository {
    private Car[] cars;

    public CarRepository(Car[] cars) {
        this.cars = cars;
    }

    public Car[] findCarsByBrand(String brand) {
        Car[] carsByBrand = new Car[cars.length];
        int countRelevantCars = 0;
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                carsByBrand[countRelevantCars] = car;
                countRelevantCars++;
            }
        }
        return Arrays.copyOf(carsByBrand, countRelevantCars);
    }

    public Car[] findCarsByModelAndUsedMoreNYears(String model, Integer termOfUsingInYears) {
        Car[] carsByModelAndUsedMoreNYears = new Car[cars.length];
        Integer currentYear = LocalDate.now().getYear();
        int countRelevantCars = 0;
        for (Car car : cars) {
            if (car.getModel().equals(model) && (currentYear - car.getManufactureYear() > termOfUsingInYears)) {
                carsByModelAndUsedMoreNYears[countRelevantCars] = car;
                countRelevantCars++;
            }
        }
        return Arrays.copyOf(carsByModelAndUsedMoreNYears, countRelevantCars);
    }

    public Car[] findCarsByManufactureYearAndPriceMoreThanN(Integer manufactureYear, Integer price) {
        Car[] carsByManufactureYearAndPriceMoreThanN = new Car[cars.length];
        int countRelevantCars = 0;
        for (Car car : cars) {
            if (car.getManufactureYear().equals(manufactureYear)
                    && (car.getPrice() > price)) {
                carsByManufactureYearAndPriceMoreThanN[countRelevantCars] = car;
                countRelevantCars++;
            }
        }
        return Arrays.copyOf(carsByManufactureYearAndPriceMoreThanN, countRelevantCars);
    }
}
