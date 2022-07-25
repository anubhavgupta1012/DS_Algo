package com.ds.arrays.questions;

public class SumPairClosesToX {
    public static void main(String[] args) {
        int A[] = {7,34,37,45,62,65,69,74,97};
        int X = 74;

        int[] sumPairClosesToX = findSumPairClosesToX(A, X);
        for (int a : sumPairClosesToX)
            System.out.print(a + " ");
    }

    private static int[] findSumPairClosesToX(int[] A, int x) {
        int[] pair = new int[2];

        int first = 0;
        int f = 0;
        int l = 0;
        int last = A.length - 1;
        int min = Integer.MAX_VALUE;

        while (first < last) {
            if (A[first] + A[last] > x) {
                if (min > (A[first] + A[last]) - x) {
                    min = A[first] + A[last] - x;
                    f = A[first];
                    l = A[last];
                }
                last--;
            } else if (A[first] + A[last] < x) {
                if (min > x - (A[first] + A[last])) {
                    min = x - (A[first] + A[last]);
                    f = A[first];
                    l = A[last];
                }
                first++;
            } else if (A[first] + A[last] == x) {
                f = A[first];
                l = A[last];
                break;
            }

        }
        pair[0] = f;
        pair[1] = l;
        return pair;
    }
}
