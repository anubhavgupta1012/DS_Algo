package com.ds.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int A[] = {1245, 12, 346, 678543, 456023, 7896, 1234, 45, 347, 7890, 5670};
        quickSort(A, 0, A.length - 1);
        for (int i : A)
            System.out.print(i + "\t");
    }

    private static void quickSort(int[] A, int left, int right) {
        if (left >= right)
            return;

        int pivot = right;
        int i = getPartition(A, left, pivot);
        quickSort(A, left, i - 1);
        quickSort(A, i + 1, right);
    }

    private static int getPartition(int[] A, int left, int pivot) {
        int i = left - 1;
        int j = left;

        while (j <= pivot) {
            int main = A[pivot];
            if (A[j] <= main) {
                i++;
                swap(A, i, j);
            }
            j++;
        }
        return i;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
