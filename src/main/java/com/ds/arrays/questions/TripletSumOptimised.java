package com.ds.arrays.questions;

import java.util.Arrays;

public class TripletSumOptimised {
    // With No Extra HashSet, Playing only with Variables
    public static void main(String[] args) {
        int[] A = {1, 4, 45, 6, 10, 8};
        int X = 13;
        System.out.println(countTripletSum(A, X));
    }

    private static int countTripletSum(int[] A, int x) {
        int result = 0;
        //quickSort(A, 0, A.length - 1);
        A = Arrays.stream(A).sorted().toArray();
        for (int i = 0; i < A.length - 2; i++) {
            int first = A[i];

            result += countDoubleSum(A, i + 1, x - first);
        }

        return result;
    }

    private static int countDoubleSum(int[] A, int j, int sum) {
        int result = 0;
        int k = A.length - 1;
        while (j < k) {
            if (A[j] + A[k] == sum) {
                result++;
                j++;
                k--;
            } else if (sum - A[j] < A[k]) {
                k--;
            } else if (sum - A[j] > A[k]) {
                j++;
            }
        }
        return result;
    }
}
