package com.ds.arrays.questions;

public class QuickSort {
    public static void main(String[] args) {
        int A[] = {1245, 12, 346, 678543, 456023, 7896, 1234, 45, 347, 7890, 5670};
        quickSort2(A, 0, A.length - 1);
        for (int i : A)
            System.out.print(i + "\t");
    }

    private static void quickSort2(int[] A, int init, int n) {
        if (init < n) {
            int j = init - 1;                               //
            int pivot = A[n];
            for (int i = init; i <= n; i++) {
                int i1 = A[i];
                if (i1 <= pivot) {
                    j++;
                    int temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
            quickSort2(A, init, j - 1);
            quickSort2(A, j + 1, n);
        }
    }
}
