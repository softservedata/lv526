package com.softserve.edu5.practical_tasks;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Enter three numbers.Find out how many of them are odd.
         */
        int count = 0;

        for(int i = 0; i < 3; ++i) {
            int a = sc.nextInt();
            if (a % 2 != 0) {
                ++count;
            }
        }

        System.out.println("How many of them are odd ? Answer: = " + count);
        /*
            Enter the number of the day of the week.Display the name in three languages.
        */
        System.out.print("Input number of week day = ");
        switch(sc.nextInt()) {
            case 1:
                System.out.println("Понеділок,Monday,Montag");
                break;
            case 2:
                System.out.println("Вівторок,Thuesday,Dienstag");
                break;
            case 3:
                System.out.println("Середа ,Wensday,Mittwoch");
                break;
            case 4:
                System.out.println("Четвер ,Thuesday, Donnerstag");
                break;
            case 5:
                System.out.println("Пятниця,Friday,Frietag");
                break;
            case 6:
                System.out.println("Субота,Saturday,Samstag");
                break;
            case 7:
                System.out.println("Неділя,Sunday,Sonntag");
        }
    }
}
