package com.ds.Java.collections;

import java.util.HashMap;

public class PairExistsWithGivenDifference {

/*
Input 1:
 A = [5, 10, 3, 2, 50, 80]
 B = 78

Input 2:
A = [-10, 20]
B = 30
*/

    public int solve(int[] A, int k) {

        HashMap<Integer, Long> map = new HashMap();

        for (int a : A)
            map.merge(a, 1L, Long::sum);
        int count = 0;
        for (int a : A) {
            int x1 = a - k;
            int x2 = a + k;

            if (x1 == a) {
                if (map.containsKey(x1) && map.get(x1) > 1) return 1;
            } else {
                if (map.containsKey(x1)) return 1;
            }
            if (x2 == a) {
                if (map.containsKey(x2) && map.get(x2) > 1) return 1;
            } else {
                if (map.containsKey(x2)) return 1;
            }
        }
        return 0;
    }
}