package com.softserve.edu.ItIsMyProject.myMainProject;

import javax.crypto.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class AppAES {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, FileNotFoundException {

        System.out.println("Your text from the file: ");
        StringBuilder data = new StringBuilder();

            File myObj = new File("C:\\MyFiles\\javaLike.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data.append(myReader.nextLine());
            }
            myReader.close();
        System.out.println(data);
        System.out.println("------------------------");

        Cipher cipher = Cipher.getInstance("AES");

        KeyGenerator keygen = KeyGenerator.getInstance("AES");
        keygen.init(128);
        SecretKey key = keygen.generateKey();

        cipher.init(Cipher.ENCRYPT_MODE, key);
        System.out.println("Your encrypt cipher: ");
        byte[] bytes = cipher.doFinal(data.toString().getBytes());
        for (byte b : bytes) {
            System.out.print(b);
        }
        System.out.println("\n------------------------");

        Cipher decryptCipher = Cipher.getInstance("AES");

        decryptCipher.init(Cipher.DECRYPT_MODE, key);
        System.out.println("Your decrypt cipher: ");
        byte[] decryptedBytes = decryptCipher.doFinal(bytes);
        for (byte b : decryptedBytes) {
            System.out.print((char) b);
        }
    }
}
