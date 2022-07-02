package com.ds.arrays.questions;

import java.util.Arrays;

public class MinimizeHeightDifference {
    /*TODO not solved yet*/
    public static void main(String[] args) {
        int A[] = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int k = 5;

        /*int A[] = {3, 9, 12, 16, 20};
        int k = 3;*/

        //7

        System.out.println(findMinimizeHeightDifference(A, k));
    }

    private static int findMinimizeHeightDifference(int[] A, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maximum = Arrays.stream(A).max().getAsInt();
        for (int i = 0; i < A.length; i++) {
            if (A[i] - k < 0) {
                A[i] = A[i] + k;
            } else if (A[i] - k >= 0 /*&& A[i]*/) {
                A[i] = A[i] + k;
            }

            if (max < A[i]) max = A[i];

            if (min > A[i]) min = A[i];

        }
        A = Arrays.stream(A).sorted().toArray();
        return A[A.length - 1] - A[0];

    }
}
