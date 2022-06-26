package com.ds.arrays.questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int A[] ={1,1,1};

        System.out.println(findFirstNonRepeating(A));
    }

    private static int findFirstNonRepeating(int[] A) {
        int index = -1;
        Map<Integer, Integer> map = new LinkedHashMap();


        int x = 0;
        for (int i : A) {
            map.merge(i, 1, Integer::sum);
        }


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value == 1) {
                x = entry.getKey();
                break;
            }
        }

        return x;
    }

}
