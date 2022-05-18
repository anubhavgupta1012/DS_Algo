package com.ds.searching.questions;

public class NthRoot {
    /* Nth Root of a number using BS*/

    public static void main(String[] args) {
        int n = 729;
        int root = 3;
        System.out.println("root == " + nthRootOfNumberUsingBS(n, root));
    }

    public static int nthRootOfNumberUsingBS(int n, int root) {
        return findNthRoot(n, 0, n, root);
    }

    private static int findNthRoot(int n, int l, int r, int root) {
        while (l <= r) {
            int mid = (l + r) / 2;

            if (Math.pow(mid, root) > n) return findNthRoot(n, l, mid - 1, root);

            else if (Math.pow(mid, root) < n) return findNthRoot(n, mid + 1, r, root);

            else if (Math.pow(mid, root) == n) return mid;
        }
        return -1;
    }

}
