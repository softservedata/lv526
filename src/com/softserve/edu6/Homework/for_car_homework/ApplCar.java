package com.softserve.edu6.Homework.for_car_homework;


import java.util.Scanner;

public class ApplCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] cars = new Car[4];
        cars[0] = new Car("Supercar", 2000, 1.5);
        cars[1] = new Car("Sedan", 1997, 1.6);
        cars[2] = new Car("Van", 2008, 1.8);
        cars[3] = new Car("Truck", 2000, 2.0);
        System.out.println("Input year of car");
        int a = sc.nextInt();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYear() == a) {
                System.out.println(cars[i].toString());
            }
        }

        Car tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length - 1; j++) {
                if (cars[i].getYear() >cars[j].getYear()){
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;

                }

            }


        }
        System.out.println("\nSotring by year ");
        for (Car c :cars
             ) {
            System.out.println(c.toString());
        }
    }
}
