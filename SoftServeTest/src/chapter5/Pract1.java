package chapter5;

public class Pract1 {

    private static int biggestValueSearcher(int[] array) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > x) {
                x = array[i];
            }
        }
        return x;

    }

    private static int summatorPositiveNum(int[] array) {
        int test = 0;
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > test) {
                summ += array[i];
            }
        }
        return summ;
    }
    private static int ammountOfNEgative(int [] array) {
        int ammount = 0;
        int start = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < start) {
                ammount++;
            }

        }
        return ammount;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 800, 6, 7, 8, 9, -10, 287, 765, 160 , 1};
        System.out.println("The biggest value is : " + biggestValueSearcher(array));
        System.out.println("Summ of positive numbers in the array is :  " +summatorPositiveNum(array) );
        System.out.println("The amount of negative numbers in the array : " + ammountOfNEgative(array));
    }
}
