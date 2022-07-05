package com.ds.arrays.questions;

import java.util.HashSet;

public class TripletSum {
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 3, 6, 7};
        int X = 10;
        System.out.println(countTripletSum(A, X));
    }

    private static int countTripletSum(int[] A, int x) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            int midSum = x - A[i];
            Integer doubleSum = findDoubleSum(A, i + 1, midSum);
            if (doubleSum > 0) count += doubleSum;
        }
        return count;
    }

    private static Integer findDoubleSum(int[] A, int from, int midSum) {
        int countDouble = 0;

        HashSet hashSet = new HashSet();
        for (int i = from; i < A.length; i++) {

            if (hashSet.contains(midSum - A[i])) {
                countDouble++;
            } else {
                hashSet.add(A[i]);
            }
        }

        return countDouble;
    }

}
