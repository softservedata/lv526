package com.softserve.edu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("First Task");
        System.out.println("Input variables :");
        System.out.print("a = ");
        int  a = sc.nextInt();
        System.out.print("b = ");
        int  b = sc.nextInt();

        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("a / b = " + (a / b) );

        //2
        System.out.println("Second task\n");
        System.out.println("How are you");
        String answer = sc.next();
        System.out.println("You are " + answer);

        /* Flower bed is shaped like circle . Calculate
            the perimeter and area by entering the radius.
            Output obtained results.
         */

        System.out.println("First homework");
        System.out.print("Input radius = ");
        double radius = sc.nextDouble();
        double perimeter =  2 * Math.PI * radius;
        System.out.println("Perimetr = "+ perimeter);
        double area = Math.PI + Math.pow(radius,2);
        System.out.println("Area = "+ area);

        /*Define String variables name and address.
          Output question "What is your name" Read the value
          name and output next question: "Where are you live,(name)".
          Read address and write whole information
         */
        System.out.println("Second homework");
        System.out.println("What is your name ?");
        String name =  sc.next();
        System.out.println("Where are you live, " + name + " ?");
        String address = sc.next();
        System.out.println(name + ", " + address);

          /* Phone calls from three different countries are c1,c2,c3
          standard units per minute. Talks continued t1,t2 and t3 minutes.
          How much computer will count each call separately and all together?
          Input all source data from console, make calculations and output to the screen !!!
         */

          System.out.println("Input how many calls per minute ");
        System.out.print("C1 :=");
       int c1 = sc.nextInt();
        System.out.print("C2 :=");
       int c2 = sc.nextInt();
        System.out.print("C3 :=");
       int c3 = sc.nextInt();
        int f1,f2,f3;
        int countF1 = 0;
        int countF2 = 0;
        int countF3 = 0;
        for (int i = 0; i <c1 ; i++) {
            System.out.println("Input time of call number "+ i +" from country c1" );
            f1 = sc.nextInt();
            countF1+=f1;
        }

        for (int i = 0; i <c2 ; i++) {
            System.out.println("Input time of call number "+ i +" from country c2" );
            f2 = sc.nextInt();
            countF2+=f2;
        }

        for (int i = 0; i <c3 ; i++) {
            System.out.println("Input time of call number "+ i +" from country c3" );
             f3 = sc.nextInt();
            countF3+=f3;
        }
        int together = countF1+countF2+countF3;
        System.out.println("Time of calls from c1 = " + countF1);
        System.out.println("Time of calls from c2 = " + countF2);
        System.out.println("Time of calls from c3 = " + countF3);
        System.out.println("Total time from all c = " + together);

    }
}
