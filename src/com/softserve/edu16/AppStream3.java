package com.softserve.edu16;

import java.util.Optional;

public class AppStream3 {
    
    public static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        // Optional.orElse - returns the value if present otherwise returns
        // the default value passed.
        Integer value1 = a.orElse(0);
        // Optional.get - gets the value, value should be present
        Integer value2 = b.get();
        return value1 + value2;
    }

    public static Integer sum1(Integer v1, Integer v2) {
        if (v1 == null) {
            v1 = 0;
        }
        if (v2 == null) {
            v2 = 0;
        }
        return v1 + v2;
    }
    
    public static void main(String[] args) {
        /*-
        long startTime = System.currentTimeMillis(); // Unix Time
        List<Integer> numbers = new Random().ints()
                .limit(2000000)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
        //
        Integer ageSum = numbers.stream()
        //Integer ageSum = numbers.parallelStream()
                .sorted()
                .reduce(0, (sum, p) -> sum += p);
        long endTime = System.currentTimeMillis();
        //
        System.out.printf("\nageSum = " + ageSum 
                + "\ntime = %.3f", ((endTime - startTime) / 1000.0));
        */
        /*-
        List<String> strings = Arrays.asList("abc", "", "bc", "eg", "abd", "", null, "jkl");
        List<String> filtered = strings.stream()
            .filter(string -> string != null)
            .filter(string -> !string.isEmpty())
            .collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);
        //
        String mergedString = strings.stream()
            .filter(string -> string != null)
            .filter(string -> !string.isEmpty())
            .filter(string -> string.length() > 2)
            .collect(Collectors.joining("* "));
        System.out.println("Merged String: " + mergedString);
        */
        /*-
        List<String> nums = Arrays.asList("3", "2", "2", "3", "7", "3", "5");
        IntSummaryStatistics stats = nums.stream()
                //.flatMap(s -> s) // Function.identity()
                .mapToInt(x -> Integer.valueOf(x))
                .summaryStatistics();
        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
        */
        //
        Integer value1 = null; // 1;
        Integer value2 = 12;   // null;
        //System.out.println("sum1 = " + sum1(value1, value2));
        //
        // Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);
        // Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);
        //
        System.out.println("First parameter is present: " + a.isPresent());
        a.ifPresent(s -> System.out.println("ifPresetn a = " + a.get()));
        System.out.println("Second parameter is present: " + b.isPresent());
        b.ifPresent(s -> System.out.println("ifPresetn b = " + b.get()));
        System.out.println("sum = " + sum(a, b)); // sum1(value1, value2)
        System.out.println("sum1 = " + sum1(value1, value2));
        //
    }

}
