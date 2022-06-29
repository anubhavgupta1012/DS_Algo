package com.ds.impAlogos;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] A = {-1, -2, -3, -4};

        System.out.println(findMaxContiguousSubArraySum(A));
    }

    private static int findMaxContiguousSubArraySum(int[] A) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];

            if (sum < A[i])
                sum = A[i];


            if (max < sum)
                max = sum;
        }
        return max;
    }
}
