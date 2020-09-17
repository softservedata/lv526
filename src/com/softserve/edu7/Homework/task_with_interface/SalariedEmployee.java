package com.softserve.edu7.Homework.task_with_interface;

import java.util.UUID;

public class SalariedEmployee extends Employee implements Payment {
    private String employeId =UUID.randomUUID().toString() ;
    private  String name;
   private double hourly_rate;

    @Override
    public double calculatePay(int hour) {
        return  hour * hourly_rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(double hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public SalariedEmployee(String name , double hourly_rate) {
        this.name = name;
        this.hourly_rate = hourly_rate;


    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                ", name='" + name + '\'' +
                ", hourly_rate=" + hourly_rate +
                ", employeId='" + employeId + '\'' +
                '}';
    }
}
