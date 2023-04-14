package com.ds.Java.collections;

public class LongestSubArraySumEqualsTo0 {
    public int solve(int[] A) {

        long[] PS = new long[A.length];
        int n = A.length;

        long sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            PS[i] = sum;
        }


        int max = 0;
        for (int s = 0; s < n; s++) {
            for (int e = s + 1; e < n; e++) {
                if (PS[e] - PS[s] == 0) {
                    max = Math.max(max, e - s);
                }
                if (PS[e] == 0) {
                    max = Math.max(max, e + 1);
                }
            }
        }
        return max;

    }
}
