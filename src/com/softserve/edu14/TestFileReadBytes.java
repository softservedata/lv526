package com.softserve.edu14;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestFileReadBytes {

    public static void main(String[] args) {
        byte[] r = new byte[20];
        String fileName = "D:\\test.txt";
        FileInputStream inFile;
        try {
            inFile = new FileInputStream(fileName);
            System.out.println("Input file was opened.");
            int bytesAv = inFile.available(); // Bytes count
            System.out.println("Bytes count: " + bytesAv + " Bytes");
            int count = inFile.read(r, 0, bytesAv);
            System.out.println("Was readed: " + count + " bytes.");
            // System.out.println(r[0] + " " + r[1] + " " + r[2]);
            // System.out.println("Arrays: " + Arrays.toString(r));
            for (int i : r) {
                if (i == 0) {
                    break;
                }
                System.out.print(i + ", ");
            }
            System.out.println();
            inFile.close();
            System.out.println("Input stream was closed.");
        } catch (IOException e) {
            System.out.println("File Read/Write Error: " + fileName);
        }
    }
}
