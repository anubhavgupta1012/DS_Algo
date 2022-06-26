package com.ds.arrays.questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingElementIndex {
    public static void main(String[] args) {
        int A[] = {-1, 2, -1, 3, 2};

        System.out.println(findFirstRepeating(A));
    }

    private static int findFirstRepeating(int[] A) {
        int index = -1;
        Map<Integer, Integer> map = new LinkedHashMap();


        int x = -999999999;
        for (int i : A) {
            map.merge(i, 1, Integer::sum);
        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value > 1) {
                x = entry.getKey();
                break;
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (x == A[i]) {
                index = i + 1;
                break;
            }
        }

        return index;
    }

}
