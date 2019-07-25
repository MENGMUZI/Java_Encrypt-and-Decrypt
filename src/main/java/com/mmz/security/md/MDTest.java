package com.mmz.security.md;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author : mengmuzi
 * create at:  2019-07-25  11:50
 * @description: MD算法
 */
public class MDTest {

    private static String src = "mengmuzi wishs a great job!";

    public static void main(String[] args) {
        System.out.println("----------------MD5--------------");
        jdkMD5();
        System.out.println("----------------MD2--------------");
        jdkMD2();

    }

    public static void jdkMD5(){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] md5Bytes = md.digest(src.getBytes());
            System.out.println("JDK MD5:" + Hex.encodeHexString(md5Bytes));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static void jdkMD2(){
        try {
            MessageDigest md = MessageDigest.getInstance("MD2");
            byte[] md5Bytes = md.digest(src.getBytes());
            System.out.println("JDK MD2:" + Hex.encodeHexString(md5Bytes));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

}
