package chapter7_Collections;

import chapter6_OOP.persons.Student;

import javax.print.attribute.HashAttributeSet;
import java.util.HashSet;
import java.util.Set;

public class HomeWork1<T> {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> interset(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
    public static void main(String[] args) {
      /*
        Set<String> set1 = new HashSet<>();
        set1.add(" Nazar");
        set1.add(" Ira");
        set1.add(" Nataliya");
        set1.add(" Bogdan");
        set1.add(" Lilia");
        System.out.println("SET1 : " + set1);
        //
        Set<String> set2 = new HashSet<>();
        set2.add(" Nazar");
        set2.add(" Oksana ");
        set2.add(" Zoryana ");
        set2.add(" Bogdan");
        set2.add(" Lilia");
        System.out.println("SET2 : " + set2);
        System.out.println("Union : " + union(set1, set2));
        System.out.println("Intersect : " + interset(set1 , set2));
       */
        Set<StudentTestForHW1> set1 = new HashSet<>();
        set1.add(new StudentTestForHW1(" Nazar", 2));
        set1.add(new StudentTestForHW1(" Ira", 10));
        set1.add(new StudentTestForHW1(" Nataliya", 56));
        set1.add(new StudentTestForHW1(" Bogdan", 45));
        set1.add(new StudentTestForHW1(" Lilia", 13));
        System.out.println("SET1 : " + set1);
        //
        Set<StudentTestForHW1> set2 = new HashSet<>();
        set2.add(new StudentTestForHW1(" Nazar", 2));
        set2.add(new StudentTestForHW1(" Ira", 10));
        set2.add(new StudentTestForHW1(" Nataliya", 56));
        set2.add(new StudentTestForHW1(" Bogdan", 2));
        set2.add(new StudentTestForHW1(" Lilia", 13));
        System.out.println("SET2 : " + set2);
        System.out.println("Union : " + union(set1, set2));
        System.out.println("Intersect : " + interset(set1, set2));
    }

}
