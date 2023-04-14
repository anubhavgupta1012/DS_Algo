package com.ds.Java.collections;

import java.util.HashMap;

public class CountPairWithGivenDifference {
    /*
        A = [3, 5, 1, 2]
        B = 4
        ans = 1



        A = [1, 2, 1, 2]
        B = 1
        ans = 4

    */
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 2};
        System.out.println(solve(A, 1));
    }

    public static int solve(int[] A, int k) {

        HashMap<Integer, Long> map = new HashMap();

        for (int a : A)
            map.merge(a, 1L, Long::sum);

        int count = 0;

        for (int a : A) {
            int x1 = a - k;
            int x2 = a + k;
            boolean b1 = false;
            if (map.containsKey(a) && map.containsKey(x1)) {
                count += map.get(a) * map.get(x1);
                b1 = true;
            }
            if (map.containsKey(a) && map.containsKey(x2)) {
                count += map.get(a) * map.get(x2);
                b1 = true;
            }

            if (b1) {
                map.remove(a);
            }
        }
        return count;
    }
}
