package com.ds.searching.variatiionsBS;

public class ContainsKeyBS {
    public static void main(String[] args) {
        int A[] = new int[]{2, 3, 3, 5, 5, 5, 6, 6};

        int left = 0;
        int right = A.length - 1;

        System.out.println("Item Found : " + binarySearch(A, 6, left, right));
    }

    public static Boolean binarySearch(int[] A, int item, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;

            int midItem = A[mid];
            if (midItem == item) return true;

            if (midItem > item) {
                return binarySearch(A, item, left, mid - 1);
            }

            if (midItem < item) {
                return binarySearch(A, item, mid + 1, right);
            }
        }
        return false;
    }
}
