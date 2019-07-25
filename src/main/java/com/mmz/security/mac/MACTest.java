package com.mmz.security.mac;

import org.apache.commons.codec.binary.Hex;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

/**
 * @author : mengmuzi
 * create at:  2019-07-25  13:58
 * @description: MAC算法
 */
public class MACTest {

    private static String src = "mengmuzi wishs a great job!";

    public static void main(String[] args) {
        jdkHmacMD5();
    }

    public static void jdkHmacMD5(){
        try{
            KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacMD5");
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] key = secretKey.getEncoded();

            SecretKey restoreSecretKey = new SecretKeySpec(key,"HmacMD5");
            Mac mac = Mac.getInstance(restoreSecretKey.getAlgorithm());
            mac.init(restoreSecretKey);
            byte[] hmacMD5Bytes = mac.doFinal(src.getBytes());
            System.out.println("JDBC hmacMD5:" + Hex.encodeHexString(hmacMD5Bytes));

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
