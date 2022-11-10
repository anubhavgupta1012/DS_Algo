package com.ds.coreJava.java8Features;

public interface Sayable2 {
    default void say() {
        System.out.println("say");
    }

    default void say1() {
        System.out.println("say1");
    }

    default void say2() {
        System.out.println("say2");
    }

    static String say3() {
        return "say3";
    }

    static String say4() {
        return "say4";
    }

    static String say5() {
        return "say5";
    }

    private String getVoid() {
        return "";
    }
}
