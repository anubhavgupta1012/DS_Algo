package com.ds.arrays.questions;

public class MaxSumConfiguration {
    public static void main(String[] args) {
        int A[] = {8, 3, 1, 2};

        System.out.println(findMaxSum(A));
    }

    private static int findMaxSum(int[] A) {
        int maxSum = 0;

        int sum = 0;
        int n = A.length;
        for (int i = 0; i < n; i++)
            sum += A[i];

        int prevSum = 0;
        for (int i = 0; i < n; i++)
            prevSum += i * A[i];

        maxSum = prevSum;

        int S = 0;

        for (int i = 1; i < n; i++) {
            S = prevSum - sum + n * A[i - 1];

            if (S > maxSum)
                maxSum = S;

            prevSum = S;
        }
        return maxSum;
    }
}
