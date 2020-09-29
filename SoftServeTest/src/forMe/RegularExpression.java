package forMe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void method(String s) {
        String patern = "[Na-z+]";
        Pattern pattern = Pattern.compile(patern);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.print(s.substring(matcher.start(), matcher.end()) + "*");
        }


    }

    public static void main(String[] args) {
        method("jhskghljrlfu9798760486ljLHJLGJLJR89679Jgljrklkdlj");
    }
}
