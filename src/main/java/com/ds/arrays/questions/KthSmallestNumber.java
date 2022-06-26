package com.ds.arrays.questions;

public class KthSmallestNumber {
    public static void main(String[] args) {
        /*
         *
         * Given an array arr[] and an integer K where K is smaller than size of array,
         * the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
         * */
      /*  Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
       */
        int x = 4;
        int A[] = {7, 10, 4, 20, 15};

        if ((A.length - x) < x) {
            buildMAxHeap(A);
            int result = 0;
            for (int i = 0; i <= A.length - x; i++) {
                result = A[0];
                A[0] = A[A.length - 1 - i];
                A[A.length - 1 - i] = result;
                maxHeapify(A, 0, A.length - 2 - i);

            }
            System.out.println(result);

        } else {
            buildMinHeap(A);
            int result = 0;
            for (int i = 0; i < x; i++) {

                result = A[0];
                A[0] = A[A.length - 1 - i];
                A[A.length - 1 - i] = result;
                minHeapify(A, 0, A.length - 2 - i);

            }
            System.out.println(result);
        }
    }

    private static void buildMinHeap(int[] A) {
        int internalNode = (int) (Math.floor(A.length / 2) - 1);

        for (int i = internalNode; i >= 0; i--) {
            minHeapify(A, i, A.length - 1);
        }
    }

    private static void minHeapify(int[] A, int i, int n) {
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;

        int pointer = -1;
        int smallest = Integer.MAX_VALUE;

        if (c1 <= n && A[i] > A[c1] && smallest > A[c1]) {
            smallest = A[c1];
            pointer = c1;
        }
        if (c2 <= n && A[i] > A[c2] && smallest > A[c2]) {
            smallest = A[c2];
            pointer = c2;
        }

        if (pointer != -1) {
            int temp = A[i];
            A[i] = A[pointer];
            A[pointer] = temp;
            if (pointer <= Math.floor(A.length / 2) - 1) minHeapify(A, pointer, n);
        }
    }

    private static void buildMAxHeap(int[] A) {
        int internalNode = (int) (Math.floor(A.length / 2) - 1);

        for (int i = internalNode; i >= 0; i--) {
            maxHeapify(A, i, A.length - 1);
        }
    }

    private static void maxHeapify(int[] A, int i, int n) {
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;

        int pointer = -1;
        int largest = -100000;

        if (c1 <= n && A[i] < A[c1] && largest < A[c1]) {
            largest = A[c1];
            pointer = c1;
        }
        if (c2 <= n && A[i] < A[c2] && largest < A[c2]) {
            largest = A[c2];
            pointer = c2;
        }

        if (pointer != -1) {
            int temp = A[i];
            A[i] = A[pointer];
            A[pointer] = temp;
            if (pointer <= Math.floor(A.length / 2) - 1) maxHeapify(A, pointer, n);
        }
    }
}