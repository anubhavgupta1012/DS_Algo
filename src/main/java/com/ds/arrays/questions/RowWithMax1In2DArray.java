package com.ds.arrays.questions;

public class RowWithMax1In2DArray {
    public static void main(String[] args) {
        int A[][] = {{0, 0}, {0, 1}, {0, 0}, {0, 0}, {0, 1}, {0, 1}};
        //int A[][] = {{0, 0}, {0, 1}};
        /*int A[][] = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};*/

        System.out.println(findRowWithMax1In2DArray(A, A.length, A[0].length));
    }

    private static int findRowWithMax1In2DArray(int[][] A, int n, int m) {
        int row = -1;
        int max1 = 0;

        int j = 0;
        int count = 0;
        for (int i = 0; i < n; ) {

            if (A[i][j] == 1)
                count++;

            if (j == m - 1) {
                j = 0;

                if (max1 < count) {
                    max1 = count;
                    row = i;
                }
                i++;
                count = 0;
                continue;
            }
            j++;

        }
        return row;
    }
}

