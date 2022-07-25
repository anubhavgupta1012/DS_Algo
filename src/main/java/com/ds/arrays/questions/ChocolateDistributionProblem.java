package com.ds.arrays.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int A[] = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        ArrayList<Integer> objects = new ArrayList<>();

        for (int i : A)
            objects.add(i);

        System.out.println(findMinDiffBetLowAndHigh(objects, m));
    }

    private static long findMinDiffBetLowAndHigh(List<Integer> A1, int m) {

        //A1 = A1.stream().sorted().collect(Collectors.toList());
        int[] A = new int[A1.size()];
        int i1 = 0;
        int min = Integer.MAX_VALUE;
        for (Integer x : A1)
            A[i1++] = x;
        Arrays.sort(A);

        for (int i = 0; i <= A.length - m; i++) {
            int i2 = Math.abs(A[i] - A[i + m - 1]);
            if (min > i2)
                min = i2;

        }
        return min;
    }
}
