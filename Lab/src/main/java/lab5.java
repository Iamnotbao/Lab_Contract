import java.util.Base64;
import Maintenance_Request.*;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class lab5 {
    public static SecretKey generateKey() throws Exception{
        KeyGenerator keyGen= KeyGenerator.getInstance("AES");
        keyGen.init(256);
        return keyGen.generateKey();
    }
    public static String encrypt(String plainText, SecretKey key) throws Exception{
      Cipher cipher =Cipher.getInstance("AES");
      cipher.init(Cipher.ENCRYPT_MODE, key);
      byte[] cyptoBytes =cipher.doFinal(plainText.getBytes());
      return Base64.getEncoder().encodeToString(cyptoBytes);
    };
    public static String decrypt(String encyptedText,SecretKey key) throws Exception{

         Cipher cipher=Cipher.getInstance("AES");
         cipher.init(Cipher.DECRYPT_MODE, key);
         byte[] decryptoBytes=cipher.doFinal(Base64.getDecoder().decode(encyptedText.getBytes()));
         return new String(decryptoBytes);
    }
    public static void main(String[] args){
        // try{
        //     SecretKey key=generateKey();
        //     String message=" i am a Customer";
        //     String encryptoMessage =encrypt(message, key);
        //     System.out.println("encrypted : "+encryptoMessage+"\n");
        //    String decryptMessage= decrypt(encryptoMessage, key);
        //     System.out.println("decrypted : "+decryptMessage+"\n");
        // }catch(Exception exception){
        //     System.out.println(exception.toString());
        // }
        Maintenance_Requests requests=new Medium_Priority_Request();
        
        System.out.println(requests.toString());
    }
}
