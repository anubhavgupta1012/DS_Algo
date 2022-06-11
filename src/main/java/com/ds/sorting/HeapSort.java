package com.ds.sorting;

public class HeapSort {
    public static void main(String[] P) {
        int A[] = {12, 100, 29, 11, 13, 5, 6, 7};
        heapSort(A);
        for (int i : A)
            System.out.print(i + "\t");
    }

    private static void heapSort(int[] A) {
        BUILD_HEAP(A);
        SORT_MAX_HEAP(A);
    }

    private static void SORT_MAX_HEAP(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[0] > A[A.length - 1 - i]) {
                int temp = A[0];
                A[0] = A[A.length - 1 - i];
                A[A.length - 1 - i] = temp;
                MAX_HEAPIFY(A, 0, A.length - 2 - i);
            }
        }
    }

    private static void BUILD_HEAP(int[] A) {
        int n = A.length;
        int internalNode = (int) Math.floor(n / 2) - 1;
        for (int i = internalNode; i >= 0; i--)
            MAX_HEAPIFY(A, i, A.length);
    }

    private static void MAX_HEAPIFY(int[] A, int i, int j) {
        int n = j;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = 0;
        int pointer = -1;

        if (left <= n - 1 && largest < A[left] && A[i] < A[left]) {
            largest = A[left];
            pointer = left;
        }

        if (right <= n - 1 && largest < A[right] && A[i] < A[right]) {
            largest = A[right];
            pointer = right;
        }

        if (pointer != -1) {
            int temp = A[i];
            A[i] = largest;
            A[pointer] = temp;
            MAX_HEAPIFY(A, pointer, n);
        }
    }
}
