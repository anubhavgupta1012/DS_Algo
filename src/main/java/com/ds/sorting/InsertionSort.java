package com.ds.sorting;

public class InsertionSort {
    // Like Inserting Cards at its correct position in Sorted Order
    public static void main(String[] args) {
        int A[] = {1245, 12, 346, 678543, 456023, 7896, 1234, 45, 347, 7890, 5670};
        insertionSort(A);
        for (int i : A)
            System.out.print(i + "\t");
    }

    private static void insertionSort(int[] A) {
        int length = A.length;

        for (int i = 0; i < length; i++) {
            int temp = A[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (temp < A[j]) {
                    A[j + 1] = A[j];
                } else {
                    break;
                }
            }
            A[j + 1] = temp;
        }
    }
}