package com.softserve.edu7.Homework.task_with_interface;

import java.util.Scanner;

public class ApplEmployee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = 0;

        Payment[] em1 = {new ContractEmployee("Steve"),
                        new SalariedEmployee("Mark",100),
                        new ContractEmployee("Peter"),
                        new SalariedEmployee("Gregor",120)};


        for (int i = 0; i <em1.length ; i++) {
            if(em1[i] instanceof ContractEmployee){
                System.out.println();
                System.out.println(em1[i].toString());
                System.out.print("Input full salary ");
                salary  = em1[i].calculatePay(sc.nextInt()) * 0.8 ;
                System.out.println("Salary = " + salary  );
        }
            if(em1[i] instanceof SalariedEmployee){
                System.out.println();
                System.out.println(em1[i].toString());
                System.out.print("Input hours  ");
                salary  = em1[i].calculatePay(sc.nextInt()) * 0.8 ;
                System.out.println("Salary = " + salary );
            }

        }

    }
}
