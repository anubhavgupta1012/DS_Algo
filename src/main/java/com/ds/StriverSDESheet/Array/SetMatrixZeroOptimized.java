package com.ds.StriverSDESheet.Array;

public class SetMatrixZeroOptimized {

    public static void main(String[] args) {
        int[][] A = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

        setMatrixZeroes(A);

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void setMatrixZeroes(int[][] A) {
        int col0 = 1;
        int row0 = 1;

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++) {
                if (!(i == 0 && j == 0) && A[i][j] == 0) {
                    if (i == 0 || j == 0) {
                        if (i == 0) row0 = 0;
                        if (j == 0) col0 = 0;
                    } else {
                        A[i][0] = 0;
                        A[0][j] = 0;
                    }
                }
            }


        for (int i = A.length - 1; i >= 0; i--)
            for (int j = A[i].length - 1; j >= 0; j--)
                if (A[0][j] == 0 || A[i][0] == 0) {
                    A[i][j] = 0;
                }

        if (col0 == 0)
            for (int i = 0; i < A.length; i++)
                A[i][0] = 0;

        if (row0 == 0)
            for (int i = 0; i < A[0].length; i++)
                A[0][i] = 0;

    }
}
