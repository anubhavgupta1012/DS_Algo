package com.ds.arrays.questions;

class Print0s1s2s {
    public static void main(String[] args) {
        int[] A = {0, 2, 1, 2, 0};
        sort012(A, A.length);
    }

    public static void sort012(int A[], int n) {
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 0; i < n; i++)
            if (A[i] == 0)
                x++;
            else if (A[i] == 1)
                y++;
            else if (A[i] == 2)
                z++;

        while (x != 0) {
            System.out.print(0 + " ");
            x--;
        }
        while (y != 0) {
            System.out.print(1 + " ");
            y--;
        }
        while (z != 0) {
            System.out.print(2 + " ");
            z--;
        }

    }
}