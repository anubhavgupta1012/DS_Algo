package com.ds.searching.questions;

public class SingleElementRecursive {

    public static void main(String[] args) {
        int A[] = new int[]{1, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};

        System.out.println(singleElement(A, 0, A.length - 1));
    }

    public static int singleElement(int A[], int left, int right) {

        while (left <= right && left >= 0 && right <= A.length - 1) {

            int mid = (left + right) / 2;

            if (mid > 0 && mid < A.length - 1 && A[mid - 1] != A[mid] && A[mid] != A[mid + 1]) return A[mid];

            else if (mid % 2 != 0) {

                if (mid > 0 && mid < A.length - 1 && A[mid - 1] != A[mid] && A[mid] == A[mid + 1])
                    return singleElement(A, left, mid - 1);

                else if (mid > 0 && mid < A.length - 1 && A[mid - 1] == A[mid] && A[mid] != A[mid + 1])
                    return singleElement(A, mid + 1, right);

                else return A[mid];

            } else {
                if (mid > 0 && mid < A.length - 1 && A[mid - 1] == A[mid] && A[mid] != A[mid + 1])
                    return singleElement(A, left, mid - 1);

                else if (mid > 0 && mid < A.length - 1 && A[mid - 1] != A[mid] && A[mid] == A[mid + 1])
                    return singleElement(A, mid + 1, right);

                else return A[mid];
            }
        }
        return -1;
    }
}
