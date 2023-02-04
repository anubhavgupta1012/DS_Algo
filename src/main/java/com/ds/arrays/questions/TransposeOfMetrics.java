package com.ds.arrays.questions;

public class TransposeOfMetrics {
    public static void main(String[] args) {

        int[][] A = {{1, 2, 3}, {10, 32, 77}, {9, 33, 2}, {22, 10, 12}};
        int[][] B = new int[A[0].length][A.length];

        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                B[i][j] = A[j][i];
            }
        }

        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

    }
}
