package com.ds.searching.questions;

public class SingleElementIterative {
    public static void main(String[] args) {
        int A[] = new int[]{1, 1, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};

        System.out.println(singleElementIterative(A, 0, A.length - 1));
    }

    private static int singleElementIterative(int[] A, int left, int right) {
        while (left <= right) {
            int mid = (right + left) / 2;
            if (mid % 2 == 0) {
                if (A[mid] != A[mid + 1]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (A[mid] == A[mid + 1]) return right = mid - 1;

                else left = mid + 1;
            }
        }
        return A[left];
    }
}


// Not Working Properly