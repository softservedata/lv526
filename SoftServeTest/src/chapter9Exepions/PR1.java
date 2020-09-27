package chapter9Exepions;

import java.util.Scanner;

public class PR1 {
    public int areaRectangle() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int x = 0;
        try {
            if (a < 0 || b < 0) {
                throw new ArithmeticException();
            } else {
                x = a * b;
            }
        } catch (ArithmeticException o) {
            System.err.println(o + " { You entered negative number } ");
        }
        return x;
    }

    public static void main(String[] args) {
        PR1 pr1 = new PR1();
        System.out.println(pr1.areaRectangle());
    }
}
