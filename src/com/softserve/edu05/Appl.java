package com.softserve.edu05;

/*-
enum Season {
    WINTER, SPRING, SUMMER, AUTUMN
}
*/

/*-
enum Season {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");
    
    private String name;
    //
    private Season(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return " ***toString() = " + name;
    }
    
    public Season nextSeason() {
        if (this == Season.WINTER) {
            return SPRING;
        }
        if (this == Season.SPRING) {
            return SUMMER;
        }
        if (this == Season.SUMMER) {
            return Season.AUTUMN;
        }
        return Season.WINTER;
    }
}
*/

enum Season {
    WINTER("Winter") {
        public Season nextSeason() { return SPRING; }
    },
    SPRING("Spring") {
        public Season nextSeason() { return SUMMER; }
    },
    SUMMER("Summer") {
        public Season nextSeason() { return AUTUMN; }
    },
    AUTUMN("Autumn") {
        public Season nextSeason() { return WINTER; }
    };
    
    private String name;
    //
    private Season(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    public abstract Season nextSeason();
}


public class Appl {

    public static void main(String[] args) {
        /*-
        int x = 11;
        int y = 7;
        //
        int a = x + y; // a = 18
        int s = x - y; // s = 4
        int m = x * y; // m = 77
        int d = x / y; // d = 1
        int r = x % y; // r = 4
        System.out.println("a= " + a + " s= " + s + " m= " + m);
        System.out.println("d= " + d + " r= " + r);
        System.out.println("as double x / y = " + ((double)x / y));
        //
        //
        int x = 5;
        int a, b;
        //
        a = (x++); // a = 5 x = 6
        x--; // x = 5
        b = ++x; // b = 6 x = 6
        ++x; // x = 7
        System.out.println("a=" + a + "  b=" + b);
        //
        x = 5;
        //a = x++ + x; // 5 (++) + 6 = 11;
        a = x++ + ++x; // 5 (++) (++)7 =12;
        System.out.println("a=" + a);
        //
        //
        int x = 5;
        boolean bool = x > 4;
        System.out.println("bool = " + bool);
        //
        //
        int x = 5;
        int y = -5;
        System.out.println(x == y); // false
        System.out.println(x != y); // true
        System.out.println("x >= y : " + (x >= y)); // true
        boolean bool = x > 4; // true
        System.out.println("!bool = " + !bool);
        */
        /*-
         *                      &&(and) ||(or)
         *      true    true    true    true 
         *      true    false   false   true
         *      false   true    false   true   
         *      false   false   false   true
         */
        //
        /*-
        int t = 5, s = 4, v = 7;
        System.out.println( (t > s) && (t > v) || (s < v)); // true
        System.out.println(( (t < v) || (s > v) ) && (t < s) ); // false
        //
        //
        byte a =97; // 0110 0001  61(16) = 97
        byte b =65; // 0100 0001 41(16) = 65
        byte c = (byte) (a & b); // = 0100 0001
        byte d = (byte) (a | b); // = 0110 0001
        System.out.println("c=" + c + "  as char c= " + (char)c 
                + "  d=" +d + "  as char d= " + (char)d);
        byte e = (byte) (b << 1); // 1000 0010 82(16) = +130 / -126
        System.out.println("e=" + e);
        int i = 0;
        i = i | e;
        i = 0x000000FF & i;
        System.out.println("i = " + i);
        //
        //
        int t = 5, s = 4;
        String str1 = null;
//        if (t >= ++s) {
//            str1 ="yes";
//        } else {
//            str1 ="no";
//        }
        str1 = t >= ++s ? "yes" : "no";
        System.out.println("str1 = " + str1);
        /
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you enjoy Java? (yes/no/maybe) = ");
        String input = sc.nextLine().toLowerCase();
        //
//        if ( (input.equals("yes")) || (input.equals("maybe")) ) {
//            System.out.println("Great!");
//        } else if (input.equals("no")) {
//            System.out.println("Too bad!");
//        } else {
//            System.out.println("unknown ???");
//        }
        switch (input) {
        case "yes":
        case "maybe":
            System.out.println("Great!");
            break;
        case "no":
            System.out.println("Too bad!");
            break;
        default:
            System.out.println("Wrong!");
        }
        //
        //
        Season season;
        season = Season.WINTER;
        System.out.println("season = " + season.name());
        System.out.println("Next season = " + season.nextSeason().name());
        //
        String name = "Spring"; // "Spring1" ERROR
        season = Season.valueOf(name.toUpperCase());
        System.out.println("season.name() = " + season.name());
        System.out.println("Next season.name() = " + season.nextSeason().name());
        //
        for (Season current : Season.values()) {
            System.out.println("current = " + current);
        }
        */
        //
        Season season = null;
        String month = "Marth";
        switch (month) {
        case "Deñember":
        case "January":
        case "February":
            season = Season.WINTER;
            break;
        case "Marth":
        case "April":
        case "May":
            season = Season.SPRING;
            break;
        case "June":
        case "Jule":
        case "August":
            season = Season.SUMMER;
            break;
        case "September":
        case "October":
        case "November":
            season = Season.AUTUMN;
            break;
        default:
            System.out.println("No this month");
            throw new IllegalArgumentException("Error: Invalid Argument");
            //System.exit(0);
        }
        System.out.println("season = " + season);
        System.out.println("Next season = " + season.nextSeason());
        //
        switch (season) {
        case WINTER:
            System.out.println("Deñember, January, February");
            break;
        case SPRING:
            System.out.println("Marth, April, May");
            break;
        case SUMMER:
            System.out.println("June, Jule, August");
            break;
        case AUTUMN:
            System.out.println("September, October, November");
            break;
        }
        //
    }
}
