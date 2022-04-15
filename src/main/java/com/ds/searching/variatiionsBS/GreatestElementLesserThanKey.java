package com.ds.searching.variatiionsBS;

public class GreatestElementLesserThanKey {
    /*
    * index(last occurrence) of greatest integer lesser than key
    Function : greatestLesser(2)
    Returns : -1

    Function : greatestLesser(5)
    Returns : 2
    */
    public static void main(String[] args) {
        int A[] = new int[]{2, 3, 3, 5, 5, 5, 6, 6};

        System.out.println("Item Found at: " + (leastIndexGreaterThanKey(A, 2) - 1));
    }

    public static int leastIndexGreaterThanKey(int[] A, int item) {
        int left = 0;
        int right = A.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (A[mid] > item) right = mid - 1;
            else if (A[mid] < item) left = mid + 1;

            else {
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }
}