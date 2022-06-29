package com.ds.arrays.questions;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Factorial {
    public static void main(String[] args) {
        int n = 12500;
        System.out.println(getDigits(n));
    }

    private static BigDecimal findFactorial(int n) {
        return n > 1 ? BigDecimal.valueOf(n).multiply(findFactorial(n - 1)) : BigDecimal.valueOf(1);
    }

    private static ArrayList<Integer> getDigits(int n) {
        String s = findFactorial(n).toString();
        System.out.println(s);

        char[] chars = s.toCharArray();

        ArrayList<Integer> integers = new ArrayList<>();

        for (char a : chars) {
            if (Character.getNumericValue(a) == -1)
                break;

            integers.add(Character.getNumericValue(a));
        }
        return integers;
    }
}
