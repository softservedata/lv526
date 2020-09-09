package com.softserve.hw051;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = { -4, 1, -7, 8, 5 };
        //
        int iPos = -1;
        int countPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPos++;
                if (countPos == 2) {
                    iPos = i;
                }
            }
        }
        System.out.println("result: " + (iPos < 0 ? "not found" : "pos = " + countPos));
        //
        int imin = 0;
        int min = arr[imin];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                imin = i;
                min = arr[imin];
            }
        }
        System.out.println("min = " + min + " position = " + imin);
    }
}
