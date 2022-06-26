package com.ds.arrays.questions;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum0 {
    public static void main(String[] args) {

        int A[] = {1, 2, 3, -1, -1};
        System.out.println(findSubArraySum0(A));
    }

    private static boolean findSubArraySum0(int[] A) {
        int result = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];

            if (map.containsKey(sum)) {
                Integer integer = map.get(sum);
                result += integer;
                map.put(sum, integer + 1);
            } else map.put(sum, 1);
        }

        return result > 0;
    }
}
