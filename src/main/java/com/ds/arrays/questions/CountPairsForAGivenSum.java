package com.ds.arrays.questions;

import java.util.HashMap;
import java.util.Map;

public class CountPairsForAGivenSum {
    public static void main(String[] args) {
        int A[] = {48, 24, 99, 51, 33, 39, 29, 83, 74, 72, 22, 46, 40, 51, 67,
                37, 78, 76, 26, 28, 76, 25, 10, 65, 64, 47, 34, 88, 26, 49, 86, 73, 73
                , 36, 75, 5, 26, 4, 39, 99, 27, 12, 97, 67, 63, 15, 3, 92, 90};
        int k = 50;

        System.out.println(getPairs(A, k, A.length));
    }

    private static int getPairs(int[] A, int k, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int key = k - A[i];
            if (map.containsKey(key)) {
                result += map.get(key);
            }
            Integer integer = map.get(A[i]);
            if (integer == null) {
                map.put(A[i], 1);
            } else {
                map.put(A[i], integer + 1);
            }
        }
        return result;
    }
}
