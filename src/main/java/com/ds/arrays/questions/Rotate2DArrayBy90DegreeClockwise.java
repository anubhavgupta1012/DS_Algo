package com.ds.arrays.questions;

public class Rotate2DArrayBy90DegreeClockwise {
    public static void main(String[] args) {

        int[][] A = {{1, 2, 3}, {10, 32, 77}, {9, 33, 2}, {22, 10, 12}};
        int m = A[0].length - 1;
        int n = A.length - 1;
        int[][] B = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = A[m - i][n - j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

    }
}
