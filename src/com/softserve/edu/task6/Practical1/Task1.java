package com.softserve.edu.task6.Practical1;

import java.util.*;


public class Task1 {
    private static void operationWithList() {
        Random random = new Random();
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int o = random.nextInt(30);
            myList.add(o);
        }
        System.out.println("Original : \n" + myList);

        myList.set(2, 1);
        myList.set(8, -3);
        myList.set(5, -4);
        System.out.println("Changed myList \n " + myList);
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) > 5) {
                newList.add(myList.get(i));

            }
        }
        System.out.println("NewCollection (values > 5) : \n " + newList);
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer < 20) {
                iterator.remove();
            }
        }
        System.out.println("New List without (values > 20) \n  " + myList);
        System.out.println("Sorted myList : ");
        Collections.sort(myList);
        System.out.println(myList);

    }

    public static void main(String[] args) {
        operationWithList();
    }
}