package com.ds.coreJava;

class ExcepPropTest {
    public static void main(String s[]) {
        int x, y, z;
        try {
            x = 6;
            y = 0;
            z = calc(x, y);
            System.out.println("Result=" + z);
        } finally {
            System.out.println("finally in main");
        }
        System.out.println("thank you");
    }

    static int calc(int a, int b) {
        try {
            System.out.println("welcome in calc");
            int c;
            c = a / b;
            return (c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally in calc");
        }
        return 0;
    }
}