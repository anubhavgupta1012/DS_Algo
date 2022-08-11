package com.ds.coreJava;

class Parent {
    void m1() {
        System.out.println("m1 in Parent");
        m2();
    }

    void m2() {
        System.out.println("m1 in Parent");
    }
}

class Child extends Parent {
    void m2() {
        System.out.println("m2 in child1");
    }
}

public class mainClass2 {
    public static void main(String[] args) {
        check(new Child());
        // check(new Parent());
    }

    public static void check(Parent parent) {
        parent.m1();
        // parent.m2();
    }
}