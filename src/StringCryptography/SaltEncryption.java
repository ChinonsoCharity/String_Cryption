package StringCryptography;


import java.util.Base64;
import java.util.Date;
import java.util.Random;

public class SaltEncryption {
    private static Random rand = new Random((new Date()).getTime());

    public String saltEncrypt(String words) {
        Base64.Encoder encoder =  Base64.getEncoder();
        byte[] salt = new byte[8];
        rand. nextBytes(salt);
        String result = encoder.encodeToString(salt) + encoder.encodeToString(words.getBytes());
        System.out.println(result);
        return result;

    }

    public String saltDecrypt(String encoded){
        if (encoded.length() >12){
            String cipher = encoded.substring(12);
            Base64.Decoder decoder = Base64.getDecoder();
            System.out.println(new String(decoder.decode(cipher)));
            return new String(decoder.decode(cipher));
        }
        return null;
    }
}
