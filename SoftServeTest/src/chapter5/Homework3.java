package chapter5;

public class Homework3 {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 9, 4};

        int pos = -1;
        int positiveCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    pos = i;
                }
            }
        }
        System.out.println("Result  " + (pos < 0 ? "Not Found" : "pos = " + positiveCount));

        int imin = 0;
        int min = array[imin];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                imin = i;
                min = array[imin];
            }
        }
        System.out.println("min = " + min + " pos " + imin);
    }
}