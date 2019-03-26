package com.sydoruk1ua.homework.home3;

import com.sydoruk1ua.homework.home3.entity.Car;
import com.sydoruk1ua.homework.home3.repository.CarRepository;
import com.sydoruk1ua.homework.home3.service.CarService;
import com.sydoruk1ua.homework.home3.ui.ConsoleCarUi;

public class ConsoleCarApp {

    public static final int CARS_NUMBER = 5;

    public static void main(String[] args) {
        Car[] cars = new Car[CARS_NUMBER];
        cars[0] = new Car(1L, "Mercedes", "S560", 2007, "white", 2_000_000,
                "AA5689KB");
        cars[1] = new Car(34L, "Mercedes", "S565", 2005, "black", 2_500_000,
                "AA5670KB");
        cars[2] = new Car(21L, "Volkswagen", "S560", 2003, "green", 1_000_000,
                "AA6521KB");
        cars[3] = new Car(41L, "Volkswagen", "mini", 2005, "white", 2_800_000,
                "AA0007KB");
        cars[4] = new Car(52L, "Volkswagen", "S560", 2005, "white", 2_300_000,
                "AA8888KB");

        CarRepository carRepository = new CarRepository(cars);
        CarService carService = new CarService(carRepository);

        ConsoleCarUi consoleCarUi = new ConsoleCarUi(carService);
        consoleCarUi.run();

    }
}
