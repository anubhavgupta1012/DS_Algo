package com.ds.searching.questions;

public class SearchInRotatedSortedArray {
    //find the index for target when array is rotated sorted
    public static void main(String[] args) {
        int A[] = new int[]{4, 5, 6, 7, 8, 9, 10, 0, 1, 2, 3};
        int target = 0;
        System.out.println(searchInRotatedArray(A, target));
    }

    private static int searchInRotatedArray(int[] A, int target) {
        int ans = -1;
        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midy = A[mid];
            int lefty = A[left];
            if (midy == target) {
                ans = mid;
                break;
            }
            if (lefty <= midy) {
                if (lefty <= target && target <= midy) right = mid - 1;
                else left = mid + 1;
            } else if (lefty > midy) {
                if (lefty >= target && target >= midy) {
                    left = mid + 1;
                } else if (lefty >= target && target <= midy) {
                    right = mid - 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return ans;
    }
}
// 10 is not being passed