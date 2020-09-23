package com.softserve.edu8.practical_task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Practical_task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> myCollection = new ArrayList<Integer>();
        System.out.println("Input 10 integer ");

        while (myCollection.size() < 10) {
            int value = sc.nextInt();
            if (value > 5) {
                myCollection.add(value);
            }
        }
        Iterator<Integer> it = myCollection.iterator();
        System.out.println("Origin list " + "\n" + myCollection);

        while (it.hasNext()) {
            Integer i = it.next();
            if (i > 20) {
                it.remove();
            }
        }

        System.out.println("Value in list after editing " + "\n" + myCollection);
        System.out.println("Set elements on position 2,8,5");

        myCollection.set(2, 1);
        myCollection.set(8, -3);
        myCollection.set(5, -4);

        while (it.hasNext() ){
            System.out.println(it.next().toString());
        }
    }

}
