package chapter8;

import java.util.Scanner;

public class HomeWork2 {


    private static void spaceDeleter() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter sentense : ");
        String sentense = scanner.nextLine();
        sentense = sentense.replaceAll("\\s+", " ");
        System.out.println(sentense);
    }


    public static void main(String[] args) {
        spaceDeleter();
    }
}
