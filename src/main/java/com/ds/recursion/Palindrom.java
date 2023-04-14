package com.ds.recursion;

public class Palindrom {
    public static void main(String[] args) {

        String str = "forgeeksskeegrof";

        System.out.println(isPalindrom(str));
    }

    private static boolean isPalindrom(String str) {
        int n = str.length();
        if (n == 0 || n == 1) {
            return true;
        }
        return str.charAt(0) == str.charAt(n - 1) && isPalindrom(str.substring(1, n - 1));
    }
}