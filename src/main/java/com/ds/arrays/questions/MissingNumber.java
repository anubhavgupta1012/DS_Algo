package com.ds.arrays.questions;

public class MissingNumber {
    public static void main(String[] args) {
        int A[] = {6, 1, 2, 8, 3, 4, 7, 10, 5};

        int n = 10;

        buildMinHeap(A);

        for (int i = 0; i < n; i++) {
            int x = A[0];
            minHeapfy(A, 0, A.length - 2 - i);
            if (i + 1 != x)
                System.out.println(i + 1);
        }
    }

    private static void buildMinHeap(int[] A) {
        int internalNode = (int) (Math.floor(A.length / 2) - 1);

        for (int i = internalNode; i >= 0; i--)
            minHeapfy(A, i, A.length - 1);
    }

    private static void minHeapfy(int[] A, int i, int n) {
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;

        int smallest = Integer.MAX_VALUE;
        int pointer = -1;
        if (c1 <= n && A[i] > A[c1] && A[c1] < smallest) {
            smallest = A[c1];
            pointer = c1;
        }
        if (c2 <= n && A[i] > A[c2] && A[c2] < smallest) {
            smallest = A[c2];
            pointer = c2;
        }

        if (pointer != -1) {
            int temp = A[i];
            A[i] = A[pointer];
            A[pointer] = temp;
            minHeapfy(A, pointer, n);
        }
    }
}
