package com.ds.arrays.questions;

public class SmallestPositiveMissingNumberOptimized {
    //O(N) Time, O(1)-> Space
    public static void main(String[] args) {

        int A[] = {0, 1};
        System.out.println(findSmallestPositiveMissingNumber(A));
    }

    private static int findSmallestPositiveMissingNumber(int[] A) {
        int n = A.length;

        boolean one = false;
        for (int i = 0; i < n; i++)
            if (A[i] == 1) {
                one = true;
                break;
            }

        if (!one) return 1;

        boolean zero = false;
        for (int i = 0; i < n; i++)
            if (A[i] == 0) {
                zero = true;
                break;
            }

        for (int i = 0; i < n; i++)
            if (A[i] <= 0 || A[i] > n) A[i] = 1;

        for (int i = 0; i < n; i++)
            A[A[i] % n] += n;


        for (int i = 1; i < n; i++)
            if (A[i] <= n)
                return i;

        return zero ? n : n + 1;

    }
}
