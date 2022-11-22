package com.ds.arrays.questions;

public class TrappingRainWater {

    public static void main(String[] args) {
        int A[] = {3, 0, 0, 2, 0, 4};
        //int A[] = {3, 0, 1, 0, 0, 2, 0, 4, 0, 2};
        //int A[] = {1, 1, 5, 2, 7, 6, 1, 4, 2, 3};

        System.out.println(getTotalTrappedRainWater(A));
    }

    private static long getTotalTrappedRainWater(int[] A) {
        int total = 0;
        int n = A.length - 1;

        int maxLeft = A[0];
        int maxRight = A[n];

        int maxL[] = new int[A.length - 2];
        int maxR[] = new int[A.length - 2];

        int ii = 0;
        for (int i = 1; i < A.length - 1; i++) {
            if (maxLeft < A[i])
                maxLeft = A[i];

            maxL[ii] = maxLeft;
            ii++;
        }

        int jj = maxR.length - 1;
        for (int j = n - 1; j >= 1; j--) {
            if (maxRight < A[j])
                maxRight = A[j];

            maxR[jj] = maxRight;
            jj--;
        }

        for (int k = 1; k < A.length - 1; k++) {
            int h = Math.min(maxL[k - 1], maxR[k - 1]) - A[k];
            total += Math.max(h, 0);
        }
        return total;
    }
}
