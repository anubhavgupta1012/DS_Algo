package com.ds.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int A[] = {1245, 12, 346, 678543, 456023, 7896, 1234, 45, 347, 7890, 5670};
        quickSort(A, 0, A.length - 1);
        for (int i : A)
            System.out.print(i + "\t");
    }

    public static void quickSort(int[] A, int left, int right) {
        if (left < right) {
            int pivot = right;
            int i = getPartition(A, left, pivot);
            quickSort(A, left, i - 1);
            quickSort(A, i + 1, right);
        }
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


/*    private static void quickSort2(int[] A, int init, int n) {
        if (init < n) {
            int j = getJ(A, init, n);
            quickSort2(A, init, j - 1);
            quickSort2(A, j + 1, n);
        }
    }

    private static int getJ(int[] A, int init, int n) {
        int j = init - 1;                               // swap counter will be 1 less than the left of subArray Each time
        int pivot = A[n];
        for (int i = init; i <= n; i++) {               // inner loops will start from the starting index of subArray
            int i1 = A[i];
            if (i1 <= pivot) {
                j++;
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
        }
        return j;
    }*/
}
