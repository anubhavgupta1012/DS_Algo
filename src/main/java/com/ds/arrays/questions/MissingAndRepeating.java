package com.ds.arrays.questions;

public class MissingAndRepeating {

    public static void main(String[] args) {
        int A[] = {12, 7, 5, 1, 13, 1, 10, 8, 11, 9, 2, 4, 3, 6};
        int[] missingAndRepeating = findMissingAndRepeating(A);
        for (int a : missingAndRepeating)
            System.out.print(a + " ");
    }

    private static int[] findMissingAndRepeating(int[] A) {
        int B[] = new int[2];
        int n = A.length;
        int An = n;
        for (int i = 0; i < n; i++) {
            if (A[i] == n || A[i] % (n + 1) == n) An += n + 1;

            else {
                A[A[i] % (n + 1)] += n + 1;
            }
        }

        for (int i = 1; i < A.length; i++) {
            if (A[i] < n + 1) B[1] = i;

            if (A[i] > (2 * n + 2))
                B[0] = i;
        }

        if (An > 2 * n + 2)
            B[0] = A.length;

        if (B[1] == 0)
            B[1] = A.length;

        return B;
    }
}
