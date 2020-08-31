package com.softserve.edu04;

import java.util.Scanner;

public class Practikal_task {
    public static void main(String[] args) {

        String name1, name2, name3;
        int hours1, hours2, hours3;
        int rate1, rate2, rate3;


        //first employee
        Scanner sc = new Scanner(System.in);
        System.out.println("Input information about first employee :");
        System.out.print("Name: ");
        name1=sc.nextLine();
        System.out.print("\nHours: ");
        hours1=sc.nextInt();
        System.out.print("\nRate: ");
        rate1=sc.nextInt();

        Employee e1 = new Employee(name1,hours1,rate1);


        //second employee

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Input information about second employee :");
        System.out.print("Name: ");
        name2=sc2.nextLine();
        System.out.print("\nHours: ");
        hours2=sc2.nextInt();
        System.out.print("\nRate: ");
        rate2=sc2.nextInt();

        Employee e2 = new Employee(name2,hours2,rate2);



        //third employee

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Input information about first employee :");
        System.out.print("Name: ");
        name3=sc3.nextLine();
        System.out.print("\nHours: ");
        hours3=sc3.nextInt();
        System.out.print("\nRate: ");
        rate3=sc3.nextInt();

        Employee e3 = new Employee(name3,hours3,rate3);


        System.out.println("Your first employee: "+e1.toString());
        System.out.println("Your second employee: "+e2.toString());
        System.out.println("Your third employee: "+e3.toString());


        System.out.println("Total salary: "+ (e1.getSalary()+e2.getSalary()+e3.getSalary()));

    }
}
