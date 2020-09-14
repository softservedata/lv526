package com.softserve.edu6.Homework.for_car_homework;

public class Car {
    private String type;
    private int year;
    private double en_capacity ;

    public Car() {
    }

    public Car(String type, int year, double en_capacity) {
        this.type = type;
        this.year = year;
        this.en_capacity = en_capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEn_capacity() {
        return en_capacity;
    }

    public void setEn_capacity(double en_capacity) {
        this.en_capacity = en_capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", en_capacity=" + en_capacity +
                '}';
    }
}
