package com.softserve.edu8.practical_task;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Practical_task_2 {
    public static void main(String[] args) {
        Map<Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(0,"Jul");
        employeeMap.put(1,"Jone");
        employeeMap.put(2,"Steve");
        employeeMap.put(3,"Omares");
        employeeMap.put(4,"Lun");
        employeeMap.put(5,"Jack");
        employeeMap.put(6,"Lian");
        employeeMap.put(7,"Biot");

        for (Map.Entry<Integer,String> item : employeeMap.entrySet()){
            System.out.println("[Key = "+item.getKey()+", "+ "Value = "+ item.getValue()+ "]");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id of person");
        int n = sc.nextInt();
        if(employeeMap.containsKey(n)){
            System.out.print("Name of this person ");
            System.out.println(employeeMap.get(n));
        }else System.out.println("Havent person with this id");

        System.out.print("\nInput name of person for searching" );
        String searchName = sc.next();
        Iterator<Map.Entry<Integer,String>> iter = employeeMap.entrySet().iterator();
        if (employeeMap.containsValue(searchName)){
            while (iter.hasNext()){
                Map.Entry<Integer,String> entry = iter.next();
                if (entry.getValue().equals(searchName)){
                    System.out.println("Id of this person = "+ entry.getKey());
                }
            }
        }else System.out.println("Havent person with this name");

    }
}
