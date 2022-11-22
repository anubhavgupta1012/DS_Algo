package com.ds.arrays.questions;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithEqual0sAnd1s {
    public static void main(String[] args) {

        int A[] = {1, 0, 0, 1, 0, 1, 1};

        System.out.println(countSubArrayWithEqual0sAnd1s(A));
    }

    private static int countSubArrayWithEqual0sAnd1s(int[] A) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < A.length; i++)
            if (A[i] == 0)
                A[i] = -1;

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            int x = A[i];
            sum += x;

            if (map.containsKey(sum)) {
                Integer integer = map.get(sum);
                count += integer;
                integer++;
                map.put(sum, integer);
            } else
                map.put(sum, 1);

        }

        return count;
    }
}
