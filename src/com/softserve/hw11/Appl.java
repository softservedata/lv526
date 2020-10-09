package com.softserve.hw11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Appl {
    public static void main(String[] args) {
        int n = 10;
        Random random = new Random();
        /*-
        Stream.generate(() -> random.nextInt(100))
            .limit(4)
            .forEach(System.out::println);
        */
        /*-
        // Print n random numbers on console using Java 8 in a sorted order
        random.ints()
            .limit(n)
            .sorted()
            .forEach(System.out::println);
        */
        /*-
        // Using Java 8 show the biggest number from n random numbers
        int max = random.ints()
                .limit(n)
                .max()
                .orElse(0);
        System.out.println("max = " + max);
        */
        /*-
        // Show witch today is a day of a week
        // LocalDateTime currentDateTime = LocalDateTime.now();
        //System.out.println("Current DateTime: " + currentDateTime);
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current DateTime: " + currentDate);
        System.out.println("Week = " + currentDate.getDayOfWeek()); // currentDate.getDayOfWeek().getValue()
        */
        /*-
        // Show a date of first Monday for current month
        LocalDate currentDate = LocalDate.now();
        LocalDate day = currentDate.with(TemporalAdjusters.firstDayOfMonth());
        while (day.getDayOfWeek() != DayOfWeek.MONDAY) {
            System.out.println("day = " + day);
            day = day.plusDays(1L);
        }
        System.out.println("firstMondayOfMonth = " + day);
        */
        /*-
        Stream.iterate(LocalDate.now()., currentDate  -> currentDate.plusDays(1L))
            .limit(7)
            .forEach(System.out::println);
        */
        /*-
        String res = Stream.iterate(LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()),
                currentDate  -> currentDate.plusDays(1L))
            .limit(7)
            .peek(System.out::println)
            .filter(day -> day.getDayOfWeek() == DayOfWeek.MONDAY)
            .map(day -> day.toString())
            //.collect(Collectors.joining(""));
            //.max(Comparator.naturalOrder())
            //.orElse("");
            .findFirst()
            .orElse("");
        System.out.println("res = " + res);
        */
        // Write a method for sorting list of Strings using Java 8
        List<String> names = Arrays.asList("ab", "aaa", "abc", "a1");
        // Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        // System.out.println("Sorted = " + names);
        List<String> names2 = names.stream()
            .sorted()
            //.forEach(s -> System.out.print(s + " "));
            .collect(Collectors.toList());
        System.out.println("Sorted = " + names2);
    }
}
