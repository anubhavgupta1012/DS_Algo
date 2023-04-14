package com.ds.StriverSDESheet.Array;

public class MaxSumPath {
    public static void main(String[] args) {
        int A[] = {10, 12};
        int B[] = {5, 7, 9};

        int sum = getSum(A, B);
        System.out.println(sum);
    }

    private static int getSum(int[] A, int[] B) {
        int maxSum = 0;

        int n1 = A.length;
        int n2 = B.length;
        int i = 0;
        int j = 0;
        int sum1 = 0;
        int sum2 = 0;

        while (i < n1 && j < n2) {
            if (A[i] < B[j]) {
                sum1 += A[i++];
            } else if (A[i] > B[j]) {
                sum2 += B[j++];
            } else if (A[i] == B[j]) {
                maxSum += Math.max(sum1, sum2) + A[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        while (i < n1) {
            sum1 += A[i++];
        }
        while (j < n2) {
            sum2 += B[j++];
        }
        maxSum += Math.max(sum1, sum2);
        return maxSum;
    }
}
