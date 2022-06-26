package com.ds.sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int A[] = {1, 4, 1, 2, 7, 5, 2, 2, 2, 2, 8, 1};
        countSort(A);
        for (int i : A)
            System.out.print(i + "\t");
    }

    private static void countSort(int[] A) {
        int max = Arrays.stream(A).max().getAsInt();

        int A1[] = new int[max + 1];

        for (int i = 0; i < A.length; i++)
            A1[A[i]]++;

        int x = 0;
        for (int i = 1; i < max + 1; i++) {
            int n = A1[i];
            for (int j = 0; j < n; j++) {
                A[x] = i;
                x++;
            }
        }

    }
}
