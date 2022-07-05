package com.ds.arrays.questions;

public class StockSpan {
    public static void main(String[] args) {
        int A[] = {10,4,5,90,120,80};

        int[] stockSpan = findStockSpan(A);
        for (int a : stockSpan) {
            System.out.print(a + " ");
        }
    }

    private static int[] findStockSpan(int[] A) {
        int[] results = new int[A.length];
        results[0] = 1;

        for (int i = 1; i < A.length; i++) {
            int result = 1;

            int span = findSpan(A, i, A[i], result);

            results[i] = span;
        }

        return results;
    }

    private static int findSpan(int[] A, int i, int x, int result) {
        if (i >= 1 && A[i - 1] <= x)
            return findSpan(A, i - 1, x, result + 1);
        return result;
    }
}
