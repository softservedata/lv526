package chapter7_Collections;

import java.util.*;

public class PracticalTask1 {
    private static void collectionsOPerations() {
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int o = random.nextInt(30);
            myCollection.add(o);
        }
        System.out.println("My Collection original : \n" + myCollection);

        myCollection.set(2, 1);
        myCollection.set(8, -3);
        myCollection.set(5, -4);
        System.out.println("Changed myCollection in first time \n " + myCollection);
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(myCollection.get(i));
            }
        }
        System.out.println("NewCollection (values > 5) : \n " + newCollection);
        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer > 20) {
                iterator.remove();
            }
        }
        System.out.println("New fixed myCollection without (values > 20) \n  " + myCollection);
        System.out.println("Sorted myCollection : ");
        Collections.sort(myCollection);
        System.out.println(myCollection);

    }
    public static void main(String[] args) {
        collectionsOPerations();

    }
}
