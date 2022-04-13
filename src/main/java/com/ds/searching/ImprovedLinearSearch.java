package com.ds.searching;

public class ImprovedLinearSearch {
    public static void main(String[] args) {
        int A[] = new int[]{10, 20, 80, 30, 60, 50, 110, 100, 130, 170};

        Integer search = search(A, 80);
        System.out.println("Item Found at index " + search);
    }

    public static Integer search(int[] A, int item) {
        int l = A.length - 1;
        int i = 0;
        int j = l;
        for (; i <= j; ) {
            if (A[i] == item) return i;
            if (A[j] == item) return j;

            i++;
            j--;
        }
        return null;
    }
}
