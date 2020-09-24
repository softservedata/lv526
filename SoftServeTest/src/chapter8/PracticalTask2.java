package chapter8;

import java.util.Scanner;

public class PracticalTask2 {

    private static void scanerok() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name : ");
        String name = scanner.nextLine();
        System.out.println("Please enter middle name : ");
        String middleName = scanner.nextLine();
        System.out.println("Please last name : ");
        String lastName = scanner.nextLine();

        System.out.println(name + " " + middleName + " " + lastName);

        String nameNew = middleName + " " + name.substring(0, 1).toUpperCase() + " " + lastName.substring(0, 1).toUpperCase();
        System.out.println(nameNew);
        System.out.println(name);

    }

    public static void main(String[] args) {
        scanerok();
    }

}
