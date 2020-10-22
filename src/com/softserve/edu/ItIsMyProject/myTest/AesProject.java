package com.softserve.edu.ItIsMyProject.myTest;

import org.apache.commons.codec.binary.Hex;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AesProject {
    private static final String INIT_VECTOR = "ItIsMyFirstCrypt";

    public static String encrypt(String secretKey, String freeText) {
        try {
            if (!isKeyLenghtValid(secretKey)) {
                throw new Exception("secret key`s lenght must be 128, 192 or 256 bits");
            }

            IvParameterSpec ivParameterSpec = new IvParameterSpec(INIT_VECTOR.getBytes("UTF-8"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);

            return new String(Hex.encodeHex(cipher.doFinal(freeText.getBytes("UTF-8")), false));
        } catch (Throwable cause) {
            System.out.println(cause.getMessage());
        }
        return null;
    }

    public static String decrypt(String secretKey, String cipherText) {
        try {
            if (!isKeyLenghtValid(secretKey)) {
                throw new Exception("secret key`s lenght must be 128, 192 or 256 bits");
            }

            IvParameterSpec ivParameterSpec = new IvParameterSpec(INIT_VECTOR.getBytes("UTF-8"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);

            return new String(cipher.doFinal(Hex.decodeHex(cipherText.toCharArray())));
        } catch (Throwable cause) {
            cause.printStackTrace();
        }
        return null;
    }

    private static boolean isKeyLenghtValid(String key) {
        return key.length() == 16 || key.length() == 24 || key.length() == 32;
    }

    public static String getWorlds() {
        System.out.println("Your free text: ");
        String data = "";
        try {
            File myObj = new File("C:\\MyFiles\\javaLike.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {

                data += myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("error. ");
            e.printStackTrace();
        }
        return data;
    }
}
