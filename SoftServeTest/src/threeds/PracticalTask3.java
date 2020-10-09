package threeds;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PracticalTask3 {
    static String fileName = "C:\\LALA\\myText.txt";

    private static void counterLengthLine(List<String> ourArray) {
        String biggestLine = "";
        for (int i = 0; i < ourArray.size(); i++) {
            if (ourArray.get(i).length() > biggestLine.length()) {
                biggestLine = ourArray.get(i);
            }
        }
        System.out.println("Our longest line : " + biggestLine);

        for (int i = 0; i < ourArray.size(); i++) {

            if (ourArray.get(i).length() < biggestLine.length()) {
                biggestLine = ourArray.get(i);
            }
        }
        System.out.println("The smallest line is : " + biggestLine);


    }

    private static void counterSymbols(List<String> ourLIst) {
        int i = 1;
        for (String s : ourLIst) {
            System.out.println("String " + i + " has " + s.length() + " symbols");
            i++;
        }
        System.err.println("_________________");

    }


    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            String s = null;
            int count = 0;
            List<String> arrayOFStrings = new ArrayList<>();
            System.out.println("Read our data : " + fileName);
            while ((s = bufferedReader.readLine()) != null) {
                arrayOFStrings.add(s);
                System.out.println("row " + ++count + " read : " + s);
            }
            System.out.println("______________");
            for (String string : arrayOFStrings) {
                System.out.println(string);
            }
            counterLengthLine(arrayOFStrings);
            counterSymbols(arrayOFStrings);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
