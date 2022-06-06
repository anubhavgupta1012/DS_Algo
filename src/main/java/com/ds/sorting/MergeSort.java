package com.ds.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int A[] = {22, 65, 45, 89, 64, 3456, 986, 87900, 54632, 76, 645, 4532};
        mergeSort(A, 0, A.length - 1);
        for (int i : A)
            System.out.print(i + "\t");
    }

    private static void mergeSort(int[] A, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(A, left, mid);
            mergeSort(A, mid + 1, right);
            merge(A, left, mid, right);
        }
    }

    private static void merge(int[] A, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int A1[] = new int[n1];
        int A2[] = new int[n2];

        for (int i = 0; i < n1; i++)
            A1[i] = A[left + i];
        for (int j = 0; j < n2; j++)
            A2[j] = A[mid + 1 + j];

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            int first = A1[i];
            int second = A2[j];
            if (first <= second) {
                A[k] = first;
                i++;
            } else {
                A[k] = second;
                j++;
            }
            k++;
        }

        while (i < n1) {
            A[k] = A1[i];
            i++;
            k++;
        }
        while (j < n2) {
            A[k] = A2[j];
            j++;
            k++;
        }
    }
}
