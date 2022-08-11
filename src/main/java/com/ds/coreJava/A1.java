package com.ds.coreJava;

public class A1 {
    static {
        System.out.println("I am in static block of class A");
    }

    public void test() {
        System.out.println("I am in test method");
    }
}

class mainA {
    public static void main(String[] args) {
        A1 a = new A1();
        a.test();
    }
}
