package com.softserve.edu.task3.OodOrNo;

import java.util.Scanner;

public class OodOrNo {
    private int [] array = new int[3];

    public static void main(String[] args) {
        OodOrNo oodOrNo = new OodOrNo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        oodOrNo.array[0] = scanner.nextInt();
        System.out.println("Input next number: ");
        oodOrNo.array[1] = scanner.nextInt();
        System.out.println("Input last number: ");
        oodOrNo.array[2] = scanner.nextInt();

        for (int i = 0; i < oodOrNo.array.length; i++) {
            String h = oodOrNo.array[i] % 2 == 0 ? "ood" : "noOod";
            System.out.println(h);
        }
    }
}
