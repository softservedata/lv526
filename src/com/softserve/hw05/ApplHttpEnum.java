package com.softserve.hw05;

import java.util.Scanner;

enum HTTPError {
    HTTP400("Bad Request"),
    HTTP401("Unauthorized"),
    HTTP402("Payment Required"),
    HTTP403("Forbidden"),
    HTTP404("Not Found"),
    HTTP999("Invalid Code");

    private String message;

    //
    private HTTPError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}

public class ApplHttpEnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter HTTP Code = ");
        int httpCode = scanner.nextInt();
        HTTPError result = HTTPError.HTTP999;
        try {
            result = HTTPError.valueOf("HTTP" + String.valueOf(httpCode));
        } catch (Exception e) {
            System.out.println("Converting Error");
        }
        System.out.println("Message: " + result.getMessage());
        scanner.close();
    }
}
