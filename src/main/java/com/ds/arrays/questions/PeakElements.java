package com.ds.arrays.questions;

public class PeakElements {

    public static void main(String[] args) {
        /*
        * An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
            Given an array arr[] of size N, Return the index of any one of its peak elements.
        * */

        int A[] = {1, 2, 3};
        System.out.println(peakElement(A, A.length));
    }

    public static int peakElement(int[] A, int n) {
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 && i + 1 < n - 1 && A[i] > A[i + 1]) {
                x = i;
                break;
            }
            if (i == n - 1 && i - 1 >= 0 && A[i] > A[i - 1]) {
                x = i;
                break;
            }
            if (i > 0 && i < n - 1 && A[i] > A[i - 1] && A[i] > A[i + 1]) {
                x = i;
                break;
            }
        }
        return x;
    }
}
