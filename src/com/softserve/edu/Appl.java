package com.softserve.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Short one line description. (1)
 * <p>
 * <font color="red"> Longer description. If there were any, it would be (2)
 * here. </font>
 * </p>
 * And even more explanations to follow in consecutive paragraphs separated by
 * HTML paragraph breaks.
 */
public class Appl {
    private int i = 0;

    /*-
     * Block sd f fsd dfs f 
     *            sd fsd fs df s 
     *                      fsd f s fsd f sdf s fsd fsd fs f
     */
    public void m1() {
        System.out.println("i = " + i);
    }

    /**
     * @param args variable Description text text text. (3)
     * @return Description text text text.
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");
        Appl appl = new Appl();
        appl.i = 123;
        //
        Appl appl2 = new Appl();
        appl2.i = 432;
        //
        System.out.println("appl.i = " + appl.i);
        System.out.println("appl2.i = " + appl2.i);
        //
        System.out.println("from Appl: ");
        appl.m1();
        //
        System.out.println("from Appl2: ");
        appl2.m1();
        //
        System.out.println("Command Line Arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Arg " + i + " is " + args[i]);
        }
        //
        String s = "abc";
        System.out.println("s = " + s);
        //
        int k = 4567;
        System.out.println("k = " + k);
        //
        /*-
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("input int: age = ");
        String text = br.readLine();
        int age = Integer.parseInt(text);
        System.out.print("This is age = " + age);
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("input int: age = ");
        int age = sc.nextInt();
        System.out.print("This is age = " + age);
        //
    }
}
