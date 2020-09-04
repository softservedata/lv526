package chapter4;

import java.util.Scanner;

public class ODDorNo {
    static int[] array = new int[3];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter first number");
        int b = scanner.nextInt();
        System.out.println("Enter first number");
        int c = scanner.nextInt();
        array[0] = a;
        array[1] = b;
        array[2] = c;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Парне");

            }else {
                System.out.println("Не парне");
            }

        }
    }


}
