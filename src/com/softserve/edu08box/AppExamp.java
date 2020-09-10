package com.softserve.edu08box;

public class AppExamp {

    public <T extends Comparable<T>> T getMax(T t0, T t1) {
        T result = t0;
//        System.out.println("t0 = " + t0);
//        System.out.println("t1 = " + t1);
//        System.out.println("t0.compareTo(t1) = " + t0.compareTo(t1));
        if (result.compareTo(t1) < 0) {
            result = t1;
        }
        //
        return result;
    }

    public static void main(String[] args) {
        AppExamp app = new AppExamp();
        System.out.println("app.getMax(2.99, 3.0) = " + app.getMax(2.99, 3.0));
        System.out.println("app.getMax(2, 3) = " + app.getMax(2, 3));
        System.out.println("app.getMax(ab, ac) = " + app.getMax("ab", "ac"));
    }
}
