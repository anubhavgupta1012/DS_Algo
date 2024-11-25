package com.ds.recursion;

public class FibonacciNthTerm {
    public static void main(String[] args) {
        long fib = fib(50);
        System.out.println(fib);
    }

    public static long fib(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
