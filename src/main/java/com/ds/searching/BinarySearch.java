package com.ds.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int A[] = new int[]{2, 4, 8, 17, 25, 27, 32, 38, 45};

        int left = 0;
        int right = A.length - 1;
        Integer search = binarySearch(A, 45, left, right);
        System.out.println("Item Found at index " + search);
    }

    public static Integer binarySearch(int[] A, int item, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;

            int midItem = A[mid];
            if (midItem == item) return mid;

            if (midItem > item) {
                return binarySearch(A, item, left, mid - 1);
            }

            if (midItem < item) {
                return binarySearch(A, item, mid + 1, right);
            }
        }
        return -1;
    }
}
