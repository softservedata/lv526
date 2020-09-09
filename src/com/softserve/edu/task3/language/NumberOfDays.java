package com.softserve.edu.task3.language;

import java.util.Scanner;

enum DaysOfWeek {

    DAY1("EN- Monday, \n UK- Понеділок, \n RU- Понедельник"),
    DAY2("EN- Tuesday, \n UK- Вівторок, \n RU- Вторник"),
    DAY3("EN- Wednesday, \n UK- Середа, \n RU- Среда"),
    DAY4("EN- Thursday, \n UK- Четвер, \n RU- Четверг"),
    DAY5("EN- Friday, \n UK- Пятниця, \n RU- Пятница"),
    DAY6("EN- Saturday, \n UK- Субота, \n RU- Суббота"),
    DAY7("EN- Sunday, \n UK- Неділя, \n RU- Воскресенье"),
    DAY8("Invalid Day");

    private String message;


    DaysOfWeek(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number day of week = ");
        int dayNumber = scanner.nextInt();
        DaysOfWeek result = DaysOfWeek.DAY8;
        try {
            result = DaysOfWeek.valueOf("DAY" + String.valueOf(dayNumber));
        } catch (Exception e) {
            System.out.println("Day not found, sorry)");
        }
        System.out.println("Message: " + result.getMessage());
        scanner.close();
    }
}