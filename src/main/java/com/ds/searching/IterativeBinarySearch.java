package com.ds.searching;

public class IterativeBinarySearch {
    public static void main(String[] args) {
        int A[] = new int[]{2, 4, 8, 17, 25, 27, 32, 38, 45};

        int left = 0;
        int right = A.length - 1;
        Integer search = iterativeBinarySearch(A, 5, left, right);
        System.out.println("Item Found at index " + search);
    }

    public static Integer iterativeBinarySearch(int[] A, int item, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;

            if (A[mid] == item) return mid;

            else if (A[mid] > item) right = mid - 1;

            else left = mid + 1;
        }
        return -1;
    }
}
