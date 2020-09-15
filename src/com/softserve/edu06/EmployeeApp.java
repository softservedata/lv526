package com.softserve.edu06;


import java.util.Arrays;
import java.util.Scanner;


public class EmployeeApp {
    public static void main(String[] args) {
        Employee e1 = new Employee("Nick", 1, 54);
        Employee e2 = new Employee("Ben", 2, 13);
        Employee e3 = new Employee("Ron", 3, 36);
        Employee e4 = new Employee("Jane", 4, 71);
        Employee e5 = new Employee("Marry", 5, 69);
        Employee []arr = {e1, e2, e3, e4, e5};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of depatment (1-5): ");
        int a = sc.nextInt();
        if (0 < a && a<6 ) {
            System.out.println(arr[a-1].toString());
        }
        else System.out.println("error");

        System.out.println("Non sorted: "+Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].getSalary() > arr[i + 1].getSalary()) {
                Employee tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;

            }
        }
        for (int i = 0; i < arr.length / 2; i++) {
            Employee tmp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = tmp;
        }
        System.out.print("Sorted: ");
        System.out.println(Arrays.toString(arr));


    }


}
