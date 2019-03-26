package com.sydoruk1ua.homework.home3.ui;

import com.sydoruk1ua.homework.home3.entity.Car;
import com.sydoruk1ua.homework.home3.service.CarService;

import java.util.Scanner;

public class ConsoleCarUi {
    private CarService carService;
    private Scanner scanner;

    public ConsoleCarUi(CarService carService) {
        this.carService = carService;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("Would you like to find cars by brand? Yes/No");
        String trigger = scanner.next();
        if (trigger.equalsIgnoreCase("Yes")) {
            System.out.println("Please enter brand name");
            String brand = scanner.next();
            System.out.println("List of cars by " + brand + " brand:");
            for (Car car : carService.findCarsByBrand(brand)) {
                System.out.println(car);
            }
            System.out.println("------------------------------");
        }

        System.out.println("Would you like to find cars by model and used more than n years? Yes/No");
        trigger = scanner.next();
        if (trigger.equalsIgnoreCase("Yes")) {
            System.out.println("Please enter model name");
            String model = scanner.next();
            System.out.println("Please enter term of use in years");
            Integer termOfUsingInYears = scanner.nextInt();
            System.out.println(termOfUsingInYears);
            System.out.println("List of cars by " + model + " model and term of using more than "
                    + termOfUsingInYears + " year/years");
            for (Car car : carService.findCarsByModelAndUsedMoreNYears(model, termOfUsingInYears)) {
                System.out.println(car);
            }
            System.out.println("------------------------------");
        }

        System.out.println("Would you like to find cars by year of manufacture and price more than n? Yes/No");
        trigger = scanner.next();
        if (trigger.equalsIgnoreCase("Yes")) {
            System.out.println("Please enter year of manufacture");
            Integer manufactureYear = scanner.nextInt();
            System.out.println("Please enter car's price");
            Integer price = scanner.nextInt();
            System.out.println(String.format("List of cars by manufacture year (%d) and price (%d) ",
                    manufactureYear, price));
            for (Car car : carService.findCarsByManufactureYearAndPriceMoreThanN(manufactureYear, price)) {
                System.out.println(car);
            }
            System.out.println("------------------------------");
        }
    }
}
