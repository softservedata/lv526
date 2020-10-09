package forMe.streamsio;

import java.io.FileOutputStream;
import java.io.IOException;

public class Task {
    public static void main(String[] args) {
        byte[] b = {67, 6, 7};
        String fileName = "C:\\LALA\\javatest.txt";
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(fileName);
            System.out.println("Output file is Opened ");
            fileOutputStream.write(b);
            System.out.println("Saved :" + b.length + " bytes ");
            fileOutputStream.close();
            System.out.println("File is closed");
        } catch (IOException e) {
            System.err.println("Error" + fileName);
        }

    }
}
