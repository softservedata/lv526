package com.softserve.edu06;


public class Pracktikal_task06 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{10, 15, 30, 17, -10, 6, -7, 9, -17, -20};
        int max = arr[0];
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }

        System.out.println("The biggest: " + max);

        int p = 0;
        int pm = 0;
        for (int value : arr) {
            if (value > 0)
                p = p + value;
            pm++;
        }
        System.out.println("The sum of positive numbers in the array: " + p);

        int a = 0;
        for (int value : arr) {
            if (value < 0)
                a++;
        }
        System.out.println("The amount of negative numbers: " + a);

        if (pm > a)
            System.out.println("Positive more: " + (pm - a));
        else if (pm == a)
            System.out.println("Positive = Negative: " + a);
        else
            System.out.println("Negative more :" + (a - pm));
    }


}
