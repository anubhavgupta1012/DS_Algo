package com.ds.coreJava;

public class Test {

    public static void main(String[] args) {
        check(5);
    }
    public static void check(int x) {
        System.out.println("in check");
        if (x == 5)
            return;
        try {
            System.out.println("from try");
        } catch (Exception e) {
            System.out.println("from catch");
        } finally {
            System.out.println("from finally");
        }
    }
}
