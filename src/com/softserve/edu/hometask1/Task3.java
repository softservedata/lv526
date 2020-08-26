package com.softserve.javacore.hometask1;

import java.util.Scanner;

/**Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results.
 */

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Please enter radius value");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("The circuit is " + 2*3.14*r);
        System.out.println("The square is " + 3.14*(r*r));
// or using Math class:
        System.out.println("The square is " + 3.14*Math.pow(r, 2));

    }
}
