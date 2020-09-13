package chapter5;

import java.util.Scanner;

public class TaskIntegersHW {
    private static void method() {
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;
        int number6 = 0;
        int number7 = 0;
        int number8 = 0;
        int number9 = 0;
        int number10 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter first number : ");
        number1 = scanner.nextInt();
        System.out.println("PLease enter second number : ");
        number2 = scanner.nextInt();
        System.out.println("PLease enter third number : ");
        number3 = scanner.nextInt();
        System.out.println("PLease enter fourth number : ");
        number4 = scanner.nextInt();
        System.out.println("PLease enter fifth number : ");
        number5 = scanner.nextInt();
        System.out.println("PLease enter sixth number : ");
        number6 = scanner.nextInt();
        System.out.println("PLease enter seventh number : ");
        number7 = scanner.nextInt();
        System.out.println("PLease enter eights number : ");
        number8 = scanner.nextInt();
        System.out.println("PLease enter nineth number : ");
        number9 = scanner.nextInt();
        System.out.println("PLease enter tenth number : ");
        number10 = scanner.nextInt();

        int summator = 0;
        int producter = 1;

        int[] array = {number1, number2, number3, number4, number5, number6, number7, number8, number9, number10};
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] > 0) {
                summator = summator + array[i];
            } else {
                for (int j = array.length / 2; i < array.length; i++) {
                    producter = producter * array[j];
                }
            }
        }
        System.out.println("First 5 vaues are positive and their summ is : " + summator);

        System.out.println("Second 5 vaues product is : " + producter);
    }

    public static void main(String[] args) {
        method();
    }
}

