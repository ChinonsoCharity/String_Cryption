package StringCryptography;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaltEncryptionTest {

    @Test
    void saltEncryptAndSaltDecrypt() {
        String words = "This is an example of how to encrypt and decrypt using a salt.\n" +
                " The salt is random data very often used in cryptography as\n" +
                " additional input to a hash function.\n" +
                " Doing encryption and decryption of a String \n" +
                "with a salt implies that you should " +
                "ABOUT JAVA CODE GEEKS\n" +
                "JCGs (Java Code Geeks) is an independent online community\n " +
                "focused on creating the ultimate Java to Java developers resource center\n" +
                "; targeted at the technical architect, technical team lead (senior developer),\n" +
                " project manager and junior developers alike. JCGs serve the Java, SOA, Agile\n " +
                "and Telecom communities with daily news written by domain\n" +
                " experts, articles, tutorials, reviews, announcements, code\n" +
                " snippets and open source projects.";
     SaltEncryption encryption = new SaltEncryption();
     String newEncode = encryption.saltEncrypt(words);
     String newDecode = encryption.saltDecrypt(newEncode);
     assertEquals(words,newDecode);
    }
}