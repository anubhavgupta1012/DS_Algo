package com.ds.coreJava.java8Features;

import java.util.Optional;


public class OptionalTest {
    public static void main(String[] args) {

        String str = "ANUBHAV";
        //String str = null;
        String finalString = Optional.ofNullable(str).orElse("DHEERAJ");
        System.out.println(finalString);
    }
}
