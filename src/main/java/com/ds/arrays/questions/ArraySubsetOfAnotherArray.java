package com.ds.arrays.questions;

import java.util.HashMap;
import java.util.Map;

public class ArraySubsetOfAnotherArray {

    public static void main(String[] args) {

        long A[] = {10, 5, 2, 23, 19, 3, 19};
        long B[] = {19, 5, 3};

        System.out.println(findArraySubsetOfAnotherArray(A, B, A.length, B.length));
    }

    private static String findArraySubsetOfAnotherArray(long[] A, long[] B, int n, int m) {
        boolean result = true;
        Map<Long, Boolean> C = new HashMap<>();

        for (int i = 0; i < B.length; i++)
            C.put(B[i], false);


        for (int i = 0; i < A.length; i++) {
            if (C.containsKey(A[i]))
                C.put(A[i], true);
        }

        for (Map.Entry<Long, Boolean> entry : C.entrySet()) {

            if (!entry.getValue()) {
                result = false;
                break;
            }
        }

        return result ? "YES" : "NO";
    }
}
