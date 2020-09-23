package com.softserve.edu8.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Appl_homework_2 {
    public static void main(String[] args) {
        Map<String,String> personMap = new HashMap<>();
        personMap.put("Lerko","Orest");
        personMap.put("Lerko","Stepan");
        personMap.put("Kriv","Violeta");
        personMap.put("Zeno","Larisa");
        personMap.put("Loi","Genri");
        personMap.put("Glebam","Orest");
        personMap.put("Sion","Yura");
        personMap.put("Di","Ivan");
        personMap.put("Di","Bernard");
        personMap.put("Loik","Kurul");
        System.out.println(personMap);
        Iterator<Map.Entry<String,String >> iterator = personMap.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            if(entry.getValue().contains("Orest")){
                personMap.remove(entry.getKey());
            }
        }

        System.out.println(personMap);
    }
}
