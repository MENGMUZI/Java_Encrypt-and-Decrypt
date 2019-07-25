package com.mmz.security.base64;

import org.apache.commons.codec.binary.Base64;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * @author : mengmuzi
 * create at:  2019-07-25  10:49
 * @description:  Base64加解密算法
 */
public class Base64Test {

    //private static String src = "mengmuzi wishs a great job!";
    private static String src = "nnnn";

    public static void main(String[] args) {
        System.out.println("-------------JDK实现---------");
        jdkBase64();
        System.out.println("-------------Commons Codec 实现--------");
        commonsCodesBase64();
        System.out.println("-------------Bouncy Castle 实现--------");
        bouncyCastleBase64();
    }

    //通过JDK实现Base64加密
    public static void jdkBase64(){

        BASE64Encoder encoder = new BASE64Encoder();
        String encode = encoder.encode(src.getBytes());
        System.out.println("encode:" + encode);

        BASE64Decoder decoder = new BASE64Decoder();
        try {
            System.out.println("decode:" + new String(decoder.decodeBuffer(encode)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //Commons Codec 实现Base64加密

    public static void commonsCodesBase64(){
        byte[] encodeBytes = Base64.encodeBase64(src.getBytes());
        System.out.println("encode:" + new String(encodeBytes));

        byte[] decodeBytes = Base64.decodeBase64(encodeBytes);
        System.out.println("decode:" + new String(decodeBytes));
    }

    //Bouncy Castle 实现Base64加密
    public static void bouncyCastleBase64(){
        byte[] encodeBytes = org.bouncycastle.util.encoders.Base64.encode(src.getBytes());
        System.out.println("encode:" + new String(encodeBytes));

        byte[] decodeBytes = org.bouncycastle.util.encoders.Base64.decode(encodeBytes);
        System.out.println("decode:" + new String(decodeBytes));
    }

}
