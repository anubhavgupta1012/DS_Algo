package com.ds.arrays.questions;

public class FindFirstMissingNumber {
    public static void main(String[] args) {
        int A[] = {0, 1, 2, 6, 9};
        System.out.println(findFirstMissingNumber(A));
    }

    private static int findFirstMissingNumber(int[] A) {
        int number = -1;

        if (A[0] != 0)
            return 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] != i) {
                number = i;
                break;
            }
        }
        return number;
    }
}
