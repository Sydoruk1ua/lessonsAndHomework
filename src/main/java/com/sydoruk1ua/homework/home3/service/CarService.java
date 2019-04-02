package com.sydoruk1ua.homework.home3.service;

import com.sydoruk1ua.homework.home3.entity.Car;
import com.sydoruk1ua.homework.home3.repository.CarRepository;

public class CarService {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car[] findCarsByBrand(String brand){
        return carRepository.findCarsByBrand(brand);
    }

    public Car[] findCarsByModelAndUsedMoreNYears(String model, Integer termOfUsingInYears) {
        return carRepository.findCarsByModelAndUsedMoreNYears(model, termOfUsingInYears);
    }

    public Car[] findCarsByManufactureYearAndPriceMoreThanN(Integer manufactureYear, Integer price) {
        return carRepository.findCarsByManufactureYearAndPriceMoreThanN(manufactureYear, price);
    }

}
