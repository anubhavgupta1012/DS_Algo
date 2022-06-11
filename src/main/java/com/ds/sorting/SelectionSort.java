package com.ds.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int A[] = {1245, 12, 346, 678543, 456023, 7896, 1234, 45, 347, 7890, 5670};
        selectionSort(A);
        for (int i : A)
            System.out.print(i + "\t");
    }

    private static void selectionSort(int[] A) {
        int length = A.length;
        for (int i = 0; i < length - 1; i++) {
            int smallestIndex = -1;
            int smallest = Integer.MAX_VALUE;


            for (int j = i; j < length; j++)
                if (A[j] < smallest) {
                    smallestIndex = j;
                    smallest = A[j];
                }

            if (smallestIndex != -1 && smallestIndex < A.length) {
                int temp = A[i];
                A[i] = smallest;
                A[smallestIndex] = temp;
            }
        }
    }
}
