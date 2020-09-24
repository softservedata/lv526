package chapter8;

public class PracticalTask1 {

    private static void check(String what, String where) {
        if (where.contains(what)) {
            System.out.println("true");
        } else
            System.out.println("false");


    }


    public static void main(String[] args) {
        String s = "IT";
        String s1 = "IT Academy";

        check(s, s1);
    }

}
