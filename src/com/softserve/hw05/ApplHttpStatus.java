package com.softserve.hw05;

import java.util.Scanner;

public class ApplHttpStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter HTTP Code = ");
        int httpCode = scanner.nextInt();
        String message = null;
        //
        switch (httpCode) {
        case 400:
            message = "Bad Request";
            break;
        case 401:
            message = "Unauthorized";
            break;
        case 402:
            message = "Payment Required";
            break;
        case 403:
            message = "Forbidden";
            break;
        case 404:
            message = "Not Found";
            break;
        default:
            message = "Invalid Code";
            break;
        }
        //
        System.out.println("Message: " + message);
        scanner.close();
    }
}
