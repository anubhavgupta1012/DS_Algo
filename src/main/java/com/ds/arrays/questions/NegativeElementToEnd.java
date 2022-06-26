package com.ds.arrays.questions;

public class NegativeElementToEnd {
    public static void main(String[] args) {

        int[] A = {-1, -7, -10, -8, -5, -10, -7};

        Integer[] A1 = new Integer[A.length];
        Integer[] A2 = new Integer[A.length];
        int i = 0;
        int j = 0;

        for (int k = 0; k < A.length; k++) {
            if (A[k] > 0) {
                A1[i++] = A[k];
            } else {
                A2[j++] = A[k];
            }
        }

        int z = 0;
        for (int i1 = 0; i1 < A.length && A1[i1] != null; i1++)
            A[z++] = A1[i1];
        for (int i2 = 0; i2 < A.length && A2[i2] != null; i2++)
            A[z++] = A2[i2];


        for (int i1 : A) {
            System.out.print(i1);
        }
    }
}
