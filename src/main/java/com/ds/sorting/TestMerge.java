package com.ds.sorting;

public class TestMerge {
    public static void main(String[] args) {
        int[] A = {3, 4, 22, 15, 9, 30, -6, -100};
        mergeSort(A, 0, A.length - 1);

        for (int a : A)
            System.out.print(a + " ");

    }

    public static void mergeSort(int[] A, int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(A, left, mid);
            mergeSort(A, mid + 1, right);
            merge(A, left, mid, right);
        }

    }

    public static void merge(int[] A, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int A1[] = new int[n1];
        int A2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            A1[i] = A[left + i];
        }

        for (int i = 0; i < n2; i++) {
            A2[i] = A[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (A1[i] <= A2[j]) {
                A[k] = A1[i];
                i++;
            } else {
                A[k] = A2[j];
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
