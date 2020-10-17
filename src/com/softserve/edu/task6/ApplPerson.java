package com.softserve.edu.task6;

import java.util.*;

public class ApplPerson {
    private static void foundDublicate(Map<String, String> myMap) {
        Map<String, String> personMap1 = new HashMap(myMap);
        Set valueset = new HashSet(personMap1.values());
        if (personMap1.values().size() != valueset.size()) {
            System.out.println("Dublicated values");
        } else {
            System.out.println("Not dublicated values");
        }
    }


    private static void removeName(final Map<String, String> map) {
        final Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        final HashSet<String> valueSet = new HashSet<>();
        while (iter.hasNext()) {
            final Map.Entry<String, String> next = iter.next();
            if (!valueSet.add(next.getValue())) {
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap();
        personMap.put("Gagag", "Ahmed");
        personMap.put("Pokemon", " Petro");
        personMap.put("Frosya", "Ivan");
        personMap.put("Ivanyok", " Ihor");
        personMap.put("Telyk", " Andriy");
        System.out.println("Original personMap : " + personMap);
        foundDublicate(personMap);
        removeName(personMap);
        System.out.println("Our new collection with uniqe values : " + personMap);
    }

}
