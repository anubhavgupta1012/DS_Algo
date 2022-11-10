package com.ds.coreJava.java8Features;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SayableImpl extends ClassTest implements Sayable2, Sayable {
    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args) {
        ClassTest sayable = new SayableImpl();
        //non-static methods
        sayable.say();
        sayable.say2();
        sayable.say1();
        //static methods
        System.out.println(Sayable2.say3());
        System.out.println(Sayable2.say4());
        System.out.println(Sayable2.say5());
        

    }

    public void say() {
        System.out.println(" classImpl say");
    }


    static String say3() {
        return "say33333";
    }

    static String say4() {
        return "say44444";
    }

    static String say5() {
        return "say55555";
    }
}

