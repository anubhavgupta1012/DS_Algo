package com.ds.sorting;


public class BubbleSort {
    public static void main(String[] args) {
        int A[] = {9, 8, 1, 7, 6, 5, 4, 3, 6, 2, 1};
        bubbleSort(A);
        for (int i : A)
            System.out.print(i + "\t");
    }

    private static void bubbleSort(int[] A) {
        int n = A.length;
        for (int i = 1; i <= n; i++)
            for (int j = 0; j < n - i; j++)
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
    }
}
