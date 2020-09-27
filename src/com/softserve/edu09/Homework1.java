package com.softserve.edu09;


import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String s1 = scan.nextLine();

        //String s1 = "My name is Khrystyna Andrukh";

        String[] arr = s1.split(" ");

        String longest = arr[0];
        for(int i = 0; i<arr.length-1; i++){
           if (arr[i].length()<arr[i+1].length()){
               longest = arr[i+1];
           }
        }
        System.out.printf("The longest word is %s. There are %d letters in it.%n", longest, longest.length());

        StringBuilder sb = new StringBuilder(arr[1]);
        System.out.print("Second word reversed: " + sb.reverse());

    }
}
