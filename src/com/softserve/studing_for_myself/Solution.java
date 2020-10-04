package com.softserve.studing_for_myself;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//

public  class Solution {
    public static void m1(int sec) throws InterruptedException {
  //      try {
            Thread.sleep(sec* 100);
    //    } catch (InterruptedException e) {
            //CODE
      //      System.out.println("ERROR");
//            //System.exit(1000);
        }




    public static void main(String[] args) throws InterruptedException {






//        Scanner sc = new Scanner(System.in);
//        int sizeArr = sc.nextInt();
//        int[] arr = new int[sizeArr];
//        boolean a = false;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//            if(arr[i]>35 && arr[i] % 5 > 2.5){
//                a= true;
//                for (int j = 0; j < 10 & a  ; j++) {
//                    arr[i] += 1;
//                    if (arr[i] % 5 == 0.0){
//                        System.out.println( arr[i]);
//                        a = false;
//                    }
//                }
//        }else System.out.println(arr[i]);
//        }



//        String  a=  "w";
//        String  b = " abcd ";
//        System.out.println("a.concat(b) = "+a.concat(b));
//        System.out.println("b.substring(0,3) = "+ b.substring(0,3));
//        System.out.println(" b.indexOf(3) = "+ b.indexOf(3)); // -1 bo ne char
//        System.out.println("b.toUpperCase() = "+ b.toUpperCase());
//        System.out.println(" b.toLowerCase() = "+ b.toLowerCase());
//        System.out.println("b.charAt(1) = " +b.charAt(1)); // znaytu pos sumvolu
//        System.out.println("b.trim() = " +b.trim()); // vukunytu provelu na kinsi i pochatku
//        System.out.println("b.replace() = " +b.replace("a","o")); // vukunytu provelu na kinsi i pochatku

//       String a0  = "Java";// new String("Java");
//        String a1  = "Java"; // reference
//        String a2  = new String("Java"); //create new object
//        System.out.println("(a0 == a1) =  "+(a0 == a1));
//        System.out.println("(a0 == a2) =  "+(a0 == a2));
//        //
//        System.out.println("(a0.equals(a1)) =  "+(a0.equals(a1)));
//        System.out.println("(a0.equals(a2))=  "+(a0.equals(a2)));
//        //
//        System.out.println("(a0.compareTo(a1))=  "+(a0.compareTo(a1)));
//        System.out.println("(a0.compareTo(a2))=  "+(a0.compareTo(a2)));
//        //
//        System.out.println("a0.hashCode() =  "+a0.hashCode());
//        System.out.println("a1.hashCode() =  "+a1.hashCode());
//        System.out.println("a2.hashCode() =  "+a2.hashCode());

//        final  double PI = 3.1415926;
//        String format = "%.2f";
//        String s = String.format(format,PI);
//        System.out.println(s);
//        System.out.printf(format,PI);
//        StringBuilder sb = new StringBuilder("volvo");
//        System.out.println(sb.reverse());
//
//         String pattern = "[abc|now]";
//         String text = "Now is the time";
//
//        Pattern p = Pattern.compile(pattern);
//        Matcher m =  p.matcher(text);
//        if (m.matches()){
//            System.out.println("m.matches() OK");
//        }
//        m.reset();
//        while(m.find()){
//            System.out.println(text.substring(m.start(),m.end()) + "*");
//        }

//    Scanner sc = new Scanner(System.in);
//   int b = sc.nextInt();
//       long[]candels ;
//        long max = 0;
//        long countMax = 0;
//
//        candels = new long[b];
//
//
//        for (int i = 0; i < candels.length; i++) {
//          long value = sc.nextLong();
//                candels[i] = value;
//            if (candels[i] > max) {
//                max = candels[i];
//               }
//            }
//
//
//        for (int i = 0; i < candels.length; i++) {
//            if (candels[i] == max){
//                countMax++;
//            }
//        }
//        System.out.println(countMax);



//           long [] a= {sc.nextInt(),sc.nextInt(),sc.nextInt(),
//                    sc.nextInt(), sc.nextInt()};
//      long temp;
//       long minSum = 0 ;
//        long maxSum = 0 ;
//        for (int i = 0; i <a.length ; i++) {
//            for (int j = 0; j < i+1 ; j++) {
//                if (a[i]< a[j]){
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//
//        }
//
//        for (int i = 0; i <a.length-1 ; i++) {
//            minSum += a[i];
//        }
//        for (int i = a.length-1; i >0 ; i--) {
//            maxSum += a[i];
//        }
//
//        System.out.println(minSum + " " + maxSum);






  //   Scanner sc = new Scanner(System.in);
//
//        char[] a = new char[sc.nextInt()];
//        for (int i = a.length -1; i >= 0 ; i--) {
//            a[i] = ' ';
//        }
//
//        for (int i = a.length -1 ; i >= 0  ; i--) {
//            a[i] = '#';
//            System.out.println(a);
//        }
//        Scanner sc = new Scanner(System.in);
//        double count = 0;
//        double pos = 0;
//        double neg = 0;
//        double zero = 0;
//        int [] arr = new int[sc.nextInt()];
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] =sc.nextInt();
//        }
//        for (int i = 0; i <arr.length ; i++) {
//            count+=1;
//            if(arr[i] > 0){
//                pos+=1;
//            }
//            if(arr[i] < 0){
//                neg+=1;
//            }
//            if (arr[i] == 0 ){
//                zero+=1;
//            }
//        }
//
//        double pRation = pos/count;
//        double nRation = neg/count;
//        double zRation = zero/count;
//        System.out.println(pRation);
//        System.out.println(nRation);
      //  System.out.println(zRation);

//        int row = sc.nextInt();
//        int col = sc.nextInt();
//        int [][] bigNum = new int[row][col];
//        int fDiagonal = 0;
//        int sDiagonal = 0;
//        for (int i = 0; i < bigNum.length ; i++) {
//            for (int j = 0; j <  bigNum.length; j++) {
//                bigNum[i][j] = sc.nextInt();
//                if( i == j ){
//                    fDiagonal += bigNum[i][j];
//                }
//
//            }
//
//        }
//        for (int i = 0,j = col-1  ; i < row && j >= 0; i++,j--) {
//                sDiagonal += bigNum[i][j];
//
//        }
//        System.out.println(Math.abs(fDiagonal-sDiagonal));


    }
}


