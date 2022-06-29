package com.ds.arrays.questions;

public class MaxContiguousSubArrayProduct {

    public static void main(String[] args) {
        int[] A = {0, 3, -5, -2, 8, -7, -6, -2, -3, -9};

        System.out.println(findMaxContiguousSubArrayProduct(A));
    }

    private static int findMaxContiguousSubArrayProduct(int[] A) {
        int max = Integer.MIN_VALUE;
        int sum = 1;
        int initialNegative = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {

            if (A[i] == 0) {
                sum = 1;
                if (i != A.length - 1)
                    initialNegative = Integer.MIN_VALUE;
                continue;
            } else if (initialNegative == Integer.MIN_VALUE && A[i] < 0)
                initialNegative = sum * A[i];


            sum *= A[i];

            if (Math.abs(max) <= Math.abs(sum))
                max = sum;

        }
        return max > 0 ? max : max / initialNegative == 1 ? max : max / initialNegative;
    }
}
