package com.ds.StriverSDESheet.Array;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes {

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

    private static int[][] setMatrixZeroes(int[][] A) {
        List<Integer> A1 = new ArrayList<>();
        List<Integer> A2 = new ArrayList<>();

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                if (A[i][j] == 0) {
                    A1.add(i);
                    A2.add(j);
                }

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[i].length; j++)
                if (A1.contains(i) || A2.contains(j)) {
                    A[i][j] = 0;
                }

        return A;
    }
}
