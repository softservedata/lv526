package chapter7_Collections;

import java.util.*;

public class PracticalTask2 {

    private static Scanner scanner = new Scanner(System.in);

    private static void inputerID(Map ourMap) {
        System.out.println(" Please enter id person  : ");
        int id = scanner.nextInt();
        if (ourMap.containsKey(id) == true) {
            System.out.println(" ID " + id + " ---- " + ourMap.get(id));
        } else {
            System.out.println("This id is not valid");
        }

    }

    public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
        Set<T> keys = new HashSet<T>();
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                keys.add(entry.getKey());
            } else {
                // System.out.println(" Invalid name"); (Incorect)
            }
        }
        return keys;
    }


    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(5, "Ivan");
        employeeMap.put(8, "Nazar");
        employeeMap.put(9, "Petro");
        employeeMap.put(56, "Natali");
        employeeMap.put(78, "Nastia");
        employeeMap.put(14, "Oleg");
        employeeMap.put(90, "Danulo");
        System.out.println("Our original list : " + employeeMap);
        inputerID(employeeMap);
        System.out.println("Please enter name :");
        String s = scanner.next();
        System.out.println(getKeysByValue(employeeMap, s));
    }
}
