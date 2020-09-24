package com.softserve.edu12;

public class Appl {

    public static void m1(int sec) throws InterruptedException {
//        try {
        Thread.sleep(sec * 1000);
//        } catch (InterruptedException e) {
//            // Code
//           System.out.println("ERROR");
//           //System.exit(1000);
//        }
        System.out.println("m1()");
        //int i = 1 / 0;
        throw new ArithmeticException("hahaha");
    }

    public static void main(String[] args) {
        try {
            m1(1);
            System.out.println("try end");
        } catch (InterruptedException e) {
        //} catch (Throwable e) {
            System.out.println("ERROR");
        } finally {
            System.out.println("finally");
        }
        
        /*-
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println("InterruptedException  ERROR");
        } catch (ArithmeticException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println("ArithmeticException  ERROR");
        }
        */
    }
}
