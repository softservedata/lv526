package chapter8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork3 {
    public static boolean checkWithRegExp() {
        Scanner scaner = new Scanner(System.in);
        String value = scaner.nextLine();
        Pattern pattern = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
        Matcher m = pattern.matcher(value);
        return m.matches();

    }

    public static void main(String[] args) {
        System.out.println(checkWithRegExp());
    }


}

