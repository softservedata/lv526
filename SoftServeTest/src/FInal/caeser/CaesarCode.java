package FInal.caeser;

public class CaesarCode {
    public String encrypt(String input, int key) {
        StringBuilder stringBuilder = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlpabet = alphabet.substring(key) + alphabet.substring(0, key);
        for (int i = 0; i < stringBuilder.length(); i++) {
            char currChar = stringBuilder.charAt(i);
            int idx = alphabet.indexOf(currChar);
            if (idx != -1) {
                char newChar = shiftedAlpabet.charAt(idx);
                stringBuilder.setCharAt(i, newChar);
            }
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {

        CaesarCode caesarCipher = new CaesarCode();
        System.out.println(caesarCipher.encrypt("ABCD", 4));
    }
}
