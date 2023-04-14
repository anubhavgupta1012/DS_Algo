package com.ds.recursion;

public class Power {
    public static void main(String[] args) {
    }

    public int[][] towerOfHanoi(int A) {

        int m = (int) ((long) Math.pow(2, A)) - 1;

        int[][] AA = new int[m][3];
        toh(A, 1, 2, 3, AA, m);
        return AA;
    }


    void toh(int n, int s, int e, int h, int[][] AA, int m) {

        if (n == 0)
            return;

        toh(n - 1, s, h, e, AA, m - 1);
        int[] x = new int[]{n, s, e};
        AA[m] = x;
        toh(n - 1, h, e, s, AA, m - 1);

    }
}
