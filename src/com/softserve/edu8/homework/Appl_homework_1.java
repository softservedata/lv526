package com.softserve.edu8.homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Appl_homework_1 {
    public static <T> Set<T> union(Set<T>a, Set<T>b){
        return  new HashSet<T>(){{
            addAll(a);
            addAll(b);
        }};
    }

    public  static  <T> Set<T> intersect(Set<T>a, Set<T>b){
        Set<T> newSet = new HashSet<T>() ;
        Iterator<T> iter = a.iterator();
        while (iter.hasNext()){
            T it = iter.next();
            if (b.contains(it)){
                newSet.add(it);

            }
        }
        return newSet;

    }

    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        Set<Integer> b = new HashSet<>();
        b.add(5);
        b.add(4);
        b.add(7);
        System.out.println("Union of a and b = "+ union(a,b));
        System.out.println("Intersect of a , b  = "+intersect(a,b).toString());
    }
}
