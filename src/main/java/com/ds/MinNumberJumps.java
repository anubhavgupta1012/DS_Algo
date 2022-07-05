package com.ds;

public class MinNumberJumps {

    /*Again Understand*/
    public static void main(String[] args) {

        //int A[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        //int A[] = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
        int A[] = {2, 1, 0, 3};
        //int A[] = {2,1};
        //int A[] = {9, 10, 1, 2, 3, 4, 8, 0, 0, 0, 0, 0, 0, 0, 1};

        System.out.println(findMinNumberJumps(A));
    }

    private static int findMinNumberJumps(int[] A) {
        int jumps = 0;
        int counter = 0;
        int maxJump = 0;

        for (int i = 0; i < A.length - 1; i++) {
            if (i == 0 && A[0] == 0) {
                jumps = -1;
                break;
            }

            maxJump = Math.max(maxJump, i + A[i]);

            if (counter == i) {

                if (A[i] == 0 && A[maxJump] == 0) {
                    jumps = -1;
                    break;
                }

                jumps++;
                counter = maxJump;
            }
        }

        return jumps;
    }
}
