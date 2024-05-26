package com.ds.searching.questions;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] A = {7, 8, 9, 1, 2, 3, 4, 5, 6};

        for (int target : A)
            System.out.println(findElementInRotatedSortedArray(A, target));
    }

    private static int findElementInRotatedSortedArray(int[] A, int target) {
        int index = -1;
        if (A.length == 0) return index;

        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (A[mid] == target) {
                return mid;
            }

            if (A[left] > A[mid]) {
                if (target < A[mid] && target <= A[left]) right = mid - 1;
                //else if (target > A[mid] && target >= A[left]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (target > A[mid]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return index;
    }
}
