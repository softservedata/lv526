package chapter5;

import javax.sound.midi.Soundbank;
import java.io.CharArrayReader;
import java.util.Scanner;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    private static void modelSearcher(Car[] array) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter year of car :");
        int numberYear = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (numberYear == array[i].yearOfProduction) {
                System.out.println(array[i]);
            }
        }
    }

    private static void orderedMethod(Car[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].yearOfProduction < array[j + 1].yearOfProduction) {
                    Car test = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = test;
                }
            }
        }
        for (Car cars : array) {
            System.out.println(cars);
        }


    }


    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public static void main(String[] args) {

        Car car1 = new Car("Sedan", 1994, 2.5);
        Car car2 = new Car("Beep", 2000, 3.5);
        Car car3 = new Car("Beep", 2018, 2.0);
        Car car4 = new Car("Sedan", 2000, 2.4);
        Car[] cars = {car1, car2, car3, car4};
        modelSearcher(cars);
        System.out.println("------------------");
        orderedMethod(cars);
    }
}
