package com.softserve.edu.ItIsMyProject.myTest;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class AesMain {

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your secret key (only 16 characters): ");
        String secretKey = sc.nextLine();
        String encryptedText;

        System.out.println("Encrypted text: " + (encryptedText = AesProject.encrypt(secretKey, AesProject.getWorlds())));
        System.out.println("Decrypted text: " + AesProject.decrypt(secretKey, encryptedText));
    }
}
