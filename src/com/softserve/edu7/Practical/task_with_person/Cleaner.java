package com.softserve.edu7.Practical.task_with_person;

public class Cleaner extends Staff{


    private int hour;

    public Cleaner(int hour) {
        this.hour = hour;
    }

    final String TYPE_PERSON = "Cleaner";

    @Override
    void print() {
        System.out.println("I am ..");
    }

    @Override
    void salary() {
        double salary = hour* 25;
        System.out.println("Salary of cleaner = " + salary);
    }
    @Override
    public String toString() {
        return "Cleaner{" +
                "hour=" + hour +
                ", TYPE_PERSON='" + TYPE_PERSON + '\'' +
                '}';
    }
}
