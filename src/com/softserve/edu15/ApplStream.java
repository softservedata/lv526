package com.softserve.edu15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplStream {
    public static void main(String[] args) {
        /*-
        //      String[] arr = new String[] {"abc", "", "bc", "abcd", "", "jkl"};
        //      List<String> strings = Arrays.asList(arr);
        List<String> strings = Arrays.asList("abc", "", "bc", "abcd", "1", "jkl", "abcd", "ad*");
        //
        System.out.println("Origin: " + strings);
        //
        List<String> filtered = strings.stream()
            .filter(string -> !string.isEmpty())
            .filter(string -> string.length() > 2)
            .collect(Collectors.toList());
        filtered
            .forEach(x->System.out.print(x+" "));
        //
        Function<Integer, Double> centigradeToFahrenheitInt =  x -> x*9.0/5+32;
        System.out.println("centigradeToFahrenheitInt = " + centigradeToFahrenheitInt.apply(1));
        //
        List<String> names = Arrays.asList("bob", "josh", "megan");
        names.replaceAll(name -> name.toUpperCase());
        names.forEach(x->System.out.print(x+" "));
        */
        /*-
        String[] arr = new String[] { "abc", "", "bc", "abcd", "", "jkl", "abc", "qwer" };
        List<String> strings = Arrays.asList(arr);
        //
        System.out.println("Origin Array: " + Arrays.deepToString(arr));
        Stream<String> st = strings.stream()
                .filter(string -> !string.isEmpty());
        //
        st = st.peek(s -> System.out.append(s + "_"));
        System.out.println("----------------");
        st = st.distinct()
                // .peek(x->System.out.println("+++" + x))
                // .sorted((p1, p2) -> -p1.length() + p2.length());
                .sorted(Comparator.<String, String>comparing(x -> x,
                        (p1, p2) -> -p1.length() + p2.length())
                        .thenComparing((p1, p2) -> -p1.compareTo(p2)));
        // st = st.peek(x->System.out.println("+"));
        arr[1] = "1234";
        st.forEach(System.out::println);
        //st.forEach(System.out::println); // Runtime Error
        */
        // /*-
        List<String> strings = Arrays.asList("abc", "", "bc", "abcd", "1", "jkl", "abcd", "ad*");
        Stream<String> st = strings.stream()
                .filter(string -> !string.isEmpty());
        List<String> filtered = st.map(str->"_"+str+"_")
                .collect(Collectors.toList());
        System.out.println("After: " + filtered);
        // */
    }
}
