package com.softserve.edu6;

public class Practical_tasks {
    public static void main(String[] args) {

         /*-
        Create an array of ten integers.Display
        1) the biggest of these numbers
        */
        int[]arr = {1,10,5,-6,100,7,-2,7,0,12};
        int biggest = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j <arr.length; j++) {
                if( arr[i]<arr[j]){
                    biggest = arr[j];
                }

            }
        }
        System.out.println("Biggest of numbers = " + biggest);
        /*
        2)The sum of positive numbers in the array
         */
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            if( arr[i] > 0 ){
                sum +=arr[i];
            }
        }
        System.out.println("Sum of positive numbers = "+ sum);
         /*
            3)The amount of the negative numbers in array
         */
         int amount = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<0){
                amount++;
            }
        }
        System.out.println("The amount of the negative numbers in array = "+ amount);
         /*
            What values there are more :negative or positive?
         */
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>=0 ){
                 pos += 1;
            }else  if (arr[i]<0){
                neg += 1;
            }
        }

        if (pos > neg){
            System.out.println("More positive values");
        }else if(neg < pos) {
            System.out.println("More negative values");
        }else{
            System.out.println("Pos and neg values are equal");
        }
    }
}
