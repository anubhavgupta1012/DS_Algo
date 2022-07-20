package com.ds.arrays.questions;

public class WaveArray {
    public static void main(String[] args) {
        int A[] = {2, 4, 7, 8, 9, 10};

        findWaveArray(A);

        for (int a : A) {
            System.out.print(a + " ");
        }

    }

    private static void findWaveArray(int[] A) {
        int i = 1;

        int n = A.length - 1;
        while (i <= n) {
            int temp = A[i];
            A[i] = A[i - 1];
            A[i - 1] = temp;

            i += 2;
        }

    }

}
