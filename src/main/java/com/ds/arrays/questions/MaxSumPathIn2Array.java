package com.ds.arrays.questions;

public class MaxSumPathIn2Array {
    public static void main(String[] args) {
        int A[] = {10, 12};
        int B[] = {5, 7, 9};

        System.out.println(findMaxSumPathIn2Array(A, B));
    }

    private static int findMaxSumPathIn2Array(int[] A, int[] B) {
        int maxSum = 0;
        int j = 0;
        int i = 0;
        int n = A.length;
        int m = B.length;
        int sum1 = 0;
        int sum2 = 0;
        while (i < n && j < m) {
            if (A[i] < B[j]) {
                sum1 += A[i++];
            } else if (B[j] < A[i]) {
                sum2 += B[j++];
            } else if (A[i] == B[j]) {
                maxSum += Math.max(sum1, sum2) + A[i];
                sum1 = sum2 = 0;
                i++;
                j++;
            }
        }
        while (i < n) {
            sum1 += A[i++];
        }
        while (j < m) {
            sum2 += B[j++];
        }
        maxSum += Math.max(sum1, sum2);

        return maxSum;
    }
}
