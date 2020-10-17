package com.softserve.edu.task6.Practical2;

import java.util.*;

public class Task2 {

    private static Scanner scanner = new Scanner(System.in);

    private static void inputerID(Map ourMap) {
        System.out.print(" Enter id person  : ");
        int id = scanner.nextInt();
        if (ourMap.containsKey(id) == true) {
            System.out.println(" ID is " + id + " - " + ourMap.get(id));
        } else {
            System.out.println("Bed value");
        }
    }
    public static <T, E extends Comparable<E>> Set<T> getKeysByValue(Map<T, E> map, E value) {
        Set<T> keys = new HashSet<T>();
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (value.compareTo(entry.getValue()) == 0) {
                keys.add(entry.getKey());
            }
        }
        if (keys.size() == 0) {
            System.out.println(" Bed name ");
        }
        return keys;
    }
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(25, "Misha");
        employeeMap.put(57, "Grisha");
        employeeMap.put(99, "Ihor");
        employeeMap.put(59, "Olga");
        employeeMap.put(89, "Vitya");
        System.out.println("All list : " + employeeMap);
        inputerID(employeeMap);
        System.out.print("Enter the name :");
        String s = scanner.next();
        System.out.println(getKeysByValue(employeeMap, s));
    }
}