package chapter8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticalTask3 {

    public static boolean checkWithRegExp(String username) {
        Pattern pattern = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = pattern.matcher(username);
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println(checkWithRegExp("ahdeshj_78"));
        System.out.println(checkWithRegExp("ahdgfytfyffhj_78"));
        System.out.println(checkWithRegExp("ahdesuhgghj_70"));
    }
}