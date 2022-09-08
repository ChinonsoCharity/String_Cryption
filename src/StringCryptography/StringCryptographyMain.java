package StringCryptography;

import java.util.Scanner;

public class StringCryptographyMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String words = scanner.nextLine();
//        String words = "Geeks For Geeks";
        String encryptedWords;
        String decryptedWords;
        StringCryptography crypto = new StringCryptography();

//        Encryption of Words
        encryptedWords = crypto.encryption(words.toCharArray());
        System.out.println(encryptedWords +"\n");

//        Decryption of Words
        decryptedWords = crypto.decryption(encryptedWords.toCharArray());
        System.out.println(decryptedWords);
    }
}
