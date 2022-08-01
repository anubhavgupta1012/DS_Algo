package com.ds.arrays.questions;

import java.util.Arrays;

public class SmallestPositiveIntegerNotAsSum {
    public static void main(String[] args) {
        long A[] = {1, 2, 3, 4, 5, 6};
        System.out.println(findSmallestPositiveIntegerNotAsSum(A));
    }

    private static long findSmallestPositiveIntegerNotAsSum(long[] A) {
        Arrays.sort(A);
        long sum = 1;
        for (int i = 0; i < A.length; i++) {

            if (A[i] <= sum)
                sum += A[i];

            else if (A[i] > sum)
                return sum;

        }
        return sum;
    }
}
