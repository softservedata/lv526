package com.softserve.hw5;

import java.util.Scanner;





public class ErrorReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter HTTP Code = ");
        int httpCode = scanner.nextInt();
        HTTPError result = HTTPError.HTTP000;
        try {
            result = HTTPError.valueOf("HTTP" + String.valueOf(httpCode));
        } catch (Exception e) {
            System.out.println("Converting ERROR");
        }
        System.out.println("Massage : " + result.getMassage());
        scanner.close();
    }
}