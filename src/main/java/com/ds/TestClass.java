package com.ds;

public class TestClass {
    public static void main(String[] args) {
        new XYZ().test2(1);
    }
}

class XYZ {
    public static void test(int x) {
        System.out.println("static content x =" + x);
    }

    public void test2(int x) {
        System.out.println(this);
        System.out.println("static content x =" + x);
    }
}

