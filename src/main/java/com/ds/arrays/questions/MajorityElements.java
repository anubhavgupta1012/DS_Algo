package com.ds.arrays.questions;

public class MajorityElements {

    public static void main(String[] args) {
        int A[] = {3, 1, 3, 0, 2};

        System.out.println(findMajorityElement(A));
    }


    private static int findMajorityElement(int[] A) {
        int majorityElement = A[0];
        int count = 1;

        for (int i = 1; i < A.length; i++) {
            if (count == 0) {
                count = 1;
                majorityElement = A[i];
            } else if (majorityElement == A[i]) count++;
            else if (majorityElement != A[i]) count--;

        }

        return verify(majorityElement, A);
    }

    private static int verify(int majorityElement, int[] A) {
        int count = 0;

        for (int i = 0; i < A.length; i++)
            if (A[i] == majorityElement) count++;


        return (count > (int) A.length / 2) ? majorityElement : -1;
    }
}
