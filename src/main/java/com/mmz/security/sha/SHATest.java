package com.mmz.security.sha;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;

/**
 * @author : mengmuzi
 * create at:  2019-07-25  13:35
 * @description: SHA算法
 */
public class SHATest {
    private static String src = "mengmuzi wishs a great job!";

    public static void main(String[] args) {
        jdkSHA1();
    }

    public static void jdkSHA1(){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA");
            md.update(src.getBytes());
            System.out.println("jdk sha-1:" + Hex.encodeHexString(md.digest()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
