package chapter4;

import java.util.Scanner;

enum HTTPError {
    HTTP400("Bad request"),
    HTTP401("Unauthorized"),
    HTTP402("Payment Required"),
    HTTP403("Forbidden"),
    HTTP404("Not found"),
    HTTP000("Invalid Code");

    private String massage;

    private HTTPError(String massage) {
        this.massage = massage;
    }

    public String getMassage() {
        return massage;
    }
}

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
