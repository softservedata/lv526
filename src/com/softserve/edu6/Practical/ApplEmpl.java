package com.softserve.edu6.Practical;

import java.util.Scanner;

public class ApplEmpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee em1 = new Employee("Andriy",2,2000);
        Employee em2 = new Employee("Oksana ",1,2500);
        Employee em3 = new Employee("Oleksiy",2,3000);
        Employee em4 = new Employee("Ivan",3,4000);
        Employee em5 = new Employee("Volodya",3,2000);
        Employee[] a = {em1,em2,em3,em4,em5};

        /*-
        Create a class Employee with fields name,department number,salary.Create five objects of class Employee.Display
        1)all employees of a certain department (enter department number in console)
         */
        System.out.println("Input number of department");
        int b = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if( a[i].getDepartment_number()== b){
                System.out.println(a[i].toString());
                }else{
                System.out.println("Not such department");
                break;
            }
            }
            sc.close();
        /*
        arrange workers by the field salary in descending order.
         */
        System.out.println("Origin array");
        for (Employee empl :a) {
            System.out.println(empl.toString());
        }
        for (int i = 0; i <a.length -1 ; i++) {
            for (int j = 0; j <a.length -i -1  ; j++) {
                if(a[j].getSalary() > a[j+1].getSalary()){
                    Employee temp  =a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }

        }
        System.out.println("Sorted array");
        for (Employee empl :a) {
            System.out.println(empl.toString());
        }
        }
        }

