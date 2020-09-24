package com.softserve.studing_for_myself;

public class ApplParam {

        //peredqacha parametriv vid odnoi do inshoi
        public void work (int i) {
            System.out.println("start work(...), i = " + i );
            i = i+1;
            System.out.println("done work (...), i = "+ i);
        }

        public void work (StringBuilder sb) {
        System.out.println("start work(...), sb =" + sb );
        sb.append("work added"); // zminuye string bilder
        System.out.println("done work (...), sb = "+ sb);
        }

        public void work (String s) {
        System.out.println("start work(...), s =" + s );
        s =  s + ("work added");
        System.out.println("done work (...), s = "+ s);
        }

        public void work (Integer i) {
        System.out.println("start work(...), i =" + i );
        i =  i + 2;
        System.out.println("done work (...), i = "+ i);
        }

    public static void main(String[] args) {
        ApplParam applParam = new ApplParam();
//        int i = 1;
//        applParam.work(i);
//        System.out.println("done main(...) , i = " + i);

//        StringBuilder stringBuilder = new StringBuilder("123");
//        applParam.work(stringBuilder);
//        System.out.println("done main (...), sb = "+ stringBuilder);

//        String s  = "1234";
//        applParam.work(s);
//        System.out.println("done main(...),s = " + s );

//        Integer i = 12;
//        applParam.work(i);
//        System.out.println("done main(...),i = " + i );

        char[] chA  = {'A','B','C','D','E','F'};
        String strChr =  new String(chA);
        System.out.println(strChr);
        String strChr2 = new String(chA,2,2);//CD
        System.out.println(strChr2);
        System.out.println("strChr.charAt(5) = "  + strChr.charAt(5));
        System.out.println("strChr.charAt(1) = "  + strChr2.charAt(1));
        System.out.println("strChr.concat(strChr2) = "+ strChr.concat(strChr2));
        System.out.println("strChr.concat(strChr2).length() = "+ strChr.concat(strChr2).length());
    }
}
