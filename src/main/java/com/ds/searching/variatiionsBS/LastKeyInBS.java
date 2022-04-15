package com.ds.searching.variatiionsBS;

public class LastKeyInBS {
    public static void main(String[] args) {
        int A[] = new int[]{2, 5, 5, 5, 6, 6, 8, 9, 9, 9};

        System.out.println("Item Found at: " + LastKeyBS(A, 1));
    }

    public static int LastKeyBS(int[] A, int item) {
        int left = 0;
        int right = A.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (A[mid] > item) right = mid - 1;
            else if (A[mid] < item) left = mid + 1;

            else {
                ans = mid;
                left = mid + 1;
            }
        }
        return ans;
    }
}
