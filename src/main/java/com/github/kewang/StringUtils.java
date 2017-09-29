package com.github.kewang;

public class StringUtils {
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static int length(String str){
        return str.length();
    }
}