package chapter7_Collections.homework2;

import chapter7_Collections.homework3FROMCollections.Student;

import java.util.*;

public class PersonStarter {
    private static void namechecker(Map<String, String> ourmap) {
        //  boolean status = false;
        Map<String, String> personMap1 = new HashMap(ourmap);
        Set valueset = new HashSet(personMap1.values());
        if (personMap1.values().size() != valueset.size()) {
            //    status = true;
            System.out.println("Our collection has dublicated values");
        } else {
            System.out.println("Our collection has not dublicated values");
            //   status = false;
        }
        //  return status;
    }


    private static void removeTheFirstNameDuplicates(final Map<String, String> map) {
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
        personMap.put("Struk", "Nazar");
        personMap.put("Sterniuk", " Yuriy");
        personMap.put("Blabla", "Nazar");
        personMap.put("Ryzhova", " Olena");
        personMap.put("Sprynska", " Anastasiya");
        System.out.println("Original personMap : " + personMap);
        namechecker(personMap);
        removeTheFirstNameDuplicates(personMap);
        System.out.println("Our new collection with uniqe values : " + personMap);
    }

}
