package com.ds.arrays.questions;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFormedByArrayElements {
    public static void main(String[] args) {
        Integer[] A = {3, 30, 34, 5, 9};

        Arrays.sort(A, (i1, i2) -> {
            String s1 = String.valueOf(i1);
            String s2 = String.valueOf(i2);
            String s11 = s1 + s2;
            String s22 = s2 + s1;
            return s11.compareTo(s22);
        });
        for (int i : A)
            System.out.print(i + " ");
    }
}
