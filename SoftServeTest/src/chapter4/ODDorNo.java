package chapter4;

import java.util.Scanner;

public class ODDorNo {
    private int[] array = new int[3];

    public static void main(String[] args) {
        ODDorNo odDorNo = new ODDorNo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        odDorNo.array[0] = scanner.nextInt();
        System.out.println("Enter first number");
        odDorNo.array[1] = scanner.nextInt();
        System.out.println("Enter first number");
        odDorNo.array[2] = scanner.nextInt();

        for (int i = 0; i < odDorNo.array.length; i++) {
            String g = odDorNo.array[i] % 2 == 0 ? "Парне" : "Не парне";
            System.out.println(g);


        }
    }


}
