package chapter9Exepions;

import java.util.Scanner;

public class HW1 {

    private double div(double a, double b) {
        double result = 0;
        try {
            if (a == 0 || b == 0)
                throw new ArithmeticException();
            else {
                result = a / b;
            }
        } catch (ArithmeticException ae) {
            System.err.println(ae + " \n Deviding on 0 ");
        }

        return result;
    }

    private int readNumber(int start, int end) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        try {
            if (number > start && number < end) {
                number = number;
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException ar) {
            System.err.println(ar + "\n {This number is not in the range}");
        }
        return number;
    }

    public static void main(String[] args) {
        HW1 hw1 = new HW1();
        System.out.println(hw1.div(0.1, 5.9));
        System.out.println(hw1.readNumber(6 , 10));
    }
}
