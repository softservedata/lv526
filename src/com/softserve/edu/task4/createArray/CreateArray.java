package com.softserve.edu.task4.createArray;

import java.util.Arrays;

public class CreateArray {
    public static int getLargest(int[] array, int total) {
        Arrays.sort(array);
        return array[total - 1];
    }

    public static int sumOfPositivesRecursive(int[] a) {
        return sumOfPositivesHelper(a, a.length);
    }

    public static int sumOfPositivesHelper(int[] a, int n) {
        if (n == 0) {
            return 0;
        }
        return a[n - 1] > 0 ? a[n - 1]
                + sumOfPositivesHelper(a, n - 1)
                : sumOfPositivesHelper(a, n - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, -3, 4, -5, 6, 7, -8, 12, 10};

        int sum = 0;
        for (int num : array) {
            sum = sum + num;
        }

        System.out.println("Sum of array all elements is: " + sum);
        System.out.println("Largest: " + getLargest(array, 10));
        System.out.println("Sum of positive elements in array: " + sumOfPositivesRecursive(array));
        System.out.println("Negative numbers in the array " + Arrays.stream(array).filter(i -> i < 0).count());
    }

}
