package threeds.HW4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class HW4 {
    private static String file = "C:\\LALA\\file.1.txt";
    private static String s = "";
    private static int count = 0;
    private static List<String> arrayOFStrings;

    private void numberOfLinesCounter(List<String> array) {
        int i = array.size();
        System.out.println("-------");
        System.out.println("Our file contains " + i + " lines");
        System.out.println("-------");
    }

    private void finderLongestString(List<String> ourArray) {
        String longestLine = " ";
        for (int i = 0; i < ourArray.size(); i++) {
            if (ourArray.get(i).length() > longestLine.length()) {
                longestLine = ourArray.get(i);
            }
        }
        System.out.println("Longest line is : " + longestLine);
        System.out.println("Longest line has : " + longestLine.length() + " symbols ");
    }
    private void finderName (List<String> ourArray) {
        String s = "name";
        String birthday = "birthday";
        for (int i = 0; i < ourArray.size(); i++) {
            if (ourArray.get(i).contains(s)) {
                System.out.println("---");
                System.out.println(ourArray.get(i));
            }
            if (ourArray.get(i).contains(birthday)) {
                System.out.println("---");
                System.out.println(ourArray.get(i));
                System.out.println("---");
            }
            }
    }


    public static void main(String[] args) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            System.out.println("Reading file : " + file);
            arrayOFStrings = new ArrayList<>();
            while ((s = bufferedReader.readLine()) != null) {
                arrayOFStrings.add(s);
                System.out.println("row " + ++count + " read : " + s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        HW4 hw4 = new HW4();
        hw4.numberOfLinesCounter(arrayOFStrings);
        hw4.finderLongestString(arrayOFStrings);
        hw4.finderName(arrayOFStrings);

    }

}
