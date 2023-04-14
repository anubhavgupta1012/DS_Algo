package com.ds.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(getSum(5921));
    }

    static int getSum(int n) {
        if (n / 10 == 0)
            return n;
        return n % 10 + getSum(n / 10);
    }
}
