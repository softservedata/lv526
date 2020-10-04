package com.softserve.edu10.homework;

import com.sun.org.apache.bcel.internal.generic.LDIV;

import java.util.Scanner;

public class Program {
Scanner sc = new Scanner(System.in);
    public static double div(double a , double b){
        double res = a/b ;
        System.out.println(res);
        return  res;
    }

    public   void readNumber(int start, int end) throws Exception {
         int a = 0;
        try {
             a  = sc.nextInt();
         }catch (Exception e){
             System.out.println("Not right type ");
         }
        if (start < a && a  < end){
            System.out.println(a);
        }else {
            throw new Exception("Invalid number");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            div(sc.nextDouble(),sc.nextDouble());
        }catch (Exception e ){
            System.err.println( "you inputed something wrong"+ "\n");
        }
        Program pr = new Program();
        try {
            pr.readNumber(10,100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
